package com.example.win7x64.bai4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyArrayAdapter extends BaseAdapter {
    Context context;
    int mylayout;
    ArrayList<sinhvien> arr;

    public MyArrayAdapter(Context context, int mylayout, ArrayList<sinhvien> arr) {
        this.context = context;
        this.mylayout = mylayout;
        this.arr = arr;
    }

    @Override
    public int getCount() {
        return arr.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class Viewholder {
        TextView txtten;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Viewholder holder ;
        if(convertView ==null){
            holder=new Viewholder();
            LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(mylayout,null);
            holder.txtten=(TextView)convertView.findViewById(R.id.txt_ten);
            convertView.setTag(holder);
        }
        else {
            holder=(Viewholder)convertView.getTag();
        }
        sinhvien sv=arr.get(position);
        holder.txtten.setText(sv.getTen());
        return convertView;
    }
}
