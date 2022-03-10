package com.example.cloudmusic.ui.search.presenter.impl;

import com.example.cloudmusic.ui.search.model.SearchSongBean;
import com.example.cloudmusic.ui.search.net.SearchListNetTask;
import com.example.cloudmusic.ui.search.presenter.ISearchListPresenter;
import com.example.cloudmusic.ui.search.presenter.callback.ISearchListPresenterCallback;
import com.example.cloudmusic.ui.search.view.callback.ISearchListViewCallback;

import java.io.IOException;

public class SearchListPresenterImpl implements ISearchListPresenter, ISearchListPresenterCallback {
    ISearchListViewCallback viewCallback ;

    private SearchListNetTask netTask = new SearchListNetTask();

    public SearchListPresenterImpl() {
        netTask.registerPresenterCallback(this);
    }

    @Override
    public void searchSong(String name) {
        netTask.searchSong(name);
    }

    @Override
    public void getSongResource(String songmid) {
        try {
            netTask.getSongSource(songmid);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void registerViewCallback(ISearchListViewCallback callback) {
            this.viewCallback = callback;
    }

    @Override
    public void unregisterViewCallback(ISearchListViewCallback callback) {
            this.viewCallback = null;
    }

    @Override
    public void loadedSearchSongSuccess(SearchSongBean songBean) {
        viewCallback.onSearchSongLoaded(songBean);
    }

    @Override
    public void loadedSongSuccess(String url) {
        viewCallback.onLoadedSongSuccess(url);
    }

    @Override
    public void onError() {

    }

    @Override
    public void onLoading() {

    }

    @Override
    public void onEmpty() {

    }
}
