package lesson_2;

import lesson_2.shapes.Circle;
import lesson_2.shapes.Rectangle;
import lesson_2.shapes.Shape;
import lesson_2.shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        print(65);
    }

    public static void print(double a) {
        System.out.println(a);
    }

    public static void print(int a, int b) {
        System.out.println(b);
    }

    private static void anonymousClassExample() {
        AbsClassExample a = new AbsClassExample() {
            @Override
            public void unfinishedMethod() {

            }

            @Override
            public String getStringRepresentation() {
                return null;
            }
        };
    }

    private static void shapesExample() {
        Shape[] shapes = {
                new Triangle("#aa13bf", 2,3,4),
                new Rectangle("#aa13bf", 3,4),
                new Circle("#aa13bf", 2),
                new Triangle("#aa13bf", 5,3,4),
                new Circle("#aa13bf", 4),
                new Rectangle("#aa13bf", 3,4.5),
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    private static void absExample() {
        AbsClassExample a = new ConcreteImpl1();
        AbsClassExample b = new ConcreteImpl2();
        a.unfinishedMethod();
        System.out.println(a.getStringRepresentation());
        b.unfinishedMethod();
        System.out.println(b.getStringRepresentation());
    }
}
