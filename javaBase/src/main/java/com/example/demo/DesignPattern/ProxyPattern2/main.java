package com.example.demo.DesignPattern.ProxyPattern2;

import java.lang.reflect.Proxy;

public class main {

    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(realSubject);

        Subject proxyClass = (Subject)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Subject.class}
        ,myInvocationHandler);

        proxyClass.sellBooks();
        proxyClass.speak();
    }
}
