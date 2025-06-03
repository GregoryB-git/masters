/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.location.LocationListener
 *  android.os.Looper
 *  android.util.Log
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  com.google.android.gms.location.FusedLocationProviderClient
 *  com.google.android.gms.location.LocationCallback
 *  com.google.android.gms.location.LocationRequest
 *  com.google.android.gms.tasks.OnSuccessListener
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.Executor
 */
package com.yandex.metrica.gpllibrary;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnSuccessListener;
import com.yandex.metrica.gpllibrary.GplLocationCallback;
import com.yandex.metrica.gpllibrary.GplOnSuccessListener;
import java.util.concurrent.Executor;

public class a
implements com.yandex.metrica.gpllibrary.b {
    @NonNull
    private final FusedLocationProviderClient a;
    @NonNull
    private final LocationListener b;
    @NonNull
    private final LocationCallback c;
    @NonNull
    private final Looper d;
    @NonNull
    private final Executor e;
    private final long f;

    public a(@NonNull Context context, @NonNull LocationListener locationListener, @NonNull Looper looper, @NonNull Executor executor, long l4) throws Throwable {
        this(new Object(context){
            @NonNull
            private final Context a;
            {
                this.a = context;
            }

            @NonNull
            public FusedLocationProviderClient a() throws Throwable {
                return new FusedLocationProviderClient(this.a);
            }
        }, locationListener, looper, executor, l4);
    }

    @VisibleForTesting
    public a(@NonNull a a2, @NonNull LocationListener locationListener, @NonNull Looper looper, @NonNull Executor executor, long l4) throws Throwable {
        this.a = a2.a();
        this.b = locationListener;
        this.d = looper;
        this.e = executor;
        this.f = l4;
        this.c = new GplLocationCallback(locationListener);
    }

    @Override
    @SuppressLint(value={"MissingPermission"})
    public void startLocationUpdates(@NonNull b b2) throws Throwable {
        Log.d((String)"[GplLibraryWrapper]", (String)"startLocationUpdates");
        FusedLocationProviderClient fusedLocationProviderClient = this.a;
        LocationRequest locationRequest = LocationRequest.create().setInterval(this.f);
        int n4 = b2.ordinal();
        n4 = n4 != 1 ? (n4 != 2 ? (n4 != 3 ? 105 : 100) : 102) : 104;
        fusedLocationProviderClient.requestLocationUpdates(locationRequest.setPriority(n4), this.c, this.d);
    }

    @Override
    public void stopLocationUpdates() throws Throwable {
        Log.d((String)"[GplLibraryWrapper]", (String)"stopLocationUpdates");
        this.a.removeLocationUpdates(this.c);
    }

    @Override
    @SuppressLint(value={"MissingPermission"})
    public void updateLastKnownLocation() throws Throwable {
        Log.d((String)"[GplLibraryWrapper]", (String)"updateLastKnownLocation");
        this.a.getLastLocation().addOnSuccessListener(this.e, (OnSuccessListener)new GplOnSuccessListener(this.b));
    }
}

