package com.example.win7x64.testlandscape;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Txt_Activity extends AppCompatActivity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_txt_);
        txt=findViewById(R.id.tvt_txt);
        Intent intent=getIntent();
        String s=intent.getStringExtra("hpm");
        txt.setText(s);
    }
}
