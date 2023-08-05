package com.devdroid.eduapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Fifthsem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifthsem);
    }
    public void retrievePDF(View view) {
        startActivity(new Intent(getApplicationContext(),RetrieveIsecse.class));
    }
}