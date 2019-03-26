package com.example.win7x64.fragment_activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SVadapter extends BaseAdapter {
    Context context;
    int mylayout;
    ArrayList<Sinhvien> arr;

    public SVadapter(Context context, int mylayout, ArrayList<Sinhvien> arr) {
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
    private class Viewholder{
        TextView txttt;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Viewholder viewholder;
        if(convertView==null){
            viewholder=new Viewholder();
            LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(mylayout,null);
            viewholder.txttt=(TextView)convertView.findViewById(R.id.tv_tt);
            convertView.setTag(viewholder);
        }
        else {
            viewholder=(Viewholder)convertView.getTag();
        }
        Sinhvien sv=arr.get(position);
        viewholder.txttt.setText(sv.getMasv());
        return convertView;
    }
}
