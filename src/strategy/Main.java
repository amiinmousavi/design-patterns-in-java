package strategy;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.log("Message", new ConsoleLogger());
    }
}