package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class V6 implements W6 {

    /* renamed from: a, reason: collision with root package name */
    public static final S2 f10691a;

    /* renamed from: b, reason: collision with root package name */
    public static final S2 f10692b;

    /* renamed from: c, reason: collision with root package name */
    public static final S2 f10693c;

    /* renamed from: d, reason: collision with root package name */
    public static final S2 f10694d;

    static {
        C0859a3 e7 = new C0859a3(P2.a("com.google.android.gms.measurement")).f().e();
        f10691a = e7.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        f10692b = e7.d("measurement.sdk.collection.last_deep_link_referrer2", true);
        f10693c = e7.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f10694d = e7.b("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.W6
    public final boolean a() {
        return ((Boolean) f10693c.f()).booleanValue();
    }
}
