package com.sk.intentfetchdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button submit;
    EditText name,email,address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.button);
        name = findViewById(R.id.nameed);
        email = findViewById(R.id.emailed);
        address = findViewById(R.id.addressed);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Username = name.getText().toString();
                String Useremail = email.getText().toString();
                String Useraddress = address.getText().toString();

                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("username",Username);
                intent.putExtra("useremail",Useremail);
                intent.putExtra("useraddress",Useraddress);
                startActivity(intent);


            }
        });
    }
}