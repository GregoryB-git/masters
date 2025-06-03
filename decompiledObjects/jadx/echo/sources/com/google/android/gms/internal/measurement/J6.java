package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class J6 implements K6 {

    /* renamed from: a, reason: collision with root package name */
    public static final S2 f10450a;

    /* renamed from: b, reason: collision with root package name */
    public static final S2 f10451b;

    /* renamed from: c, reason: collision with root package name */
    public static final S2 f10452c;

    static {
        C0859a3 e7 = new C0859a3(P2.a("com.google.android.gms.measurement")).f().e();
        f10450a = e7.d("measurement.gbraid_campaign.gbraid.client.dev", false);
        f10451b = e7.d("measurement.gbraid_campaign.gbraid.service", false);
        f10452c = e7.b("measurement.id.gbraid_campaign.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.K6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.K6
    public final boolean b() {
        return ((Boolean) f10450a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.K6
    public final boolean c() {
        return ((Boolean) f10451b.f()).booleanValue();
    }
}
