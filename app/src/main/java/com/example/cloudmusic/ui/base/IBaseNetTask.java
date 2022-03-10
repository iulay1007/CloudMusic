package com.example.cloudmusic.ui.base;


public interface IBaseNetTask<T> {
    void registerPresenterCallback(T callback);

    void unregisterPresenterCallback(T callback);
}
