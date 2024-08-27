package org.example.challenge1;

//Step 3: Create a class 'VideoPlayer' that also implements the 'Playable' interface. Implement the 'play' method to play a video.
public class VideoPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("Play a video");
    }
}
