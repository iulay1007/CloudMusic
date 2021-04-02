package com.example.cloudmusic.ui.community;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.cloudmusic.R;
import com.example.cloudmusic.ui.community.view.TabFragmentPagerAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class CommunityFragment extends Fragment {
    private TabLayout mTablayout;
    private ViewPager mViewPager;
    private List<Fragment> fragmentList;
    private TabFragmentPagerAdapter adapter;
    private  String[] titles = new String[]{"关注","推荐"};

    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_community, container, false);

        /*if(container.getTag()==null){
            view = inflater.inflate(R.layout.fragment_community, container, false);
           // init();

            container.setTag(view);
        }else{
            view = (View) container.getTag();
        }*/

        initView(view);
        return view;
    }

    private void initView(View view) {
        mTablayout = (TabLayout) view.findViewById(R.id.tablayout);
        mViewPager = (ViewPager)view.findViewById(R.id.viewpager);
        fragmentList = new ArrayList<>();
        Fragment followFragment=new FollowFragmentInCommunity();
        Fragment recommendFragment=new RecommendFragmentInCommunity();
        fragmentList.add(followFragment);
        fragmentList.add(recommendFragment);
        adapter = new TabFragmentPagerAdapter(getChildFragmentManager(),fragmentList);
        mViewPager.setAdapter(adapter);
        mTablayout.setupWithViewPager(mViewPager);
        mTablayout.getTabAt(0).setText(titles[0]);
        mTablayout.getTabAt(1).setText(titles[1]);
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }
            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


    }

}


