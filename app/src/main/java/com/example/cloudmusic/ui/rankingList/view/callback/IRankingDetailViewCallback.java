package com.example.cloudmusic.ui.rankingList.view.callback;

import com.example.cloudmusic.ui.base.IBaseCallback;
import com.example.cloudmusic.ui.rankingList.model.MusicBean;
import com.example.cloudmusic.ui.rankingList.model.RankBean;

public interface IRankingDetailViewCallback extends IBaseCallback {
    void onDataLoaded(RankBean bean);

    void onMusicLoaded(MusicBean bean);
}
