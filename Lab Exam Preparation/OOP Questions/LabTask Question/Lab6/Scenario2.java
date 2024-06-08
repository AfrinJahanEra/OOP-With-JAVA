package Lab6;
// Logger interface
interface Logger {
    void logMessage(String message);
}

// ConsoleLogger implementation
class ConsoleLogger implements Logger {
    @Override
    public void logMessage(String message) {
        System.out.println("Console Log: " + message);
    }
}

// FileLogger implementation
class FileLogger implements Logger {
    @Override
    public void logMessage(String message) {
        // Implement file logging logic here
        System.out.println("File Log: " + message);
    }
}

// EmailLogger implementation
class EmailLogger implements Logger {
    @Override
    public void logMessage(String message) {
        // Implement email logging logic here
        System.out.println("Email Log: " + message);
    }
}

// LoggerController class that delegates the responsibility to the appropriate logger
class LoggerController {
    private Logger logger;

    // Set the logger dynamically
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    // Log a message using the chosen logger
    public void log(String message) {
        if (logger != null) {
            logger.logMessage(message);
        } else {
            System.out.println("No logger set. Cannot log message.");
        }
    }
}

public class Scenario2 {
    public static void main(String[] args) {
        // Create instances of different loggers
        ConsoleLogger consoleLogger = new ConsoleLogger();
        FileLogger fileLogger = new FileLogger();
        EmailLogger emailLogger = new EmailLogger();

        // Create a LoggerController
        LoggerController loggerController = new LoggerController();

        // Set different loggers dynamically
        loggerController.setLogger(consoleLogger);
        loggerController.log("This message will be logged to the console.");

        loggerController.setLogger(fileLogger);
        loggerController.log("This message will be logged to a file.");

        loggerController.setLogger(emailLogger);
        loggerController.log("This message will be sent via email.");
    }
}
