package com.example.win7x64.testlandscape;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FragmentActivity extends Fragment {
    Button btna,btnb,btnc;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_activity,container,false);
        btna=(Button)view.findViewById(R.id.btn_a);
        btnb=(Button)view.findViewById(R.id.btn_b);
        btnc=(Button)view.findViewById(R.id.btn_c);

        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentBTN fragmentBTN=(FragmentBTN)getFragmentManager().findFragmentById(R.id.frg_btn);
                Toast.makeText(getActivity(), btna.getText(), Toast.LENGTH_SHORT).show();
                if(fragmentBTN != null && fragmentBTN.isInLayout()){
//                    Toast.makeText(getActivity(), btna.getText(), Toast.LENGTH_SHORT).show();
                    fragmentBTN.tvtxt.setText("Click in A");
                    
                }
                else {
                    Intent intent=new Intent(getActivity(),Txt_Activity.class);
                    intent.putExtra("hpm","Nhấn A");
                    startActivity(intent);
                }
            }
        });
        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentBTN fragmentBTN=(FragmentBTN)getFragmentManager().findFragmentById(R.id.frg_btn);
                Toast.makeText(getActivity(), btnb.getText(), Toast.LENGTH_SHORT).show();
                if(fragmentBTN != null && fragmentBTN.isInLayout()){
                    fragmentBTN.tvtxt.setText("Click in B");
                }
                else {
                    Intent intent=new Intent(getActivity(),Txt_Activity.class);
                    intent.putExtra("hpm","Nhấn B");
                    startActivity(intent);
                }
            }
        });
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentBTN fragmentBTN=(FragmentBTN)getFragmentManager().findFragmentById(R.id.frg_btn);
                Toast.makeText(getActivity(), btnc.getText(), Toast.LENGTH_SHORT).show();
                if(fragmentBTN != null && fragmentBTN.isInLayout()){
                    fragmentBTN.tvtxt.setText("Click in C");
                }
                else {
                    Intent intent=new Intent(getActivity(),Txt_Activity.class);
                    intent.putExtra("hpm","Nhấn C");
                    startActivity(intent);
                }
            }
        });

        return view;
    }
}
