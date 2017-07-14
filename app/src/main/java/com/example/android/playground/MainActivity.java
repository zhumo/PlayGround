package com.example.android.playground;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        player = MediaPlayer.create(this, R.raw.mozart_concerto_4);
        player.setOnCompletionListener(new MozartOnCompletionListener(this));
    }

    public void playMusic(View view) {
        player.start();
    }

    public void pauseMusic(View view) {
        player.pause();
    }
}
