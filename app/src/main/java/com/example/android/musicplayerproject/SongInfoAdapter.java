package com.example.android.musicplayerproject;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongInfoAdapter extends ArrayAdapter<SongInfo> {
    private static final String LOG_TAG = SongInfoAdapter.class.getSimpleName();

    /**
     * @param context  The current context. Used to inflate the layout file
     * @param songInfo A list of SongInfo objects to display in a list
     */
    public SongInfoAdapter(Activity context, ArrayList<SongInfo> songInfo) {
        // the array adapter's internal storage is initialised here for the storage
        // of the context and the list.
        // the second argument is used when the array adapter is populating a single text view
        // the adapter doesn't use the second argument because this is a custom adapter
        super(context, 0, songInfo);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // check is the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_songs, parent, false);

        }
        // Get the {@link SongInfo} object located at this position in the list
        SongInfo currentSongInfo = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID song_name
        TextView songNameTextView = (TextView) listItemView.findViewById(R.id.song_name);
        // get the song name from the currentSongInfo object and set this text on the song name text view
        songNameTextView.setText(currentSongInfo.getSongName());


        // Find the TextView in the list_item.xml layout with the ID song_album
        TextView albumTextView = (TextView) listItemView.findViewById(R.id.song_album);
        // get the song's album from the currentSongInfo object and set this text on the song name text view
        albumTextView.setText(currentSongInfo.getSongsAlbum());


        // Find the TextView in the list_item.xml layout with the ID song_name
        TextView artistNameTextView = (TextView) listItemView.findViewById(R.id.artist_name);
        // get the song name from the currentSongInfo object and set this text on the song name text view
        artistNameTextView.setText(currentSongInfo.getArtistName());
        return listItemView;


    }
}





