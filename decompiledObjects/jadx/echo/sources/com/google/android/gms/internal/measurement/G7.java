package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class G7 implements D7 {

    /* renamed from: a, reason: collision with root package name */
    public static final S2 f10388a;

    /* renamed from: b, reason: collision with root package name */
    public static final S2 f10389b;

    static {
        C0859a3 e7 = new C0859a3(P2.a("com.google.android.gms.measurement")).f().e();
        f10388a = e7.d("measurement.sgtm.client.dev", false);
        f10389b = e7.d("measurement.sgtm.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.D7
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.D7
    public final boolean b() {
        return ((Boolean) f10388a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.D7
    public final boolean c() {
        return ((Boolean) f10389b.f()).booleanValue();
    }
}
