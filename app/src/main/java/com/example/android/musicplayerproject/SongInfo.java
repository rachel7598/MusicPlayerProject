package com.example.android.musicplayerproject;

public class SongInfo {
    // name of the song
    private String mSongName;

    // album the song belongs to
    private String mSongsAlbum;

    // name of the artist
    private String mArtistName;

    /* create a new SongInfo object
     *@param sName is the name of the song
     *@param sSongsAlbum is the name of the album the song belongs to
     *@param sArtistName is the name of the artist
     * */
    public SongInfo(String sName, String sSongsAlbum, String sArtistName) {
        mSongName = sName;
        mSongsAlbum = sSongsAlbum;
        mArtistName = sArtistName;
    }

    /**
     * Get the name of the song
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the album the song belongs to
     */
    public String getSongsAlbum() {
        return mSongsAlbum;
    }

    /**
     * Get the artist's name
     */
    public String getArtistName() {
        return mArtistName;
    }


}
