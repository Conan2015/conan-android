package com.conan.mylocation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MyLocationActivity extends AppCompatActivity {
    private final static String LOG_TAG = MyLocationActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_location);
    }
}
