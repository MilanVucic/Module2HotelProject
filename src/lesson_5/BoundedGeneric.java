package lesson_5;

public class BoundedGeneric<T extends Car> {
    T car;

    public void doStuff(T parameter) {
        parameter.somethingCarSpecific();
    }
}
