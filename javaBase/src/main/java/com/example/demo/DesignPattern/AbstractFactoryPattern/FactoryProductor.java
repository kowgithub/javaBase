package com.example.demo.DesignPattern.AbstractFactoryPattern;

public class FactoryProductor  {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("shape")){
            return new ShapeFactory();
        }else if(choice.equalsIgnoreCase("color")){
            return new ColorFactory();
        }
        return null;
    }
}
