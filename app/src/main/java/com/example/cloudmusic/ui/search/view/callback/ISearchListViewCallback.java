package com.example.cloudmusic.ui.search.view.callback;

import com.example.cloudmusic.ui.base.IBaseCallback;
import com.example.cloudmusic.ui.search.model.SearchSongBean;

public interface ISearchListViewCallback extends IBaseCallback {

    void onSearchSongLoaded(SearchSongBean songBean);

    void onLoadedSongSuccess(String url);
}
