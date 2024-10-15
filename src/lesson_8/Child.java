package lesson_8;

public class Child extends Parent {
    private int c;
    {
        System.out.println("Child init block");
    }

    static {
        System.out.println("Child Static init block");
    }

    public Child() {
        System.out.println("Child constructor");
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
