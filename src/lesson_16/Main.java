package lesson_16;

import java.lang.reflect.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        ProxyExample proxyExample = new ProxyImpl();
        ProxyExample proxy = (ProxyExample) Proxy.newProxyInstance(proxyExample.getClass().getClassLoader(),
                proxyExample.getClass().getInterfaces(), new CustomInvocationHandler(proxyExample));

        proxy.doSomething();
        proxy.doASlowerOperation();
    }

    private static void changingAField() {
        Example e = new Example(59);
        Example e2 = new Example(2000);
        Class<?> clazz = e.getClass();

        try {
            System.out.println(e.getA());
            Field f = clazz.getDeclaredField("a");
            f.setAccessible(true);
            f.set(e, 5000);
            System.out.println(e.getA());
        } catch (NoSuchFieldException ex) {
            throw new RuntimeException(ex);
        } catch (IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
    }

    private static void constructorsExample(Class<?> clazz) {
        try {
            Constructor<?> constructor = clazz.getDeclaredConstructor(int.class);
            Example e3 = (Example) constructor.newInstance(333);
            e3.protectedMethod("Milan");
        } catch (NoSuchMethodException ex) {
            throw new RuntimeException(ex);
        } catch (InvocationTargetException ex) {
            throw new RuntimeException(ex);
        } catch (InstantiationException ex) {
            throw new RuntimeException(ex);
        } catch (IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
    }

    private static void methodsExample(Example e, Example e2, Class<?> clazz) {
        try {
            Method method = clazz.getDeclaredMethod("privateMethod");
            Method method2 = clazz.getDeclaredMethod("privateMethod", String.class);

            method2.setAccessible(true);
            method2.invoke(e, "Milan");
            method2.invoke(e2, "Milan");
            method2.setAccessible(false);
        } catch (NoSuchMethodException ex) {
            throw new RuntimeException(ex);
        } catch (InvocationTargetException ex) {
            throw new RuntimeException(ex);
        } catch (IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
    }

    private static void getAllMethods(Class<?> clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("-------------");
            System.out.println(m.getName());
            System.out.println(Arrays.toString(m.getParameterTypes()));
            System.out.println("-------------");
        }
    }


    private static void fieldsExample(Class<?> clazz) {
        try {
            Field field = clazz.getDeclaredField("a");
            Field field2 = clazz.getField("b");
            // 0000000001001001 modifiers
            // 0000000001000000 "mask"
            boolean isAbstract = (Modifier.VOLATILE & field.getModifiers()) != 0;
            System.out.println(isAbstract);

            boolean isAbstract2 = (Modifier.VOLATILE & field2.getModifiers()) != 0;
            System.out.println(isAbstract2);
            System.out.println((Modifier.PRIVATE & field.getModifiers()) != 0);
        } catch (NoSuchFieldException ex) {
            throw new RuntimeException(ex);
        }
    }
}
