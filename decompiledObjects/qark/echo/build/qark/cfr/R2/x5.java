/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.AlarmManager
 *  android.app.PendingIntent
 *  android.app.job.JobInfo
 *  android.app.job.JobInfo$Builder
 *  android.app.job.JobScheduler
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.PersistableBundle
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package R2;

import E2.e;
import R2.A5;
import R2.B5;
import R2.C;
import R2.C5;
import R2.D5;
import R2.G2;
import R2.K;
import R2.N2;
import R2.N5;
import R2.P1;
import R2.S5;
import R2.X1;
import R2.Y1;
import R2.a2;
import R2.b6;
import R2.f;
import R2.g;
import R2.g5;
import R2.l2;
import R2.m3;
import R2.o3;
import R2.p;
import R2.x;
import R2.x2;
import R2.z5;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.g0;
import com.google.android.gms.internal.measurement.i0;

public final class x5
extends C5 {
    public final AlarmManager d;
    public x e;
    public Integer f;

    public x5(D5 d52) {
        super(d52);
        this.d = (AlarmManager)this.a().getSystemService("alarm");
    }

    private final void D() {
        JobScheduler jobScheduler = (JobScheduler)this.a().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(this.A());
        }
    }

    public final int A() {
        if (this.f == null) {
            String string2 = this.a().getPackageName();
            StringBuilder stringBuilder = new StringBuilder("measurement");
            stringBuilder.append(string2);
            this.f = stringBuilder.toString().hashCode();
        }
        return this.f;
    }

    public final PendingIntent B() {
        Context context = this.a();
        return g0.a(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), g0.b);
    }

    public final x C() {
        if (this.e == null) {
            this.e = new A5(this, this.b.i0());
        }
        return this.e;
    }

    @Override
    public final boolean x() {
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            alarmManager.cancel(this.B());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.D();
        }
        return false;
    }

    public final void y(long l8) {
        this.u();
        Context context = this.a();
        if (!S5.c0(context)) {
            this.j().F().a("Receiver not registered/enabled");
        }
        if (!S5.d0(context, false)) {
            this.j().F().a("Service not registered/enabled");
        }
        this.z();
        this.j().K().b("Scheduling upload, millis", l8);
        long l9 = this.b().b();
        if (l8 < Math.max((long)0L, (long)((Long)K.z.a(null))) && !this.C().e()) {
            this.C().b(l8);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            context = this.a();
            ComponentName componentName = new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService");
            int n8 = this.A();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            i0.c(context, new JobInfo.Builder(n8, componentName).setMinimumLatency(l8).setOverrideDeadline(l8 << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        context = this.d;
        if (context != null) {
            context.setInexactRepeating(2, l9 + l8, Math.max((long)((Long)K.u.a(null)), (long)l8), this.B());
        }
    }

    public final void z() {
        this.u();
        this.j().K().a("Unscheduling upload");
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            alarmManager.cancel(this.B());
        }
        this.C().a();
        if (Build.VERSION.SDK_INT >= 24) {
            this.D();
        }
    }
}

