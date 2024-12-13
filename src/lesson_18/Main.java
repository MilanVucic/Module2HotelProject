package lesson_18;

public class Main {
    // select * from Person where age > 18;
    public static void main(String[] args) {
        Dog dog = new Dog("Golden retriever", "Ruffy", 1, 200);
        Dog dog2 = new Dog("Golden retriever", "Ruffy", 2, 500);
        Dog dog3 = new Dog("Golden retriever", "Ruffy", 200, 50);
        User user = new User("vucic94@yahoo.com", "Vucko94", "123456");

        System.out.println(AnnotationProcessor.stringify(dog));
        System.out.println(AnnotationProcessor.stringify(user));
        System.out.println(AnnotationProcessor.allFieldsValid(dog));
        System.out.println(AnnotationProcessor.allFieldsValid(dog2));
        System.out.println(AnnotationProcessor.allFieldsValid(dog3));

    }
}
