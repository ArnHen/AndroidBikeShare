package com.example.arnehenriksen.bikeshareassignment;

/**
 * Created by Arne Henriksen on 02-02-2018.
 */
public class Ride {
    private String mBikeName;
    private String mStartRide;
    private String mEndRide;

    public Ride(String name, String start) {
        mBikeName = name;
        mStartRide = start;
    }

    public Ride(String name, String start, String end) {
        mBikeName = name;
        mStartRide = start;
        mEndRide = end;
    }

    public String getBikeName() {
        return mBikeName;
    }

    public void setBikeName(String mBikeName) {
        this.mBikeName = mBikeName;
    }

    public String getStartRide() {
        return mStartRide;
    }

    public void setStartRide(String mStartRide) {
        this.mStartRide = mStartRide;
    }

    public String getEndRide() {
        return mEndRide;
    }

    public void setEndRide(String endRide) {
        mEndRide = endRide;
    }

    public String toString() {
        if (mEndRide == null) {
            return mBikeName + " started: " + mStartRide;
        } else {
            return mBikeName + " started here: " + mStartRide + " and ended " + mEndRide;
        }
    }
}