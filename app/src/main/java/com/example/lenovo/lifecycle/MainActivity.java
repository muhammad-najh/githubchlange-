package com.example.lenovo.lifecycle;

import android.media.MediaPlayer;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
  Button play,stop,pause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play=findViewById(R.id.play);
        stop=findViewById(R.id.stop);
        pause=findViewById(R.id.pause);
      play.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.play:
                MediaPlayer mediaPlayer= MediaPlayer.create(getApplicationContext(),R.raw.music);
                mediaPlayer.start();
                break;
            case R.id.pause:
                break;
            case R.id.stop:
                break;

        }
    }

}
