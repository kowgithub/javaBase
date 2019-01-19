package com.example.demo.DesignPattern.FactoryPattern;

//工厂模式
// 意图：不同条件下创建不同的实例，让接口子类创建，返回给接口
public class Demo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
    }
}
