package lesson_2;

public class ConcreteImpl1 extends AbsClassExample {

    @Override
    public void unfinishedMethod() {
        System.out.println("Now this method does something.");
    }

    @Override
    public String getStringRepresentation() {
        return "Hello world";
    }
}
