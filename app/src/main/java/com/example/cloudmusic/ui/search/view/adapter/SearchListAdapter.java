package com.example.cloudmusic.ui.search.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cloudmusic.R;
import com.example.cloudmusic.ui.search.model.SearchSongBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchListAdapter extends RecyclerView.Adapter<SearchListAdapter.InnerHolder>{

    private List<SearchSongBean.DataBean.SongBean.ListBean> mData;

    public Context context;

    public interface onItemClickListener {
        void onItemClick(Integer pos);
    }

    public void setOnItemClickListener(onItemClickListener listener){
        this.onItemClickListener = listener;
    }

   onItemClickListener onItemClickListener = null;


    public SearchListAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public InnerHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        return new InnerHolder(LayoutInflater.from(context).inflate(R.layout.item_search_music, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull  SearchListAdapter.InnerHolder holder, int position) {
       if(mData!=null)
        holder.setData(mData.get(position));
       holder.itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(onItemClickListener!=null){
                    onItemClickListener.onItemClick(position);
               }
           }
       });

    }

    @Override
    public int getItemCount() {
        if (mData!=null)
        return mData.size();
        return 10;
    }

    public void setData(List<SearchSongBean.DataBean.SongBean.ListBean> mData) {
        this.mData = mData;
    }

    public class InnerHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.music_name_tv)
        public TextView musicNameTv;

        @BindView(R.id.singer_name_tv)
        public TextView singerNameTv;

        public InnerHolder(@NonNull  View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }

        public void setData(SearchSongBean.DataBean.SongBean.ListBean bean){
            musicNameTv.setText(bean.getSongname());
            String albumname = bean.getAlbumname();
            if(albumname!=null&&albumname.length()!=0)
            {
                albumname = " - "+albumname;
            }
            singerNameTv.setText(bean.getSinger().get(0).getName()+albumname);
        }
    }
}
