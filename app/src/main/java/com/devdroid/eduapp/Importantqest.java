package com.devdroid.eduapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Importantqest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_importantqest);
    }
    public void Syllab1(View view) {
        startActivity(new Intent(getApplicationContext(),Syllab1.class));
    }
    public void Syllab2(View view) {
        startActivity(new Intent(getApplicationContext(),Syllab2.class));
    }
    public void Syllab3(View view) {
        startActivity(new Intent(getApplicationContext(),Syllab3.class));
    }
    public void Syllab4(View view) {
        startActivity(new Intent(getApplicationContext(),Syllab4.class));
    }
    public void Syllab5(View view) {
        startActivity(new Intent(getApplicationContext(),Syllab5.class));
    }
    public void Syllab6(View view) {
        startActivity(new Intent(getApplicationContext(),Syllab6.class));
    }
}