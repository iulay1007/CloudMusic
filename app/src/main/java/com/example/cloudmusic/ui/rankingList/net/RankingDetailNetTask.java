package com.example.cloudmusic.ui.rankingList.net;

import com.example.cloudmusic.ui.api.Api;
import com.example.cloudmusic.ui.base.IBaseNetTask;
import com.example.cloudmusic.ui.rankingList.model.MusicBean;
import com.example.cloudmusic.ui.rankingList.model.RankBean;
import com.example.cloudmusic.ui.rankingList.presenter.callback.IRankingDetailPresenterCallback;
import com.example.cloudmusic.ui.utils.RetrofitManager;

import java.net.HttpURLConnection;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class RankingDetailNetTask implements IBaseNetTask<IRankingDetailPresenterCallback> {
    IRankingDetailPresenterCallback callback;

    private final Api mApi;

    public RankingDetailNetTask() {
        Retrofit retrofit = RetrofitManager.getInstance().getRetrofit(4);
        mApi = retrofit.create(Api.class);
    }

    public void getRankingDetail(int rankid){
        Call<RankBean> call = mApi.getRank(rankid);
        call.enqueue(new Callback<RankBean>() {
            @Override
            public void onResponse(Call<RankBean> call, Response<RankBean> response) {
                int code = response.code();
                if(code == HttpURLConnection.HTTP_OK){
                    callback.loadedRankingDetailSuccess(response.body());
                }
            }

            @Override
            public void onFailure(Call<RankBean> call, Throwable t) {

            }
        });
    }

    @Override
    public void registerPresenterCallback(IRankingDetailPresenterCallback callback) {
        this.callback = callback;
    }

    @Override
    public void unregisterPresenterCallback(IRankingDetailPresenterCallback callback) {
        this.callback = null;
    }

    public void getMusic(String hash) {
        Call<MusicBean> call = mApi.getMusic(hash);
        call.enqueue(new Callback<MusicBean>() {
            @Override
            public void onResponse(Call<MusicBean> call, Response<MusicBean> response) {
                int code = response.code();
                if(code == HttpURLConnection.HTTP_OK){
                    callback.loadedMusicSuccess(response.body());
                }
            }

            @Override
            public void onFailure(Call<MusicBean> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
