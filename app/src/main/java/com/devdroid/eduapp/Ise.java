package com.devdroid.eduapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Ise extends AppCompatActivity {
    private ListView listView;
    private ArrayList<item> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ise);

        listView = findViewById(R.id.listview);

        // Create dummy data for the list
        itemList = new ArrayList<>();
        itemList.add(new item("Third Semester", R.drawable.third, Thirdsem.class));
        itemList.add(new item("Fourth Semester", R.drawable.fourth, Fourthsem.class));
        itemList.add(new item("Fifth Semester", R.drawable.fifth, Fifthsem.class));
        itemList.add(new item("Sixth Semester", R.drawable.six, Sixthsem.class));
        itemList.add(new item("Seventh Semester", R.drawable.seven, Seventhsem.class));
        itemList.add(new item("Eight Semester", R.drawable.eight, Eighthsem.class));

        // Create and set the adapter
        ItemAdapter adapter = new ItemAdapter(this, itemList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Class<?> activityClass = itemList.get(position).getActivityClass();
                // Start the corresponding activity for the selected item's image
                Intent intent = new Intent(Ise.this, activityClass);
                startActivity(intent);
            }
        });

    }
}