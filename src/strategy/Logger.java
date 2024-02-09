package strategy;

public class Logger {
    public void log(String message, LogHandler logHandler) {
        logHandler.log(message);
    }
}