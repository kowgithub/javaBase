package com.example.demo.DesignPattern.SimpleFactoryPattern;

public class CircleFactory implements ShapeFactory {

    public Shape createShape(){
        return new Circle();
    }
}
