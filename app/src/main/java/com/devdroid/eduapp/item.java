package com.devdroid.eduapp;

import android.content.ClipData;

import java.util.ArrayList;

public class item {
    private String name;
    private int imageResource;
    private Class<Cse> activityClass;

    public item(String name, int imageResource, Class<?> activityClass) {
        this.name = name;
        this.imageResource = imageResource;
        this.activityClass = (Class<Cse>) activityClass;
    }



    public String getName() {
        return name;
    }

    public int getImageResource() {
        return imageResource;
    }

    public Class<Cse> getActivityClass() {
        return activityClass;
    }
}
