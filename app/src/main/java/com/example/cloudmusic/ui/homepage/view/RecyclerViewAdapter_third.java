package com.example.cloudmusic.ui.homepage.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cloudmusic.R;

public class RecyclerViewAdapter_third extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public Context context;

    public RecyclerViewAdapter_third(Context context) {
        this.context=context;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= View.inflate(context, R.layout.homepage_third_item,null);

        return new RecyclerViewAdapter_third.MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
