package com.google.android.gms.internal.measurement;

import A2.AbstractC0328n;
import android.app.Activity;
import com.google.android.gms.internal.measurement.J0;

/* renamed from: com.google.android.gms.internal.measurement.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0992p1 extends J0.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Activity f11093s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ J0.c f11094t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0992p1(J0.c cVar, Activity activity) {
        super(J0.this);
        this.f11094t = cVar;
        this.f11093s = activity;
    }

    @Override // com.google.android.gms.internal.measurement.J0.a
    public final void a() {
        InterfaceC1062x0 interfaceC1062x0;
        interfaceC1062x0 = J0.this.f10433i;
        ((InterfaceC1062x0) AbstractC0328n.i(interfaceC1062x0)).onActivityResumed(H2.b.Z0(this.f11093s), this.f10435p);
    }
}
