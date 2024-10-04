package lesson_4;

public class FileBookStorage implements BookStorage{
    @Override
    public boolean save(Book book) {
        return false; // Files.writeString(.....)
    }

    @Override
    public boolean update(Book book) {
        return false;
    }

    @Override
    public Book get(int id) {
        return null; // Files.read...
    }

    @Override
    public void delete(int id) {

    }
}
