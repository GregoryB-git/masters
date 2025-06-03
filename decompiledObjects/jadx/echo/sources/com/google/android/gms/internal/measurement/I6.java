package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class I6 implements F6 {

    /* renamed from: a, reason: collision with root package name */
    public static final S2 f10421a;

    /* renamed from: b, reason: collision with root package name */
    public static final S2 f10422b;

    /* renamed from: c, reason: collision with root package name */
    public static final S2 f10423c;

    static {
        C0859a3 e7 = new C0859a3(P2.a("com.google.android.gms.measurement")).f().e();
        f10421a = e7.d("measurement.client.sessions.check_on_reset_and_enable2", true);
        f10422b = e7.d("measurement.client.sessions.check_on_startup", true);
        f10423c = e7.d("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // com.google.android.gms.internal.measurement.F6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.F6
    public final boolean b() {
        return ((Boolean) f10421a.f()).booleanValue();
    }
}
