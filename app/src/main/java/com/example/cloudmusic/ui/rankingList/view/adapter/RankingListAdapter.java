package com.example.cloudmusic.ui.rankingList.view.adapter;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cloudmusic.R;
import com.example.cloudmusic.ui.homepage.view.adapter.NewSongListAdapter;
import com.example.cloudmusic.ui.rankingList.model.RankBean;
import com.example.cloudmusic.ui.rankingList.model.RankingListBean;
import com.example.cloudmusic.ui.utils.HorizontalItemDecorationUtil;
import com.example.cloudmusic.ui.utils.ItemDecoration;
import com.example.cloudmusic.ui.utils.ScreenSizeUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import butterknife.BindView;
import butterknife.ButterKnife;

@RequiresApi(api = Build.VERSION_CODES.N)
public class RankingListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;

    public RankingListAdapter(Context context) {
        this.context = context;
        for (int i = 0; i < 6; i++) {
            categoryList.add(new ArrayList<>());
        }
    }

   onItemClickListener listener = null;


    public interface onItemClickListener{
        void onItemClick(Integer rankid);
    }

    public void setOnItemClickListener(onItemClickListener listener){
        this.listener = listener;
    }


    private List<RankingListBean.RankBean.ListBean> mData;

    private List<List<RankingListBean.RankBean.ListBean>> categoryList = new ArrayList<>();

    private PriorityQueue<RankingListBean.RankBean.ListBean> priorityQueue = new PriorityQueue<>(new Comparator<RankingListBean.RankBean.ListBean>() {
        @Override
        public int compare(RankingListBean.RankBean.ListBean o1, RankingListBean.RankBean.ListBean o2) {
            return o1.getPlay_times() - o2.getPlay_times();
        }
    });

    public void setData(List<RankingListBean.RankBean.ListBean> mData) {
        this.mData = mData;
        for (int i = 0; i < mData.size(); i++) {
            RankingListBean.RankBean.ListBean bean = mData.get(i);
            if (priorityQueue.size() < 3) {
                priorityQueue.add(bean);
            } else {
                if (priorityQueue.peek().getPlay_times() < bean.getPlay_times()) {
                    priorityQueue.poll();
                    priorityQueue.add(bean);
                }
            }
            int classify = bean.getClassify();
            if (classify == 1) {
                categoryList.get(1).add(bean);
            } else if (classify == 2) {
                categoryList.get(2).add(bean);
            } else if (classify == 5) {
                categoryList.get(3).add(bean);
            } else if (classify == 3) {
                categoryList.get(4).add(bean);
            } else if (classify == 4) {
                categoryList.get(5).add(bean);
            }
        }

        if (priorityQueue != null) {
            int size = priorityQueue.size();
            for (int i = 0; i < size; i++) {
                categoryList.get(0).add(priorityQueue.poll());
            }
        }

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 1)
            return new HotSongInnerHolder(LayoutInflater.from(context).inflate(R.layout.item_rangking_list_type_one, parent, false));
        else
            return new ClassifyInnerHolder(LayoutInflater.from(context).inflate(R.layout.item_rangking_list_type_two, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (position == 1) {
            ((HotSongInnerHolder) holder).setData(categoryList.get(1));
            if(listener!=null){
                ((HotSongInnerHolder) holder).setOnItemClickListener(listener);
            }
        } else {
            ((ClassifyInnerHolder) holder).setData(categoryList.get(position));
            ((ClassifyInnerHolder) holder).setTitle(getTitle(position));
            if(listener!=null){
                ((ClassifyInnerHolder) holder).setOnItemClickListener(listener);
            }

        }

    }

    String getTitle(int pos) {
        if (pos == 0)
            return "推荐";
        if (pos == 2)
            return "新歌榜";
        if (pos == 3)
            return "曲风榜";
        if (pos == 4)
            return "特色榜";
        if (pos == 5)
            return "全球榜";
        return "";
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 1)
            return 1;
        return 2;
    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class HotSongInnerHolder extends RecyclerView.ViewHolder {

        List<RankingListBean.RankBean.ListBean> mData;

        private HotSongListAdapter listAdapter;

        @BindView(R.id.listview)
        public RecyclerView mListView;

        public HotSongInnerHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            listAdapter = new HotSongListAdapter(context);
            mListView.setLayoutManager(new LinearLayoutManager(context, RecyclerView.VERTICAL, false));
            mListView.setAdapter(listAdapter);
        }

        public void setData(List<RankingListBean.RankBean.ListBean> data) {
            this.mData = data;
            //update
            listAdapter.setData(data);
            listAdapter.notifyDataSetChanged();
        }

        public void setOnItemClickListener(onItemClickListener listener){
            listAdapter.setOnItemClickListener(new HotSongListAdapter.onItemClickListener() {
                @Override
                public void onItemClick(Integer rankid) {
                    listener.onItemClick(rankid);
                }
            });
        }
    }

    public class ClassifyInnerHolder extends RecyclerView.ViewHolder {

        List<RankingListBean.RankBean.ListBean> mData;

        @BindView(R.id.list_view)
        public RecyclerView mListView;

        private ClassifyListAdapter listAdapter;

        @BindView(R.id.title_tv)
        public TextView mTitleTV;

        public ClassifyInnerHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            listAdapter = new ClassifyListAdapter();
            mListView.setLayoutManager(new GridLayoutManager(context, 3));
            int screenSize = (int) (ScreenSizeUtils.getScreenSize(context).x);
            int space = (int) ((1 - 3 / 3.5) * screenSize / 6);
            Log.d("space", space + "");
            mListView.addItemDecoration(new ItemDecoration(space));
            mListView.setAdapter(listAdapter);
        }

        public void setData(List<RankingListBean.RankBean.ListBean> data) {
            this.mData = data;
            listAdapter.setData(mData);
            listAdapter.notifyDataSetChanged();
        }

        public void setTitle(String title) {
            mTitleTV.setText(title);
        }

        public void setOnItemClickListener(onItemClickListener listener){
            listAdapter.setOnItemClickListener(new ClassifyListAdapter.onItemClickListener() {
                @Override
                public void onItemClick(Integer rankid) {
                    listener.onItemClick(rankid);
                }
            });
        }

    }
}
