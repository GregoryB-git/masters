package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class U6 implements R6 {

    /* renamed from: a, reason: collision with root package name */
    public static final S2 f10672a;

    /* renamed from: b, reason: collision with root package name */
    public static final S2 f10673b;

    /* renamed from: c, reason: collision with root package name */
    public static final S2 f10674c;

    static {
        C0859a3 e7 = new C0859a3(P2.a("com.google.android.gms.measurement")).f().e();
        f10672a = e7.d("measurement.item_scoped_custom_parameters.client", true);
        f10673b = e7.d("measurement.item_scoped_custom_parameters.service", false);
        f10674c = e7.b("measurement.id.item_scoped_custom_parameters.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.R6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.R6
    public final boolean b() {
        return ((Boolean) f10672a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.R6
    public final boolean c() {
        return ((Boolean) f10673b.f()).booleanValue();
    }
}
