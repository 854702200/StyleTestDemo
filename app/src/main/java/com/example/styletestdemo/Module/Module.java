package com.example.styletestdemo.Module;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.widget.Toast;

import com.example.styletestdemo.API.Retrofit_API;
import com.example.styletestdemo.Bean.Request_Sign;
import com.example.styletestdemo.Bean.Sign.PostUser;
import com.example.styletestdemo.Bean.Sign.User;
import com.example.styletestdemo.Bean.Sign.User1;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class Module {
    private Module_api module_api;

    public Module(Module_api module_api) {
        this.module_api = module_api;
    }

    /** 判断网络是否连接 */
    public boolean isConnectIsNomarl(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService(context.CONNECTIVITY_SERVICE);
        NetworkInfo info = connectivityManager.getActiveNetworkInfo();
        if (info != null && info.isAvailable()) {
            String intentName = info.getTypeName();
            Log.i("通了没", "当前网络名称：" + intentName);
            return true;
        } else {
            Log.i("通了没", "没有可用网络");
            return false;
        }
    }

    /**
     *  登录验证
     */
    public void Signload(final String n , final String p){
        String url = "http://47.101.34.42/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        Retrofit_API retrofit_api = retrofit.create(Retrofit_API.class);
        Observable<User> observable = retrofit_api.login(new PostUser(n,p,"phone"));
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<User>() {
                    private Disposable dd;
                    @Override
                    public void onSubscribe(Disposable d) {
                        dd = d;
                    }

                    @Override
                    public void onNext(User user) {
                        //user.getToken需要保存
                        Request_Sign request_sign = new Request_Sign(user.getToken());
                        String s = user.getMessage();

                        Signload1(user.getToken());

                        if (s.equals("成功")){
                            module_api.Sign_CallBack(true,s);
                        }else {
                            module_api.Sign_CallBack(false,s);
                        }



                    }

                    @Override
                    public void onError(Throwable e) {
                        module_api.Sign_CallBack(false,"请检查服务器地址");
                        Log.e("module==","登录验证失败:" + e);
                    }

                    @Override
                    public void onComplete() {
                        dd.dispose();//关闭连接
                    }
                });

    }


    public void Signload1(String t){
        String url = "http://47.101.34.42/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        Retrofit_API retrofit_api = retrofit.create(Retrofit_API.class);
        Observable<User1> observable = retrofit_api.request(new Request_Sign(t));
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<User1>() {
                    private Disposable dd;
                    @Override
                    public void onSubscribe(Disposable d) {
                        dd = d;
                    }

                    @Override
                    public void onNext(User1 user) {

                            Log.e("当前输出==", user.getData().toString());

                    }

                    @Override
                    public void onError(Throwable e) {
                        module_api.Sign_CallBack(false,"请检查服务器地址");
                        Log.e("module==","登录验证失败:" + e);
                    }

                    @Override
                    public void onComplete() {
                        dd.dispose();//关闭连接
                    }
                });

    }



}
