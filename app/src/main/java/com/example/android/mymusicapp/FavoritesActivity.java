package com.example.android.mymusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class FavoritesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        // Find the View that shows the like button
        ImageButton likeButton = (ImageButton) findViewById(R.id.like_button);
        // Set a click listener on that View
        likeButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent likeButtonIntent = new Intent(FavoritesActivity.this, FavoritesActivity.class);

                // Start the new activity
                startActivity(likeButtonIntent);
            }
        });

        // Find the View that shows the Main Menu button
        Button mainMenuButton = (Button) findViewById(R.id.back_main_button);
        // Set a click listener on that View
        mainMenuButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity}
                Intent mainMenuButtonIntent = new Intent(FavoritesActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(mainMenuButtonIntent);
            }
        });

        // Find the View that shows the All Songs button
        Button allSongsButton = (Button) findViewById(R.id.all_songs_button);
        // Set a click listener on that View
        allSongsButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongsActivity}
                Intent allSongsButtonIntent = new Intent(FavoritesActivity.this, SongsActivity.class);

                // Start the new activity
                startActivity(allSongsButtonIntent);
            }
        });
    }
}
