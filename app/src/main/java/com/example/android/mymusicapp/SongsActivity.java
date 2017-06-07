package com.example.android.mymusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Find the View that shows the like button
        ImageButton likeButton = (ImageButton) findViewById(R.id.like_button);
        // Set a click listener on that View
        likeButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent likeButtonIntent = new Intent(SongsActivity.this, FavoritesActivity.class);

                // Start the new activity
                startActivity(likeButtonIntent);
            }
        });
    }
}
