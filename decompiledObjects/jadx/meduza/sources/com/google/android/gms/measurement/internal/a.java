package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import e7.h3;
import e7.k3;
import m6.j;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService.a f2906a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f2907b;

    public a(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService.a aVar) {
        this.f2906a = aVar;
        this.f2907b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h3 h3Var;
        k3 k10 = this.f2907b.f2900a.k();
        AppMeasurementDynamiteService.a aVar = this.f2906a;
        k10.l();
        k10.t();
        if (aVar != null && aVar != (h3Var = k10.f4422e)) {
            j.k(h3Var == null, "EventInterceptor already set.");
        }
        k10.f4422e = aVar;
    }
}
