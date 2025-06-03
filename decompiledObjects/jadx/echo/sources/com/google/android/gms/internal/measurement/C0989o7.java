package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.o7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0989o7 implements InterfaceC0998p7 {

    /* renamed from: a, reason: collision with root package name */
    public static final S2 f11091a;

    /* renamed from: b, reason: collision with root package name */
    public static final S2 f11092b;

    static {
        C0859a3 e7 = new C0859a3(P2.a("com.google.android.gms.measurement")).f().e();
        f11091a = e7.d("measurement.remove_app_background.client", false);
        f11092b = e7.b("measurement.id.remove_app_background.client", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0998p7
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0998p7
    public final boolean b() {
        return ((Boolean) f11091a.f()).booleanValue();
    }
}
