package com.example.cloudmusic.ui.main.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cloudmusic.R;


public class RecyclerviewAdapter_NavigationView extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public Context context;


    public RecyclerviewAdapter_NavigationView(Context context){
        this.context = context;

    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      //  if(viewType==0)
            return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.navigationview_first_item,parent,false));
       // else // if(viewType==2)
       // return new SomeRecyclerviewViewHolder(LayoutInflater.from(context).inflate(R.layout.navigationview_white_cardview_item,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof MyViewHolder) {

        }
        else if(holder instanceof SomeRecyclerviewViewHolder){

        }
    }

    @Override
    public int getItemViewType(int position) {
      //  if(position==0)
       //     return 0;

            //    return 1;
      return super.getItemViewType(position);
    }

    @Override
    public int getItemCount() {
        return 10;
    }
    class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
    class SomeRecyclerviewViewHolder extends RecyclerView.ViewHolder{
        public SomeRecyclerviewViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
