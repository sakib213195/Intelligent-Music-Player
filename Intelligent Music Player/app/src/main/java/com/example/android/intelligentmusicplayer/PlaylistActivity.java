package com.example.android.intelligentmusicplayer;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_playlist);


        TextView HappyList = (TextView) findViewById(R.id.HappyList);


        HappyList.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent HappyList = new Intent(PlaylistActivity.this, HappyPlaylist.class);


                startActivity(HappyList);
            }
        });


        TextView SadList = (TextView) findViewById(R.id.SadList);


        SadList.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent SadList = new Intent(PlaylistActivity.this, SadPlaylist.class);


                startActivity(SadList);
            }
        });
        }
}
