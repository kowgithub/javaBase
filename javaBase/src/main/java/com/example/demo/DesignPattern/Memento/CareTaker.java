package com.example.demo.DesignPattern.Memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<Memento> mementosList = new ArrayList<>();

    public void add(Memento memento){
        mementosList.add(memento);
    }
    public Memento get(int index){
        return mementosList.get(index);
    }
}
