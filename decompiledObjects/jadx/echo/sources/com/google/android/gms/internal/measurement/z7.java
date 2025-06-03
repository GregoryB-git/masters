package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class z7 implements InterfaceC1060w7 {

    /* renamed from: a, reason: collision with root package name */
    public static final S2 f11234a;

    /* renamed from: b, reason: collision with root package name */
    public static final S2 f11235b;

    /* renamed from: c, reason: collision with root package name */
    public static final S2 f11236c;

    /* renamed from: d, reason: collision with root package name */
    public static final S2 f11237d;

    /* renamed from: e, reason: collision with root package name */
    public static final S2 f11238e;

    /* renamed from: f, reason: collision with root package name */
    public static final S2 f11239f;

    static {
        C0859a3 e7 = new C0859a3(P2.a("com.google.android.gms.measurement")).f().e();
        f11234a = e7.d("measurement.client.sessions.background_sessions_enabled", true);
        f11235b = e7.d("measurement.client.sessions.enable_fix_background_engagement", false);
        f11236c = e7.d("measurement.client.sessions.immediate_start_enabled_foreground", true);
        f11237d = e7.d("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        f11238e = e7.d("measurement.client.sessions.session_id_enabled", true);
        f11239f = e7.b("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1060w7
    public final boolean a() {
        return ((Boolean) f11235b.f()).booleanValue();
    }
}
