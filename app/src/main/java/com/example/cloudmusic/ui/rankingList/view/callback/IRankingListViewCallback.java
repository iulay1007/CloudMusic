package com.example.cloudmusic.ui.rankingList.view.callback;

import com.example.cloudmusic.ui.base.IBaseCallback;
import com.example.cloudmusic.ui.rankingList.model.RankingListBean;

public interface IRankingListViewCallback extends IBaseCallback {

    void onRankingListLoaded(RankingListBean bean);
}
