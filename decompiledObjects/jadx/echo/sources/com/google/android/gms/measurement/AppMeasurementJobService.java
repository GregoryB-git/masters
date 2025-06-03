package com.google.android.gms.measurement;

import R2.C0531i5;
import R2.InterfaceC0559m5;
import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;

@TargetApi(24)
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements InterfaceC0559m5 {

    /* renamed from: o, reason: collision with root package name */
    public C0531i5 f11242o;

    public final C0531i5 a() {
        if (this.f11242o == null) {
            this.f11242o = new C0531i5(this);
        }
        return this.f11242o;
    }

    @Override // R2.InterfaceC0559m5
    public final boolean e(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // R2.InterfaceC0559m5
    public final void f(Intent intent) {
    }

    @Override // R2.InterfaceC0559m5
    public final void g(JobParameters jobParameters, boolean z7) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        a().c();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        a().h();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        a().i(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        return a().g(jobParameters);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return a().k(intent);
    }
}
