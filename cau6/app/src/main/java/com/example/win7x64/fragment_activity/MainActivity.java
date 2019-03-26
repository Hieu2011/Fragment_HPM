package com.example.win7x64.fragment_activity;

import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Truyendata {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    @Override
    public void dataSV(Sinhvien sv) {
        FragmentTT fragmentTT=(FragmentTT) getFragmentManager().findFragmentById(R.id.frg_tt);
        if(fragmentTT != null && fragmentTT.isInLayout()){
            fragmentTT.setinfor(sv);
        }
        else {
            Intent intent=new Intent(MainActivity.this,Thongtin_activity.class);
            intent.putExtra("Thongtin",sv);
            startActivity(intent);
        }

    }
}
