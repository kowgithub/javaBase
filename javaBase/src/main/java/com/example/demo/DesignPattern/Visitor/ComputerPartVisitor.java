package com.example.demo.DesignPattern.Visitor;

public interface ComputerPartVisitor {

    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Monitor monitor);
    public void visit(Keyboard keyboard);

}
