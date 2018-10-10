package com.example.android.music;

/**
 * {@link Song} represents the song the user wants to play
 * It contains the artist name and the song name. */

public class Song {

    private static final int NO_IMAGE_PROVIDED = -1;

    private String mArtist;
    private String mSongName;
    private int mImageResourceId = NO_IMAGE_PROVIDED;  // Initialization


    /**
     * Create a new Song object.
     * NOTE: This object contains NO IMAGE!!!
     * @param Artist
     * @param SongName
     */
    public Song(String Artist, String SongName) {
        //-- Initialization
        mArtist = Artist;
        mSongName = SongName;
    }

    /**
     * Create a new Song object.
     * NOTE: This object is for audio files with a corresponding IMAGE!!!
     * @param Artist
     * @param SongName
     * @param imageResourceId is the drawable resource ID for the image associated with the song
     */
    public Song(String Artist, String SongName, int imageResourceId) {
        //-- Initialization
        mArtist = Artist;
        mSongName = SongName;
        mImageResourceId = imageResourceId;
    }

    /** Get the name of the artist. */
    public String getArtist() {
        return mArtist;
    }

    /** Get the name of the song. */
    public String getSongName() {
        return mSongName;
    }

    /** Get the image ID of the song. */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /** Returns whether or not there's an image for this song.
     *  Returns TRUE when there's an image for the song */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
