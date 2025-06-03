package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0935i7 implements InterfaceC0944j7 {

    /* renamed from: a, reason: collision with root package name */
    public static final S2 f10984a;

    /* renamed from: b, reason: collision with root package name */
    public static final S2 f10985b;

    /* renamed from: c, reason: collision with root package name */
    public static final S2 f10986c;

    /* renamed from: d, reason: collision with root package name */
    public static final S2 f10987d;

    /* renamed from: e, reason: collision with root package name */
    public static final S2 f10988e;

    /* renamed from: f, reason: collision with root package name */
    public static final S2 f10989f;

    static {
        C0859a3 e7 = new C0859a3(P2.a("com.google.android.gms.measurement")).f().e();
        f10984a = e7.d("measurement.rb.attribution.client2", false);
        f10985b = e7.d("measurement.rb.attribution.followup1.service", false);
        f10986c = e7.d("measurement.rb.attribution.service", false);
        f10987d = e7.d("measurement.rb.attribution.enable_trigger_redaction", true);
        f10988e = e7.d("measurement.rb.attribution.uuid_generation", true);
        f10989f = e7.b("measurement.id.rb.attribution.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0944j7
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0944j7
    public final boolean b() {
        return ((Boolean) f10984a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0944j7
    public final boolean c() {
        return ((Boolean) f10985b.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0944j7
    public final boolean d() {
        return ((Boolean) f10986c.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0944j7
    public final boolean f() {
        return ((Boolean) f10987d.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0944j7
    public final boolean g() {
        return ((Boolean) f10988e.f()).booleanValue();
    }
}
