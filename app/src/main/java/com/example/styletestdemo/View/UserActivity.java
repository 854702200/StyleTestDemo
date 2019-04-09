package com.example.styletestdemo.View;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.ImageView;

import com.example.styletestdemo.BaseClass.mBaseActivity;
import com.example.styletestdemo.R;
import com.example.styletestdemo.View.fragment.Retrospective;
import com.example.styletestdemo.customview.RippleBackground;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class UserActivity extends mBaseActivity {
    //初始化控件
    @BindView(R.id.main_menu) RippleBackground rippleBackground;

    /**
     * 基础事件
     */

    @Override
    public void initView() {
        rippleBackground.startRippleAnimation();//波纹背景
    }

    @Override
    public void initDate() {

    }

    @Override
    public void initEvent() {
        //在这里绑定fragment
        replaceFragment(new Retrospective());


    }

    @Override
    public int getContentView() {
        return R.layout.user_activtiy;
    }
    /**
     * 用户事件
     */
    private void replaceFragment(Fragment f){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.main_content,f);
//        transaction.addToBackStack(null);
        transaction.commit();
     }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
