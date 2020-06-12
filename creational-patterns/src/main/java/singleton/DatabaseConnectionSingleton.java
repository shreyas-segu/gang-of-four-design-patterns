package singleton;

public class DatabaseConnectionSingleton {
    private static DatabaseConnectionSingleton firstInstance = null;
    public String connectionString = "localhost";

    private DatabaseConnectionSingleton() {
    }

    public static synchronized DatabaseConnectionSingleton getInstance() {
        if (firstInstance == null) {
            firstInstance = new DatabaseConnectionSingleton();
        }
        return firstInstance;
    }
}
