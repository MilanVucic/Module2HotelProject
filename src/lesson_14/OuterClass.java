package lesson_14;

public class OuterClass {
    private int a = 50;
    private static int b = 500;

    private void doSomething() {

    }

    private static void doSomething2() {

    }

    public class InnerNonStaticClass {
        public void doSomething() {
            OuterClass.this.doSomething();
            doSomething2();
            a = 500;
            b = 500123;
        }
    }

    public static class InnerStaticClass {
        public void doSomething() {
            b = 500123;
            doSomething2();
        }
    }
}
