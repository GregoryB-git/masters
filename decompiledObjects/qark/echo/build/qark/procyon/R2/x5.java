// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.BaseBundle;
import com.google.android.gms.internal.measurement.i0;
import android.app.job.JobInfo$Builder;
import android.os.PersistableBundle;
import android.content.ComponentName;
import android.os.Build$VERSION;
import E2.e;
import android.content.Context;
import com.google.android.gms.internal.measurement.g0;
import android.content.Intent;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.app.AlarmManager;

public final class x5 extends C5
{
    public final AlarmManager d;
    public x e;
    public Integer f;
    
    public x5(final D5 d5) {
        super(d5);
        this.d = (AlarmManager)this.a().getSystemService("alarm");
    }
    
    private final void D() {
        final JobScheduler jobScheduler = (JobScheduler)this.a().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(this.A());
        }
    }
    
    public final int A() {
        if (this.f == null) {
            final String packageName = this.a().getPackageName();
            final StringBuilder sb = new StringBuilder("measurement");
            sb.append(packageName);
            this.f = sb.toString().hashCode();
        }
        return this.f;
    }
    
    public final PendingIntent B() {
        final Context a = this.a();
        return g0.a(a, 0, new Intent().setClassName(a, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), g0.b);
    }
    
    public final x C() {
        if (this.e == null) {
            this.e = new A5(this, super.b.i0());
        }
        return this.e;
    }
    
    @Override
    public final boolean x() {
        final AlarmManager d = this.d;
        if (d != null) {
            d.cancel(this.B());
        }
        if (Build$VERSION.SDK_INT >= 24) {
            this.D();
        }
        return false;
    }
    
    public final void y(final long b) {
        this.u();
        final Context a = this.a();
        if (!S5.c0(a)) {
            this.j().F().a("Receiver not registered/enabled");
        }
        if (!S5.d0(a, false)) {
            this.j().F().a("Service not registered/enabled");
        }
        this.z();
        this.j().K().b("Scheduling upload, millis", b);
        final long b2 = this.b().b();
        if (b < Math.max(0L, (long)K.z.a(null)) && !this.C().e()) {
            this.C().b(b);
        }
        if (Build$VERSION.SDK_INT >= 24) {
            final Context a2 = this.a();
            final ComponentName componentName = new ComponentName(a2, "com.google.android.gms.measurement.AppMeasurementJobService");
            final int a3 = this.A();
            final PersistableBundle extras = new PersistableBundle();
            ((BaseBundle)extras).putString("action", "com.google.android.gms.measurement.UPLOAD");
            i0.c(a2, new JobInfo$Builder(a3, componentName).setMinimumLatency(b).setOverrideDeadline(b << 1).setExtras(extras).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        final AlarmManager d = this.d;
        if (d != null) {
            d.setInexactRepeating(2, b2 + b, Math.max((long)K.u.a(null), b), this.B());
        }
    }
    
    public final void z() {
        this.u();
        this.j().K().a("Unscheduling upload");
        final AlarmManager d = this.d;
        if (d != null) {
            d.cancel(this.B());
        }
        this.C().a();
        if (Build$VERSION.SDK_INT >= 24) {
            this.D();
        }
    }
}
