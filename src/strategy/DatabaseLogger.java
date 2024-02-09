package strategy;

public class DatabaseLogger implements LogHandler{
    @Override
    public void log(String message) {
        System.out.println("Logging to database: " + message);
    }
}
