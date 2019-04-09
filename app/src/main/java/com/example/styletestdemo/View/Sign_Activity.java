package com.example.styletestdemo.View;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;

import com.example.styletestdemo.BaseClass.mBaseActivity;
import com.example.styletestdemo.Present.Present;
import com.example.styletestdemo.R;

import butterknife.BindView;
import butterknife.OnClick;

public class Sign_Activity extends mBaseActivity implements View_api {
    //View注册
    @BindView(R.id.ed_login_user) EditText editText_user;
    @BindView(R.id.ed_login_pwd) EditText editText_pwd;
    //公共数据
    private Present present;


    /**
     * 抽象事件
     */
    @Override
    public void initView() {
        //绑定View
        present = new Present();
        present.attachView(this);

    }

    @Override
    public void initDate() {

    }

    @Override
    public void initEvent() {

    }

    @Override
    public int getContentView() {
        return R.layout.activity_sign_;
    }
    /**
     * 定义的事件
     */


    /**
     * 接口重载事件
     */
    @Override
    public void signload() {
        startActivity(new Intent(Sign_Activity.this,UserActivity.class));//登录成功
        finish();
    }

    @Override
    public void notsignload(String s) {
        ToastShow(this,s); //登录失败
    }

    /**
     * 触发事件
     */
    @OnClick({R.id.bt_login_log,R.id.bt_login_reg})
    public void onClick(View view){
        switch (view.getId()){
            case R.id.bt_login_log:
                present.Requestlogin(editText_user.getText().toString(),editText_pwd.getText().toString());//请求登录
                break;
            case R.id.bt_login_reg:
                    //服务器选择
                break;
                default:
        }
    }


/**
 *  其他相关事件
 */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        present.detachView();//解除绑定事件
    }
}
