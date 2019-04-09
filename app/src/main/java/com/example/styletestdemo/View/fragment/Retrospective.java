package com.example.styletestdemo.View.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.styletestdemo.Bean.FromDate.fromdate;
import com.example.styletestdemo.R;
import com.example.styletestdemo.View.UserActivity;
import com.example.styletestdemo.adapter.from_adapter;
import com.example.styletestdemo.customview.TableRowTextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class Retrospective extends Fragment {
    private View view;
    private Unbinder unbinder;
    private List<fromdate> fromdates = new ArrayList<fromdate>();
    @BindView(R.id.listview_from) ListView listView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.retrospective_fragment,container,false);
        unbinder = ButterKnife.bind(this,view);//butterknife的绑定
        initDate();
        initEvent();
        return view;
    }
    private void initDate(){
        //初始化装载数据
        fromdate f1 = new fromdate("阶段名","时间(分)","时间(秒)","灭菌舱压力(帕)","灭菌舱压力(度)");
        fromdates.add(f1);
        fromdate f2 = new fromdate("抽真空","11","12","13","14");
        fromdates.add(f2);
        fromdate f3 = new fromdate("注射1","21","22","23","24");
        fromdates.add(f3);
        fromdate f4 = new fromdate("扩散1","31","32","33","34");
        fromdates.add(f4);
        fromdate f5 = new fromdate("等离子态1","41","42","43","44");
        fromdates.add(f5);
        fromdate f6 = new fromdate("注射2","51","52","53","54");
        fromdates.add(f6);
        fromdate f7 = new fromdate("扩散2","61","62","63","64");
        fromdates.add(f7);
        fromdate f8 = new fromdate("等离子态2","71","72","73","74");
        fromdates.add(f8);
        fromdate f9 = new fromdate("通风","81","82","83","84");
        fromdates.add(f9);

    }
    private void initEvent(){
        from_adapter from_adapter = new from_adapter(getContext(),R.layout.layout_from,fromdates);
        listView.setAdapter(from_adapter);




        ImageView imageView = (ImageView) view.findViewById(R.id.imageView_add);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new Photos());
            }
        });

    }
    private void replaceFragment(Fragment f){
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.main_content,f);
        transaction.addToBackStack(null);
        transaction.commit();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();

    }
}
