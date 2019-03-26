package com.example.win7x64.fragment_activity;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


import java.util.ArrayList;

public class FragmentSV extends Fragment {
    ListView lvw;
    SVadapter add;
    ArrayList<Sinhvien> arr;
    Truyendata truyendata;

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_sv,container,false);
        //anh xa
        lvw=(ListView)view.findViewById(R.id.lvw_sv);
        truyendata=(Truyendata)getActivity();
        arr=new ArrayList<Sinhvien>();
        arr.add(new Sinhvien("16012551","Nguyễn Trung Hiếu","Hocmon"));
        arr.add(new Sinhvien("16012552","Lê Thị Thanh Nhàn","Củ Chi"));
        add=new SVadapter(getActivity(),R.layout.custome_lisview,arr);
        lvw.setAdapter(add);
        lvw.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getActivity(), arr.get(position).getTensv(), Toast.LENGTH_SHORT).show();
                truyendata.dataSV(arr.get(position));


            }
        });

        return view;
    }



}
