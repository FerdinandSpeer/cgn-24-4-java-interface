package org.example;


import org.example.session1.Guitar;
import org.example.session1.Jigsaw;
import org.example.session1.Noisy;
import org.example.session1.Plane;

public class Main {
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
    }

    public static void recordNoise(Noisy noisy){
        System.out.println("Recording started");
        noisy.makeNoise();
        System.out.println("Recording ended");
    }
}