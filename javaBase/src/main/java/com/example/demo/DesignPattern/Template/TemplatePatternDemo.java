package com.example.demo.DesignPattern.Template;

public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
