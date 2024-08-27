package org.example;


import org.example.challenge1.MediaController;
import org.example.challenge1.MusicPlayer;
import org.example.challenge1.Playable;
import org.example.challenge1.VideoPlayer;
import org.example.session1.Guitar;
import org.example.session1.Jigsaw;
import org.example.session1.Noisy;
import org.example.session1.Plane;

import javax.print.attribute.standard.Media;

public class Main {
    //Session1:
    //Vererbung in Java kann nur von einer Klasse funktionieren
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        Jigsaw jigsaw = new Jigsaw();
        Plane plane = new Plane();

        recordNoise(guitar);
        recordNoise(jigsaw);
        recordNoise(plane);

        Noisy[] noises = {guitar, jigsaw, plane};

        Noisy noisy = new Guitar();

        System.out.println("_____________________________________________________");

        //Challenge1:
        //Step5: initialize an object of the 'MusicPlayer' and 'VideoPlayer' classes with the 'Playable' interface (polymorphism).
        MusicPlayer musicPlayer = new MusicPlayer();
        VideoPlayer videoPlayer = new VideoPlayer();

        //Step6: create an object of the 'MediaController' class
        MediaController mediaController = new MediaController();
        // and use it to play both a song and a video.
        mediaController.playMedia(musicPlayer); //returns "Play a song"
        mediaController.playMedia(videoPlayer); //returns "Play a video"

    }
    //Session1:
    public static void recordNoise(Noisy noisy){
        System.out.println("Recording started");
        noisy.makeNoise();
        System.out.println("Recording ended");
    }
}