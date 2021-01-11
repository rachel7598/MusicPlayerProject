package com.example.android.musicplayerproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class  SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Create an ArrayList of SongInfo objects
        ArrayList<SongInfo> songInfo = new ArrayList<SongInfo>();
        songInfo.add(new SongInfo("See A Victory", "Graves Into Gardens", "Elevation Worship"));

        // create an {@link SongInfoAdapter}, whose data source is a list of
        // {@link SongInfo}s. The adapter knows how to create list item views for each list item

        SongInfoAdapter songAdapter = new SongInfoAdapter(this, songInfo);

        // get a reference to the listview and attach the adapter to the listView
      ListView songListView = findViewById(R.id.listview_songs);
        songListView.setAdapter(songAdapter);



    }
}