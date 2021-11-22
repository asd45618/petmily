package com.example.petmliy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class animal_attri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_attri);
    }

    public void animal_result (View view) {
        Intent intent_ani_result =new Intent(getApplicationContext(),animal_result.class);
        startActivity(intent_ani_result);
    }
}