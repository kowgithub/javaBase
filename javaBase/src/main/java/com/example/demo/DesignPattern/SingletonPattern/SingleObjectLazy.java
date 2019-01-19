package com.example.demo.DesignPattern.SingletonPattern;

/**
 * 懒汉式，线程不安全
 * 加上同步锁后线程安全
 */
public class SingleObjectLazy {

    private static SingleObjectLazy instance ;

    private SingleObjectLazy() {
    }

    public static SingleObjectLazy getInstance(){
        if(instance == null){
            return new SingleObjectLazy();
        }
        return instance;
    }
//
//    public static synchronized SingleObjectLazy getInstance(){
//        if(instance == null){
//            return new SingleObjectLazy();
//        }
//        return instance;
//    }

    public void showMessage(){
        System.out.println("Hello Message");
    }
}