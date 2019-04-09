package com.example.styletestdemo.Present;

import android.view.View;

import com.example.styletestdemo.BaseClass.mBasePresent;
import com.example.styletestdemo.Bean.Sign.User;
import com.example.styletestdemo.Module.Module;
import com.example.styletestdemo.Module.Module_api;
import com.example.styletestdemo.View.View_api;

/**
 *  Present 2019/3/29 逻辑处理界面,Sign_Activity()
 */

public class Present extends mBasePresent<View_api> implements Module_api{
    //公用数据
    private Module module = new Module(this);

    /**
     * 回调的登录数据
     */
    @Override
    public void Sign_CallBack(Boolean b,String s) {
        if (isattachView()){
            if (b == true){
                //允许登录
                getView().signload();

            }else {
                //不允许登录，返回s，通知
                getView().notsignload(s);

            }
        }

    }
//-----------------------↑Moudel回调事件-----------------------我是事件分割线------------------↓View需要执行的事件-------------------------------------

    /**
     * 请求登录
     */
    public void Requestlogin(String n,String p) {
        module.Signload(n,p);
    }
}
