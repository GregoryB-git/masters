// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.content.Intent;
import android.content.Context;
import R2.i5;
import android.annotation.TargetApi;
import R2.m5;
import android.app.job.JobService;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements m5
{
    public i5 o;
    
    public final i5 a() {
        if (this.o == null) {
            this.o = new i5((Context)this);
        }
        return this.o;
    }
    
    public final boolean e(final int n) {
        throw new UnsupportedOperationException();
    }
    
    public final void f(final Intent intent) {
    }
    
    public final void g(final JobParameters jobParameters, final boolean b) {
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
    
    public final void onRebind(final Intent intent) {
        this.a().i(intent);
    }
    
    public final boolean onStartJob(final JobParameters jobParameters) {
        return this.a().g(jobParameters);
    }
    
    public final boolean onStopJob(final JobParameters jobParameters) {
        return false;
    }
    
    public final boolean onUnbind(final Intent intent) {
        return this.a().k(intent);
    }
}
