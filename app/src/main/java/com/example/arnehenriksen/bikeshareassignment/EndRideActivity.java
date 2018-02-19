package com.example.arnehenriksen.bikeshareassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EndRideActivity extends AppCompatActivity {
    // GUI variables
    private Button endRide;
    private TextView lastAdded;
    private TextView newWhat, newWhere;
    private Ride last= new Ride("", "");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_ride);
        lastAdded= (TextView) findViewById(R.id.last_ride);
        updateUI();
// Button
        endRide = (Button) findViewById(R.id.end_button);
// Texts
        newWhat= (TextView) findViewById(R.id.what_bike);
        newWhere= findViewById(R.id.where);

// view products click event
        endRide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((newWhat.getText().length()>0) && (newWhere.getText().length()>0 )){
                    last.setBikeName(newWhat.getText().toString().trim());
                    last.setStartRide(newWhere.getText().toString().trim());
// reset text fields
                    newWhat.setText("");
                    newWhere.setText("");
                    updateUI();
                }
            }
        });
    }
    private void updateUI(){ lastAdded.setText(last.toString()); }
}
