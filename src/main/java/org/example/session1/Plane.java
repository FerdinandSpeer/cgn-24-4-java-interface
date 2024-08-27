package org.example.session1;

public class Plane implements Noisy, CanFly {
    @Override
    public void makeNoise() {
        System.out.println("Loud plane sounds");
    }

    @Override
    public void takeOff() {
        System.out.println("Plane takes off");
    }
}
