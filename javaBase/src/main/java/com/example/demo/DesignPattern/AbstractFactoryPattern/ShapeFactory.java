package com.example.demo.DesignPattern.AbstractFactoryPattern;

public class ShapeFactory extends AbstractFactory {
    public Color getColor(String color){
        return null;
    }
    public Shape getShape(String shape){
        if(shape == null){
            return null;
        }
        if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }else if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }
}
