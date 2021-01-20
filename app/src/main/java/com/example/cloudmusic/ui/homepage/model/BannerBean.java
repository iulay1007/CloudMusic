package com.example.cloudmusic.ui.homepage.model;

import com.example.cloudmusic.R;

import java.util.ArrayList;
import java.util.List;

public class BannerBean {
    public int getImageRes() {
        return imageRes;
    }

    public void setImageRes(int imageRes) {
        this.imageRes = imageRes;
    }

    public int imageRes;

    public BannerBean(int imageRes) {
        this.imageRes = imageRes;
    }

    public static List<BannerBean> getData() {
        List<BannerBean> list = new ArrayList<>();
        list.add(new BannerBean(R.mipmap.pic0));
        list.add(new BannerBean(R.mipmap.pic1));
        list.add(new BannerBean(R.mipmap.pic2));
        list.add(new BannerBean(R.mipmap.pic3));
        return list;
    }

}
