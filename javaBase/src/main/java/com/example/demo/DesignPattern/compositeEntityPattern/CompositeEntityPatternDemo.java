package com.example.demo.DesignPattern.compositeEntityPattern;

public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("test","data");
        client.printData();
        client.setData("Second test","data1");
        client.printData();
    }
}
