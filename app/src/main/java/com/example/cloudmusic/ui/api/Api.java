package com.example.cloudmusic.ui.api;

import com.example.cloudmusic.ui.homepage.model.NewSongBean;
import com.example.cloudmusic.ui.homepage.model.RecommendMusicBean;
import com.example.cloudmusic.ui.rankingList.model.MusicBean;
import com.example.cloudmusic.ui.rankingList.model.RankBean;
import com.example.cloudmusic.ui.rankingList.model.RankingListBean;
import com.example.cloudmusic.ui.search.model.SearchSongBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Api {

    @GET("personalized/newsong/")
    Call<NewSongBean> getSongList();

    @GET("soso/fcgi-bin/client_search_cp?aggr=1&cr=1&flag_qc=0&p=1&n=30")
    Call<SearchSongBean> searchSong(@Query("w") String w);

    @GET("v8/fcg-bin/fcg_v8_toplist_cp.fcg?g_tk=5381&uin=0&format=json&inCharset=utf-8&outCharset=utf-8¬ice=0&platform=h5&needNewCode=1&tpl=3&page=detail&type=top&topid=36&_=1520777874472")
    Call<RecommendMusicBean> getRecommendMusic();

    @GET("{albumid}")
    Call<String> getAlbumPic(@Path("albumid") String albumid);

    @GET("rank/list&json=true")
    Call<RankingListBean> getRankingList();

    @GET("rank/info/?page=1&json=true")
    Call<RankBean> getRank(@Query("rankid") int rankid);

    @GET("app/i/getSongInfo.php?cmd=playInfo")
    Call<MusicBean> getMusic(@Query("hash") String hash);
}
