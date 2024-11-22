package lesson_13;

public interface DatabaseContract {
    // CRUD
    void save(Object item);
    Object get(int id);
    void update(Object item);
    void delete(int id);
}
