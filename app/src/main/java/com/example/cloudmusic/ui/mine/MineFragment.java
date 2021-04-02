package com.example.cloudmusic.ui.mine;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.cloudmusic.R;
import com.example.cloudmusic.ui.mine.view.RecyclerViewAdapter_mine;

import java.awt.font.TextAttribute;

public class MineFragment extends Fragment {

    private RecyclerViewAdapter_mine recyclerViewAdapter_mine;
    private RecyclerView mRecyclerview;
    private ImageView imageView;
    private TextView mtext;
    private MyScrollView myScrollView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mine, container, false);
        init(view);
        return view;
    }

    private void init(View view) {
        mRecyclerview=(RecyclerView)view.findViewById(R.id.recyclerview_mine);
        recyclerViewAdapter_mine=new RecyclerViewAdapter_mine(getActivity());
        mRecyclerview.setAdapter(recyclerViewAdapter_mine);
        mRecyclerview.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL,false));
        imageView=(ImageView) view.findViewById(R.id.circle_ig_mine);
       // mtext=(TextView)view.findViewById(R.id.tvte);
        myScrollView=(MyScrollView)view.findViewById(R.id.myscrollView);
        imageView.setVisibility(View.GONE);
        mRecyclerview.addOnScrollListener(new RecyclerView.OnScrollListener() {
          @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
              LinearLayoutManager layoutManager = (LinearLayoutManager) mRecyclerview.getLayoutManager();
              int position = layoutManager.findFirstVisibleItemPosition();
              if(position == 0){
                  imageView.setVisibility(View.GONE);
              }else {
                  imageView.setVisibility(View.VISIBLE);
              }
                /*recyclerViewAdapter_mine.setItemScrollListener(new RecyclerViewAdapter_mine.ItemScrollListener() {
                    @Override
                    public void onScrollChanged(TextView textView,int y) {
                        if(dy>textView.getHeight())
                            textView.setVisibility(View.VISIBLE);
                        Log.d("scr","======>1dy  "+dy);
                        Log.d("scr","======>dy  "+dy+"====>y"+y);
                    }
                });*/

              //  Log.d("scr","======>2dy  "+dy);
               // if(dy>30)
                 //   textView.setVisibility(View.VISIBLE);
              //  Log.d("scr","======>"+dy);

             //   else
               //     textView.setVisibility(View.GONE);
            }

            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }
        });
        myScrollView.setScrollViewListener(new MyScrollView.ScrollViewListener() {
            @Override
            public void onScrollChanged(MyScrollView scrollView, int x, int y, int oldx, int oldy) {
                
              /*  if (y > mtext.getHeight())

                    textView.setVisibility(View.VISIBLE);
                else
                    textView.setVisibility(View.GONE);*/
            }
        });
    }
}
