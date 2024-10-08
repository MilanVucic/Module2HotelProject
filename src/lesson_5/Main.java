package lesson_5;

public class Main {
    public static void main(String[] args) {
        MyPriorityQueue<Task> stuffToDo = new MapPriorityQueue<>();
        stuffToDo.put(new Task(1, "Get the money from the bank", ""));
        stuffToDo.put(new Task(2, "Pay bills", ""));
        stuffToDo.put(new Task(3, "Wash dishes", ""));
        stuffToDo.put(new Task(3, "Take out laundry", ""));
        stuffToDo.put(new Task(2, "Buy plane tickets", ""));
        stuffToDo.put(new Task(3, "Wash the car", ""));

        System.out.println(stuffToDo.getNext());
        System.out.println(stuffToDo.getNext());
        System.out.println(stuffToDo.getNext());
        System.out.println(stuffToDo.getNext());
        System.out.println(stuffToDo.getNext());
        System.out.println(stuffToDo.getNext());
    }

    private static void theoryExample() {
        GenericExample<String, Integer> genericExample =
                new GenericExample<>(String.class, Integer.class);
        genericExample.getSomeValue();

        BoundedGeneric<Suv> boundedGeneric = new BoundedGeneric<>();
        boundedGeneric.doStuff(new Suv());
        BoundedGeneric<RacingCar> boundedGeneric2 = new BoundedGeneric<>();
        boundedGeneric2.doStuff(new RacingCar());
        BoundedGeneric<Car> boundedGeneric3 = new BoundedGeneric<>();
        boundedGeneric3.doStuff(new RacingCar());

        doOtherStuff(new GenericExample<Car, Suv>());
    }

    public static <T> int doSomething(T first, T second) {
        return 9;
    }

    public static void doOtherStuff(GenericExample<? super Car, ? extends Car> asdf) {

    }
}
