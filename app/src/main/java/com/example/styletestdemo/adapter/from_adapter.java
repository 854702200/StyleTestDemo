package com.example.styletestdemo.adapter;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.styletestdemo.Bean.FromDate.fromdate;
import com.example.styletestdemo.R;
import com.example.styletestdemo.customview.TableRowTextView;

import java.util.ArrayList;
import java.util.List;

public class from_adapter extends ArrayAdapter<fromdate> {
    private Context context;
    private int resource;

    public from_adapter( Context context, int resource,List<fromdate> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        fromdate fromdate = getItem(position);
        View view = LayoutInflater.from(context).inflate(resource,parent,false);
        TableRowTextView tableRow = (TableRowTextView) view.findViewById(R.id.tableRow1);
        tableRow.setTextArray(
                getCharSequenceBuilder(fromdate.getName_1(), 0, 0, Color.RED),fromdate.getName_2(),fromdate.getName_3(),fromdate.getName_4(),
                getCharSequenceBuilder(fromdate.getName_5(), 0, 0, Color.RED));
        return view;
    }
    /**
     * 表格绘制
     */
    private SpannableStringBuilder getCharSequenceBuilder(String host, int start, int end, int color) {
        SpannableStringBuilder ssb = new SpannableStringBuilder(host);
        ssb.setSpan(new ForegroundColorSpan(color), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ssb.setSpan(new AbsoluteSizeSpan(color, false), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        return ssb;
    }
}
