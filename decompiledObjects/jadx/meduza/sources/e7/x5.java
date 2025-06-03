package e7;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.internal.measurement.zzcy;

/* loaded from: classes.dex */
public final class x5 extends h6 {

    /* renamed from: e, reason: collision with root package name */
    public final AlarmManager f4762e;
    public s5 f;

    /* renamed from: o, reason: collision with root package name */
    public Integer f4763o;

    public x5(i6 i6Var) {
        super(i6Var);
        this.f4762e = (AlarmManager) zza().getSystemService("alarm");
    }

    @Override // e7.h6
    public final boolean r() {
        JobScheduler jobScheduler;
        AlarmManager alarmManager = this.f4762e;
        if (alarmManager != null) {
            alarmManager.cancel(u());
        }
        if (Build.VERSION.SDK_INT < 24 || (jobScheduler = (JobScheduler) zza().getSystemService("jobscheduler")) == null) {
            return false;
        }
        jobScheduler.cancel(t());
        return false;
    }

    public final void s() {
        JobScheduler jobScheduler;
        p();
        zzj().f4067w.b("Unscheduling upload");
        AlarmManager alarmManager = this.f4762e;
        if (alarmManager != null) {
            alarmManager.cancel(u());
        }
        v().a();
        if (Build.VERSION.SDK_INT < 24 || (jobScheduler = (JobScheduler) zza().getSystemService("jobscheduler")) == null) {
            return;
        }
        jobScheduler.cancel(t());
    }

    public final int t() {
        if (this.f4763o == null) {
            this.f4763o = Integer.valueOf(("measurement" + zza().getPackageName()).hashCode());
        }
        return this.f4763o.intValue();
    }

    public final PendingIntent u() {
        Context zza = zza();
        return zzcy.zza(zza, 0, new Intent().setClassName(zza, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzcy.zza);
    }

    public final v v() {
        if (this.f == null) {
            this.f = new s5(this, this.f4804c.t, 1);
        }
        return this.f;
    }
}
