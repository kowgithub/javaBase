package com.example.demo.DesignPattern.Mediator;

public class MediatorPatternDemo {

    public static void main(String[] args) {
        User robert = new User("robert");
        User john = new User("john");

        robert.sendMessage("Hi,John");
        john.sendMessage("Hello!, Robert");
    }
}
