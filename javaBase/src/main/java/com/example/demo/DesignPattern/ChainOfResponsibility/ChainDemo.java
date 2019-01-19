package com.example.demo.DesignPattern.ChainOfResponsibility;

import java.util.concurrent.ArrayBlockingQueue;

public class ChainDemo {

    public static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO,
                "this is an information");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "this is a debug level message");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information");
    }
}
