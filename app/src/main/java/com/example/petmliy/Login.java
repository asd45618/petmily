package com.example.petmliy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void login(View view) {
        Intent intent_login =new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent_login);
    }


    public void join(View view) {
        Intent intent_join =new Intent(getApplicationContext(),Join.class);
        startActivity(intent_join);
    }
}