package lesson_9;

public class Example implements Cloneable {
    private int a;

    public Example(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Example e) {
            return e.a == this.a;
        }
        return false;
    }
}
