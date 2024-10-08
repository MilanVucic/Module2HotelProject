package lesson_5;

public interface MyPriorityQueue<T extends HasPriority> {
    void put(T item);
    T getNext();
}
