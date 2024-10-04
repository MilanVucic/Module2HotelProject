package lesson_4;

public class MySQLBookStorage implements BookStorage {
    @Override
    public boolean save(Book book) {
        return false; // INSERT INTO BOOKS (....)
    }

    @Override
    public boolean update(Book book) {
        return false;
    }

    @Override
    public Book get(int id) {
        return null; // SELECT * FROM BOOKS
    }

    @Override
    public void delete(int id) {

    }
}
