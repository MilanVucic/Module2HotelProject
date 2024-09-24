package lesson_1;

public class Person {
    String name;
    private int yearOfBirth;

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >= 2025) {
            throw new IllegalArgumentException("Year cannot be greater than current year.");
        }
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
