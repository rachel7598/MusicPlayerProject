package com.example.android.musicplayerproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // links 'songs' variable with the text view id
        TextView songs = findViewById(R.id.songs_text_view);
        // Set a click listener on that View
        songs.setOnClickListener(new View.OnClickListener(){
            // the code in this method will be executed when the 'songs' text view is clicked on
            @Override
            public void onClick(View view){
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        // links 'albums' variable with the text view id
        TextView albums = findViewById(R.id.albums_text_view);
        // Set a click listener on that View
        albums.setOnClickListener(new View.OnClickListener(){
            // the code in this method will be executed when the 'albums' text view is clicked on
            @Override
            public void onClick(View view){
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        // links 'favourites' variable with the text view id
        TextView favourites = findViewById(R.id.favourites_text_view);
        // Set a click listener on that View
        favourites.setOnClickListener(new View.OnClickListener(){
            // the code in this method will be executed when the 'favourites' text view is clicked on
            @Override
            public void onClick(View view){
                Intent favouritesIntent = new Intent(MainActivity.this, FavouritesActivity.class);
                startActivity(favouritesIntent);
            }
        });


    }
}