package com.example.cloudmusic.ui.homepage.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.cloudmusic.R;
import com.example.cloudmusic.ui.homepage.model.BannerBean;
import com.google.android.material.internal.NavigationMenu;
import com.youth.banner.Banner;
import com.youth.banner.adapter.BannerAdapter;
import com.youth.banner.indicator.CircleIndicator;

import java.util.List;

public class HomePageFragment extends Fragment {
    private Banner banner;
    private NavigationMenu mNavigationMenu;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.fragment_homepage,container,false);
        initBanner(view);
        // 获得抽屉控件
        mDrawerLayout = (DrawerLayout) view.findViewById(R.id.drawer_layout);
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


}
