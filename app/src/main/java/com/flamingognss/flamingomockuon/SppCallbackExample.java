package com.flamingognss.flamingomockuon;


import android.util.Log;

import flamingo.flamingoapi.spp_location.SppLocation;
import flamingo.flamingoapi.spp_location.SppLocationCallback;

public class SppCallbackExample implements SppLocationCallback {
    String TAG = "SppCallbackExample";
    @Override
    public void registerSppLocationCallback() {

    }

    @Override
    public void unregisterSppLocationCallback() {

    }

    @Override
    public void onSppLocationReceived(SppLocation sppLocation) {
        double latitude =  sppLocation.getLatitude();
        double longitude =  sppLocation.getLongitude();
        Log.i(TAG, "lat: " + latitude + ", lon: " + longitude);
    }
}
