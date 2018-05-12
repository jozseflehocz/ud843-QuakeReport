package com.example.android.quakereport;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Earthquake {

    private String mLocation;
    private String mMagnitude;
    private Long mTime;
    private Date dateObject;
    private SimpleDateFormat dateFormatter;
    private SimpleDateFormat timeFormatter;
    private String dateToDisplay;
    private String timeToDisplay;

    public Earthquake(String location, String magnitude, Long time){
        mLocation=location;
        mMagnitude=magnitude;
        mTime=time;
        dateObject=new Date(time);
        dateFormatter = new SimpleDateFormat("MMM DD, yyyy");
        dateToDisplay = dateFormatter.format(dateObject);
        timeFormatter = new SimpleDateFormat("HH:mm:ss");
        timeToDisplay = timeFormatter.format(dateObject);
    }

    public String getLocation() {
        return mLocation;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getDateToDisplay() {
        return dateToDisplay;
    }

    public String getTimeToDisplay() {
        return timeToDisplay;
    }

}
