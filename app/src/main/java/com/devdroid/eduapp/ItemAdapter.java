package com.devdroid.eduapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<item> {

    private Context context;
    private ArrayList<item> itemList;

    public ItemAdapter(Context context, ArrayList<item> itemList) {
        super(context, 0, itemList);
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.single_item, parent, false);
        }

        item currentItem = itemList.get(position);

        ImageView itemImageView = convertView.findViewById(R.id.Imageview);
        TextView itemTextView = convertView.findViewById(R.id.Textview);

        itemImageView.setImageResource(currentItem.getImageResource());
        itemTextView.setText(currentItem.getName());

        return convertView;
    }
}

