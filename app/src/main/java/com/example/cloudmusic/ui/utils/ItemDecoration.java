package com.example.cloudmusic.ui.utils;

import android.graphics.Rect;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public class ItemDecoration extends RecyclerView.ItemDecoration {
    private int space;

    public ItemDecoration(int space) {
        this.space = space;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        //不是第一个的格子都设一个左边和底部的间距

        outRect.bottom = space;

        outRect.left = space;
        outRect.right = space;
        outRect.top = space;

        //由于每行都只有3个，所以第一个都是3的倍数，把左边距设为0
        //if (parent.getChildLayoutPosition(view) %4==0) {
         //   outRect.left = 0;
       // }
    }


}
