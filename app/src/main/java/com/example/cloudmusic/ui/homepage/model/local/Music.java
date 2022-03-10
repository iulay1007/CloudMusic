package com.example.cloudmusic.ui.homepage.model.local;

public class Music {
    String name;
    String singer;
    String picUrl;

    public String getPicUrl() {
        return picUrl;
    }

    public Music(String name, String singer, String picUrl) {
        this.name = name;
        this.singer = singer;
        this.picUrl = picUrl;
    }

    public String getName() {
        return name;
    }



    public String getSinger() {
        return singer;
    }


}
