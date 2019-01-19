package com.example.demo.DesignPattern.SingletonPattern;

public class SingletonInner {

    private static class SingletonHolder{
        private static final SingletonInner instance = new SingletonInner();

    }

    private SingletonInner(){}

    public static SingletonInner getInstance(){
        return SingletonHolder.instance;
    }


}
