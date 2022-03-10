package com.example.cloudmusic.ui.search.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.cloudmusic.R;
import com.example.cloudmusic.ui.search.model.SearchSongBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchActivity extends AppCompatActivity {

    @BindView(R.id.search_et)
    public EditText searchEt;

    List<SearchSongBean.DataBean.SongBean.ListBean> searchList;

    private Context context;

    @BindView(R.id.back_btn)
    public ImageView mBackBtn;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ButterKnife.bind(this);
        context = this;
        initListener();
        initPresenter();
    }

    private void initPresenter() {

    }

    private void initListener() {
        searchEt.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                    String input = v.getText().toString();
                    Log.d("searchEt", input);
                    if (input.length() != 0) {
                        Intent intent = new Intent(context, SearchListListActivity.class);
                        intent.putExtra("searchMsg", input);
                        startActivity(intent);
                    }

                }
                return false;
            }
        });

        mBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


}
