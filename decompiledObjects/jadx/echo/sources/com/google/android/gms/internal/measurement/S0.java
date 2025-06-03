package com.google.android.gms.internal.measurement;

import A2.AbstractC0328n;
import com.google.android.gms.internal.measurement.J0;

/* loaded from: classes.dex */
public final class S0 extends J0.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ J0 f10568s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(J0 j02) {
        super(j02);
        this.f10568s = j02;
    }

    @Override // com.google.android.gms.internal.measurement.J0.a
    public final void a() {
        InterfaceC1062x0 interfaceC1062x0;
        interfaceC1062x0 = this.f10568s.f10433i;
        ((InterfaceC1062x0) AbstractC0328n.i(interfaceC1062x0)).resetAnalyticsData(this.f10434o);
    }
}
