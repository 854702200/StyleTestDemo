package com.example.styletestdemo.View;

import com.example.styletestdemo.BaseClass.mBaseView;

public interface View_api  extends mBaseView {
    void signload();//登录成功
    void notsignload(String s);//登录失败

}
