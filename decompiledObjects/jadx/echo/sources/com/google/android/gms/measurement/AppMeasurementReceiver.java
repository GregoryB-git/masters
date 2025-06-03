package com.google.android.gms.measurement;

import R2.C0618v2;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends V.a implements C0618v2.a {

    /* renamed from: q, reason: collision with root package name */
    public C0618v2 f11243q;

    @Override // R2.C0618v2.a
    public final void a(Context context, Intent intent) {
        V.a.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f11243q == null) {
            this.f11243q = new C0618v2(this);
        }
        this.f11243q.a(context, intent);
    }
}
