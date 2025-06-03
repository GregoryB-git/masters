package com.google.android.gms.internal.measurement;

import A2.AbstractC0328n;
import com.google.android.gms.internal.measurement.J0;

/* renamed from: com.google.android.gms.internal.measurement.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0947k1 extends J0.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ J0.b f11008s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ J0 f11009t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0947k1(J0 j02, J0.b bVar) {
        super(j02);
        this.f11009t = j02;
        this.f11008s = bVar;
    }

    @Override // com.google.android.gms.internal.measurement.J0.a
    public final void a() {
        InterfaceC1062x0 interfaceC1062x0;
        interfaceC1062x0 = this.f11009t.f10433i;
        ((InterfaceC1062x0) AbstractC0328n.i(interfaceC1062x0)).registerOnMeasurementEventListener(this.f11008s);
    }
}
