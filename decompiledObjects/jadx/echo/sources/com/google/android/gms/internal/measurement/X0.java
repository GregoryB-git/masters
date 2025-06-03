package com.google.android.gms.internal.measurement;

import A2.AbstractC0328n;
import com.google.android.gms.internal.measurement.J0;

/* loaded from: classes.dex */
public final class X0 extends J0.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f10707s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ J0 f10708t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(J0 j02, String str) {
        super(j02);
        this.f10708t = j02;
        this.f10707s = str;
    }

    @Override // com.google.android.gms.internal.measurement.J0.a
    public final void a() {
        InterfaceC1062x0 interfaceC1062x0;
        interfaceC1062x0 = this.f10708t.f10433i;
        ((InterfaceC1062x0) AbstractC0328n.i(interfaceC1062x0)).beginAdUnitExposure(this.f10707s, this.f10435p);
    }
}
