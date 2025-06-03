package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class B7 implements C7 {

    /* renamed from: a, reason: collision with root package name */
    public static final S2 f10320a;

    /* renamed from: b, reason: collision with root package name */
    public static final S2 f10321b;

    static {
        C0859a3 e7 = new C0859a3(P2.a("com.google.android.gms.measurement")).f().e();
        f10320a = e7.d("measurement.sfmc.client", true);
        f10321b = e7.d("measurement.sfmc.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.C7
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.C7
    public final boolean b() {
        return ((Boolean) f10320a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.C7
    public final boolean c() {
        return ((Boolean) f10321b.f()).booleanValue();
    }
}
