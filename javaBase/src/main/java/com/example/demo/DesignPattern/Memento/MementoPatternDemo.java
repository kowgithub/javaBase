package com.example.demo.DesignPattern.Memento;

public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("#1");
        originator.setState("#2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("#3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("#4");

        System.out.println("Current state:" +originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("first save state:"+originator.getState());

        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second save state:"+originator.getState());
    }
}
