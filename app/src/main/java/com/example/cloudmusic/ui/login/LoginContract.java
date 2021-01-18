package com.example.cloudmusic.ui.login;

import android.content.Context;

public interface LoginContract {
    interface View{
        String getUsername();
        String getPassword();
        void successLogin();
        void failLogin();
        Context getContext();
    }

    interface Presenter{
        void login();
    }
}
