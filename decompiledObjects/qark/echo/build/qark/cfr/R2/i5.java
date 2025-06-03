/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.job.JobParameters
 *  android.content.Context
 *  android.content.Intent
 *  android.os.IBinder
 *  android.os.PersistableBundle
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package R2;

import A2.n;
import R2.D5;
import R2.G2;
import R2.N2;
import R2.R2;
import R2.Y1;
import R2.a2;
import R2.h5;
import R2.j5;
import R2.k5;
import R2.m5;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PersistableBundle;

public final class i5 {
    public final Context a;

    public i5(Context context) {
        n.i((Object)context);
        this.a = context;
    }

    public final int a(Intent intent, int n8, int n9) {
        Y1 y12 = N2.c(this.a, null, null).j();
        if (intent == null) {
            y12.L().a("AppMeasurementService started with null intent");
            return 2;
        }
        String string2 = intent.getAction();
        y12.K().c("Local AppMeasurementService called. startId, action", n9, string2);
        if ("com.google.android.gms.measurement.UPLOAD".equals((Object)string2)) {
            this.f(new k5(this, n9, y12, intent));
        }
        return 2;
    }

    public final IBinder b(Intent object) {
        if (object == null) {
            this.j().G().a("onBind called with null intent");
            return null;
        }
        if ("com.google.android.gms.measurement.START".equals(object = object.getAction())) {
            return new R2(D5.k(this.a));
        }
        this.j().L().b("onBind received unknown action", object);
        return null;
    }

    public final void c() {
        N2.c(this.a, null, null).j().K().a("Local AppMeasurementService is starting up");
    }

    public final /* synthetic */ void d(int n8, Y1 y12, Intent intent) {
        if (((m5)this.a).e(n8)) {
            y12.K().b("Local AppMeasurementService processed last upload request. StartId", n8);
            this.j().K().a("Completed wakeful intent.");
            ((m5)this.a).f(intent);
        }
    }

    public final /* synthetic */ void e(Y1 y12, JobParameters jobParameters) {
        y12.K().a("AppMeasurementJobService processed last upload request.");
        ((m5)this.a).g(jobParameters, false);
    }

    public final void f(Runnable runnable) {
        D5 d52 = D5.k(this.a);
        d52.e().D(new j5(this, d52, runnable));
    }

    public final boolean g(JobParameters jobParameters) {
        Y1 y12 = N2.c(this.a, null, null).j();
        String string2 = jobParameters.getExtras().getString("action");
        y12.K().b("Local AppMeasurementJobService called. action", string2);
        if ("com.google.android.gms.measurement.UPLOAD".equals((Object)string2)) {
            this.f(new h5(this, y12, jobParameters));
        }
        return true;
    }

    public final void h() {
        N2.c(this.a, null, null).j().K().a("Local AppMeasurementService is shutting down");
    }

    public final void i(Intent object) {
        if (object == null) {
            this.j().G().a("onRebind called with null intent");
            return;
        }
        object = object.getAction();
        this.j().K().b("onRebind called. action", object);
    }

    public final Y1 j() {
        return N2.c(this.a, null, null).j();
    }

    public final boolean k(Intent object) {
        if (object == null) {
            this.j().G().a("onUnbind called with null intent");
            return true;
        }
        object = object.getAction();
        this.j().K().b("onUnbind called for intent. action", object);
        return true;
    }
}

