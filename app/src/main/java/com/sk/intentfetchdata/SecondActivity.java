package com.sk.intentfetchdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        t1 = findViewById(R.id.nametext);
        t2 = findViewById(R.id.emailtext);
        t3 = findViewById(R.id.addresstext);

        Intent intent = getIntent();

        String name = intent.getStringExtra("username");
        String email = intent.getStringExtra("useremail");
        String address = intent.getStringExtra("useraddress");

        t1.setText(name);
        t2.setText(email);
        t3.setText(address);
    }
}