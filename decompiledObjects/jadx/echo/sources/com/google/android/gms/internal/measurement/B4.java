package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class B4 implements J4 {

    /* renamed from: a, reason: collision with root package name */
    public J4[] f10314a;

    public B4(J4... j4Arr) {
        this.f10314a = j4Arr;
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final G4 a(Class cls) {
        for (J4 j42 : this.f10314a) {
            if (j42.b(cls)) {
                return j42.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final boolean b(Class cls) {
        for (J4 j42 : this.f10314a) {
            if (j42.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
