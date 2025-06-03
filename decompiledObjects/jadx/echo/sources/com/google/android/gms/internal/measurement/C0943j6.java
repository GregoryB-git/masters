package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.j6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0943j6 implements InterfaceC0916g6 {

    /* renamed from: a, reason: collision with root package name */
    public static final S2 f11003a;

    /* renamed from: b, reason: collision with root package name */
    public static final S2 f11004b;

    /* renamed from: c, reason: collision with root package name */
    public static final S2 f11005c;

    /* renamed from: d, reason: collision with root package name */
    public static final S2 f11006d;

    static {
        C0859a3 e7 = new C0859a3(P2.a("com.google.android.gms.measurement")).f().e();
        f11003a = e7.d("measurement.client.consent_state_v1", true);
        f11004b = e7.d("measurement.client.3p_consent_state_v1", true);
        f11005c = e7.d("measurement.service.consent_state_v1_W36", true);
        f11006d = e7.b("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0916g6
    public final long a() {
        return ((Long) f11006d.f()).longValue();
    }
}
