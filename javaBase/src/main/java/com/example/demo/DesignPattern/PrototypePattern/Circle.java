package com.example.demo.DesignPattern.PrototypePattern;

public class Circle extends Shape{

    public Circle(){
        this.type = "Circle";
    }

    public void draw(){
        System.out.println("Circle draw");
    }
}
