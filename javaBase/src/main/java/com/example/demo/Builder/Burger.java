package com.example.demo.Builder;

public abstract class Burger implements Item  {

    public Packing packing(){
        return new Warpper();
    }

    public abstract float price();
}
