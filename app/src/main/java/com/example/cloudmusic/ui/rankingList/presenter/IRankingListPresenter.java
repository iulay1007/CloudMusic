package com.example.cloudmusic.ui.rankingList.presenter;

import com.example.cloudmusic.ui.base.IBasePresenter;
import com.example.cloudmusic.ui.rankingList.view.callback.IRankingListViewCallback;

public interface IRankingListPresenter extends IBasePresenter<IRankingListViewCallback> {
    void getRankingList();
}
