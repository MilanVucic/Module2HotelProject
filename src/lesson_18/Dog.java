package lesson_18;

@Stringify(includeFieldNames = false)
public class Dog {
    private String breed;
    private String name;
    @RangeLimit(min = 0, max = 100)
    private int age;
    @RangeLimit(min = 0, max = 300)
    private int weight;

    public Dog(String breed, String name, int age, int weight) {
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Deprecated(since = "1.2", forRemoval = true)
    public void deprecatedMethod() {

    }
}
