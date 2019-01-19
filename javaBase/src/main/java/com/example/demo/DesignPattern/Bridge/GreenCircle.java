package com.example.demo.DesignPattern.Bridge;

public class GreenCircle implements DrawApi {
    public void drawCircle(int radius,int x,int y){
        System.out.println("draw_Green_Circle");
    }
}
