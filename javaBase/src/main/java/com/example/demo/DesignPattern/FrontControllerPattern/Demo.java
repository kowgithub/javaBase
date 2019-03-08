package com.example.demo.DesignPattern.FrontControllerPattern;

public class Demo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("home");
        frontController.dispatchRequest("STUDENT");
    }
}
