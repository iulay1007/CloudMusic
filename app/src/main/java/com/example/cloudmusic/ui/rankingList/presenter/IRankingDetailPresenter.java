package com.example.cloudmusic.ui.rankingList.presenter;

import com.example.cloudmusic.ui.base.IBasePresenter;
import com.example.cloudmusic.ui.rankingList.view.callback.IRankingDetailViewCallback;

public interface IRankingDetailPresenter extends IBasePresenter<IRankingDetailViewCallback> {

    void getRankingDetail(int rankid);

    void getMusic(String hash);
}
