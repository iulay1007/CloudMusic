package com.example.cloudmusic.ui.musicPlay;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.example.cloudmusic.R;
import com.example.cloudmusic.ui.eventbus.PlayStatusEvent;
import com.example.cloudmusic.ui.homepage.model.local.Music;
import com.example.cloudmusic.ui.main.MainActivity;
import com.example.cloudmusic.ui.service.MusicService;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MusicPlayActivity extends AppCompatActivity {
    @BindView(R.id.close_btn)
    public Button mCLoseButton;

    @BindView(R.id.play_music_btn)
    public Button mPlayButton;

    @BindView(R.id.music_name_tv)
    public TextView mMusicNameTv;

    @BindView(R.id.music_img_iv)
    public ImageView mMusicPicIv;

    @BindView(R.id.singer_name_tv)
    public TextView mSingerNameTv;


    private MusicService.MusicBinder mBinder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window=getWindow();
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(WindowManager.LayoutParams.FLAG_FULLSCREEN);
            //白色状态栏字体颜色改变
           // getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
            //
        }
        setContentView(R.layout.activity_music_play);
        ButterKnife.bind(this);
        EventBus.getDefault().register(MusicPlayActivity.this);
        initListener();
        initMusicService();
    }

    private void initMusicService() {
        ServiceConnection conn = new ServiceConnection() {
            @Override
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                 mBinder = (MusicService.MusicBinder) iBinder;
               //  mBinder.setResource("http://58.144.248.169/amobile.music.tc.qq.com/C400000SlJkg4GNRB8.m4a?guid=8348972662&vkey=9A20C30E3968BB964E1218EB57523C4B9214450BA157536FA26E88E4F90D781B7DBD138F3301BCC95363EA342F4FCFBFD1F6D402B5F83FEC&uin=&fromtag=66");
            }

            @Override
            public void onServiceDisconnected(ComponentName componentName) {
            }
        };

        //开启服务
        Intent intent = new Intent(MusicPlayActivity.this, MusicService.class);
        //TODO
        startService(intent);
        bindService(intent, conn, BIND_AUTO_CREATE);

    }

    private void initListener() {

        mCLoseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                overridePendingTransition(R.anim.top_to_current, R.anim.current_to_bottom);

            }
        });

        mPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mBinder!=null) {
                    Log.d("mPlayButton","mBinder");
                    try {
                        mBinder.playMusic();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

    }

    @Subscribe(threadMode = ThreadMode.MAIN, sticky = true)
    public void onGetMusicMsg(Music music) {
        mMusicNameTv.setText(music.getName());
        mSingerNameTv.setText(music.getSinger());
        if(music.getPicUrl()!=null&&music.getPicUrl().length()!=0)
            Glide.with(this).load(music.getPicUrl()).transform(new CircleCrop()).into(mMusicPicIv);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Subscribe(threadMode = ThreadMode.MAIN, sticky = true)
    public void onGetMusicIsPlaying(PlayStatusEvent playStatusEvent) {
        Log.d("onGetMusicIsPlaying", playStatusEvent.isPlaying() + "");
        if (playStatusEvent.isPlaying()) {
            mPlayButton.setBackground(getDrawable(R.drawable.ic_baseline_pause_circle_outline_24));
        } else {
            mPlayButton.setBackground(getDrawable(R.drawable.ic_baseline_play_circle_outline_24));
        }
    }
}