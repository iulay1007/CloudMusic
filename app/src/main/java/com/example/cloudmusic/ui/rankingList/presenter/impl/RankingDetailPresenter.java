package com.example.cloudmusic.ui.rankingList.presenter.impl;

import com.example.cloudmusic.ui.rankingList.model.MusicBean;
import com.example.cloudmusic.ui.rankingList.model.RankBean;
import com.example.cloudmusic.ui.rankingList.net.RankingDetailNetTask;
import com.example.cloudmusic.ui.rankingList.presenter.IRankingDetailPresenter;
import com.example.cloudmusic.ui.rankingList.presenter.IRankingListPresenter;
import com.example.cloudmusic.ui.rankingList.presenter.callback.IRankingDetailPresenterCallback;
import com.example.cloudmusic.ui.rankingList.view.callback.IRankingDetailViewCallback;

public class RankingDetailPresenter implements IRankingDetailPresenter, IRankingDetailPresenterCallback {
    private IRankingDetailViewCallback callback;

    private RankingDetailNetTask netTask = new RankingDetailNetTask();

    public RankingDetailPresenter() {
        netTask.registerPresenterCallback(this);
    }

    @Override
    public void getRankingDetail(int rankid) {
        netTask.getRankingDetail(rankid);
    }

    @Override
    public void getMusic(String hash) {
        netTask.getMusic(hash);
    }

    @Override
    public void registerViewCallback(IRankingDetailViewCallback callback) {
        this.callback = callback;
    }

    @Override
    public void unregisterViewCallback(IRankingDetailViewCallback callback) {
        this.callback = null;
    }

    @Override
    public void loadedRankingDetailSuccess(RankBean bean) {
        callback.onDataLoaded(bean);
    }

    @Override
    public void loadedMusicSuccess(MusicBean musicBean) {
        callback.onMusicLoaded(musicBean);
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
