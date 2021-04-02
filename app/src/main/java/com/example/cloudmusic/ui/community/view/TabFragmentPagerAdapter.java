package com.example.cloudmusic.ui.community.view;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class TabFragmentPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> fragmentlist;
    public TabFragmentPagerAdapter(FragmentManager fm, List<Fragment> fragmentlist){
        super(fm);
        this.fragmentlist=fragmentlist;

    }


    @NonNull
    @Override
    public Fragment getItem(int position) {

        return fragmentlist.get(position);
    }

    @Override
    public int getCount() {
        return 2;
    }
}