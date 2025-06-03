package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class Q implements P {

    /* renamed from: a, reason: collision with root package name */
    public final C0904f3 f10546a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10547b;

    public Q(C0904f3 c0904f3, String str) {
        this.f10546a = c0904f3;
        this.f10547b = str;
    }

    @Override // com.google.android.gms.internal.measurement.P
    public final C0904f3 a(InterfaceC1016s interfaceC1016s) {
        C0904f3 d7 = this.f10546a.d();
        d7.e(this.f10547b, interfaceC1016s);
        return d7;
    }
}
