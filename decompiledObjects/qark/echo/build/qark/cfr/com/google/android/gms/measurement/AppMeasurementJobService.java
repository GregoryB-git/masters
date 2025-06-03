/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.job.JobParameters
 *  android.app.job.JobService
 *  android.content.Context
 *  android.content.Intent
 *  java.lang.UnsupportedOperationException
 */
package com.google.android.gms.measurement;

import R2.i5;
import R2.m5;
import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;

@TargetApi(value=24)
public final class AppMeasurementJobService
extends JobService
implements m5 {
    public i5 o;

    public final i5 a() {
        if (this.o == null) {
            this.o = new i5((Context)this);
        }
        return this.o;
    }

    @Override
    public final boolean e(int n8) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void f(Intent intent) {
    }

    @Override
    public final void g(JobParameters jobParameters, boolean bl) {
        this.jobFinished(jobParameters, false);
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

    public final boolean onStartJob(JobParameters jobParameters) {
        return this.a().g(jobParameters);
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onUnbind(Intent intent) {
        return this.a().k(intent);
    }
}

