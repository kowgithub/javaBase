package com.example.demo.DesignPattern.ProxyPattern;

public class demo {

    public static void main(String[] args) {
        Image image = new ProxyImage("1.jpg");
        image.display();
        System.out.println("");
        image.display();
    }
}
