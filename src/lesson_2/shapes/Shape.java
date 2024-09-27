package lesson_2.shapes;

public abstract class Shape {
    private int id;
    private String color; // #ff3404 RGB

    private static int NEXT_ID = 1;

    public Shape(String color) {
        this.id = NEXT_ID++;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getId() {
        return id;
    }

    public abstract double getArea();
    public abstract double getCircumference();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id + " color: " + color
                + "\nArea: " + getArea()
                + "\nCircumference: " + getCircumference();
    }
}
