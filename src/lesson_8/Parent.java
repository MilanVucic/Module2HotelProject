package lesson_8;

public class Parent {
    private int a = 500;
    private double b = a + 2;
    private double c = b;
    {
        System.out.println("Parent init block");
    }

    public Parent() {
        System.out.println("Parent constructor");
    }
}
