package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.q6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1006q6 implements InterfaceC1014r6 {

    /* renamed from: a, reason: collision with root package name */
    public static final S2 f11116a;

    /* renamed from: b, reason: collision with root package name */
    public static final S2 f11117b;

    /* renamed from: c, reason: collision with root package name */
    public static final S2 f11118c;

    static {
        C0859a3 e7 = new C0859a3(P2.a("com.google.android.gms.measurement")).f().e();
        f11116a = e7.d("measurement.collection.event_safelist", true);
        f11117b = e7.d("measurement.service.store_null_safelist", true);
        f11118c = e7.d("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1014r6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1014r6
    public final boolean b() {
        return ((Boolean) f11117b.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1014r6
    public final boolean c() {
        return ((Boolean) f11118c.f()).booleanValue();
    }
}
