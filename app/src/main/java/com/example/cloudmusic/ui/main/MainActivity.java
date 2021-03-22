package com.example.cloudmusic.ui.main;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.GravityCompat;
import androidx.core.view.MenuItemCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.widget.Toolbar;
import com.example.cloudmusic.R;
import com.example.cloudmusic.ui.classifyAndRecommend.CandRFragment;
import com.example.cloudmusic.ui.community.CommunityFragment;
import com.example.cloudmusic.ui.homepage.view.HomePageFragment;
import com.example.cloudmusic.ui.main.view.RecyclerviewAdapter_NavigationView;
import com.example.cloudmusic.ui.mine.MineFragment;
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
    public Toolbar mToolbar;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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

    public void openDrawer(){
        //drawerLayout.openDrawer(drawerLayout);
        drawerLayout.openDrawer(GravityCompat.START);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void initView() {

        viewPager=(ViewPager)findViewById(R.id.viewpager);
        bottomNavigationView=(BottomNavigationView)findViewById(R.id.nav_view);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView=(NavigationView)findViewById(R.id.navigation_view);
        navigationView.inflateHeaderView(R.layout.nav_header);

        View navHeaderView = navigationView.getHeaderView(0);
        nav_recyclerview=(RecyclerView)navHeaderView.findViewById(R.id.nav_recyclerview);
        recyclerviewAdapter_navigationView=new RecyclerviewAdapter_NavigationView(this);
        nav_recyclerview.setAdapter(recyclerviewAdapter_navigationView);
        nav_recyclerview.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        // navHeaderView.
       // navigationView.inflate

        mToolbar = findViewById(R.id.toolbar);
        mToolbar.setTitle("");
          setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_menu_24);
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

    @SuppressLint("UseCompatLoadingForDrawables")
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        mToolbar.inflateMenu(R.menu.searchview_item);
      //MenuItem menuItem=mToolbar.findViewById(R.id.searchView_menu_item);
    //    SearchView searchView=(SearchView) MenuItemCompat.getActionView(menuItem);
       //SearchView searchView= (SearchView) menuItem.getActionView();
       // searchView.setQueryHint("qwq");
        //searchView.setBackground(getDrawable(R.drawable.login_btn_background));
        return super.onCreateOptionsMenu(menu);
    }
}