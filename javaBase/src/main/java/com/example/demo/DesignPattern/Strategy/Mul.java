package com.example.demo.DesignPattern.Strategy;

public class Mul  implements  Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1*num2;
    }
}
