package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService.a f11254o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f11255p;

    public a(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService.a aVar) {
        this.f11255p = appMeasurementDynamiteService;
        this.f11254o = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11255p.f11248b.H().J(this.f11254o);
    }
}
