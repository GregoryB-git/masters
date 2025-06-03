/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.hardware.SensorEvent
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.appsflyer.internal;

import android.hardware.SensorEvent;
import com.appsflyer.internal.AFf1kSDK;

public final class v
implements Runnable {
    public final /* synthetic */ AFf1kSDK o;
    public final /* synthetic */ SensorEvent p;

    public /* synthetic */ v(AFf1kSDK aFf1kSDK, SensorEvent sensorEvent) {
        this.o = aFf1kSDK;
        this.p = sensorEvent;
    }

    public final void run() {
        AFf1kSDK.a(this.o, this.p);
    }
}

