package lesson_1;

import example.EncapsulationExample;

import java.util.Scanner;

public class Main extends EncapsulationExample {
    public static void main(String[] args) {
        polyExample();
    }

    private static void polyExample() {
        Parent[] objects = new Parent[]{new Child1(), new Child2(), new Parent()};
        for (Parent object : objects) {
            object.sayHi();
        }

        Cipher c = new CaesarCipher();
        System.out.println(c.encrypt("asdasdasd"));

        Cipher c2 = new RandomCipher();
        System.out.println(c2.encrypt("asdasd"));
    }

    private static void encapsulationExample() {
        Person p = new Person();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter yob:");
            int year = scanner.nextInt();
            try {
                p.setYearOfBirth(year);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(p.getYearOfBirth());
    }
}
