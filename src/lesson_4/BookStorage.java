package lesson_4;

public interface BookStorage {
    // CRUD - Create Update Retrieve Delete
    boolean save(Book book);
    boolean update(Book book);
    Book get(int id);
    void delete(int id); // MongoDB, MySQL, MariaDB
}
