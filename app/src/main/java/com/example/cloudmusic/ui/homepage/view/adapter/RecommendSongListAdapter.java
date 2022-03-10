package com.example.cloudmusic.ui.homepage.view.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.cloudmusic.R;
import com.example.cloudmusic.ui.homepage.model.RecommendMusicBean;
import com.example.cloudmusic.ui.search.view.adapter.SearchListAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecommendSongListAdapter extends RecyclerView.Adapter<RecommendSongListAdapter.InnerHolder> {
    public Context context;

    List<RecommendMusicBean.SonglistBean> mData;

    public void setData(List<RecommendMusicBean.SonglistBean> mData) {
        this.mData = mData;
    }

    public RecommendSongListAdapter(Context context) {
        this.context = context;
    }

    public interface onItemClickListener {
        void onItemClick(Integer pos);
    }

    public void setOnItemClickListener(onItemClickListener listener){
        this.onItemClickListener = listener;
    }

    onItemClickListener onItemClickListener = null;


    @NonNull

    @Override
    public RecommendSongListAdapter.InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.homepage_third_item, null);

        return new InnerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecommendSongListAdapter.InnerHolder holder, int position) {
        List<RecommendMusicBean.SonglistBean> beanList = new ArrayList<>();
        if (mData != null && mData.size() != 0) {
            for (int i = 0; i < 3; i++) {
                if (mData.size() > position * 3 + i) {
                    beanList.add(mData.get(position * 3 + i));
                }
            }
            holder.bindData(beanList);
        }

        holder.firstConstraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mData!=null&&position*3<mData.size())
                onItemClickListener.onItemClick(position*3);
            }
        });

        holder.secondConstraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mData!=null&&position*3+1<mData.size())
                onItemClickListener.onItemClick(position*3+1);
            }
        });

        holder.thirdConstraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mData!=null&&position*3+2<mData.size())
                onItemClickListener.onItemClick(position*3+2);
            }
        });


    }


    @Override
    public int getItemCount() {
        return 10;
    }


    public class InnerHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.imageView_first)
        public ImageView firstIV;

        @BindView(R.id.imageView_second)
        public ImageView secondIV;

        @BindView(R.id.imageView_third)
        public ImageView thirdIV;

        @BindView(R.id.music_name_first)
        public TextView firstTV;

        @BindView(R.id.music_name_second)
        public TextView secondTV;

        @BindView(R.id.music_name_third)
        public TextView thirdTV;

        @BindView(R.id.cons_first)
        public ConstraintLayout firstConstraintLayout;

        @BindView(R.id.cons_second)
        public ConstraintLayout secondConstraintLayout;

        @BindView(R.id.cons_third)
        public ConstraintLayout thirdConstraintLayout;


        public InnerHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bindData(List<RecommendMusicBean.SonglistBean> beanList) {
            RecommendMusicBean.SonglistBean.DataBean data;
            String picUrl;
            if (beanList.get(0) != null) {
                data = beanList.get(0).getData();
                firstTV.setText(data.getSongname());
                picUrl = "http://imgcache.qq.com/music/photo/album_300/17/300_albumpic_" + data.getAlbumid() + "_0.jpg";
                Glide.with(itemView).load(picUrl).apply(RequestOptions.bitmapTransform(new RoundedCorners(30))).into(firstIV);
            }
            if (beanList.get(1) != null) {
                data = beanList.get(1).getData();
                secondTV.setText(data.getSongname());
                picUrl = "http://imgcache.qq.com/music/photo/album_300/17/300_albumpic_" + data.getAlbumid() + "_0.jpg";
                Glide.with(itemView).load(picUrl).apply(RequestOptions.bitmapTransform(new RoundedCorners(30))).into(secondIV);
            } else {
                secondTV.setVisibility(View.GONE);
                secondIV.setVisibility(View.GONE);
            }
            if (beanList.get(2) != null) {
                data = beanList.get(2).getData();
                thirdTV.setText(data.getSongname());
                picUrl = "http://imgcache.qq.com/music/photo/album_300/17/300_albumpic_" + data.getAlbumid() + "_0.jpg";
                Glide.with(itemView).load(picUrl).apply(RequestOptions.bitmapTransform(new RoundedCorners(30))).into(thirdIV);
            } else {
                thirdTV.setVisibility(View.GONE);
                thirdIV.setVisibility(View.GONE);
            }
        }
    }
}
