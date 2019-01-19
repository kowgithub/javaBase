package com.example.demo.DesignPattern.ProxyPattern2;

public class RealSubject implements Subject{

    @Override
    public int sellBooks(){
        System.out.println("卖书");
        return 1;
    }

    @Override
    public String speak(){
        System.out.println("读书");
        return "张三";
    }

}
