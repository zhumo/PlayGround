package com.example.android.playground;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.android.playground.activity_lifecycle.ActivityLifecycleActivity;
import com.example.android.playground.mozart.MozartActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMozartActivity(View view) {
        Intent i = new Intent(this, MozartActivity.class);
        startActivity(i);
    }

    public void showActivityLifecycleActivity(View view) {
        Intent i = new Intent(this, ActivityLifecycleActivity.class);
        startActivity(i);
    }
}
