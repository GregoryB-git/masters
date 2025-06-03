package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0918h implements InterfaceC1016s {

    /* renamed from: o, reason: collision with root package name */
    public final boolean f10966o;

    public C0918h(Boolean bool) {
        this.f10966o = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final InterfaceC1016s c() {
        return new C0918h(Boolean.valueOf(this.f10966o));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final Boolean d() {
        return Boolean.valueOf(this.f10966o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0918h) && this.f10966o == ((C0918h) obj).f10966o;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final Double f() {
        return Double.valueOf(this.f10966o ? 1.0d : 0.0d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final String g() {
        return Boolean.toString(this.f10966o);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f10966o).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final Iterator k() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final InterfaceC1016s s(String str, C0904f3 c0904f3, List list) {
        if ("toString".equals(str)) {
            return new C1034u(Boolean.toString(this.f10966o));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f10966o), str));
    }

    public final String toString() {
        return String.valueOf(this.f10966o);
    }
}
