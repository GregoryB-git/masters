/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.LocationManager
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Collections
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.LocationManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Collections;
import java.util.List;

public class x {
    @Nullable
    private final LocationManager a;

    public x(@NonNull Context context) {
        this((LocationManager)context.getSystemService("location"));
    }

    @VisibleForTesting
    public x(@Nullable LocationManager locationManager) {
        this.a = locationManager;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    public List<String> a() {
        LocationManager locationManager = this.a;
        List list = Collections.emptyList();
        if (locationManager != null) {
            try {
                locationManager = locationManager.getProviders(true);
            }
            catch (Throwable throwable) {}
        }
        locationManager = null;
        if (locationManager != null) return locationManager;
        return list;
    }
}

