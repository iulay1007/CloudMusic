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
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.cloudmusic.R;
import com.example.cloudmusic.ui.eventbus.PlayStatusEvent;
import com.example.cloudmusic.ui.homepage.model.local.Music;
import com.example.cloudmusic.ui.musicPlay.MusicPlayActivity;
import com.example.cloudmusic.ui.rankingList.model.MusicBean;
import com.example.cloudmusic.ui.rankingList.model.RankBean;
import com.example.cloudmusic.ui.rankingList.presenter.IRankingDetailPresenter;
import com.example.cloudmusic.ui.rankingList.presenter.impl.RankingDetailPresenter;
import com.example.cloudmusic.ui.rankingList.view.adapter.RankingDetailListAdapter;
import com.example.cloudmusic.ui.rankingList.view.callback.IRankingDetailViewCallback;
import com.example.cloudmusic.ui.search.view.SearchListListActivity;
import com.example.cloudmusic.ui.service.MusicService;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.io.IOException;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RankingDetailActivity extends AppCompatActivity implements IRankingDetailViewCallback {

    int rankid = 0;

    @BindView(R.id.list_view)
    public RecyclerView recyclerView;

    @BindView(R.id.back_btn)
    public ImageView backBtn;

    @BindView(R.id.ranking_pic_iv)
    public ImageView rankingPicIV;

    @BindView(R.id.rangking_name_tv)
    public TextView rankingNameTv;

    @BindView(R.id.update_frequency_tv)
    public TextView updateFrequencyTv;

    @BindView(R.id.music_name_tv)
    public TextView mMusicNameTv;

    @BindView(R.id.music_img_iv)
    public ImageView mMusicPicIv;

    @BindView(R.id.play_btn)
    public Button mPlayBtn;

    @BindView(R.id.bottom_player)
    public ConstraintLayout mBottomPlayer;

    private RankingDetailListAdapter listAdapter;

    private IRankingDetailPresenter presenter;

    private MusicService.MusicBinder mBinder;

    private Context context;



    @Override
    protected void onCreate(@Nullable  Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking_detail);
        ButterKnife.bind(this);
        EventBus.getDefault().register(RankingDetailActivity.this);
        context = this;
        Intent intent = getIntent();
        rankid = intent.getIntExtra("rankid",0);
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


    private void initListener() {
        listAdapter.setOnItemClickListener(new RankingDetailListAdapter.onItemClickListener() {
            @Override
            public void onItemClick(String hash) {
                presenter.getMusic(hash);
                Intent intent = new Intent(context, MusicPlayActivity.class);
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

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
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

    private void initData() {
        presenter.getRankingDetail(rankid);
    }

    private void initPresenter() {
        presenter = new RankingDetailPresenter();
        presenter.registerViewCallback(this);

    }

    private void initListView() {
        listAdapter = new RankingDetailListAdapter(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        recyclerView.setAdapter(listAdapter);
    }

    @Override
    public void onDataLoaded(RankBean bean) {
        Log.d("onDataLoaded",bean.toString());
        listAdapter.setData(bean.getSongs().getList());
        listAdapter.notifyDataSetChanged();
        String picUrl = bean.getInfo().getImgurl();
        picUrl = picUrl.replace("{size}","480");
        Glide.with(this).load(picUrl).apply(RequestOptions.bitmapTransform(new RoundedCorners(30))).into(rankingPicIV);
        rankingNameTv.setText(bean.getInfo().getRankname());
        updateFrequencyTv.setText(bean.getInfo().getUpdate_frequency()+"更新");
    }

    @Override
    public void onMusicLoaded(MusicBean bean) {
        List<String> backup_url = bean.getBackup_url();
        if(backup_url == null||backup_url.size()==0){
            Toast.makeText(this,"付费歌曲，暂时不支持播放",Toast.LENGTH_LONG).show();
            return;
        }
        mBinder.setResource(backup_url.get(0));
        String picUrl = bean.getAlbum_img();
        picUrl = picUrl.replace("{size}","480");
        mBinder.setMusicMsg(new Music(bean.getSongName(),bean.getSingerName(),picUrl));
        try {
            mBinder.playMusic();
        }catch (IOException e){
            e.printStackTrace();
        }
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
