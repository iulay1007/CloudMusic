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
import androidx.navigation.ui.AppBarConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.cloudmusic.R;
import com.example.cloudmusic.ui.homepage.model.BannerBean;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.navigation.NavigationView;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;

public class HomePageFragment extends Fragment implements NavigationView.OnNavigationItemSelectedListener {
    private Banner banner;
    private Button menu_expanded_btn;
    public Toolbar mToolbar;
    private NavigationMenu mNavigationMenu;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;
    private AppBarConfiguration mAppBarConfiguration;
    private RecyclerView recyclerView_one;
    private RecyclerView recyclerView_two;
    private RecyclerViewAdapter_first adapter_one;
    private RecyclerViewAdapter_second adapter_two;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @SuppressLint("WrongConstant")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.fragment_homepage,container,false);
        initBanner(view);
        // 获得抽屉控件
        // mDrawerLayout = (DrawerLayout) view.findViewById(R.id.drawer_layout);
        menu_expanded_btn=(Button) view.findViewById(R.id.expanded_menu_btn);
        recyclerView_one=(RecyclerView)view.findViewById(R.id.recyclerview_one);
        recyclerView_two=(RecyclerView)view.findViewById(R.id.recyclerview_two);
      //  RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false);
        adapter_one=new RecyclerViewAdapter_first(getActivity());
        recyclerView_one.setAdapter(adapter_one);
        recyclerView_one.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        //recyclerView.setScrollingTouchSlop();
        recyclerView_one.addItemDecoration(new HorizontalItemDecoration(30));
        adapter_two=new RecyclerViewAdapter_second(getActivity());
        recyclerView_two.setAdapter(adapter_two);
        recyclerView_two.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));

        mToolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(mToolbar);
        mToolbar.setTitle("");
        setHasOptionsMenu(true);
        setHasOptionsMenu(true);
        mDrawerLayout=(DrawerLayout)view.findViewById(R.id.drawer_layout);
        //NavigationView navigationView = view.findViewById(R.id.navigation_view);

      //  navigationView.setNavigationItemSelectedListener(this);
     /*   mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDrawerLayout.openDrawer(GravityCompat.START);
            }
        });*/
            menu_expanded_btn.setOnClickListener(new View.OnClickListener() {
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

    @Override
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

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    private void initBanner(View view) {
        banner=(Banner)view .findViewById(R.id.banner);
        //banner.setR
        banner.setAdapter(new BannnerAdapter(BannerBean.getData()) {
            @Override
            public void onBindView(BannerViewHolder holder, BannerBean data, int position, int size) {
                //图片加载自己实现
                Glide.with(holder.itemView)
                        .load(data.imageRes)
                        .into(holder.imageView);
            }
        })
                .setIndicator(new CircleIndicator(getContext())).setBannerRound(30);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }
}
