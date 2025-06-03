package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class H7 implements I7 {

    /* renamed from: a, reason: collision with root package name */
    public static final S2 f10403a = new C0859a3(P2.a("com.google.android.gms.measurement")).f().e().d("measurement.integration.disable_firebase_instance_id", false);

    @Override // com.google.android.gms.internal.measurement.I7
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.I7
    public final boolean b() {
        return ((Boolean) f10403a.f()).booleanValue();
    }
}
