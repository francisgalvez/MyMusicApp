package com.example.android.mymusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the "all songs" category
        ImageButton allSongs = (ImageButton) findViewById(R.id.all_songs);
        // Set a click listener on that View
        allSongs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);

                // Start the new activity
                startActivity(songsIntent);
            }
        });

        // Find the View that shows the "artists" category
        ImageButton artists = (ImageButton) findViewById(R.id.artists);
        // Set a click listener on that View
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);

                // Start the new activity
                startActivity(artistsIntent);
            }
        });

        // Find the View that shows the "genres" category
        ImageButton genres = (ImageButton) findViewById(R.id.genres);
        // Set a click listener on that View
        genres.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent genresIntent = new Intent(MainActivity.this, GenresActivity.class);

                // Start the new activity
                startActivity(genresIntent);
            }
        });

        // Find the View that shows the "albums" category
        ImageButton albums = (ImageButton) findViewById(R.id.albums);
        // Set a click listener on that View
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);

                // Start the new activity
                startActivity(albumsIntent);
            }
        });

        // Find the View that shows the like button
        ImageButton likeButton = (ImageButton) findViewById(R.id.like_button);
        // Set a click listener on that View
        likeButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent likeButtonIntent = new Intent(MainActivity.this, FavoritesActivity.class);

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
                Intent mainMenuButtonIntent = new Intent(MainActivity.this, MainActivity.class);

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
                Intent allSongsButtonIntent = new Intent(MainActivity.this, SongsActivity.class);

                // Start the new activity
                startActivity(allSongsButtonIntent);
            }
        });
    }
}
