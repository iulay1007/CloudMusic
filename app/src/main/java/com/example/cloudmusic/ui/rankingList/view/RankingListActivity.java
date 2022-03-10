package com.example.cloudmusic.ui.rankingList.view;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.example.cloudmusic.R;
import com.example.cloudmusic.ui.eventbus.PlayStatusEvent;
import com.example.cloudmusic.ui.homepage.model.local.Music;
import com.example.cloudmusic.ui.musicPlay.MusicPlayActivity;
import com.example.cloudmusic.ui.rankingList.model.RankingListBean;
import com.example.cloudmusic.ui.rankingList.presenter.IRankingListPresenter;
import com.example.cloudmusic.ui.rankingList.presenter.impl.RankingListPresenter;
import com.example.cloudmusic.ui.rankingList.view.adapter.RankingListAdapter;
import com.example.cloudmusic.ui.rankingList.view.callback.IRankingListViewCallback;
import com.example.cloudmusic.ui.search.view.SearchListListActivity;
import com.example.cloudmusic.ui.service.MusicService;


import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RankingListActivity extends AppCompatActivity implements IRankingListViewCallback {

    @BindView(R.id.ranking_listview)
    public RecyclerView mRankingList;

    private RankingListAdapter listAdapter ;

    @BindView(R.id.back_btn)
    public ImageView backIV;

    @BindView(R.id.music_name_tv)
    public TextView mMusicNameTv;

    @BindView(R.id.music_img_iv)
    public ImageView mMusicPicIv;

    @BindView(R.id.play_btn)
    public Button mPlayBtn;

    @BindView(R.id.bottom_player)
    public ConstraintLayout mBottomPlayer;

    private IRankingListPresenter presenter;

    private MusicService.MusicBinder mBinder;


    private Context context;
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking_list);
        ButterKnife.bind(this);
        EventBus.getDefault().register(RankingListActivity.this);
        context = this;
        initListView();
        initListener();
        initPresenter();
        initData();
        initService();

    }

    private void initService() {
        ServiceConnection conn = new ServiceConnection() {
            @Override
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                mBinder = (MusicService.MusicBinder) iBinder;
            }

            @Override
            public void onServiceDisconnected(ComponentName componentName) {
            }
        };

        //开启服务
        Intent intent = new Intent(this, MusicService.class);
        //TODO
        startService(intent);
        bindService(intent, conn, BIND_AUTO_CREATE);
    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    private void initListView() {
        listAdapter = new RankingListAdapter(this);
        mRankingList.setAdapter(listAdapter);
        mRankingList.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
    }

    private void initData() {
        if (presenter != null) {
            presenter.getRankingList();
        }
    }

    private void initPresenter() {
        presenter = new RankingListPresenter();
        presenter.registerViewCallback(this);

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void initListener() {
        backIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        listAdapter.setOnItemClickListener(new RankingListAdapter.onItemClickListener() {
            @Override
            public void onItemClick(Integer rankid) {
                Intent intent = new Intent(context,RankingDetailActivity.class);
                intent.putExtra("rankid",rankid);
                startActivity(intent);
            }
        });

        mPlayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    mBinder.playMusic();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        mBottomPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MusicPlayActivity.class);
                startActivity(intent);
            }
        });
       }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onRankingListLoaded(RankingListBean bean) {
        Log.d("onRankingListLoaded", bean.toString());
        listAdapter.setData(bean.getRank().getList());
        listAdapter.notifyDataSetChanged();

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

    @Subscribe(threadMode = ThreadMode.MAIN, sticky = true)
    public void onGetMusicMsg(Music music) {
        mMusicNameTv.setText(music.getName() + " - " + music.getSinger());
        if(music.getPicUrl()!=null&&music.getPicUrl().length()!=0)
            Glide.with(this).load(music.getPicUrl()).transform(new CircleCrop()).into(mMusicPicIv);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Subscribe(threadMode = ThreadMode.MAIN, sticky = true)
    public void onGetMusicIsPlaying(PlayStatusEvent playStatusEvent) {
        Log.d("onGetMusicIsPlaying", playStatusEvent.isPlaying() + "");
        if (playStatusEvent.isPlaying()) {
            mPlayBtn.setBackground(getDrawable(R.drawable.ic_baseline_pause_circle_outline_24));
        } else {
            mPlayBtn.setBackground(getDrawable(R.drawable.ic_baseline_play_circle_outline_24));
        }
    }
}
