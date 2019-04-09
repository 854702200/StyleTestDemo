package com.example.styletestdemo.BaseClass;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Toast;

import com.example.styletestdemo.R;

import butterknife.ButterKnife;

public abstract class mBaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //屏幕设置非旋转
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        /**
         * 界面布局装载
         */
        ActionBar actionBar =getSupportActionBar();
        if (actionBar!=null){
            actionBar.hide();
        }
        /**
         * 事件初始化
         */
        ButterKnife.bind(this);//绑定Butterknife
        initView();
        initDate();
        initEvent();
    }

    /**
     * 抽象类
     */
    public abstract void  initView();

    public abstract void  initDate();

    public abstract void  initEvent();

    public abstract int getContentView();
    /**
     * 重载的事件
     */
    private long exitTime = 0;
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_DOWN) {
            if ((System.currentTimeMillis() - exitTime) > 1000) {
                Toast.makeText(getApplicationContext(), "再按一次退出程序", Toast.LENGTH_SHORT).show();
                exitTime = System.currentTimeMillis();
            } else {
                finish();
                System.exit(0);
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    /**
     * Toast显示
     */
    public void ToastShow(Context context,String s){
        Toast.makeText(context,s,Toast.LENGTH_LONG).show();
    }
    /**
     * Log显示
     */
    public void LogShow(String s){
        Log.e("测试输出==","");
    }
}
