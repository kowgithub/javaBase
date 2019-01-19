package com.example.demo.DesignPattern.SingletonPattern;

public class Demo {

    public static void main(String[] args) {
        SingleObjectNoLazy singleObject = SingleObjectNoLazy.getInstance();
        singleObject.showMessage();

    }
}
