package com.example.cloudmusic.ui.homepage.view.adapter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.cloudmusic.R;
import com.example.cloudmusic.ui.homepage.model.NewSongBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NewSongListAdapter extends RecyclerView.Adapter<NewSongListAdapter.InnerHolder> {
    public Context context;
    List<NewSongBean.ResultBean> mData = null;

    onItemClickListener listener = null;


    interface onItemClickListener{
       void onItemClick(Integer position);
    }

    public void setOnItemClickListener(onItemClickListener listener){
        this.listener = listener;
    }


    public NewSongListAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.item_homepage_recommend_music, null);

        return new InnerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InnerHolder holder, int position) {

        if (mData != null) {
            Log.d("RecommendAdapter", mData.toString());
            NewSongBean.ResultBean data = mData.get(position);
            holder.setData(data);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(position);
            }
        });
    }


    void setData(List<NewSongBean.ResultBean> data) {
        if(data!=null)
        Log.d("RecommendAdapter","setData ==="+ data.toString());
        this.mData = data;
    }


    @Override
    public int getItemCount() {
        if (mData != null)
            return mData.size();
        else return 10;
    }

    static class InnerHolder extends RecyclerView.ViewHolder {
        NewSongBean.ResultBean mData;

        @BindView(R.id.recommend_music_img_iv)
        public ImageView musicImgIv;

        @BindView(R.id.recommend_music_name_tv)
        public TextView musicNameTv;

        public InnerHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void setData(NewSongBean.ResultBean mData) {
            this.mData = mData;
            Glide.with(itemView).load(mData.getPicUrl()).into(musicImgIv);
            musicNameTv.setText(mData.getName());
        }
    }
}
