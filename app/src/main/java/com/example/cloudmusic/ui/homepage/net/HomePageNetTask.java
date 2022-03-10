package com.example.cloudmusic.ui.homepage.net;

import android.util.Log;

import com.example.cloudmusic.ui.api.Api;
import com.example.cloudmusic.ui.base.IBaseNetTask;
import com.example.cloudmusic.ui.homepage.model.KeyBean;
import com.example.cloudmusic.ui.homepage.model.NewSongBean;
import com.example.cloudmusic.ui.homepage.model.RecommendMusicBean;
import com.example.cloudmusic.ui.search.model.SearchSongBean;
import com.example.cloudmusic.ui.homepage.presenter.callback.IHomePagePresenterCallback;
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

public class HomePageNetTask implements IBaseNetTask<IHomePagePresenterCallback> {
    IHomePagePresenterCallback callback = null;

    private final Api mApiE;

    private final Api mApiC;

    private final Api mApiI;

    private Map<String,String> cachedSongUrl = new HashMap<>();

    public HomePageNetTask() {
        Retrofit retrofit = RetrofitManager.getInstance().getRetrofit(1);
        mApiE = retrofit.create(Api.class);
        Retrofit retrofit2 = RetrofitManager.getInstance().getRetrofit(2);
        mApiC = retrofit2.create(Api.class);
        Retrofit retrofit4 = RetrofitManager.getInstance().getRetrofit(4);
        mApiI = retrofit4.create(Api.class);

    }

    public void getSongList() {
        Call<NewSongBean> call = mApiE.getSongList();
        call.enqueue(new Callback<NewSongBean>() {
            @Override
            public void onResponse(Call<NewSongBean> call, Response<NewSongBean> response) {
                int resultCode = response.code();
                Log.d("HomePageNetTask", "code ===> " + resultCode);
                if (resultCode == HttpURLConnection.HTTP_OK) {
                    NewSongBean result = response.body();
                    callback.LoadedNewSongListSuccess(result);
                } else {
                    callback.onError();
                }
            }

            @Override
            public void onFailure(Call<NewSongBean> call, Throwable t) {
                Log.d("HomePageNetTask", "onFailure" + t.toString());
                callback.onError();
            }
        });
    }

    public void getSong(String name) {
        Call<SearchSongBean> call = mApiC.searchSong(name);
        call.enqueue(new Callback<SearchSongBean>() {
            @Override
            public void onResponse(Call<SearchSongBean> call, Response<SearchSongBean> response) {
                int resultCode = response.code();
                Log.d("getSong", resultCode + "");
                if (resultCode == HttpURLConnection.HTTP_OK) {
                    Log.d("getSong",response.body().toString());
                    try {
                        getSongSource(response.body().getData().getSong().getList().get(0).getSongmid());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }


            }

            @Override
            public void onFailure(Call<SearchSongBean> call, Throwable t) {
                Log.d("getSong", t.toString());
            }
        });
    }


    void getSongSource(String songmid) throws IOException {
        if(cachedSongUrl.containsKey(songmid)){
            callback.LoadedSongSuccess(cachedSongUrl.get(songmid));
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
                            callback.LoadedSongSuccess(url);
                    }}
                });
    }


    public void getRecommendSong() {
        Call<RecommendMusicBean> call = mApiC.getRecommendMusic();
        call.enqueue(new Callback<RecommendMusicBean>() {
            @Override
            public void onResponse(Call<RecommendMusicBean> call, Response<RecommendMusicBean> response) {
                int code =  response.code();
                if(code == HttpURLConnection.HTTP_OK){
                    callback.LoadedRecommendSuccess(response.body());
                }
            }

            @Override
            public void onFailure(Call<RecommendMusicBean> call, Throwable t) {
                t.printStackTrace();

            }
        });
    }


    @Override
    public void registerPresenterCallback(IHomePagePresenterCallback callback) {
        this.callback = callback;
    }

    @Override
    public void unregisterPresenterCallback(IHomePagePresenterCallback callback) {
        this.callback = null;
    }

}
