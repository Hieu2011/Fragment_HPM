package com.example.win7x64.bai4;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class FR_list extends Fragment {
   // String[] arr={"Nhàn","Vân","Phương"};
    ArrayList<sinhvien>arr;
    MyArrayAdapter adapter;
    ListView lswds;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fr_listview,container,false);
        lswds=(ListView)view.findViewById(R.id.list);
       // adapter=new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,arr);
        arr=new ArrayList<>();

        ds();
        adapter=new MyArrayAdapter(getActivity(),R.layout.demo_layout,arr);
        lswds.setAdapter(adapter);
        lswds.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                sinhvien sv=arr.get(position);
                Toast.makeText(getActivity(),sv.getTen().toString(),Toast.LENGTH_SHORT).show();
            }
        });
        return view;

    }
    private void ds(){
        arr.add(new sinhvien("Nhàn"));
        arr.add(new sinhvien("Phương"));


    }
}
