package com.example.demo.DesignPattern.Template;

public class cricket extends Game {
    @Override
    void initialize() {
        System.out.println("C initialize");
    }

    @Override
    void startPlay() {
        System.out.println("c started");
    }

    @Override
    void endPlay() {
        System.out.println("C end");
    }
}
