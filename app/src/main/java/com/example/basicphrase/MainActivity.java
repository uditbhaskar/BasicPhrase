package com.example.basicphrase;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
  MediaPlayer mediaPlayer;
    int phraseNumber=0;
    int check =0;

    public void onClick(View view) {
        Button button = (Button) view;

        Log.i("PHRASE",button.getTag().toString() );
        mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier(button.getTag().toString(), "raw", getPackageName()));

        mediaPlayer.start();
        check =1;

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
