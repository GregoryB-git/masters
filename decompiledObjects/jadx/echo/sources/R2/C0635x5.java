package R2;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.AbstractC0910g0;
import com.google.android.gms.internal.measurement.C0928i0;

/* renamed from: R2.x5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0635x5 extends C5 {

    /* renamed from: d, reason: collision with root package name */
    public final AlarmManager f5614d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC0629x f5615e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f5616f;

    public C0635x5(D5 d52) {
        super(d52);
        this.f5614d = (AlarmManager) a().getSystemService("alarm");
    }

    private final void D() {
        JobScheduler jobScheduler = (JobScheduler) a().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(A());
        }
    }

    public final int A() {
        if (this.f5616f == null) {
            this.f5616f = Integer.valueOf(("measurement" + a().getPackageName()).hashCode());
        }
        return this.f5616f.intValue();
    }

    public final PendingIntent B() {
        Context a7 = a();
        return AbstractC0910g0.a(a7, 0, new Intent().setClassName(a7, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), AbstractC0910g0.f10959b);
    }

    public final AbstractC0629x C() {
        if (this.f5615e == null) {
            this.f5615e = new A5(this, this.f5633b.i0());
        }
        return this.f5615e;
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ E2.e b() {
        return super.b();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ C0504f d() {
        return super.d();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ G2 e() {
        return super.e();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C0511g f() {
        return super.f();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C g() {
        return super.g();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ X1 h() {
        return super.h();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C0549l2 i() {
        return super.i();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ Y1 j() {
        return super.j();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ S5 k() {
        return super.k();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // R2.AbstractC0649z5
    public final /* bridge */ /* synthetic */ N5 o() {
        return super.o();
    }

    @Override // R2.AbstractC0649z5
    public final /* bridge */ /* synthetic */ b6 p() {
        return super.p();
    }

    @Override // R2.AbstractC0649z5
    public final /* bridge */ /* synthetic */ C0574p q() {
        return super.q();
    }

    @Override // R2.AbstractC0649z5
    public final /* bridge */ /* synthetic */ C0632x2 r() {
        return super.r();
    }

    @Override // R2.AbstractC0649z5
    public final /* bridge */ /* synthetic */ C0517g5 s() {
        return super.s();
    }

    @Override // R2.AbstractC0649z5
    public final /* bridge */ /* synthetic */ B5 t() {
        return super.t();
    }

    @Override // R2.C5
    public final boolean x() {
        AlarmManager alarmManager = this.f5614d;
        if (alarmManager != null) {
            alarmManager.cancel(B());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        D();
        return false;
    }

    public final void y(long j7) {
        u();
        Context a7 = a();
        if (!S5.c0(a7)) {
            j().F().a("Receiver not registered/enabled");
        }
        if (!S5.d0(a7, false)) {
            j().F().a("Service not registered/enabled");
        }
        z();
        j().K().b("Scheduling upload, millis", Long.valueOf(j7));
        long b7 = b().b() + j7;
        if (j7 < Math.max(0L, ((Long) K.f4870z.a(null)).longValue()) && !C().e()) {
            C().b(j7);
        }
        if (Build.VERSION.SDK_INT < 24) {
            AlarmManager alarmManager = this.f5614d;
            if (alarmManager != null) {
                alarmManager.setInexactRepeating(2, b7, Math.max(((Long) K.f4860u.a(null)).longValue(), j7), B());
                return;
            }
            return;
        }
        Context a8 = a();
        ComponentName componentName = new ComponentName(a8, "com.google.android.gms.measurement.AppMeasurementJobService");
        int A7 = A();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        C0928i0.c(a8, new JobInfo.Builder(A7, componentName).setMinimumLatency(j7).setOverrideDeadline(j7 << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final void z() {
        u();
        j().K().a("Unscheduling upload");
        AlarmManager alarmManager = this.f5614d;
        if (alarmManager != null) {
            alarmManager.cancel(B());
        }
        C().a();
        if (Build.VERSION.SDK_INT >= 24) {
            D();
        }
    }
}
