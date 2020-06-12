package singleton;

public class GetTheConnectionString implements Runnable {

    @Override
    public void run() {
        DatabaseConnectionSingleton session = DatabaseConnectionSingleton.getInstance();
        System.out.println(session.connectionString);
    }
}
