package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0972n implements InterfaceC0963m, InterfaceC1016s {

    /* renamed from: o, reason: collision with root package name */
    public final String f11052o;

    /* renamed from: p, reason: collision with root package name */
    public final Map f11053p = new HashMap();

    public AbstractC0972n(String str) {
        this.f11052o = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0963m
    public final void a(String str, InterfaceC1016s interfaceC1016s) {
        if (interfaceC1016s == null) {
            this.f11053p.remove(str);
        } else {
            this.f11053p.put(str, interfaceC1016s);
        }
    }

    public abstract InterfaceC1016s b(C0904f3 c0904f3, List list);

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public InterfaceC1016s c() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final Boolean d() {
        return Boolean.TRUE;
    }

    public final String e() {
        return this.f11052o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0972n)) {
            return false;
        }
        AbstractC0972n abstractC0972n = (AbstractC0972n) obj;
        String str = this.f11052o;
        if (str != null) {
            return str.equals(abstractC0972n.f11052o);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final String g() {
        return this.f11052o;
    }

    public int hashCode() {
        String str = this.f11052o;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0963m
    public final InterfaceC1016s i(String str) {
        return this.f11053p.containsKey(str) ? (InterfaceC1016s) this.f11053p.get(str) : InterfaceC1016s.f11133d;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final Iterator k() {
        return AbstractC0990p.b(this.f11053p);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0963m
    public final boolean q(String str) {
        return this.f11053p.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final InterfaceC1016s s(String str, C0904f3 c0904f3, List list) {
        return "toString".equals(str) ? new C1034u(this.f11052o) : AbstractC0990p.a(this, new C1034u(str), c0904f3, list);
    }
}
