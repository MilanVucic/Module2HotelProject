package lesson_4;

public interface ExampleInt {
    double b = 50;

    void something(int a, double b);
    default void extraSomething() {
        System.out.println("Default code...");
    }
}
