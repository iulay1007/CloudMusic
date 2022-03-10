package com.example.cloudmusic.ui.homepage.presenter;

import com.example.cloudmusic.ui.base.IBasePresenter;
import com.example.cloudmusic.ui.homepage.view.callback.IHomePageViewCallback;

public interface IHomePagePresenter extends IBasePresenter<IHomePageViewCallback> {
    void getNewSongLists();

    void getSong(String name);

    void getRecommendSong();

}
