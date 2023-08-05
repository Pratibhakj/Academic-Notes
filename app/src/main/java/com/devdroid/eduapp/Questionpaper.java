package com.devdroid.eduapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Questionpaper extends AppCompatActivity {
    TextView v1,v2,v3,v4,v5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionpaper);

        v1 = findViewById(R.id.pdf_name1);
        v2 = findViewById(R.id.pdf_name);
        v3 = findViewById(R.id.name1);
        v4 = findViewById(R.id.pdf_name2);
        v5= findViewById(R.id.pdf_name3);


    }
    public void retrievePDF01(View view) {
        startActivity(new Intent(getApplicationContext(),RetrievePDF01.class));
    }



}