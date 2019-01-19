package com.example.demo.DesignPattern.Bridge;

public class Circle extends Shape {

    private int x,y,radius;

    public Circle(int x,int y,int radius,DrawApi drawApi){
        super(drawApi);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }


    public void draw(){
        drawApi.drawCircle(radius,x,y);
    }
}
