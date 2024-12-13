package lesson_18;

import java.lang.reflect.Field;

public class AnnotationProcessor {

    public static String stringify(Object object) {
        Class<?> clazz = object.getClass();
        Stringify annotation = clazz.getAnnotation(Stringify.class);
        if (annotation == null) {
            throw new IllegalArgumentException("Cannot stringify, not annotated");
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (annotation.includeClassName()) {
            stringBuilder.append(clazz.getSimpleName()).append(":");
        }
        stringBuilder.append("{");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.getAnnotation(StringifyIgnore.class) != null) {
                continue;
            }
            field.setAccessible(true);
            try {
                if (annotation.includeFieldNames()) {
                    StringifyFieldName fieldNameAnnotation = field.getAnnotation(StringifyFieldName.class);
                    String fieldName = fieldNameAnnotation == null ? field.getName() : fieldNameAnnotation.value();
                    stringBuilder.append(fieldName)
                            .append(annotation.delimiter());
                }
                stringBuilder.append(field.get(object))
                        .append(", ");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
            field.setAccessible(false);
        }
        if (stringBuilder.length() > 2) {
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static boolean allFieldsValid(Object object) {
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            RangeLimit annotation = field.getAnnotation(RangeLimit.class);
            if (annotation != null) {
                try {
                    field.setAccessible(true);
                    int value = (int) field.get(object);
                    field.setAccessible(false);
                    if (value < annotation.min() || value > annotation.max()) {
                        return false;
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return true;
    }
}
