package com.example.styletestdemo.View;

import android.content.Intent;
import android.os.Handler;

import com.example.styletestdemo.BaseClass.mBaseActivity;
import com.example.styletestdemo.R;

/**
 * logo初始化界面
 */
public class MainActivity extends mBaseActivity {
    @Override
    public void initView() {
        new Handler().postDelayed(new Thread(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, Sign_Activity.class));
                finish();
            }
        }),500);
    }

    @Override
    public void initDate() {

    }

    @Override
    public void initEvent() {



    }

    @Override
    public int getContentView() {
        return R.layout.activity_main;
    }
}
