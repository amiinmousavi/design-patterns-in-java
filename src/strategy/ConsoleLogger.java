package strategy;

public class ConsoleLogger implements LogHandler{
    @Override
    public void log(String message) {
        System.out.println("Logging to console: " + message);
    }
}
