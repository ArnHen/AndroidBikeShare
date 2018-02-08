package com.example.arnehenriksen.bikeshareassignment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BikeShareActivity extends Activity {
    // GUI variables
    private Button addRide;
    private Button endRide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout. activity_bike_share);

// Button
        addRide = (Button) findViewById(R.id.add_button);
        addRide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BikeShareActivity.this, StartRideActivity.class);
                startActivity(intent);
            }
        });
        endRide = (Button) findViewById(R.id.end_button);
        endRide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BikeShareActivity.this, EndRideActivity.class);
                startActivity(intent);
            }
        });
    }
}
