package lesson_5;

public class GenericExample<T, R> {
    T myVariable;
    R myOtherVariable;
    Class<T> clazz;
    Class<R> clazz2;

    public GenericExample(Class<T> clazz, Class<R> clazz2) {
        this.clazz = clazz;
        this.clazz2 = clazz2;
    }

    public GenericExample() {
        this.myVariable = myVariable;
        this.myOtherVariable = myOtherVariable;
    }

    public T getSomeValue() {
        System.out.println(myVariable.getClass());
        return myVariable;
    }

    public void doSomeStuff(T aVar, T aVar2, R another) {

    }
}
