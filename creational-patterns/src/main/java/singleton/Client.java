package singleton;

public class Client {
    public void useDatabase() {

        Runnable getConnString = new GetTheConnectionString();
        Runnable getConnString2 = new GetTheConnectionString();

        new Thread(getConnString).start();
        new Thread(getConnString2).start();

    }
}
