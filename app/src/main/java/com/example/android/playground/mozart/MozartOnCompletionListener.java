package com.example.android.playground.mozart;

import android.content.Context;
import android.media.MediaPlayer;
import android.widget.Toast;

/**
 * Created by coding on 7/14/17.
 */

public class MozartOnCompletionListener implements MediaPlayer.OnCompletionListener {

    Context mcontext;
    public MozartOnCompletionListener(Context context) {
        mcontext = context;
    }

    @Override
    public void onCompletion(MediaPlayer mediaPlayer) {
        Toast.makeText(mcontext, "Done!", Toast.LENGTH_SHORT).show();
    }
}
