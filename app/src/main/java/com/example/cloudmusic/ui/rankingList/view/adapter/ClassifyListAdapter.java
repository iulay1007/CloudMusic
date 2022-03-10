package com.example.cloudmusic.ui.rankingList.view.adapter;

import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.cloudmusic.R;
import com.example.cloudmusic.ui.homepage.view.adapter.NewSongListAdapter;
import com.example.cloudmusic.ui.rankingList.model.RankingListBean;
import com.example.cloudmusic.ui.utils.ScreenSizeUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ClassifyListAdapter extends RecyclerView.Adapter<ClassifyListAdapter.InnerHolder> {

    private List<RankingListBean.RankBean.ListBean> mData;

    public void setData(List<RankingListBean.RankBean.ListBean> mData) {
        this.mData = mData;
    }

    onItemClickListener listener = null;


    interface onItemClickListener{
        void onItemClick(Integer rankid);
    }

    public void setOnItemClickListener(onItemClickListener listener){
        this.listener = listener;
    }

    @NonNull
    @Override
    public InnerHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_classify_ranking_list, parent, false);
        Point point= ScreenSizeUtils.getScreenSize(itemView.getContext());
        RecyclerView.LayoutParams layoutParams=new RecyclerView.LayoutParams((int) (point.x/3.5),(int) (point.x/3));
        itemView.setLayoutParams(layoutParams);

        return new InnerHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ClassifyListAdapter.InnerHolder holder, int position) {
        if(mData!=null){
            holder.setData(mData.get(position));
        }
        if(listener!=null){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(mData.get(position).getRankid());
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        if(mData!=null)
            return mData.size();
        return 10;
    }

    public class InnerHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.rank_name_tv)
        public TextView rankNameTV;

        @BindView(R.id.image_iv)
        public ImageView imageView;

        @BindView(R.id.update_frequency_tv)
        public TextView updateFrequencyTV;

        public InnerHolder(@NonNull  View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
            Point point= ScreenSizeUtils.getScreenSize(itemView.getContext());
        }

        public void setData(RankingListBean.RankBean.ListBean bean) {
            rankNameTV.setText(bean.getRankname());
            updateFrequencyTV.setText(bean.getUpdate_frequency()+"更新");
            String picUrl = bean.getImgurl();
            picUrl = picUrl.replace("{size}","480");
            Glide.with(itemView).load(picUrl).apply(RequestOptions.bitmapTransform(new RoundedCorners(30))).into(imageView);
        }
    }
}
