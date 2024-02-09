package strategy;

public class FileLogger implements LogHandler{
    @Override
    public void log(String message) {
        System.out.println("Logging to file: " + message);
    }
}
