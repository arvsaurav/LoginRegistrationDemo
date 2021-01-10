package com.gmail.sauravarv.loginregistrationdemo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class SignUpActivity extends AppCompatActivity
{
    EditText etName, etEmail, etPassword;
    Button b;
    RadioButton r1, r2;
    RadioGroup rg;

    //@SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        etName = (EditText)findViewById(R.id.input_name);
        etEmail = (EditText)findViewById(R.id.input_email);
        etPassword = (EditText)findViewById(R.id.input_password);
        r1 = (RadioButton)findViewById(R.id.rB1);
        r2 = (RadioButton)findViewById(R.id.rB2);
        //rg = (RadioGroup)findViewById(R.id.rGroup);
        //rg = (RadioGroup) this.<View>findViewById(R.id.rGroup);
    }

    public void onClick(View v){
        String name = etName.getText().toString();
        String email = etEmail.getText().toString();
        String password = etPassword.getText().toString();
        String gender = "";
        if(r1.isChecked()){
            gender = "Male";
        }
        else{
            gender = "Female";
        }

        Toast.makeText(this, "Account Created", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(SignUpActivity.this, ShowData.class);
        intent.putExtra("name", name);
        intent.putExtra("email", email);
        intent.putExtra("password", password);
        intent.putExtra("gender", gender);
        startActivity(intent);
    }

}
