package com.example.petmliy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class animal_join extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_join);
    }

    public void join_result (View view) {
        Intent intent_join_result =new Intent(getApplicationContext(),join_result.class);
        startActivity(intent_join_result);
    }
}