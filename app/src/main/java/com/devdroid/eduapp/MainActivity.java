package com.devdroid.eduapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.devdroid.eduapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ImageView physics,chemistry,cse,ise,cse1,ise1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // physics=findViewById(R.id.physics);

        cse=findViewById(R.id.cse);
        ise=findViewById(R.id.ise);
        cse1=findViewById(R.id.cse1);
        ise1=findViewById(R.id.ise1);


      /*  physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(MainActivity.this,Physics.class);
                startActivity(i1);
            }
        });*/

        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 =new Intent(MainActivity.this,Cse.class);
                startActivity(i3);
            }
        });
        ise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 =new Intent(MainActivity.this,Ise.class);
                startActivity(i4);
            }
        });
        cse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 =new Intent(MainActivity.this,Questionpaper.class);
                startActivity(i4);
            }
        });
        ise1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 =new Intent(MainActivity.this,Importantqest.class);
                startActivity(i4);
            }
        });








}
}