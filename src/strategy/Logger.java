package strategy;

public class Logger {
    private String logType;

    public Logger(String logType) {
        this.logType = logType;
    }

    public void log(String message) {
        switch (logType.toLowerCase()) {
            case "console":
                System.out.println("Logging to console: " + message);
                break;

            case "file":
                System.out.println("Logging to file: " + message);
                break;

            case "database":
                System.out.println("Logging to database: " + message);
                break;

            default:
                throw new IllegalArgumentException("Invalid log type: " + logType);
        }
    }
}