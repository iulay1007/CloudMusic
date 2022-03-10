package com.example.cloudmusic.ui.service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

import com.example.cloudmusic.ui.eventbus.PlayStatusEvent;
import com.example.cloudmusic.ui.homepage.model.local.Music;

import org.greenrobot.eventbus.EventBus;

import java.io.IOException;

public class MusicService extends Service {

    private Binder mBinder = null;

    public MediaPlayer mPlayer = null;

    @Override
    public void onCreate() {
        super.onCreate();
        if (mBinder == null)
            mBinder = new MusicBinder();
        if (mPlayer == null)
            mPlayer = new MediaPlayer();

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

     public class MusicBinder extends Binder {
        private String resource = "";

        private String lastResource = "";

        private Music music = null;

         public boolean isPlaying() {
            return mPlayer.isPlaying();
        }

        public void setResource(String resource){
            lastResource =this.resource;
            this.resource = resource;

        }

        public void setMusicMsg(Music music){
            this.music = music;
            EventBus.getDefault().postSticky(music);
        }

        public void playMusic() throws IOException {
            Log.d("playMusic","playMusic"+resource+isPlaying());
            if(isPlaying()){
                if(lastResource.equals(resource))
                mPlayer.pause();
                else {
                    mPlayer.stop();
                    mPlayer = new MediaPlayer();
                    mPlayer.setDataSource(resource);
                    mPlayer.prepare();
                    mPlayer.start();
                }
            }else {
                if(!resource.equals("")&&lastResource.equals(resource))
                {
                    mPlayer.start();
                }
                else if(resource != null && resource.length()!=0) {
                    Log.d("playMusic","playing"+resource);
                    mPlayer = new MediaPlayer();
                    mPlayer.setDataSource(resource);
                    mPlayer.prepare();
                    mPlayer.start();
                }

            }
            lastResource = resource;
            EventBus.getDefault().postSticky(new PlayStatusEvent(isPlaying()));
            if(mPlayer!=null)
                mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mPlayer.stop();
                        Log.d("onCompletion","onCompletion");
                        EventBus.getDefault().postSticky(new PlayStatusEvent(isPlaying()));
                        mPlayer = new MediaPlayer();
                        try {
                            mPlayer.setDataSource(resource);
                            mPlayer.prepare();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }


                    }
                });
        }
    }
}
