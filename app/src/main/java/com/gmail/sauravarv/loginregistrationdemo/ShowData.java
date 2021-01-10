package com.gmail.sauravarv.loginregistrationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class ShowData extends AppCompatActivity {
    EditText etName, etEmail, etPassword, etGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");
        String password = intent.getStringExtra("password");
        String gender = intent.getStringExtra("gender");

        etName = (EditText)findViewById(R.id.etName);
        etEmail = (EditText)findViewById(R.id.etEmail);
        etPassword = (EditText)findViewById(R.id.etPassword);
        etGender = (EditText)findViewById(R.id.etGender);

        etName.setText(name);
        etEmail.setText(email);
        etPassword.setText(password);
        etGender.setText(gender);
    }
}