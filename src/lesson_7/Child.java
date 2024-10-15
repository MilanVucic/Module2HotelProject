package lesson_7;

public class Child extends Parent implements SomeInterface{
    @Override
    public void method() {

    }

    @Override
    public void someMethod() {
        super.someMethod();
    }
}
