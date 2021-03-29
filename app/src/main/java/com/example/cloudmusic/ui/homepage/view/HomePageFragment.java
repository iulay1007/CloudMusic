package com.example.cloudmusic.ui.homepage.view;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.widget.Toolbar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;

import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.cloudmusic.R;
import com.example.cloudmusic.ui.homepage.model.BannerBean;
import com.example.cloudmusic.ui.main.view.RecyclerviewAdapter_NavigationView;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.navigation.NavigationView;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;
//implements NavigationView.OnNavigationItemSelectedListener
public class HomePageFragment extends Fragment  {
    private Banner banner;
    public Toolbar mToolbar;
    private NavigationMenu mNavigationMenu;
    private DrawerLayout mDrawerLayout;
    public NavigationView navigationView;
    public RecyclerView nav_recyclerview;
    public RecyclerviewAdapter_NavigationView recyclerviewAdapter_navigationView;

    private ActionBarDrawerToggle mDrawerToggle;
    private AppBarConfiguration mAppBarConfiguration;
    private RecyclerView recyclerView;
   private Button open_nav_btn;

    private RecyclerViewAdapter_homepage adapter_homepage;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @SuppressLint("WrongConstant")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.fragment_homepage,container,false);
       // initBanner(view);
        // 获得抽屉控件
      //  Toolbar toolbar =view.findViewById(R.id.toolbar);

       // ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        initView(view);

        //  RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false);
         //recyclerView.setScrollingTouchSlop();

      // mToolbar = (Toolbar) view.findViewById(R.id.toolbar);
       // ((AppCompatActivity)getActivity()).setSupportActionBar(mToolbar);



     //   mDrawerLayout=(DrawerLayout)view.findViewById(R.id.drawer_layout);
        //mToolbar.setTitle("");
        //setHasOptionsMenu(true);



        //NavigationView navigationView = view.findViewById(R.id.navigation_view);

      //  navigationView.setNavigationItemSelectedListener(this);
     /*   mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDrawerLayout.openDrawer(GravityCompat.START);
            }
        });*/

     //useful
          open_nav_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(mDrawerLayout.isDrawerOpen(Gravity.START))
                        mDrawerLayout.closeDrawer(Gravity.START);
                        else  mDrawerLayout.openDrawer(Gravity.START);
                 //   else mDrawerLayout.closeDrawer(GravityCompat.START);
                }
            });

     //   ActionBarDrawerToggle actionBarDrawerToggle =new ActionBarDrawerToggle(getActivity(), mDrawerLayout, mToolbar, R.string.open, R.string.close);
        //初始化状态
       // actionBarDrawerToggle.syncState();
      //  //ActionBarDrawerToggle implements DrawerLayout.DrawerListener
 //       mDrawerLayout.addDrawerListener(actionBarDrawerToggle);
      //  mDrawerLayout.setStatusBarBackground(1);
        //mDrawerLayout.closeDrawer(Gravity.START);


      /*ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(getActivity(),mDrawerLayout , mToolbar, R.string.open, R.string.close) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };
        drawerToggle.syncState();//将左上角的图标和侧滑监听进行联动 达到动画效果显示
        mDrawerLayout.addDrawerListener(drawerToggle);*/


     //   mDrawerLayout.openDrawer(GravityCompat.START);

       // mDrawerLayout.isDrawerVisible(View.GONE);
     ;
       /*menu_expanded_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ((MainActivity)getActivity()).openDrawer();
            //   mDrawerLayout.openDrawer(GravityCompat.START);
            }
        });*/

        // 获得菜单控件
     //   mNavigationMenu = (NavigationMenu) view. findViewById(R.id.navigation_menu);
      //  mNavigationMenu.attacthDrawer(mDrawerLayout);

        // enable ActionBar app icon to behave as action to toggle nav
        // drawer
     //   getActionBar().setDisplayHomeAsUpEnabled(true);
        // 使actionbar 的logo图标透明不可见
       // getActionBar().setIcon(
         //       new ColorDrawable(getResources().getColor(
           //             android.R.color.transparent)));

        // 注册导航菜单抽屉 的弹出和关闭事件
       // mDrawerToggle = new ActionBarDrawerToggle(this, /* host Activity */
         //       mDrawerLayout, /* DrawerLayout object */
           //     R.drawable.ic_notification_content) ;


        return view;
    }

    private void initView(View view) {
        open_nav_btn=(Button)view.findViewById(R.id.open_nav_btn);
        mDrawerLayout = (DrawerLayout) view.findViewById(R.id.drawer_layout);
        navigationView=(NavigationView)view.findViewById(R.id.navigation_view);
        navigationView.inflateHeaderView(R.layout.nav_header);

        recyclerView=(RecyclerView)view.findViewById(R.id.homepage_recyclerview);
        adapter_homepage=new RecyclerViewAdapter_homepage(getActivity());
        recyclerView.setAdapter(adapter_homepage);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));

        View navHeaderView = navigationView.getHeaderView(0);
        nav_recyclerview=(RecyclerView)navHeaderView.findViewById(R.id.nav_recyclerview);
        recyclerviewAdapter_navigationView=new RecyclerviewAdapter_NavigationView(getActivity());
        nav_recyclerview.setAdapter(recyclerviewAdapter_navigationView);
        nav_recyclerview.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
    }

  /*  @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);

       // getMenuInflater().inflate(R.menu.homepage_item, menu);
        //MenuItem item = menu.findItem(R.id.action_search);
        //SearchView searchView=(SearchView) item.getActionView();

        //searchView.setIconifiedByDefault(false);

     //   SearchView searchView=(SearchView)MenuItemCompat.getActionView(item);
       // searchView.clearFocus();
        //searchView.setIconifiedByDefault(false);
      //  mSearchView = (SearchView) MenuItemCompat.getActionView(item);
       getActivity().getMenuInflater().inflate(R.menu.navigation_menu,menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }*/
}
