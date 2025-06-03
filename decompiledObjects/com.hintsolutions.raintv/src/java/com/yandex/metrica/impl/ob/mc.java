/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.location.Location
 *  android.location.LocationListener
 *  android.location.LocationManager
 *  android.os.Looper
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.Qb;
import com.yandex.metrica.impl.ob.sd;
import com.yandex.metrica.impl.ob.wc;

class Mc
extends wc<Qb> {
    @Nullable
    private final LocationManager f;
    @NonNull
    private final String g;

    @VisibleForTesting
    public Mc(@NonNull Context context, @NonNull Looper looper, @Nullable LocationManager locationManager, @NonNull sd sd2, @NonNull String string2, @NonNull LocationListener locationListener) {
        super(context, locationListener, sd2, looper);
        this.f = locationManager;
        this.g = string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a() {
        LocationManager locationManager = this.f;
        if (locationManager == null) return;
        try {
            locationManager.removeUpdates(this.c);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @SuppressLint(value={"MissingPermission"})
    public void b() {
        if (this.b.a(this.a)) {
            LocationManager locationManager = this.f;
            if (locationManager != null) {
                try {
                    locationManager = locationManager.getLastKnownLocation(this.g);
                }
                catch (Throwable throwable) {}
            }
            locationManager = null;
            this.c.onLocationChanged((Location)locationManager);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean c() {
        boolean bl;
        boolean bl2 = this.b.a(this.a);
        boolean bl3 = bl = false;
        if (!bl2) return bl3;
        String string2 = this.g;
        long l4 = wc.e;
        LocationListener locationListener = this.c;
        Looper looper = this.d;
        LocationManager locationManager = this.f;
        bl3 = bl;
        if (locationManager == null) return bl3;
        try {
            locationManager.requestLocationUpdates(string2, l4, 0.0f, locationListener, looper);
            return true;
        }
        catch (Throwable throwable) {
            return bl;
        }
    }
}

