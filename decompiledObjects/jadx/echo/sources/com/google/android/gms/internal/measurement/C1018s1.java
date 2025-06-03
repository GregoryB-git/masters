package com.google.android.gms.internal.measurement;

import A2.AbstractC0328n;
import android.app.Activity;
import com.google.android.gms.internal.measurement.J0;

/* renamed from: com.google.android.gms.internal.measurement.s1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1018s1 extends J0.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Activity f11143s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ J0.c f11144t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1018s1(J0.c cVar, Activity activity) {
        super(J0.this);
        this.f11144t = cVar;
        this.f11143s = activity;
    }

    @Override // com.google.android.gms.internal.measurement.J0.a
    public final void a() {
        InterfaceC1062x0 interfaceC1062x0;
        interfaceC1062x0 = J0.this.f10433i;
        ((InterfaceC1062x0) AbstractC0328n.i(interfaceC1062x0)).onActivityPaused(H2.b.Z0(this.f11143s), this.f10435p);
    }
}
