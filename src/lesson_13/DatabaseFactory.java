package lesson_13;

public class DatabaseFactory {
    public static DatabaseContract getDatabaseContract() {
        return new MySqlDb();
    }
}
