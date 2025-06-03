package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1043v implements InterfaceC1016s {

    /* renamed from: o, reason: collision with root package name */
    public final String f11189o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f11190p;

    public C1043v(String str, List list) {
        this.f11189o = str;
        ArrayList arrayList = new ArrayList();
        this.f11190p = arrayList;
        arrayList.addAll(list);
    }

    public final String a() {
        return this.f11189o;
    }

    public final ArrayList b() {
        return this.f11190p;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final InterfaceC1016s c() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final Boolean d() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1043v)) {
            return false;
        }
        C1043v c1043v = (C1043v) obj;
        String str = this.f11189o;
        if (str == null ? c1043v.f11189o != null : !str.equals(c1043v.f11189o)) {
            return false;
        }
        ArrayList arrayList = this.f11190p;
        ArrayList arrayList2 = c1043v.f11190p;
        return arrayList != null ? arrayList.equals(arrayList2) : arrayList2 == null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final Double f() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final String g() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final int hashCode() {
        String str = this.f11189o;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ArrayList arrayList = this.f11190p;
        return hashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final Iterator k() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final InterfaceC1016s s(String str, C0904f3 c0904f3, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}
