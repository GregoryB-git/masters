/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.app.job.JobParameters
 *  android.content.Context
 *  android.content.Intent
 *  android.os.IBinder
 *  java.lang.UnsupportedOperationException
 */
package com.google.android.gms.measurement;

import R2.i5;
import R2.m5;
import V.a;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

public final class AppMeasurementService
extends Service
implements m5 {
    public i5 o;

    private final i5 a() {
        if (this.o == null) {
            this.o = new i5((Context)this);
        }
        return this.o;
    }

    @Override
    public final boolean e(int n8) {
        return this.stopSelfResult(n8);
    }

    @Override
    public final void f(Intent intent) {
        a.b(intent);
    }

    @Override
    public final void g(JobParameters jobParameters, boolean bl) {
        throw new UnsupportedOperationException();
    }

    public final IBinder onBind(Intent intent) {
        return this.a().b(intent);
    }

    public final void onCreate() {
        super.onCreate();
        this.a().c();
    }

    public final void onDestroy() {
        this.a().h();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        this.a().i(intent);
    }

    public final int onStartCommand(Intent intent, int n8, int n9) {
        return this.a().a(intent, n8, n9);
    }

    public final boolean onUnbind(Intent intent) {
        return this.a().k(intent);
    }
}

