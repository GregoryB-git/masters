/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  android.location.LocationListener
 *  androidx.annotation.NonNull
 *  com.google.android.gms.tasks.OnSuccessListener
 *  java.lang.Object
 */
package com.yandex.metrica.gpllibrary;

import android.location.Location;
import android.location.LocationListener;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnSuccessListener;

class GplOnSuccessListener
implements OnSuccessListener<Location> {
    @NonNull
    private final LocationListener mLocationListener;

    public GplOnSuccessListener(@NonNull LocationListener locationListener) {
        this.mLocationListener = locationListener;
    }

    public void onSuccess(Location location) {
        this.mLocationListener.onLocationChanged(location);
    }
}

