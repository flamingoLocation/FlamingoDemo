package com.flamingognss.flamingomockuon;

import android.util.Log;

import flamingo.flamingoapi.FlamingoLocation;
import flamingo.flamingoapi.FlamingoLocationCallback;

public class FlamingoCallbackExample implements FlamingoLocationCallback {
    String TAG = "FlamingoCallbackExample";

    @Override
    public void registerFlamingoLocationCallback() {

    }

    @Override
    public void unregisterFlamingoLocationCallback() {

    }

    @Override
    public void onFlamingoLocationReceived(FlamingoLocation flamingoLocation) {
       double latitide =  flamingoLocation.getLatitude();
       double longitude =  flamingoLocation.getLongitude();
        Log.i(TAG, "lat: " + latitide  + ", lon: " + longitude);

    }
}
