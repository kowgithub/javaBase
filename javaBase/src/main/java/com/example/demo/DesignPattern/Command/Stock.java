package com.example.demo.DesignPattern.Command;

public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("by stock");
    }

    public void sell(){
        System.out.println("sell stock");
    }
}
