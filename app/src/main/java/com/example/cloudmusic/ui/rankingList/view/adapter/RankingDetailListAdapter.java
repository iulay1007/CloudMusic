package com.example.cloudmusic.ui.rankingList.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cloudmusic.R;
import com.example.cloudmusic.ui.rankingList.model.RankBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RankingDetailListAdapter extends RecyclerView.Adapter<RankingDetailListAdapter.InnerHolder> {
    private Context context;

    private List<RankBean.SongsBean.ListBean>  mData;

    public void setData(List<RankBean.SongsBean.ListBean> mData) {
        this.mData = mData;
    }

    public RankingDetailListAdapter(Context context) {
        this.context = context;
    }

    onItemClickListener listener = null;


    public interface onItemClickListener{
        void onItemClick(String hash);
    }

    public void setOnItemClickListener(onItemClickListener listener){
        this.listener = listener;
    }


    @NonNull
    @Override
    public RankingDetailListAdapter.InnerHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        return new InnerHolder(LayoutInflater.from(context).inflate(R.layout.item_song_list,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull  RankingDetailListAdapter.InnerHolder holder, int position) {
        if(mData!=null){
            holder.bindData(mData.get(position),position);
        }
        if(listener!=null&&mData!=null){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick( mData.get(position).getHash());
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

        @BindView(R.id.pos_tv)
        public TextView posTV;

        @BindView(R.id.music_name_tv)
        public TextView musicNameTV;

        @BindView(R.id.singer_name_tv)
        public TextView singerNameTV;

        public InnerHolder(@NonNull  View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }

        public void bindData(RankBean.SongsBean.ListBean bean,int pos) {
            pos++;
            posTV.setText(pos+"");
            String[] strs = bean.getFilename().split("-");
            musicNameTV.setText(strs[1].trim());
            singerNameTV.setText(strs[0].trim());
        }
    }
}
