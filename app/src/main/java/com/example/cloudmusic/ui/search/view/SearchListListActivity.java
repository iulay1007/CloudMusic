package com.example.cloudmusic.ui.search.view;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
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
import com.example.cloudmusic.ui.search.model.SearchSongBean;
import com.example.cloudmusic.ui.homepage.model.local.Music;
import com.example.cloudmusic.ui.musicPlay.MusicPlayActivity;
import com.example.cloudmusic.ui.search.presenter.ISearchListPresenter;
import com.example.cloudmusic.ui.search.presenter.impl.SearchListPresenterImpl;
import com.example.cloudmusic.ui.search.view.adapter.SearchListAdapter;
import com.example.cloudmusic.ui.search.view.callback.ISearchListViewCallback;
import com.example.cloudmusic.ui.service.MusicService;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.io.IOException;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchListListActivity extends AppCompatActivity implements ISearchListViewCallback {

    @BindView(R.id.search_et)
    public EditText searchEt;

    @BindView(R.id.music_list)
    public RecyclerView mRecyclerView;

    private SearchListAdapter mAdapter;

    private ISearchListPresenter presenter;

    List<SearchSongBean.DataBean.SongBean.ListBean> searchList;

    private MusicService.MusicBinder mBinder;

    private Context context;

    @BindView(R.id.back_btn)
    public ImageView mBackBtn;

    private String searchMsg;

    @BindView(R.id.music_name_tv)
    public TextView mMusicNameTv;

    @BindView(R.id.music_img_iv)
    public ImageView mMusicPicIv;

    @BindView(R.id.play_btn)
    public Button mPlayBtn;

    @BindView(R.id.bottom_player)
    public ConstraintLayout mBottomPlayer;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_list);
        ButterKnife.bind(this);
        EventBus.getDefault().register(SearchListListActivity.this);
        context = this;
        initListView();
        initListener();
        initPresenter();
        initData();
        initService();

    }

    private void initListView() {
        mAdapter = new SearchListAdapter(this);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
    }

    private void initData() {
        Intent intent = getIntent();
        searchMsg = intent.getStringExtra("searchMsg");
        if(searchMsg!=null&&searchMsg.length()!=0){
            searchEt.setText(searchMsg);
            if(presenter!=null){
                presenter.searchSong(searchMsg);
            }
        }
    }

    private void initPresenter() {
        presenter = new SearchListPresenterImpl();
        presenter.registerViewCallback(this);
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
        searchEt.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                    String input = v.getText().toString();
                    Log.d("searchEt", input);
                    presenter.searchSong(input);
                }
                return false;
            }
        });

        mAdapter.setOnItemClickListener(new SearchListAdapter.onItemClickListener() {
            @Override
            public void onItemClick(Integer pos) {
                SearchSongBean.DataBean.SongBean.ListBean bean = searchList.get(pos);
                presenter.getSongResource(bean.getSongmid());
                String picurl = "http://imgcache.qq.com/music/photo/album_300/17/300_albumpic_"+bean.getAlbumid()+"_0.jpg";
                mBinder.setMusicMsg(new Music(bean.getSongname(),bean.getSinger().get(0).getName(),picurl));

            }
        });

        mBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
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

    @Override
    public void onSearchSongLoaded(SearchSongBean songBean) {
        searchList = songBean.getData().getSong().getList();
        mAdapter.setData(searchList);
        mAdapter.notifyDataSetChanged();
        Log.d("SearchListListActivity", searchList.toString());
    }

    @Override
    public void onLoadedSongSuccess(String url) {
        Log.d("SearchListListActivity", url);
        mBinder.setResource(url);
        try {
            if(mBinder!=null){
                mBinder.playMusic();
            }
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
