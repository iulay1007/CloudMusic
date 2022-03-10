package com.example.cloudmusic.ui.homepage.view.callback;

import com.example.cloudmusic.ui.base.IBaseCallback;
import com.example.cloudmusic.ui.homepage.model.NewSongBean;
import com.example.cloudmusic.ui.homepage.model.RecommendMusicBean;

import java.io.IOException;

public interface IHomePageViewCallback extends IBaseCallback {
    void onNewSongListLoaded(NewSongBean newSongBeans);

    void LoadedSongSuccess(String url) ;

    void onRecommendSongListLoaded(RecommendMusicBean recommendMusicBean);
}
