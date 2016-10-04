package com.example.mario.sonido1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer fivef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer mplayer = MediaPlayer.create(this, R.raw.peroo);

        fivef = MediaPlayer.create(this, R.raw.five);

        mplayer.start();
    }

    public void playAudio(View view) {
        fivef.start();
    }

    public void pauseAudio(View view) {
        fivef.pause();
    }
}