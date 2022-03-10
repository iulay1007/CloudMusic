package com.example.cloudmusic.ui.main;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.example.cloudmusic.R;
import com.example.cloudmusic.ui.classifyAndRecommend.CandRFragment;
import com.example.cloudmusic.ui.community.CommunityFragment;
import com.example.cloudmusic.ui.eventbus.PlayStatusEvent;
import com.example.cloudmusic.ui.homepage.model.local.Music;
import com.example.cloudmusic.ui.homepage.view.HomePageFragment;
import com.example.cloudmusic.ui.main.view.RecyclerviewAdapter_NavigationView;
import com.example.cloudmusic.ui.mine.MineFragment;
import com.example.cloudmusic.ui.musicPlay.MusicPlayActivity;
import com.example.cloudmusic.ui.service.MusicService;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    public ViewPager viewPager;
    public BottomNavigationView bottomNavigationView;
    public NavigationView navigationView;
    public RecyclerView nav_recyclerview;
    public RecyclerviewAdapter_NavigationView recyclerviewAdapter_navigationView;
    public DrawerLayout drawerLayout;
    private DrawerLayout mDrawerLayout;
    public ConstraintLayout constraintLayout;
    public Toolbar mToolbar;
    private MusicService.MusicBinder mBinder;


    @BindView(R.id.music_name_tv)
    public TextView mMusicNameTv;

    @BindView(R.id.music_img_iv)
    public ImageView mMusicPicIv;

    @BindView(R.id.play_btn)
    public Button mPlayBtn;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(WindowManager.LayoutParams.FLAG_FULLSCREEN);
            //白色状态栏字体颜色改变
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
            //
        }
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        EventBus.getDefault().register(MainActivity.this);

        initView();
        initListener();
        initService();

    }

    private void initListener() {
        mPlayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    mBinder.playMusic();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void initService() {
        ServiceConnection conn = new ServiceConnection() {
            @Override
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                mBinder = (MusicService.MusicBinder) iBinder;
            }

            @Override
            public void onServiceDisconnected(ComponentName componentName) {
            }
        };

        //开启服务
        Intent intent = new Intent(this, MusicService.class);
        startService(intent);
        bindService(intent, conn, BIND_AUTO_CREATE);
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void initView() {

        viewPager = (ViewPager) findViewById(R.id.viewpager);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.nav_view);
        //useful1
        /*
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView=(NavigationView)findViewById(R.id.navigation_view);
        navigationView.inflateHeaderView(R.layout.nav_header);*/
        constraintLayout = (ConstraintLayout) findViewById(R.id.bottom_player);
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MusicPlayActivity.class);
                startActivity(intent);
                //overridePendingTransition(enterAnim 进入时的动画, exitAnim 出去时的动画);


            }
        });


        //useful2
        /*
        View navHeaderView = navigationView.getHeaderView(0);
        nav_recyclerview=(RecyclerView)navHeaderView.findViewById(R.id.nav_recyclerview);
        recyclerviewAdapter_navigationView=new RecyclerviewAdapter_NavigationView(this);
        nav_recyclerview.setAdapter(recyclerviewAdapter_navigationView);
        nav_recyclerview.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));*/

        // navHeaderView.
        // navigationView.inflate

        // mToolbar = findViewById(R.id.toolbar);
        //   mToolbar.setTitle("");

        //   setSupportActionBar(mToolbar);
        //     getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //    getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_menu_24);


        //   mDrawerLayout=(DrawerLayout)view.findViewById(R.id.drawer_layout);

        //  setHasOptionsMenu(true);
        viewPager.setAdapter(new ViewPageAdapter(getSupportFragmentManager(), getFragmentList()));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                bottomNavigationView.getMenu().getItem(position).setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.nav_homepage:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.nav_CaR:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.nav_Mine:
                        viewPager.setCurrentItem(2);
                        break;
                    case R.id.nav_Community:
                        viewPager.setCurrentItem(3);
                        break;
                }
                return false;
            }
        });
    }

    private List<Fragment> getFragmentList() {
        List<Fragment> list = new ArrayList<>();
        list.add(new HomePageFragment());
        list.add(new CandRFragment());
        list.add(new MineFragment());
        list.add((new CommunityFragment()));
        return list;
    }

    @SuppressLint("WrongConstant")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(Gravity.START);


        }
        return super.onOptionsItemSelected(item);
    }

    @Subscribe(threadMode = ThreadMode.MAIN, sticky = true)
    public void onGetMusicMsg(Music music) {
        mMusicNameTv.setText(music.getName() + " - " + music.getSinger());
        if(music.getPicUrl()!=null&&music.getPicUrl().length()!=0)
        Glide.with(this).load(music.getPicUrl()).transform(new CircleCrop()).into(mMusicPicIv);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Subscribe(threadMode = ThreadMode.MAIN, sticky = true)
    public void onGetMusicIsPlaying(PlayStatusEvent playStatusEvent) {
        Log.d("onGetMusicIsPlaying", playStatusEvent.isPlaying() + "");
        if (playStatusEvent.isPlaying()) {
            mPlayBtn.setBackground(getDrawable(R.drawable.ic_baseline_pause_circle_outline_24));
        } else {
            mPlayBtn.setBackground(getDrawable(R.drawable.ic_baseline_play_circle_outline_24));
        }
    }


}