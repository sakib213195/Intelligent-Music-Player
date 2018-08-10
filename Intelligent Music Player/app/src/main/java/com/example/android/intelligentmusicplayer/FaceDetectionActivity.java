package com.example.android.intelligentmusicplayer;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.android.intelligentmusicplayer.R;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import 	java.util.Scanner;

public class FaceDetectionActivity extends AppCompatActivity {

    Button button;
    ImageView imageView;
    static  final int CAM_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face_detection);
        button = (Button) findViewById(R.id.cambutton1);
        imageView = (ImageView) findViewById(R.id.image_view);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent camera_intent = new Intent (MediaStore.ACTION_IMAGE_CAPTURE);
                File file = getFile();
                camera_intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(file));
                startActivityForResult(camera_intent, CAM_REQUEST);


            }
        });


    }

    private File getFile()
    {
        File folder = new File("sdcard/IntelligentMusicPlayer");

        if((folder.exists()))
        {
            folder.mkdir();
        }

        File image_file = new File(folder,"IntelligentMusicPlayer.jpg");
        return image_file;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        String path = "sdcard/IntelligentMusicPlayer/IntelligentMusicPlayer.jpg";
        imageView.setImageDrawable(Drawable.createFromPath(path));


    }
}
