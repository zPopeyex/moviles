package com.leonardo.proyecto025;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    private MediaPlayer mp;
    private MediaPlayer mpleon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(this, R.raw.gatito);
        mpleon = MediaPlayer.create(this, R.raw.leon);
    }
    public void presionGato(View v) {
           mp.start();
    }
    public void presionLeon(View v) {
        mpleon.start();
    }

}