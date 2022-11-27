package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    EditText editName, editPhone, editAddress;
    RadioButton radioMale, radioFemale;
    CheckBox checkBox1, checkBox2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = (EditText) findViewById(R.id.EditName);
        editPhone = (EditText) findViewById(R.id.EditPhone);
        editAddress = (EditText) findViewById(R.id.EditAddress);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioMale = (RadioButton) findViewById(R.id.RadioMale);
        radioFemale = (RadioButton) findViewById(R.id.RadioFemale);

        checkBox1 = (CheckBox) findViewById(R.id.BCheck);
        checkBox2 = (CheckBox) findViewById(R.id.MCheck);

        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);

                intent.putExtra("name", editName.getText().toString());
                intent.putExtra("phone", editPhone.getText().toString());
                intent.putExtra("address", editAddress.getText().toString());

                if(radioMale.isChecked()) {
                    intent.putExtra("gender", "Male");
                } else if(radioFemale.isChecked()) {
                    intent.putExtra("gender", "Female");
                }

                if(checkBox1.isChecked()) {
                    intent.putExtra("degree", "Bacheolar");
                } else if(checkBox2.isChecked()) {
                    intent.putExtra("degree", "Master");
                }

                startActivity(intent);


            }
        });


    }
}