package com.example.cloudmusic.ui.homepage.view;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.widget.Toolbar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cloudmusic.R;
import com.example.cloudmusic.ui.homepage.model.NewSongBean;
import com.example.cloudmusic.ui.homepage.model.RecommendMusicBean;
import com.example.cloudmusic.ui.homepage.model.local.Music;
import com.example.cloudmusic.ui.homepage.presenter.IHomePagePresenter;
import com.example.cloudmusic.ui.homepage.presenter.impl.HomePagePresenterImpl;
import com.example.cloudmusic.ui.homepage.view.adapter.HomePageListAdapter;
import com.example.cloudmusic.ui.homepage.view.callback.IHomePageViewCallback;
import com.example.cloudmusic.ui.main.view.RecyclerviewAdapter_NavigationView;
import com.example.cloudmusic.ui.rankingList.view.RankingListActivity;
import com.example.cloudmusic.ui.search.view.SearchActivity;
import com.example.cloudmusic.ui.service.MusicService;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.navigation.NavigationView;
import com.youth.banner.Banner;

import java.io.IOException;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.content.Context.BIND_AUTO_CREATE;

//implements NavigationView.OnNavigationItemSelectedListener
public class HomePageFragment extends Fragment implements IHomePageViewCallback {
    private Banner banner;
    public Toolbar mToolbar;
    private NavigationMenu mNavigationMenu;
    private DrawerLayout mDrawerLayout;
    public NavigationView navigationView;
    public RecyclerView nav_recyclerview;
    public RecyclerviewAdapter_NavigationView recyclerviewAdapter_navigationView;

    private ActionBarDrawerToggle mDrawerToggle;
    private AppBarConfiguration mAppBarConfiguration;
    private RecyclerView recyclerView;
    private Button open_nav_btn;

    private HomePageListAdapter adapter_homepage;

    private IHomePagePresenter presenter;

    private MusicService.MusicBinder mBinder;

    List<NewSongBean.ResultBean> mNewSongList;

    private RecommendMusicBean mRecommendMusic;

    @BindView(R.id.searchView)
    public ImageView mSearchView ;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @SuppressLint("WrongConstant")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_homepage, container, false);
        // initBanner(view);
        // 获得抽屉控件
        //  Toolbar toolbar =view.findViewById(R.id.toolbar);

        // ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        ButterKnife.bind(this,view);
        initView(view);
        initPresenter();
        initListener();
        loadData();
        initService();
        //  RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false);
        //recyclerView.setScrollingTouchSlop();

        // mToolbar = (Toolbar) view.findViewById(R.id.toolbar);
        // ((AppCompatActivity)getActivity()).setSupportActionBar(mToolbar);


        //   mDrawerLayout=(DrawerLayout)view.findViewById(R.id.drawer_layout);
        //mToolbar.setTitle("");
        //setHasOptionsMenu(true);


        //NavigationView navigationView = view.findViewById(R.id.navigation_view);

        //  navigationView.setNavigationItemSelectedListener(this);
     /*   mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDrawerLayout.openDrawer(GravityCompat.START);
            }
        });*/

        //useful
        open_nav_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mDrawerLayout.isDrawerOpen(Gravity.START))
                    mDrawerLayout.closeDrawer(Gravity.START);
                else mDrawerLayout.openDrawer(Gravity.START);
                //   else mDrawerLayout.closeDrawer(GravityCompat.START);
            }
        });

        //   ActionBarDrawerToggle actionBarDrawerToggle =new ActionBarDrawerToggle(getActivity(), mDrawerLayout, mToolbar, R.string.open, R.string.close);
        //初始化状态
        // actionBarDrawerToggle.syncState();
        //  //ActionBarDrawerToggle implements DrawerLayout.DrawerListener
        //       mDrawerLayout.addDrawerListener(actionBarDrawerToggle);
        //  mDrawerLayout.setStatusBarBackground(1);
        //mDrawerLayout.closeDrawer(Gravity.START);


      /*ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(getActivity(),mDrawerLayout , mToolbar, R.string.open, R.string.close) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };
        drawerToggle.syncState();//将左上角的图标和侧滑监听进行联动 达到动画效果显示
        mDrawerLayout.addDrawerListener(drawerToggle);*/


        //   mDrawerLayout.openDrawer(GravityCompat.START);

        // mDrawerLayout.isDrawerVisible(View.GONE);
        ;
       /*menu_expanded_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ((MainActivity)getActivity()).openDrawer();
            //   mDrawerLayout.openDrawer(GravityCompat.START);
            }
        });*/

        // 获得菜单控件
        //   mNavigationMenu = (NavigationMenu) view. findViewById(R.id.navigation_menu);
        //  mNavigationMenu.attacthDrawer(mDrawerLayout);

        // enable ActionBar app icon to behave as action to toggle nav
        // drawer
        //   getActionBar().setDisplayHomeAsUpEnabled(true);
        // 使actionbar 的logo图标透明不可见
        // getActionBar().setIcon(
        //       new ColorDrawable(getResources().getColor(
        //             android.R.color.transparent)));

        // 注册导航菜单抽屉 的弹出和关闭事件
        // mDrawerToggle = new ActionBarDrawerToggle(this, /* host Activity */
        //       mDrawerLayout, /* DrawerLayout object */
        //     R.drawable.ic_notification_content) ;


        return view;
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
        Intent intent = new Intent(getContext(), MusicService.class);
        //TODO
        getActivity().startService(intent);
        getActivity().bindService(intent, conn, BIND_AUTO_CREATE);
    }

    private void initListener() {
        adapter_homepage.setOnNewSongItemClickListener(new HomePageListAdapter.onNewSongItemClickListener() {
            @Override
            public void onItemClick(Integer pos) {
                NewSongBean.ResultBean bean= mNewSongList.get(pos);
                presenter.getSong(bean.getName());
                mBinder.setMusicMsg(new Music(bean.getName(),bean.getSong().getAlbum().getArtists().get(0).getName(),bean.getPicUrl()));

            }
        });

        adapter_homepage.setOnRecommendItemClickListener(new HomePageListAdapter.onRecommendItemClickListener() {
            @Override
            public void onItemClick(Integer pos) {
                RecommendMusicBean.SonglistBean.DataBean bean = mRecommendMusic.getSonglist().get(pos).getData();
                presenter.getSong(bean.getSongname());
                String picUrl = "http://imgcache.qq.com/music/photo/album_300/17/300_albumpic_" +bean.getAlbumid()+ "_0.jpg";
                mBinder.setMusicMsg(new Music(bean.getSongname(),bean.getSinger().get(0).getName(),picUrl));
            }
        });

        adapter_homepage.setOnFunctionItemClickListener(new HomePageListAdapter.onFunctionItemClickListener() {
            @Override
            public void onItemClick(Integer pos) {
                if(pos == 0){
                    Intent intent = new Intent(getActivity(), RankingListActivity.class);
                    startActivity(intent);
                }
            }
        });

        mSearchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SearchActivity.class);
                startActivity(intent);
            }
        });
    }

    private void loadData() {
        if (presenter != null) {
            presenter.getNewSongLists();
            presenter.getRecommendSong();
        }
    }

    private void initPresenter() {
        presenter = new HomePagePresenterImpl();
        presenter.registerViewCallback(this);
    }

    private void initView(View view) {
        open_nav_btn = (Button) view.findViewById(R.id.open_nav_btn);
        mDrawerLayout = (DrawerLayout) view.findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) view.findViewById(R.id.navigation_view);
        navigationView.inflateHeaderView(R.layout.nav_header);

        recyclerView = (RecyclerView) view.findViewById(R.id.homepage_recyclerview);
        adapter_homepage = new HomePageListAdapter(getActivity());
        recyclerView.setAdapter(adapter_homepage);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false));

        View navHeaderView = navigationView.getHeaderView(0);
        nav_recyclerview = (RecyclerView) navHeaderView.findViewById(R.id.nav_recyclerview);
        recyclerviewAdapter_navigationView = new RecyclerviewAdapter_NavigationView(getActivity());
        nav_recyclerview.setAdapter(recyclerviewAdapter_navigationView);
        nav_recyclerview.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false));
    }

    @Override
    public void onNewSongListLoaded(NewSongBean newSongBeans) {
        Log.d("HomePageFragment", newSongBeans.toString());
         mNewSongList = newSongBeans.getResult();
        adapter_homepage.setNewSongList(mNewSongList);
        adapter_homepage.notifyDataSetChanged();

    }

    @Override
    public void LoadedSongSuccess(String url) {
        Log.d("LoadedSongSuccess ---",url);
        mBinder.setResource(url);
        try {
            mBinder.playMusic();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void onRecommendSongListLoaded(RecommendMusicBean recommendMusicBean) {
        mRecommendMusic = recommendMusicBean;
        Log.d("recommendMusicBean",recommendMusicBean.toString());
        List<RecommendMusicBean.SonglistBean> songlist = recommendMusicBean.getSonglist();
        adapter_homepage.setRecommendSongList(songlist);
        adapter_homepage.notifyDataSetChanged();
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

  /*  @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);

       // getMenuInflater().inflate(R.menu.homepage_item, menu);
        //MenuItem item = menu.findItem(R.id.action_search);
        //SearchView searchView=(SearchView) item.getActionView();

        //searchView.setIconifiedByDefault(false);

     //   SearchView searchView=(SearchView)MenuItemCompat.getActionView(item);
       // searchView.clearFocus();
        //searchView.setIconifiedByDefault(false);
      //  mSearchView = (SearchView) MenuItemCompat.getActionView(item);
       getActivity().getMenuInflater().inflate(R.menu.navigation_menu,menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }*/


}
