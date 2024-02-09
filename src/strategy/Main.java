package strategy;

public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = new Logger("console");
        consoleLogger.log("This is a console log message");

        Logger fileLogger = new Logger("file");
        fileLogger.log("This is a file log message");

        Logger databaseLogger = new Logger("database");
        databaseLogger.log("This is a database log message");
    }
}
