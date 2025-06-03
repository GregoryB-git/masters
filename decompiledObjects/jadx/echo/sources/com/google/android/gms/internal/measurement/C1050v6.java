package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.v6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1050v6 implements InterfaceC1023s6 {

    /* renamed from: a, reason: collision with root package name */
    public static final S2 f11202a = new C0859a3(P2.a("com.google.android.gms.measurement")).f().e().d("measurement.client.firebase_feature_rollout.v1.enable", true);

    @Override // com.google.android.gms.internal.measurement.InterfaceC1023s6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1023s6
    public final boolean b() {
        return ((Boolean) f11202a.f()).booleanValue();
    }
}
