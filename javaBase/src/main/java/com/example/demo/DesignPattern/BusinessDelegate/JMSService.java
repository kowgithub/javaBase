package com.example.demo.DesignPattern.BusinessDelegate;

public class JMSService implements BusinessService {
    @Override
    public void doProcessimg() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
