package org.example.session1;

import org.example.challenge1.Playable;

public class Guitar implements Noisy {
    @Override
    public void makeNoise() {
        System.out.println("Guitar sounds");
    }
}
