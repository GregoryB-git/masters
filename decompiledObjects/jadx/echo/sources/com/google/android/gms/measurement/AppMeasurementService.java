package com.google.android.gms.measurement;

import R2.C0531i5;
import R2.InterfaceC0559m5;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements InterfaceC0559m5 {

    /* renamed from: o, reason: collision with root package name */
    public C0531i5 f11244o;

    private final C0531i5 a() {
        if (this.f11244o == null) {
            this.f11244o = new C0531i5(this);
        }
        return this.f11244o;
    }

    @Override // R2.InterfaceC0559m5
    public final boolean e(int i7) {
        return stopSelfResult(i7);
    }

    @Override // R2.InterfaceC0559m5
    public final void f(Intent intent) {
        V.a.b(intent);
    }

    @Override // R2.InterfaceC0559m5
    public final void g(JobParameters jobParameters, boolean z7) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return a().b(intent);
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

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i8) {
        return a().a(intent, i7, i8);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return a().k(intent);
    }
}
