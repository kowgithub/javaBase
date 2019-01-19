package com.example.demo.DesignPattern.SimpleFactoryPattern;

public class Demo {

    public static void main(String[] args) {
        Shape shape = new CircleFactory().createShape();
        shape.draw();
    }
}
