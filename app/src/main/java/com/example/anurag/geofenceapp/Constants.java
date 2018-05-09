package com.example.anurag.geofenceapp;

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

public class Constants {
    public static final float GEOFENCE_RADIUS_IN_METRES = 100;
    public static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS = 12 * 60 * 60 * 1000;

    public static final HashMap<String, LatLng> LANDMARKS = new HashMap<String, LatLng>();

    static {
        LANDMARKS.put("Sedin Technologies", new LatLng(13.0362844, 80.2141388));
        LANDMARKS.put("Amazon Rainforest", new LatLng(-3.4652837, -62.2246353));
        LANDMARKS.put("Delhi", new LatLng(28.6466773, 76.813073));
    }
}
