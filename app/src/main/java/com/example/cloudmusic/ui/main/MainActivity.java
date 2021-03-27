package com.example.cloudmusic.ui.main;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.core.view.MenuItemCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;
import com.example.cloudmusic.R;
import com.example.cloudmusic.ui.classifyAndRecommend.CandRFragment;
import com.example.cloudmusic.ui.community.CommunityFragment;
import com.example.cloudmusic.ui.homepage.view.HomePageFragment;
import com.example.cloudmusic.ui.main.view.RecyclerviewAdapter_NavigationView;
import com.example.cloudmusic.ui.mine.MineFragment;
import com.example.cloudmusic.ui.musicPlay.MusicPlayActivity;
import com.githang.statusbar.StatusBarCompat;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

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
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window=getWindow();
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(WindowManager.LayoutParams.FLAG_FULLSCREEN);
            //白色状态栏字体颜色改变
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
           //
        }
       // getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);//使状态栏透明
       // getWindow().setStatusBarColor(Color.TRANSPARENT);
       // getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
   /*     if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            //透明状态栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            //透明导航栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }
        StatusBarCompat.setStatusBarColor(this, Color.TRANSPARENT);*/

        setContentView(R.layout.activity_main);

       // StatusBarCompat.setStatusBarColor(this, color, lightStatusBar);

        initView();
       // drawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);

        //setSupportActionBar(mToolbar);

      //  ActionBarDrawerToggle actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,mToolbar,R.string.open,R.string.close);

    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void initView() {

        viewPager=(ViewPager)findViewById(R.id.viewpager);

        bottomNavigationView=(BottomNavigationView)findViewById(R.id.nav_view);
        //useful1
        /*
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView=(NavigationView)findViewById(R.id.navigation_view);
        navigationView.inflateHeaderView(R.layout.nav_header);*/
        constraintLayout=(ConstraintLayout)findViewById(R.id.bottom_bth);
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MusicPlayActivity.class);
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
        viewPager.setAdapter(new ViewPageAdapter(getSupportFragmentManager(),getFragmentList()));
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

    @SuppressLint("WrongConstant")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
        case android.R.id.home:mDrawerLayout.openDrawer(Gravity.START);


        }
        return super.onOptionsItemSelected(item);
    }


}