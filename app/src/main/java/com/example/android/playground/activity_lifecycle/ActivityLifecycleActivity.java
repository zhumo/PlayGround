package com.example.android.playground.activity_lifecycle;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.android.playground.R;

public class ActivityLifecycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_lifecycle);
        Log.v("ActivityLifecycle", "Created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("ActivityLifecycle", "Started");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("ActivityLifecycle", "Stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("ActivityLifecycle", "Destroyed");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.v("ActivityLifecycle", "Back Pressed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("ActivityLifecycle", "Paused");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("ActivityLifecycle", "Resumed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("ActivityLifecycle", "Restart");
    }
}
