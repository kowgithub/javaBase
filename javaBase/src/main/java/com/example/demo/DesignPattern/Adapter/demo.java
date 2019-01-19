package com.example.demo.DesignPattern.Adapter;

public class demo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3"," a.mp3");
        audioPlayer.play("mp4"," a.mp4");
        audioPlayer.play("vlc"," a.vlc");
        audioPlayer.play("avi"," a.avi");

    }
}
