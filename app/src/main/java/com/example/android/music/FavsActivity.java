package com.example.android.music;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class FavsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //-- Create a list of songs
        //-- * Note: 'final' was required by the onItemClick method to reference the 'words' ArrayList
        //--          This is required because of the variable scope (Check 'Anonymous class' for details)
        final ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song(getString(R.string.favs_album_0), getString(R.string.favs_artist_0), R.drawable.favs_pic_0));
        songs.add(new Song(getString(R.string.favs_album_1), getString(R.string.favs_artist_1), R.drawable.favs_pic_1));
        songs.add(new Song(getString(R.string.favs_album_2), getString(R.string.favs_artist_2), R.drawable.favs_pic_2));
        songs.add(new Song(getString(R.string.favs_album_3), getString(R.string.favs_artist_3), R.drawable.favs_pic_3));
        songs.add(new Song(getString(R.string.favs_album_4), getString(R.string.favs_artist_4), R.drawable.favs_pic_4));
        songs.add(new Song(getString(R.string.favs_album_5), getString(R.string.favs_artist_5), R.drawable.favs_pic_5));
        songs.add(new Song(getString(R.string.favs_album_6), getString(R.string.favs_artist_6), R.drawable.favs_pic_6));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter itemsAdapter = new SongAdapter(this, songs, R.color.category_favs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // song_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(itemsAdapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                // Get the {@link Song} object at the given position the user clicked on
                Song song = songs.get(position);

                // Display a toast when a list item is clicked on
                Toast.makeText(FavsActivity.this, "Item #" + position + " Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
