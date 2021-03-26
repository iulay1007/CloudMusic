package com.example.cloudmusic.ui.musicPlay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.cloudmusic.R;
import com.example.cloudmusic.ui.main.MainActivity;

public class MusicPlayActivity extends AppCompatActivity {
    private Button button;
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
        initView();
    }

    private void initView() {
        button=(Button)findViewById(R.id.close_btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MusicPlayActivity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.top_to_current, R.anim.current_to_bottom);
            }
        });
    }
}