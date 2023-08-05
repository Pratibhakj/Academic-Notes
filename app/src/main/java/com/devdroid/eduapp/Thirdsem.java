package com.devdroid.eduapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Thirdsem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdsem);
    }

    public void retrievePDF(View view) {
        startActivity(new Intent(getApplicationContext(),RetrieveIsecse.class));
    }
    public void retrievePDF01(View view) {
        startActivity(new Intent(getApplicationContext(),RetrievePDF01.class));
    }

    public void retrievePDF02(View view) {
        startActivity(new Intent(getApplicationContext(),RetrievePDF02.class));
    }

    public void retrievePDF03(View view) {
        startActivity(new Intent(getApplicationContext(),RetrivePDF03.class));
    }

    public void retrievePDF04(View view) {
        startActivity(new Intent(getApplicationContext(),RetrivePDF04.class));
    }

    public void retrievePDF05(View view) {
        startActivity(new Intent(getApplicationContext(),RetrievePDF05.class));
    }

    //public void retrievePDF06(View view) {
        //
    // startActivity(new Intent(getApplicationContext(),RetrieveIsecse.class));
    //}
}