package com.example.cloudmusic.ui.mine.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cloudmusic.R;

public class RecyclerViewAdapter_mine extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private Context context;
    private ItemScrollListener itemScrollListener=null;
    public RecyclerViewAdapter_mine(Context context) {
        this.context=context;
    }


    public interface ItemScrollListener{
        void onScrollChanged(TextView textView,int y);
    }
    public void setItemScrollListener(ItemScrollListener itemScrollListener){
        this.itemScrollListener=itemScrollListener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 0)
            return new RecyclerViewAdapter_mine.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.mine_item_first, parent, false));
        else if(viewType==1)
            return new RecyclerViewAdapter_mine.SecondViewHolder(LayoutInflater.from(context).inflate(R.layout.mine_item_second,parent,false));
        return null;
    }


    @Override
    public int getItemViewType(int position) {
        if(position==0)
            return 0;
        else return 1;
      //  return super.getItemViewType(position);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof MyViewHolder) {
            ((MyViewHolder) holder).textView.getHeight();
            if(itemScrollListener!=null)
            itemScrollListener.onScrollChanged(((MyViewHolder) holder).textView,((MyViewHolder) holder).textView.getHeight());
        }
            //else if
    }

    @Override
    public int getItemCount() {
        return 30;
    }
    class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.myFravoriteMusic_tv);
        }
    }
    class SecondViewHolder extends RecyclerView.ViewHolder {
        public SecondViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
