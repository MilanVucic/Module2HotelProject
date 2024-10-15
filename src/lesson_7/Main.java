package lesson_7;

public class Main {
    public static void main(String[] args) {
        int choice = 5;
        String message = switch (choice) {
            case 1 -> {
                System.out.println("....");
                yield "Welcome";
            }
            case 2 -> "Add items";
            case 3 -> "Remove items";
            case 4 -> "Exit";
            default -> "Unknown";
        };
        System.out.println(message);
    }

    private static void instanceOfExample() {
        Parent p1 = new Parent();
        Parent p2 = new Child();
        Child c1 = new Child();
        System.out.println(p1 instanceof Parent);
        System.out.println(p1 instanceof Child);
        System.out.println(p2 instanceof Parent);
        System.out.println(p2 instanceof Child);
        System.out.println(c1 instanceof Child);
        System.out.println(c1 instanceof Parent);
        System.out.println(p1 instanceof SomeInterface);
        System.out.println(c1 instanceof SomeInterface);

        if (p2 instanceof Child casted) {
            Child c2 = casted;
        } else {
            System.out.println("Can't cast.");
        }
    }
}
