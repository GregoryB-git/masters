package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.b7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0872b7 implements X6 {

    /* renamed from: a, reason: collision with root package name */
    public static final S2 f10846a;

    /* renamed from: b, reason: collision with root package name */
    public static final S2 f10847b;

    /* renamed from: c, reason: collision with root package name */
    public static final S2 f10848c;

    static {
        C0859a3 e7 = new C0859a3(P2.a("com.google.android.gms.measurement")).f().e();
        f10846a = e7.b("measurement.id.lifecycle.app_in_background_parameter", 0L);
        f10847b = e7.d("measurement.lifecycle.app_backgrounded_tracking", true);
        f10848c = e7.d("measurement.lifecycle.app_in_background_parameter", false);
    }

    @Override // com.google.android.gms.internal.measurement.X6
    public final boolean a() {
        return ((Boolean) f10848c.f()).booleanValue();
    }
}
