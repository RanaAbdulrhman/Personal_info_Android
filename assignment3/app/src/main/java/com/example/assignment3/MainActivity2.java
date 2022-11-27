package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView genderView, degreeView,nameView,phoneView,addressView;
    String name,phone,address,gender, degree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);

        nameView = (TextView) findViewById(R.id.name);
        genderView = (TextView) findViewById(R.id.gender);
        degreeView = (TextView) findViewById(R.id.degree);
        phoneView = (TextView) findViewById(R.id.phone);
        addressView = (TextView) findViewById(R.id.Address);

        name = getIntent().getExtras().getString("name");
        gender = getIntent().getExtras().getString("gender");
        degree = getIntent().getExtras().getString("degree");
        phone = getIntent().getExtras().getString("phone");
        address = getIntent().getExtras().getString("address");

        nameView.setText(name);
        genderView.setText(gender);
        degreeView.setText(degree);
        phoneView.setText(phone);
        addressView.setText(address);

    }
}