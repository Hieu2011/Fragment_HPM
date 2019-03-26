package com.example.win7x64.fragment_activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.app.Fragment;

public class FragmentTT extends Fragment {
    TextView tvmssv,tvten,tvdc;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_tt,container,false);
        anhxa();




        return view;
    }
    public void setinfor(Sinhvien sv){
        tvmssv.setText(sv.getMasv());
        tvten.setText(sv.getTensv());
        tvdc.setText(sv.getDiachi());
    }
    private void anhxa(){
        tvmssv=(TextView)view.findViewById(R.id.tv_mssv);
        tvten=(TextView)view.findViewById(R.id.tv_ht);
        tvdc=(TextView)view.findViewById(R.id.tv_dc);


    }
}
