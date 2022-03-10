package com.example.cloudmusic.ui.homepage.presenter.callback;

import com.example.cloudmusic.ui.base.IBaseCallback;
import com.example.cloudmusic.ui.homepage.model.NewSongBean;
import com.example.cloudmusic.ui.homepage.model.RecommendMusicBean;

import java.io.IOException;

public interface IHomePagePresenterCallback extends IBaseCallback {
   void LoadedNewSongListSuccess(NewSongBean newSongBean);

   void LoadedSongSuccess(String url) throws IOException;

   void LoadedRecommendSuccess(RecommendMusicBean musicBean);
}
