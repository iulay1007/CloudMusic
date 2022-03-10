package com.example.cloudmusic.ui.search.net;

import android.util.Log;

import com.example.cloudmusic.ui.api.Api;
import com.example.cloudmusic.ui.base.IBaseNetTask;
import com.example.cloudmusic.ui.homepage.model.KeyBean;
import com.example.cloudmusic.ui.search.model.SearchSongBean;
import com.example.cloudmusic.ui.homepage.net.IHttpCallback;
import com.example.cloudmusic.ui.search.presenter.callback.ISearchListPresenterCallback;
import com.example.cloudmusic.ui.utils.HttpUtil;
import com.example.cloudmusic.ui.utils.RetrofitManager;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class SearchListNetTask implements IBaseNetTask<ISearchListPresenterCallback> {
    private final Api mApiC;

    private Map<String,String> cachedSongUrl = new HashMap<>();



    public SearchListNetTask() {
        Retrofit retrofit2 = RetrofitManager.getInstance().getRetrofit(2);
        mApiC = retrofit2.create(Api.class);
    }

    ISearchListPresenterCallback callback;

    public void searchSong(String name){
        Call<SearchSongBean> call = mApiC.searchSong(name);
        call.enqueue(new Callback<SearchSongBean>() {
            @Override
            public void onResponse(Call<SearchSongBean> call, Response<SearchSongBean> response) {
                int resultCode = response.code();
                if (resultCode == HttpURLConnection.HTTP_OK) {
                    callback.loadedSearchSongSuccess(response.body());
                    //  getSongSource(response.body().getData().getSong().getList().get(0).getSongmid());
                }


            }

            @Override
            public void onFailure(Call<SearchSongBean> call, Throwable t) {
                Log.d("searchSong", t.toString());
            }
        });
    }

    public void getSongSource(String songmid) throws IOException {
        if(cachedSongUrl.containsKey(songmid)){
            callback.loadedSongSuccess(cachedSongUrl.get(songmid));
            return;
        }
        String url = "https://u.y.qq.com/cgi-bin/musicu.fcg?g_tk=5381&loginUin=0&hostUin=0&format=json&inCharset=utf8&outCharset=utf-8&notice=0&platform=yqq.json&needNewCode=0&data="+"{\"req\":{\"module\":\"CDN.SrfCdnDispatchServer\",\"method\":\"GetCdnDispatch\",\"param\":{\"guid\":\"8348972662\",\"calltype\":0,\"userip\":\"\"}},\"req_0\":{\"module\":\"vkey.GetVkeyServer\",\"method\":\"CgiGetVkey\",\"param\":{\"guid\":\"8348972662\",\"songmid\":[\""+songmid+"\"],\"songtype\":[1],\"uin\":\"0\",\"loginflag\":1,\"platform\":\"20\"}},\"comm\":{\"uin\":0,\"format\":\"json\",\"ct\":24,\"cv\":0}}";
        Log.d("getSongSource",url);
        HttpUtil.get(url, KeyBean.class, new IHttpCallback() {
            @Override
            public <T> void onLoadedSuccess(T data) throws IOException {
                Log.d("onSongLoaded ===>",data.toString());
                Log.d("onSongLoaded ===>",data.getClass().getName());

                if(data instanceof KeyBean){
                    KeyBean bean =(KeyBean) data;
                    String url = bean.getReq().getData().getFreeflowsip().get(0) + bean.getReq_0().getData().getMidurlinfo().get(0).getPurl();
                    Log.d("onSongLoaded url===>",url);
                    cachedSongUrl.put(songmid,url);
                    callback.loadedSongSuccess(url);
                }}
        });
    }


    @Override
    public void registerPresenterCallback(ISearchListPresenterCallback callback) {
        this.callback = callback;
    }

    @Override
    public void unregisterPresenterCallback(ISearchListPresenterCallback callback) {
        this.callback = null;
    }
}
