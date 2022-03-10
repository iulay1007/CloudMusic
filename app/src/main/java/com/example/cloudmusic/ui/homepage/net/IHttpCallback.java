package com.example.cloudmusic.ui.homepage.net;

import java.io.IOException;

public interface IHttpCallback {
    <T> void onLoadedSuccess(T result)throws IOException;
}
