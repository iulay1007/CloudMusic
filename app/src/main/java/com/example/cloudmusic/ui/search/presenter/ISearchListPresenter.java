package com.example.cloudmusic.ui.search.presenter;

import com.example.cloudmusic.ui.base.IBasePresenter;
import com.example.cloudmusic.ui.search.view.callback.ISearchListViewCallback;

public interface ISearchListPresenter extends IBasePresenter<ISearchListViewCallback> {
    void searchSong(String name);

    void getSongResource(String songmid);
}
