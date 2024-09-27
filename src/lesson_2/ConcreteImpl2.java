package lesson_2;

public class ConcreteImpl2 extends AbsClassExample{
    private double abc = 5;

    @Override
    public void unfinishedMethod() {
        System.out.println("Another implementation");
    }

    @Override
    public String getStringRepresentation() {
        return "Hi there";
    }

    public void doSomeSpecificThing() {

    }

    @Override
    public void printA() {
        super.printA();
    }
}
