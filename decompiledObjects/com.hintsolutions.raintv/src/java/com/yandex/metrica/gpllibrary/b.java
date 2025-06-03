/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Throwable
 */
package com.yandex.metrica.gpllibrary;

import androidx.annotation.NonNull;
import com.yandex.metrica.gpllibrary.a;

public interface b {
    public void startLocationUpdates(@NonNull a.b var1) throws Throwable;

    public void stopLocationUpdates() throws Throwable;

    public void updateLastKnownLocation() throws Throwable;
}

