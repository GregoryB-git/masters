package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0954l implements InterfaceC1016s {

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC1016s f11017o;

    /* renamed from: p, reason: collision with root package name */
    public final String f11018p;

    public C0954l(String str) {
        this.f11017o = InterfaceC1016s.f11133d;
        this.f11018p = str;
    }

    public final InterfaceC1016s a() {
        return this.f11017o;
    }

    public final String b() {
        return this.f11018p;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final InterfaceC1016s c() {
        return new C0954l(this.f11018p, this.f11017o.c());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final Boolean d() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0954l)) {
            return false;
        }
        C0954l c0954l = (C0954l) obj;
        return this.f11018p.equals(c0954l.f11018p) && this.f11017o.equals(c0954l.f11017o);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final Double f() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final String g() {
        throw new IllegalStateException("Control is not a String");
    }

    public final int hashCode() {
        return (this.f11018p.hashCode() * 31) + this.f11017o.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final Iterator k() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final InterfaceC1016s s(String str, C0904f3 c0904f3, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public C0954l(String str, InterfaceC1016s interfaceC1016s) {
        this.f11017o = interfaceC1016s;
        this.f11018p = str;
    }
}
