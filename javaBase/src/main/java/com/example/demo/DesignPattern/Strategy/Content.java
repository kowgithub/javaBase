package com.example.demo.DesignPattern.Strategy;

public class Content {
    private Strategy strategy;

    public Content(Strategy strategy) {
        this.strategy = strategy;
    }

    public int exec(int num1,int num2){
        return strategy.doOperation(num1,num2);
    }
}
