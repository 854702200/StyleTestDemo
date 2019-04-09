package com.example.styletestdemo.View.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.styletestdemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class Photos extends Fragment {
    private View view;
    private Unbinder unbinder;
    @BindView(R.id.imageView_back) ImageView imageView_back;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view  = inflater.inflate(R.layout.photos_fragment,container,false);
        unbinder = ButterKnife.bind(this,view);//butterknife的绑定
        initEvent();
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    private void initEvent() {


    }
    @OnClick({R.id.imageView_back})
    public void OnClick(View view){
        switch (view.getId()){
            case R.id.imageView_back:
                getActivity().getSupportFragmentManager().popBackStack();
                break;
                default:
        }
    }


    private void replaceFragment(Fragment f){
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.main_content,f);
//        transaction.addToBackStack(null); //不能压入栈
        transaction.commit();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();

    }
}
