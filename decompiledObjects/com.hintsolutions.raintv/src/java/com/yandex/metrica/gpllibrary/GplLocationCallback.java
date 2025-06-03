/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.LocationListener
 *  androidx.annotation.NonNull
 *  com.google.android.gms.location.LocationCallback
 *  com.google.android.gms.location.LocationResult
 *  java.lang.Object
 */
package com.yandex.metrica.gpllibrary;

import android.location.LocationListener;
import androidx.annotation.NonNull;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

class GplLocationCallback
extends LocationCallback {
    @NonNull
    private final LocationListener mLocationListener;

    public GplLocationCallback(@NonNull LocationListener locationListener) {
        this.mLocationListener = locationListener;
    }

    public void onLocationResult(LocationResult locationResult) {
        this.mLocationListener.onLocationChanged(locationResult.getLastLocation());
    }
}

