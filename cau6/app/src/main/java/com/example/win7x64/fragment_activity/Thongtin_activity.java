package com.example.win7x64.fragment_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Thongtin_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongtin_activity);

        Intent intent=getIntent();
        Sinhvien sv= (Sinhvien) intent.getSerializableExtra("Thongtin");
        FragmentTT fragmentTT=(FragmentTT)getFragmentManager().findFragmentById(R.id.frg_tt2);
        fragmentTT.setinfor(sv);


    }
}
