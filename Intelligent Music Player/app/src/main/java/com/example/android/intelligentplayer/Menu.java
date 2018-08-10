package com.example.android.intelligentplayer;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Menu extends AppCompatActivity {


    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);


            setContentView(R.layout.activity_main);


            TextView DetectFacialEmotion = (TextView) findViewById(R.id.DetectFacialEmotion);


            DetectFacialEmotion.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {

                    Intent numbersIntent = new Intent(MainActivity.this, FaceDetectionActivity.class);


                    startActivity(numbersIntent);
                }
            });


            TextView Playlist = (TextView) findViewById(R.id.Playlist);


            Playlist.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {

                    Intent colorsIntent = new Intent(MainActivity.this, PlaylistActivity.class);


                    startActivity(colorsIntent);
                }
            });

        }
    }
}
