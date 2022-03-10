package com.example.cloudmusic.ui.rankingList.presenter.callback;

import com.example.cloudmusic.ui.base.IBaseCallback;
import com.example.cloudmusic.ui.homepage.model.local.Music;
import com.example.cloudmusic.ui.rankingList.model.MusicBean;
import com.example.cloudmusic.ui.rankingList.model.RankBean;

public interface IRankingDetailPresenterCallback extends IBaseCallback {
    void loadedRankingDetailSuccess(RankBean bean);

    void loadedMusicSuccess(MusicBean musicBean);
}
