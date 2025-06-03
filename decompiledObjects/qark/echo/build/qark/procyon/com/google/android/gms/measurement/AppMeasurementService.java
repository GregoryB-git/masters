// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.measurement;

import android.os.IBinder;
import android.app.job.JobParameters;
import V.a;
import android.content.Intent;
import android.content.Context;
import R2.i5;
import R2.m5;
import android.app.Service;

public final class AppMeasurementService extends Service implements m5
{
    public i5 o;
    
    private final i5 a() {
        if (this.o == null) {
            this.o = new i5((Context)this);
        }
        return this.o;
    }
    
    public final boolean e(final int n) {
        return this.stopSelfResult(n);
    }
    
    public final void f(final Intent intent) {
        a.b(intent);
    }
    
    public final void g(final JobParameters jobParameters, final boolean b) {
        throw new UnsupportedOperationException();
    }
    
    public final IBinder onBind(final Intent intent) {
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
    
    public final void onRebind(final Intent intent) {
        this.a().i(intent);
    }
    
    public final int onStartCommand(final Intent intent, final int n, final int n2) {
        return this.a().a(intent, n, n2);
    }
    
    public final boolean onUnbind(final Intent intent) {
        return this.a().k(intent);
    }
}
