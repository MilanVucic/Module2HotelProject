package lesson_9;

public class Main {
    public static void main(String[] args) {
        Example example = new Example(5);
        Example example2 = new Example(5);
        Example example3 = example;
        System.out.println(example);
        System.out.println(example2);
        System.out.println(example3);
        String className = example2.getClass().getSimpleName();
        System.out.println(className);
        String a = "asd";
        a = "xzc";

    }
}
