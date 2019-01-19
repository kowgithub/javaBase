package com.example.demo.DesignPattern.Adapter;

public class Vlcplayer implements AdvancedMediaPlayer{

    public void playVlc(String fileName){
        System.out.println("play vlc"+fileName);
    }
    public void playMp4(String fileName){

    }
}
