package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.p6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0997p6 implements InterfaceC0970m6 {

    /* renamed from: a, reason: collision with root package name */
    public static final S2 f11101a;

    /* renamed from: b, reason: collision with root package name */
    public static final S2 f11102b;

    /* renamed from: c, reason: collision with root package name */
    public static final S2 f11103c;

    /* renamed from: d, reason: collision with root package name */
    public static final S2 f11104d;

    /* renamed from: e, reason: collision with root package name */
    public static final S2 f11105e;

    /* renamed from: f, reason: collision with root package name */
    public static final S2 f11106f;

    /* renamed from: g, reason: collision with root package name */
    public static final S2 f11107g;

    static {
        C0859a3 e7 = new C0859a3(P2.a("com.google.android.gms.measurement")).f().e();
        f11101a = e7.d("measurement.dma_consent.client", false);
        f11102b = e7.d("measurement.dma_consent.client_bow_check", false);
        f11103c = e7.d("measurement.dma_consent.service", false);
        f11104d = e7.d("measurement.dma_consent.service_gcs_v2", false);
        f11105e = e7.d("measurement.dma_consent.service_npa_remote_default", false);
        f11106f = e7.d("measurement.dma_consent.service_split_batch_on_consent", false);
        f11107g = e7.b("measurement.id.dma_consent.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0970m6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0970m6
    public final boolean b() {
        return ((Boolean) f11101a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0970m6
    public final boolean c() {
        return ((Boolean) f11102b.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0970m6
    public final boolean d() {
        return ((Boolean) f11103c.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0970m6
    public final boolean f() {
        return ((Boolean) f11104d.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0970m6
    public final boolean g() {
        return ((Boolean) f11105e.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0970m6
    public final boolean m() {
        return ((Boolean) f11106f.f()).booleanValue();
    }
}
