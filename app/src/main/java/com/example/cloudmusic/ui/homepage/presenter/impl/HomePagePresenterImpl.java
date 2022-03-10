package com.example.cloudmusic.ui.homepage.presenter.impl;

import com.example.cloudmusic.ui.homepage.model.NewSongBean;
import com.example.cloudmusic.ui.homepage.model.RecommendMusicBean;
import com.example.cloudmusic.ui.homepage.net.HomePageNetTask;
import com.example.cloudmusic.ui.homepage.presenter.IHomePagePresenter;
import com.example.cloudmusic.ui.homepage.presenter.callback.IHomePagePresenterCallback;
import com.example.cloudmusic.ui.homepage.view.callback.IHomePageViewCallback;

import java.io.IOException;

public class HomePagePresenterImpl implements IHomePagePresenter, IHomePagePresenterCallback {
    IHomePageViewCallback viewCallBack = null;
    HomePageNetTask homePageNetTask = new HomePageNetTask();

    public HomePagePresenterImpl(){
        homePageNetTask.registerPresenterCallback(this);
    }
    @Override
    public void getNewSongLists() {
        homePageNetTask.getSongList();
    }

    @Override
    public void getSong(String name) {
        homePageNetTask.getSong(name);
    }

    @Override
    public void getRecommendSong() {
        homePageNetTask.getRecommendSong();
    }

    @Override
    public void registerViewCallback(IHomePageViewCallback callback) {
        viewCallBack = callback;
    }

    @Override
    public void unregisterViewCallback(IHomePageViewCallback callback) {
        viewCallBack = null;
    }

    @Override
    public void LoadedNewSongListSuccess(NewSongBean listBeanList) {
        viewCallBack.onNewSongListLoaded(listBeanList);
    }

    @Override
    public void LoadedSongSuccess(String url) throws IOException {
        viewCallBack.LoadedSongSuccess(url);
    }

    @Override
    public void LoadedRecommendSuccess(RecommendMusicBean musicBean) {
        viewCallBack.onRecommendSongListLoaded(musicBean);
    }

    @Override
    public void onError() {

    }

    @Override
    public void onLoading() {

    }

    @Override
    public void onEmpty() {

    }
}
