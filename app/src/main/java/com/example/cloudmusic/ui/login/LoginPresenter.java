package com.example.cloudmusic.ui.login;

import android.text.TextUtils;
import android.widget.Toast;

import com.example.cloudmusic.ui.login.model.User;
import com.example.cloudmusic.ui.login.model.UserInstance;

public class LoginPresenter implements LoginContract.Presenter {
    private LoginContract.View view;

    public  LoginPresenter(LoginContract.View view){
        this.view=view;
    }

    @Override
    public void login() {
        String username=view.getUsername();
        String password=view.getPassword();
        if(TextUtils.isEmpty(username))
        {
            Toast.makeText(view.getContext(),"请输入用户名",Toast.LENGTH_SHORT).show();
         //   return;
        }
      if(TextUtils.isEmpty(password)){
            Toast.makeText(view.getContext(),"请输入密码",Toast.LENGTH_SHORT).show();
           // return;
        }

       //没有后端支持，无论怎么样都会登录成功qwq
        User user=new User(username,password);
        UserInstance.getInstance().setUser(user);
        view.successLogin();

    }
}
