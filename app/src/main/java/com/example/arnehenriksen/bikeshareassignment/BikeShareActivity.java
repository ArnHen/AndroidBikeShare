package com.example.arnehenriksen.bikeshareassignment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class BikeShareActivity extends Activity {
    // GUI variables
    private Button addRide;
    private Button endRide;
    private Button listRides;
    private ArrayAdapter<Ride> listAdapter;
    private RidesDB ridesDB;
    private ListView rideListOverview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bike_share);
        ridesDB = RidesDB.get(this);

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
        listRides = (Button) findViewById(R.id.list_rides);
        listRides.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (listAdapter == null) {
                    listAdapter = new ArrayAdapter<Ride>(BikeShareActivity.this, R.layout.single_ride, ridesDB.getRidesDB());
                    rideListOverview = (ListView) findViewById(R.id.ride_list);
                    rideListOverview.setVisibility(View.INVISIBLE);
                    rideListOverview.setAdapter(listAdapter);
                }

                if (rideListOverview.getVisibility() == View.INVISIBLE) {
                    rideListOverview.setVisibility(View.VISIBLE);
                } else {
                    rideListOverview.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
