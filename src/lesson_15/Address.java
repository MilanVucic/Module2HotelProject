package lesson_15;

public class Address {
    private String city;
    private String zipCode;

    public Address(String city, String zipCode) {
        this.city = city;
        this.zipCode = zipCode;
    }

    public Address() {

    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
