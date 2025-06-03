/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  android.location.LocationListener
 *  android.os.Bundle
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.Ic;

public class sc
implements LocationListener {
    @NonNull
    private final Ic a;

    public sc(@NonNull Ic ic2) {
        this.a = ic2;
    }

    public void onLocationChanged(@Nullable Location location) {
        if (location != null) {
            this.a.a(location);
        }
    }

    public void onProviderDisabled(String string) {
    }

    public void onProviderEnabled(String string) {
    }

    public void onStatusChanged(String string, int n4, Bundle bundle) {
    }
}

