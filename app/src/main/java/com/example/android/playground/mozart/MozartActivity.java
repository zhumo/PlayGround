package com.example.android.playground.mozart;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.android.playground.R;

public class MozartActivity extends AppCompatActivity {

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mozart);
        initializePlayer();
    }

    public void playMusic(View view) {
        player.start();
    }

    public void pauseMusic(View view) {
        player.pause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        player.release();
        player = null;
    }

    @Override
    protected void onResume() {
        super.onResume();
        initializePlayer();
    }

    private void initializePlayer() {
        player = MediaPlayer.create(this, R.raw.mozart_concerto_4);
        player.setOnCompletionListener(new MozartOnCompletionListener(this));
    }
}
