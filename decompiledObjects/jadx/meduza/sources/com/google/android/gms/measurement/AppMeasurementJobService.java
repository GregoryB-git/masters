package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zzed;
import e7.a1;
import e7.h0;
import e7.i6;
import e7.j2;
import e7.m5;
import e7.o5;
import e7.x2;
import i6.t;
import java.util.Objects;
import l6.q0;
import m6.j;

/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements o5 {

    /* renamed from: a, reason: collision with root package name */
    public m5<AppMeasurementJobService> f2894a;

    @Override // e7.o5
    public final void a(Intent intent) {
    }

    @Override // e7.o5
    public final void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final m5<AppMeasurementJobService> c() {
        if (this.f2894a == null) {
            this.f2894a = new m5<>(this);
        }
        return this.f2894a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        j2.a(c().f4496a, null, null).zzj().f4067w.b("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        j2.a(c().f4496a, null, null).zzj().f4067w.b("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        c().a(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        m5<AppMeasurementJobService> c10 = c();
        c10.getClass();
        String string = jobParameters.getExtras().getString("action");
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            j.i(string);
            i6 f = i6.f(c10.f4496a);
            a1 zzj = f.zzj();
            zzj.f4067w.c("Local AppMeasurementJobService called. action", string);
            f.zzl().u(new t(f, new x2(c10, zzj, jobParameters)));
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        j.i(string);
        zzed zza = zzed.zza(c10.f4496a);
        if (!h0.O0.a(null).booleanValue()) {
            return true;
        }
        zza.zza(new q0(c10, jobParameters, 5));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        c().c(intent);
        return true;
    }

    @Override // e7.o5
    public final boolean zza(int i10) {
        throw new UnsupportedOperationException();
    }
}
