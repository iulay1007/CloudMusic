package com.example.cloudmusic.ui.rankingList.view.adapter;

import android.content.Context;
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

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HotSongListAdapter extends RecyclerView.Adapter<HotSongListAdapter.InnerHolder> {
    private Context context;

    private List<RankingListBean.RankBean.ListBean>  mData;

    public void setData(List<RankingListBean.RankBean.ListBean> mData) {
        this.mData = mData;
    }

    public HotSongListAdapter(Context context) {
        this.context = context;
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
    public InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.item_hot_song_list, null);
        return new InnerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HotSongListAdapter.InnerHolder holder, int position) {
        if(mData!=null&&mData.size()!=0){
            RankingListBean.RankBean.ListBean bean = mData.get(position);
            holder.bindData(bean);
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

        @BindView(R.id.rangking_name_tv)
        public TextView rankingNameTV;

        @BindView(R.id.ranking_img_iv)
        public ImageView rankingImgIV;

        public InnerHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }

        void bindData(RankingListBean.RankBean.ListBean bean){
            rankingNameTV.setText(bean.getRankname());
            String picUrl = bean.getImgurl();
            picUrl = picUrl.replace("{size}","480");
            Glide.with(itemView).load(picUrl).apply(RequestOptions.bitmapTransform(new RoundedCorners(30))).into(rankingImgIV);
        }
    }
}
