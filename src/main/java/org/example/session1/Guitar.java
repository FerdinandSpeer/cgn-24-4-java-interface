package org.example.session1;

public class Guitar implements Noisy {
    @Override
    public void makeNoise() {
        System.out.println("Guitar sounds");
    }
}
