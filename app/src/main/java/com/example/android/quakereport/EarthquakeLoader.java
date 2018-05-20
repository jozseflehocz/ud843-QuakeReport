package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {

    private String mUrl;

    public EarthquakeLoader(Context context, String url) {
        super(context);
        // TODO: Finis implementing this constructor
        mUrl=url;
    }

    @Override
    protected void onStartLoading() {
        Log.v("EarthquakeLoader", "onStartLoading");
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground() {
        // TODO: Implement this method

        Log.v("EarthquakeLoader", "loadInBackground");

        if (mUrl == null || mUrl.length()<1) {
            return null;
        }

        List<Earthquake> earthquakes = QueryUtils.fetchEarthquakeData(mUrl);
        return earthquakes;
    }
}
