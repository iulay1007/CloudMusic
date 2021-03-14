package com.example.cloudmusic.ui.homepage.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.cloudmusic.R;
import com.example.cloudmusic.ui.homepage.model.BannerBean;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;

public class RecyclerViewAdapter_homepage extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public Context context;


    public RecyclerViewAdapter_homepage(Context context){
        this.context = context;


    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 0)
            return new BannerViewHolder(LayoutInflater.from(context).inflate(R.layout.homepage_banner, parent, false));
        else if(viewType==1)
            return new Recyclerview_one_Holder(LayoutInflater.from(context).inflate(R.layout.homepage_recyclerview_one, parent, false));
        else
            return new Recyclerview_two_Holder(LayoutInflater.from(context).inflate(R.layout.homepage_recyclerview_two, parent, false));


    }

    @Override
    public int getItemViewType(int position) {
        if(position==0)
            return 0;
        else if(position==1)
            return 1;
        else if (position==2)
            return 2;

       return super.getItemViewType(position);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof BannerViewHolder) {

        }
        else if(holder instanceof Recyclerview_one_Holder ){

        }
        else if(holder instanceof Recyclerview_two_Holder){


        }

    }

    @Override
    public int getItemCount() {
        return 10;
    }
    class BannerViewHolder extends RecyclerView.ViewHolder {

        private Banner banner;
        public BannerViewHolder(@NonNull View itemView) {
            super(itemView);
            banner=(Banner)itemView.findViewById(R.id.banner);
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
    class Recyclerview_one_Holder extends RecyclerView.ViewHolder{
        private RecyclerView recyclerView_one;
        private RecyclerViewAdapter_first adapter_one;

        public Recyclerview_one_Holder(@NonNull View itemView) {
            super(itemView);
            recyclerView_one=(RecyclerView)itemView.findViewById(R.id.recyclerview_one);
            adapter_one=new RecyclerViewAdapter_first(context);
            recyclerView_one.setAdapter(adapter_one);
            recyclerView_one.setLayoutManager(new LinearLayoutManager(context,RecyclerView.HORIZONTAL,false));
            recyclerView_one.addItemDecoration(new HorizontalItemDecoration(30));


        }
    }
    class Recyclerview_two_Holder extends RecyclerView.ViewHolder{
        private RecyclerView recyclerView_two;
        private RecyclerViewAdapter_second adapter_two;

        public Recyclerview_two_Holder(@NonNull View itemView) {
            super(itemView);
            recyclerView_two=(RecyclerView)itemView.findViewById(R.id.recyclerview_two);
            adapter_two=new RecyclerViewAdapter_second(context);
            recyclerView_two.setAdapter(adapter_two);
            recyclerView_two.setLayoutManager(new LinearLayoutManager(context,RecyclerView.HORIZONTAL,false));
            recyclerView_two.addItemDecoration(new HorizontalItemDecoration(20));

        }
    }



}
