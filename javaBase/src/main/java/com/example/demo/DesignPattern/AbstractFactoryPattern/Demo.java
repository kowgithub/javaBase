package com.example.demo.DesignPattern.AbstractFactoryPattern;

public class Demo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProductor.getFactory("SHAPE");

        Shape shape = shapeFactory.getShape("SQUARE");
        shape.draw();

        //获得颜色工厂
        AbstractFactory colorFactory = FactoryProductor.getFactory("Color");
        Color color = colorFactory.getColor("red");
        color.fill();
    }
}
