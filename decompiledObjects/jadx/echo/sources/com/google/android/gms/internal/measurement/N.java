package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class N implements P {

    /* renamed from: a, reason: collision with root package name */
    public final C0904f3 f10516a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10517b;

    public N(C0904f3 c0904f3, String str) {
        this.f10516a = c0904f3;
        this.f10517b = str;
    }

    @Override // com.google.android.gms.internal.measurement.P
    public final C0904f3 a(InterfaceC1016s interfaceC1016s) {
        C0904f3 d7 = this.f10516a.d();
        d7.f(this.f10517b, interfaceC1016s);
        return d7;
    }
}
