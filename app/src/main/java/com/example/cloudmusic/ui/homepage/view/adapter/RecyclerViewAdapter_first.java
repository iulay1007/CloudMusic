package com.example.cloudmusic.ui.homepage.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cloudmusic.R;
import com.example.cloudmusic.ui.search.view.adapter.SearchListAdapter;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecyclerViewAdapter_first extends RecyclerView.Adapter<RecyclerViewAdapter_first.MyViewHolder> {
    public Context context;

    private Map<Integer, String> mData = new HashMap<>();


    public RecyclerViewAdapter_first(Context context) {
        this.context = context;
        mData.put(0, "排行榜");

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
    public RecyclerViewAdapter_first.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.homepage_first_item, null);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter_first.MyViewHolder holder, int position) {
        if(mData!=null&&mData.size()!=0&&mData.get(0)!=null){
            holder.setData(mData.get(0));
        }
        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickListener.onItemClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (mData != null && mData.size() != 0)
            return mData.size();
        return 10;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.cons_layout)
        public ConstraintLayout constraintLayout;

        @BindView(R.id.name_tv)
        public TextView nameTv;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void setData(String name){
            nameTv.setText(name);
        }

    }
}
