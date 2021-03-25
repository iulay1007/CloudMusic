package com.example.cloudmusic.ui.login;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.cloudmusic.R;
import com.example.cloudmusic.ui.main.MainActivity;


public class LoginActivity extends AppCompatActivity implements LoginContract.View {
    private Button login_btn;
    private EditText username_et;
    private EditText password_et;
    private LoginContract.Presenter presenter;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window=getWindow();
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(WindowManager.LayoutParams.FLAG_FULLSCREEN);
           getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        setContentView(R.layout.activity_login);
        initView();
        presenter=new LoginPresenter(this);
    }

    private void initView() {
        login_btn=(Button)findViewById(R.id.login_btn);
        username_et=(EditText)findViewById(R.id.username_et);
        password_et=(EditText)findViewById(R.id.password_et);
        login_btn.setOnClickListener(v->{
            presenter.login();
        });
    }

    @Override
    public String getUsername() {
        return username_et.getText().toString();
    }

    @Override
    public String getPassword() {
        return password_et.getText().toString();
    }

    @Override
    public void successLogin() {
        startActivity(new Intent(this, MainActivity.class));
    }

    @Override
    public void failLogin() {

    }

    @Override
    public Context getContext() {
        return this;
    }
}
