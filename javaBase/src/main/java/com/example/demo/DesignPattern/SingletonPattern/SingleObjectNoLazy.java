package com.example.demo.DesignPattern.SingletonPattern;

public class SingleObjectNoLazy {

    private static SingleObjectNoLazy instance = new SingleObjectNoLazy();

    private SingleObjectNoLazy() {
    }

    public static SingleObjectNoLazy getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello Message");
    }
}