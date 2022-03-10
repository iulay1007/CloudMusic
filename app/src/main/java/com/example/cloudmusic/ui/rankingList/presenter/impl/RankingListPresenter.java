package com.example.cloudmusic.ui.rankingList.presenter.impl;

import com.example.cloudmusic.ui.rankingList.model.RankingListBean;
import com.example.cloudmusic.ui.rankingList.net.RankingListNetTask;
import com.example.cloudmusic.ui.rankingList.presenter.IRankingListPresenter;
import com.example.cloudmusic.ui.rankingList.presenter.callback.IRankingListPresenterCallback;
import com.example.cloudmusic.ui.rankingList.view.callback.IRankingListViewCallback;

public class RankingListPresenter implements IRankingListPresenter , IRankingListPresenterCallback {
    IRankingListViewCallback viewCallback;

    RankingListNetTask netTask = new RankingListNetTask();

    public RankingListPresenter() {
        netTask.registerPresenterCallback(this);
    }

    @Override
    public void getRankingList() {
        netTask.getRankingList();
    }

    @Override
    public void registerViewCallback(IRankingListViewCallback callback) {
        this.viewCallback = callback;
    }

    @Override
    public void unregisterViewCallback(IRankingListViewCallback callback) {
        this.viewCallback = null;
    }

    @Override
    public void loadedRankingListSuccess(RankingListBean bean) {
        viewCallback.onRankingListLoaded(bean);
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
