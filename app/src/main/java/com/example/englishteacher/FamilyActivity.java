package com.example.englishteacher;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class FamilyActivity extends AppCompatActivity {

    private ImageButton fBTN,gfBTN,mBTN,gmBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        fBTN =  findViewById(R.id.fatherButton);
        gfBTN = findViewById(R.id.grandFatherBTN);
        mBTN = findViewById(R.id.motherButton);
        gmBTN = findViewById(R.id.GrandMotherButton);
        fBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getBaseContext(),R.raw.father);
                mp.start();
            }
        });
        gfBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getBaseContext(),R.raw.grand_father);
                mp.start();
            }
        });
        mBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getBaseContext(),R.raw.mother);
                mp.start();
            }
        });
        gmBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getBaseContext(),R.raw.grand_mother);
                mp.start();
            }
        });
    }
}