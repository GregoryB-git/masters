package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.c7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0881c7 implements InterfaceC0890d7 {

    /* renamed from: a, reason: collision with root package name */
    public static final S2 f10859a;

    /* renamed from: b, reason: collision with root package name */
    public static final S2 f10860b;

    /* renamed from: c, reason: collision with root package name */
    public static final S2 f10861c;

    /* renamed from: d, reason: collision with root package name */
    public static final S2 f10862d;

    /* renamed from: e, reason: collision with root package name */
    public static final S2 f10863e;

    static {
        C0859a3 e7 = new C0859a3(P2.a("com.google.android.gms.measurement")).f().e();
        f10859a = e7.d("measurement.test.boolean_flag", false);
        f10860b = e7.a("measurement.test.double_flag", -3.0d);
        f10861c = e7.b("measurement.test.int_flag", -2L);
        f10862d = e7.b("measurement.test.long_flag", -1L);
        f10863e = e7.c("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0890d7
    public final double a() {
        return ((Double) f10860b.f()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0890d7
    public final long b() {
        return ((Long) f10861c.f()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0890d7
    public final long c() {
        return ((Long) f10862d.f()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0890d7
    public final String d() {
        return (String) f10863e.f();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0890d7
    public final boolean f() {
        return ((Boolean) f10859a.f()).booleanValue();
    }
}
