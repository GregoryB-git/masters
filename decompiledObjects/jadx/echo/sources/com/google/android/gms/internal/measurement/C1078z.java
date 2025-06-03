package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1078z implements InterfaceC1016s {
    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final InterfaceC1016s c() {
        return InterfaceC1016s.f11133d;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final Boolean d() {
        return Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C1078z;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final String g() {
        return "undefined";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final Iterator k() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final InterfaceC1016s s(String str, C0904f3 c0904f3, List list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }
}
