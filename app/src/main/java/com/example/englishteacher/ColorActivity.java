package com.example.englishteacher;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ColorActivity extends AppCompatActivity {
    private Button whiteBTN,blackBTN,blueBTN,redBTN,greenBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        whiteBTN = findViewById(R.id.button);
        blackBTN = findViewById(R.id.button3);
        redBTN = findViewById(R.id.button4);
        blueBTN = findViewById(R.id.button2);
        greenBTN = findViewById(R.id.button5);

        whiteBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getBaseContext(),R.raw.white);
                mp.start();

            }
        });
        blackBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getBaseContext(),R.raw.black);
                mp.start();
            }
        });
        redBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getBaseContext(),R.raw.red);
                mp.start();
            }
        });
        blueBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getBaseContext(),R.raw.blue);
                mp.start();
            }
        });
        greenBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getBaseContext(),R.raw.green);
                mp.start();

            }
        });
    }
}