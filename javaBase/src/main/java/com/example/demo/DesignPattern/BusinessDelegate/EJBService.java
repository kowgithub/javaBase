package com.example.demo.DesignPattern.BusinessDelegate;

public class EJBService implements BusinessService {
    @Override
    public void doProcessimg() {
        System.out.println("processing task by invoking EJB Service");
    }
}
