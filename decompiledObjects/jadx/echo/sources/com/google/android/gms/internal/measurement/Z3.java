package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Y3;

/* loaded from: classes.dex */
public final class Z3 implements J4 {

    /* renamed from: a, reason: collision with root package name */
    public static final Z3 f10807a = new Z3();

    public static Z3 c() {
        return f10807a;
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final G4 a(Class cls) {
        if (!Y3.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (G4) Y3.l(cls.asSubclass(Y3.class)).p(Y3.c.f10724c, null, null);
        } catch (Exception e7) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final boolean b(Class cls) {
        return Y3.class.isAssignableFrom(cls);
    }
}
