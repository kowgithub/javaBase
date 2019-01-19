package com.example.demo.DesignPattern.Bridge;

public class RedCircle implements DrawApi {
    public void drawCircle(int radius,int x,int y){
        System.out.println("drawRedCircle");
    }
}
