package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.u7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1042u7 implements InterfaceC1051v7 {

    /* renamed from: a, reason: collision with root package name */
    public static final S2 f11185a;

    /* renamed from: b, reason: collision with root package name */
    public static final S2 f11186b;

    /* renamed from: c, reason: collision with root package name */
    public static final S2 f11187c;

    /* renamed from: d, reason: collision with root package name */
    public static final S2 f11188d;

    static {
        C0859a3 e7 = new C0859a3(P2.a("com.google.android.gms.measurement")).f().e();
        f11185a = e7.d("measurement.collection.enable_session_stitching_token.client.dev", true);
        f11186b = e7.d("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        f11187c = e7.d("measurement.session_stitching_token_enabled", false);
        f11188d = e7.d("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1051v7
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1051v7
    public final boolean b() {
        return ((Boolean) f11185a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1051v7
    public final boolean c() {
        return ((Boolean) f11186b.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1051v7
    public final boolean d() {
        return ((Boolean) f11187c.f()).booleanValue();
    }
}
