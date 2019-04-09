package com.example.styletestdemo.API;

import com.example.styletestdemo.Bean.Request_Sign;
import com.example.styletestdemo.Bean.Sign.PostUser;
import com.example.styletestdemo.Bean.Sign.User;
import com.example.styletestdemo.Bean.Sign.User1;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Retrofit_API {
    @POST("ajax/Login")   //初始请求地址
    Observable<User> login(@Body PostUser user);


    @POST("ajax/getDeviceList")   //登录后请求数据
    Observable<User1> request(@Body Request_Sign users);

}
