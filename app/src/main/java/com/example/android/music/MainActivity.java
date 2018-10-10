package com.example.android.music;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view that shows the category
        View favs = findViewById(R.id.favs);

        // Set a clicklistener on that View
        favs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Activity}
                Intent favsIntent = new Intent(MainActivity.this, FavsActivity.class);

                // Start a new Activity
                startActivity(favsIntent);
            }
        });

        // Find the view that shows the category
        View newHits = findViewById(R.id.newHits);

        // Set a clicklistener on that View
        newHits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Activity}
                Intent newHitsIntent = new Intent(MainActivity.this, NewHitsActivity.class);

                // Start a new Activity
                startActivity(newHitsIntent);
            }
        });

        // Find the view that shows the category
        View classics = findViewById(R.id.classics);

        // Set a clicklistener on that View
        classics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Activity}
                Intent classicsIntent = new Intent(MainActivity.this, ClassicsActivity.class);

                // Start a new Activity
                startActivity(classicsIntent);
            }
        });

        // Find the view that shows the category
        View workout = findViewById(R.id.workoutSongs);

        // Set a clicklistener on that View
        workout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Activity}
                Intent workoutIntent = new Intent(MainActivity.this, WorkoutActivity.class);

                // Start a new Activity
                startActivity(workoutIntent);
            }
        });
    }
}
