package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.k6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0952k6 implements InterfaceC0961l6 {

    /* renamed from: a, reason: collision with root package name */
    public static final S2 f11015a;

    /* renamed from: b, reason: collision with root package name */
    public static final S2 f11016b;

    static {
        C0859a3 e7 = new C0859a3(P2.a("com.google.android.gms.measurement")).f().e();
        f11015a = e7.d("measurement.service.deferred_first_open", false);
        f11016b = e7.b("measurement.id.service.deferred_first_open", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0961l6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0961l6
    public final boolean b() {
        return ((Boolean) f11015a.f()).booleanValue();
    }
}
