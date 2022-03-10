package com.example.cloudmusic.ui.eventbus;

import com.example.cloudmusic.ui.homepage.model.local.Music;

public class MusicEvent {

    public Music getMusic() {
        return music;
    }

    private Music music;

    public MusicEvent(Music music) {
        this.music = music;
    }
}
