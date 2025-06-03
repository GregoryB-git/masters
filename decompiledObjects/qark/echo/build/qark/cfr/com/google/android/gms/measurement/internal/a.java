/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.google.android.gms.measurement.internal;

import R2.C3;
import R2.N2;
import R2.v3;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

public final class a
implements Runnable {
    public final /* synthetic */ AppMeasurementDynamiteService.a o;
    public final /* synthetic */ AppMeasurementDynamiteService p;

    public a(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService.a a8) {
        this.p = appMeasurementDynamiteService;
        this.o = a8;
    }

    public final void run() {
        this.p.b.H().J(this.o);
    }
}

