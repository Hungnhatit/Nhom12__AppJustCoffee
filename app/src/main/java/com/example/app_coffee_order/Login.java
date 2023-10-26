package com.example.app_coffee_order;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    EditText username,pass;
    CheckBox save_account;
   // WebView my_web;
    Button forgot_pass,login,facebook,twitter,instagram,google,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //Edittext
        username = findViewById(R.id.edtusername);
        pass = findViewById(R.id.edtpass);
        //Checkbox
        save_account = findViewById(R.id.ckbsaveaccount);
        //Button
        forgot_pass = findViewById(R.id.btnforgotpass);
        login = findViewById(R.id.btn_login);
        facebook = findViewById(R.id.btnfacebook);
        twitter = findViewById(R.id.btntwiter);
        instagram= findViewById(R.id.btninstagram);
        google = findViewById(R.id.btngoogle);
        signup = findViewById(R.id.btnSingup);


        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_face = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
                startActivity(intent_face);
            }
        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_twitter = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/"));
                startActivity(intent_twitter);
            }
        });
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_ins = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/"));
                startActivity(intent_ins);
            }
        });
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_google = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"));
                startActivity(intent_google);
            }
        });
        //quên mật khẩu
        forgot_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forget_pass = new Intent(Login.this, forgot_pass.class);
                startActivity(forget_pass);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gosign = new Intent(Login.this,loginactivity.class);
                startActivity(gosign);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gohomehuy2 = new Intent(Login.this,home.class);
                startActivity(gohomehuy2);
            }
        });
    }
}