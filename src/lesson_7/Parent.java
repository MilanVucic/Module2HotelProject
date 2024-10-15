package lesson_7;

public class Parent {
    private int a;
    private double b;

    public boolean equals(Object obj) {
        if (obj instanceof Parent p) {
            return p.a == this.a && p.b == this.b;
        }
        return false;
    }

    public void someMethod() {

    }
}
