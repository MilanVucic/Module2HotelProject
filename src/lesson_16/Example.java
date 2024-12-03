package lesson_16;

public class Example {
    private volatile int a = 50;
    public static int b = 50;

    public Example(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    private void privateMethod() {
        System.out.println("Hello!");
    }

    private void privateMethod(String name) {
        System.out.println("Hello!" + name + a);
    }

    protected int protectedMethod(String asdf) {
        System.out.println("Protected:" + asdf + this.a);
        return 5;
    }

    public static void staticMethod() {
        System.out.println("Static");
    }
}
