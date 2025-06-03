package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.n7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0980n7 implements InterfaceC0953k7 {

    /* renamed from: a, reason: collision with root package name */
    public static final S2 f11066a;

    /* renamed from: b, reason: collision with root package name */
    public static final S2 f11067b;

    /* renamed from: c, reason: collision with root package name */
    public static final S2 f11068c;

    /* renamed from: d, reason: collision with root package name */
    public static final S2 f11069d;

    /* renamed from: e, reason: collision with root package name */
    public static final S2 f11070e;

    /* renamed from: f, reason: collision with root package name */
    public static final S2 f11071f;

    /* renamed from: g, reason: collision with root package name */
    public static final S2 f11072g;

    /* renamed from: h, reason: collision with root package name */
    public static final S2 f11073h;

    /* renamed from: i, reason: collision with root package name */
    public static final S2 f11074i;

    /* renamed from: j, reason: collision with root package name */
    public static final S2 f11075j;

    /* renamed from: k, reason: collision with root package name */
    public static final S2 f11076k;

    /* renamed from: l, reason: collision with root package name */
    public static final S2 f11077l;

    /* renamed from: m, reason: collision with root package name */
    public static final S2 f11078m;

    /* renamed from: n, reason: collision with root package name */
    public static final S2 f11079n;

    static {
        C0859a3 e7 = new C0859a3(P2.a("com.google.android.gms.measurement")).f().e();
        f11066a = e7.d("measurement.redaction.app_instance_id", true);
        f11067b = e7.d("measurement.redaction.client_ephemeral_aiid_generation", true);
        f11068c = e7.d("measurement.redaction.config_redacted_fields", true);
        f11069d = e7.d("measurement.redaction.device_info", true);
        f11070e = e7.d("measurement.redaction.e_tag", true);
        f11071f = e7.d("measurement.redaction.enhanced_uid", true);
        f11072g = e7.d("measurement.redaction.populate_ephemeral_app_instance_id", true);
        f11073h = e7.d("measurement.redaction.google_signals", true);
        f11074i = e7.d("measurement.redaction.no_aiid_in_config_request", true);
        f11075j = e7.d("measurement.redaction.retain_major_os_version", true);
        f11076k = e7.d("measurement.redaction.scion_payload_generator", true);
        f11077l = e7.d("measurement.redaction.upload_redacted_fields", true);
        f11078m = e7.d("measurement.redaction.upload_subdomain_override", true);
        f11079n = e7.d("measurement.redaction.user_id", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0953k7
    public final boolean a() {
        return ((Boolean) f11075j.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0953k7
    public final boolean b() {
        return ((Boolean) f11076k.f()).booleanValue();
    }
}
