package com.example.android.musicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("MainActivity", "onCreate");
        mediaPlayer = MediaPlayer.create(this, R.raw.loving_you);
         Button playButton = findViewById(R.id.play_button);
        playButton.setOnClickListener(new View.OnClickListener(){

            @Override
                    public void onClick(View v) {
               mediaPlayer.start();
            }

        });
        Button pauseButton = findViewById(R.id.pause_button);
        pauseButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
              mediaPlayer.pause();


              }


        });

    }
        @Override
        protected void onStart() {
        super.onStart();
        Log.v("MainActivity", "onStart");
        }
        @Override
        protected void onResume() {
        super.onResume();
        Log.v("MainActivity", "onResume");
        }
        @Override
        protected void onPause() {
        super.onPause();
        Log.v("MainActivity", "onPause");
        }
        @Override
        protected void onStop() {
        super.onStop();
        Log.v("MainActivity", "onStop");
        }
       @Override
       protected void onDestroy() {
        super.onDestroy();
        Log.v("MainActivity", "onDestroy");
        }
        }