package com.example.demo.DesignPattern.Bridge;

public class Demo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100,10,new RedCircle());
        Shape greenCircle = new Circle(100,100,10,new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
