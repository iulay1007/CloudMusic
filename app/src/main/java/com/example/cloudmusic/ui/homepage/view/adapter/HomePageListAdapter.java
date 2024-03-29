package com.example.cloudmusic.ui.homepage.view.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.cloudmusic.R;
import com.example.cloudmusic.ui.homepage.model.BannerBean;
import com.example.cloudmusic.ui.homepage.model.NewSongBean;
import com.example.cloudmusic.ui.homepage.model.RecommendMusicBean;
import com.example.cloudmusic.ui.utils.HorizontalItemDecorationUtil;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;

import java.util.List;

public class HomePageListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public Context context;


    List<NewSongBean.ResultBean> newSongList;

    public void setRecommendSongList(List<RecommendMusicBean.SonglistBean> recommendSongList) {
        this.recommendSongList = recommendSongList;
    }

    private List<RecommendMusicBean.SonglistBean> recommendSongList;

    public HomePageListAdapter(Context context) {
        this.context = context;

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 0)
            return new BannerViewHolder(LayoutInflater.from(context).inflate(R.layout.homepage_banner, parent, false));
        else if (viewType == 1)
            return new Recyclerview_one_Holder(LayoutInflater.from(context).inflate(R.layout.homepage_recyclerview_one, parent, false));
        else if (viewType == 2)
            return new Recyclerview_two_Holder(LayoutInflater.from(context).inflate(R.layout.homepage_recyclerview_two, parent, false));
        else
            return new Recyclerview_three_Holder(LayoutInflater.from(context).inflate(R.layout.homepage_recyclerview_three, parent, false));

    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0)
            return 0;
        else if (position == 1)
            return 1;
        else if (position == 2)
            return 2;
        else if (position == 3)
            return 3;
        return 2;
        //  return super.getItemViewType(position);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof BannerViewHolder) {

        } else if (holder instanceof Recyclerview_one_Holder) {
            if (onFunctionItemClickListener!=null)
            ((Recyclerview_one_Holder)holder).setOnClickListener(onFunctionItemClickListener);

        } else if (holder instanceof Recyclerview_two_Holder) {
            if (newSongList != null) {
                Log.d("Recyclerview_two_Holder", newSongList.toString());
                ((Recyclerview_two_Holder) holder).setSongMsgData(newSongList);
            }

            if (onNewSongItemClickListener != null) {
                ((Recyclerview_two_Holder) holder).setOnClickListener(onNewSongItemClickListener);
            }

        } else if (holder instanceof Recyclerview_three_Holder) {
            if (recommendSongList != null && recommendSongList.size() != 0) {
                ((Recyclerview_three_Holder) holder).setData(recommendSongList);
            }

            if (onRecommendItemClickListener != null) {
                ((Recyclerview_three_Holder) holder).setOnClickListener(onRecommendItemClickListener);
            }
        }


    }
    onNewSongItemClickListener onNewSongItemClickListener = null;

    public interface onNewSongItemClickListener {
        void onItemClick(Integer pos);
    }

    public void setOnNewSongItemClickListener(onNewSongItemClickListener listener) {
        this.onNewSongItemClickListener = listener;
    }

    onRecommendItemClickListener onRecommendItemClickListener = null;

    public interface onRecommendItemClickListener {
        void onItemClick(Integer pos);
    }

    public void setOnRecommendItemClickListener(onRecommendItemClickListener listener) {
        this.onRecommendItemClickListener = listener;
    }

    onFunctionItemClickListener onFunctionItemClickListener = null;

    public interface onFunctionItemClickListener {
        void onItemClick(Integer pos);
    }

    public void setOnFunctionItemClickListener(onFunctionItemClickListener listener) {
        this.onFunctionItemClickListener = listener;
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class BannerViewHolder extends RecyclerView.ViewHolder {

        private Banner banner;

        public BannerViewHolder(@NonNull View itemView) {
            super(itemView);
            banner = (Banner) itemView.findViewById(R.id.banner);
            banner.setAdapter(new BannnerAdapter(BannerBean.getData()) {
                @Override
                public void onBindView(BannerViewHolder holder, BannerBean data, int position, int size) {
                    //图片加载自己实现
                    Glide.with(holder.itemView)
                            .load(data.imageRes)
                            .into(holder.imageView);
                }
            })
                    .setIndicator(new CircleIndicator(context)).setBannerRound(30);
        }


    }

    class Recyclerview_one_Holder extends RecyclerView.ViewHolder {
        private RecyclerView recyclerView_one;
        private RecyclerViewAdapter_first adapter_one;

        public Recyclerview_one_Holder(@NonNull View itemView) {
            super(itemView);
            recyclerView_one = (RecyclerView) itemView.findViewById(R.id.recyclerview_one);
            adapter_one = new RecyclerViewAdapter_first(context);
            recyclerView_one.setAdapter(adapter_one);
            recyclerView_one.setLayoutManager(new LinearLayoutManager(context, RecyclerView.HORIZONTAL, false));
            recyclerView_one.addItemDecoration(new HorizontalItemDecorationUtil(30));
        }

        public void setOnClickListener(onFunctionItemClickListener listener){
            adapter_one.setOnItemClickListener(new RecyclerViewAdapter_first.onItemClickListener() {
                @Override
                public void onItemClick(Integer pos) {
                    listener.onItemClick(pos);
                }
            });
        }
        }


    class Recyclerview_two_Holder extends RecyclerView.ViewHolder {
        private RecyclerView recyclerView_two;
        private NewSongListAdapter adapter_two;

        public Recyclerview_two_Holder(@NonNull View itemView) {
            super(itemView);
            recyclerView_two = (RecyclerView) itemView.findViewById(R.id.recyclerview_two);
            adapter_two = new NewSongListAdapter(context);
            recyclerView_two.setAdapter(adapter_two);
            recyclerView_two.setLayoutManager(new LinearLayoutManager(context, RecyclerView.HORIZONTAL, false));
            recyclerView_two.addItemDecoration(new HorizontalItemDecorationUtil(20));

        }

        void setSongMsgData(List<NewSongBean.ResultBean> data) {
            adapter_two.setData(data);
            adapter_two.notifyDataSetChanged();
        }


        void setOnClickListener(onNewSongItemClickListener onClickListener) {
            adapter_two.setOnItemClickListener(new NewSongListAdapter.onItemClickListener() {
                @Override
                public void onItemClick(Integer pos) {
                    onClickListener.onItemClick(pos);
                }
            });
        }
    }

    public void setNewSongList(List<NewSongBean.ResultBean> newSongList) {
        if (newSongList != null)
            Log.d("setRecommendSongList", newSongList.toString());
        this.newSongList = newSongList;
    }


    class Recyclerview_three_Holder extends RecyclerView.ViewHolder {

        private RecyclerView recyclerView_three;
        private RecommendSongListAdapter adapter_third;

        public Recyclerview_three_Holder(@NonNull View itemView) {
            super(itemView);
            recyclerView_three = (RecyclerView) itemView.findViewById(R.id.recyclerview_three);
            adapter_third = new RecommendSongListAdapter(context);
            recyclerView_three.setAdapter(adapter_third);
            recyclerView_three.setLayoutManager(new LinearLayoutManager(context, RecyclerView.HORIZONTAL, false));
            //recyclerView_three.addItemDecoration(new HorizontalItemDecorationUtil(20));
            //   recyclerView_three.setOnFlingListener(null); // 这行代码必须加上如果不加将会报一个错误

            new PagerSnapHelper().attachToRecyclerView(recyclerView_three);
// 滑动时使父布局不响应事件
            //  recycleView.setOnTouchListener(DisInterceptTouchListener())
        }

        public void setData(List<RecommendMusicBean.SonglistBean> data) {
            adapter_third.setData(data);
            adapter_third.notifyDataSetChanged();
        }

        public void setOnClickListener(HomePageListAdapter.onRecommendItemClickListener onRecommendItemClickListener) {
            adapter_third.setOnItemClickListener(new RecommendSongListAdapter.onItemClickListener() {
                @Override
                public void onItemClick(Integer pos) {
                    onRecommendItemClickListener.onItemClick(pos);
                }
            });
        }
    }


}
