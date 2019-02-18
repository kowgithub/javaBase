package com.example.demo.DesignPattern.Strategy;

public class Demo {

    public static void main(String[] args) {

        Content content = new Content(new Add());
        System.out.println(content.exec(1,2));
        Content content1 = new Content(new Mul());
        System.out.println(content1.exec(1,8));
    }
}
