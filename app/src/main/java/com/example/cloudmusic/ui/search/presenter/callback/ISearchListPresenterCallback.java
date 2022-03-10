package com.example.cloudmusic.ui.search.presenter.callback;

import com.example.cloudmusic.ui.base.IBaseCallback;
import com.example.cloudmusic.ui.search.model.SearchSongBean;

public interface ISearchListPresenterCallback extends IBaseCallback {
    void loadedSearchSongSuccess(SearchSongBean songBean);

    void loadedSongSuccess(String url) ;

}
