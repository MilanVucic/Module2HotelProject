package lesson_15;

import java.io.Serializable;
import java.util.List;

public class Person implements Serializable {
    private int age;
    private String name;
    private double height;
    private Address address;
    private List<String> phoneNumbers;

    public Person() {

    }

    public Person(int age, String name, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public Person(int age, String name, double height, Address address, List<String> phoneNumbers) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.address = address;
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", address=" + address +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}
