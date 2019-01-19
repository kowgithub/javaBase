package com.example.demo.DesignPattern.SingletonPattern;

public class SingleObjectDoubleCheck {

    private static volatile SingleObjectDoubleCheck singleObjectDoubleCheck;

    private SingleObjectDoubleCheck(){

    }

    public static SingleObjectDoubleCheck getInstance(){
        if(singleObjectDoubleCheck == null){

            synchronized (SingleObjectDoubleCheck.class){
                if(singleObjectDoubleCheck == null){
                    return new SingleObjectDoubleCheck();
                }
            }
        }
        return singleObjectDoubleCheck;
    }
}
