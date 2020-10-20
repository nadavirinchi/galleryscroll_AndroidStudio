package com.example.galleryscroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Gallery;

public class MainActivity extends AppCompatActivity {

    Gallery gallery;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gallery = findViewById(R.id.gallery);

        GalleryAdapter adapter = new GalleryAdapter(MainActivity.this);
        gallery.setAdapter(adapter);


    }
}