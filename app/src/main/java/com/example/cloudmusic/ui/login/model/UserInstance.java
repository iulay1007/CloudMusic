package com.example.cloudmusic.ui.login.model;

public class UserInstance {
    private User user;
    private static UserInstance instance=new UserInstance();
    private UserInstance(){

        //User的本地实例，即已登录过后无需再登录
    }

    public static UserInstance getInstance(){
        return instance;
    }

    public void setUser(User user){
        this.user=user;
    }
}
