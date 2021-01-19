package com.example.cloudmusic.ui.main;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.cloudmusic.R;
import com.example.cloudmusic.ui.classifyAndRecommend.CandRFragment;
import com.example.cloudmusic.ui.community.CommunityFragment;
import com.example.cloudmusic.ui.homepage.HomePageFragment;
import com.example.cloudmusic.ui.mine.MineFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

import static com.example.cloudmusic.R.menu.navigation_item;

public class MainActivity extends AppCompatActivity {

    public ViewPager viewPager;
    public BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    private void initView() {
        viewPager=(ViewPager)findViewById(R.id.viewpager);
        navigationView=(BottomNavigationView)findViewById(R.id.nav_view);
        viewPager.setAdapter(new ViewPageAdapter(getSupportFragmentManager(),getFragmentList()));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                navigationView.getMenu().getItem(position).setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
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

    private List<Fragment> getFragmentList(){
    List<Fragment> list=new ArrayList<>();
    list.add(new HomePageFragment());
    list.add(new CandRFragment());
    list.add(new MineFragment());
    list.add((new CommunityFragment()));
    return list;
    }
}