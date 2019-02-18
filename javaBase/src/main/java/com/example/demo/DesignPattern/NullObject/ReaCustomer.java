package com.example.demo.DesignPattern.NullObject;

public class ReaCustomer extends AbstractCustomer {
    public ReaCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
