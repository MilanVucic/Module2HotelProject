package lesson_5;

public class Task implements HasPriority{
    private int priority;
    private String name;
    private String description;

    public Task(int priority, String name, String description) {
        this.priority = priority;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return priority + " " + name + " " + description;
    }

    @Override
    public int getPriority() {
        return priority;
    }
}
