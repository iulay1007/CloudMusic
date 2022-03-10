package com.example.cloudmusic.ui.eventbus;

public class PlayStatusEvent {
    private boolean isPlaying;

    public boolean isPlaying() {
        return isPlaying;
    }

    public PlayStatusEvent(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }
}
