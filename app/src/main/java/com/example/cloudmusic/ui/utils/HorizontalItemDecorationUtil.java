package com.example.cloudmusic.ui.utils;

import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HorizontalItemDecorationUtil extends RecyclerView.ItemDecoration
{
    private int space;//定义2个Item之间的距离

    public HorizontalItemDecorationUtil(int space) {
        this.space = space;
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        int position = parent.getChildAdapterPosition(view);
        int totalCount = parent.getAdapter().getItemCount();
        if (position == 0) {//第一个
            outRect.left = space;
            outRect.right = space / 2;
        } else if (position == totalCount - 1) {//最后一个
            outRect.left = space / 2;
            outRect.right = space;
        } else {//中间其它的
            outRect.left = space / 2;
            outRect.right = space / 2;
        }
    }
}


