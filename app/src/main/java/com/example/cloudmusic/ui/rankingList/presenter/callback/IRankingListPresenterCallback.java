package com.example.cloudmusic.ui.rankingList.presenter.callback;

import com.example.cloudmusic.ui.base.IBaseCallback;
import com.example.cloudmusic.ui.rankingList.model.RankingListBean;

public interface IRankingListPresenterCallback extends IBaseCallback {

    void loadedRankingListSuccess(RankingListBean bean);
}
