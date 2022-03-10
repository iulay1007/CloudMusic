package com.example.cloudmusic.ui.rankingList.net;

import com.example.cloudmusic.ui.api.Api;
import com.example.cloudmusic.ui.base.IBaseNetTask;
import com.example.cloudmusic.ui.rankingList.model.RankBean;
import com.example.cloudmusic.ui.rankingList.model.RankingListBean;
import com.example.cloudmusic.ui.rankingList.presenter.callback.IRankingListPresenterCallback;
import com.example.cloudmusic.ui.utils.RetrofitManager;

import java.net.HttpURLConnection;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class RankingListNetTask implements IBaseNetTask<IRankingListPresenterCallback> {
    IRankingListPresenterCallback callback ;

    private final Api mApi;

    public RankingListNetTask() {
        Retrofit retrofit = RetrofitManager.getInstance().getRetrofit(4);
        mApi = retrofit.create(Api.class);
    }

   public void getRankingList(){
        Call<RankingListBean> call = mApi.getRankingList();
        call.enqueue(new Callback<RankingListBean>() {
            @Override
            public void onResponse(Call<RankingListBean> call, Response<RankingListBean> response) {
                int code = response.code();
                if(code == HttpURLConnection.HTTP_OK){
                    callback.loadedRankingListSuccess(response.body());
                }
            }

            @Override
            public void onFailure(Call<RankingListBean> call, Throwable t) {
                    t.printStackTrace();
            }
        });
    }

    void getRank(int rankid){
        Call<RankBean> call = mApi.getRank(rankid);
        call.enqueue(new Callback<RankBean>() {
            @Override
            public void onResponse(Call<RankBean> call, Response<RankBean> response) {
                int code = response.code();
                if (code == HttpURLConnection.HTTP_OK){
                    
                }
            }

            @Override
            public void onFailure(Call<RankBean> call, Throwable t) {

            }
        });
    }

    @Override
    public void registerPresenterCallback(IRankingListPresenterCallback callback) {
        this.callback = callback;
    }

    @Override
    public void unregisterPresenterCallback(IRankingListPresenterCallback callback) {
        this.callback = null;
    }
}
