package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class O implements Z {

    /* renamed from: a, reason: collision with root package name */
    public final K f11997a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f11998b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11999c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1147l f12000d;

    public O(g0 g0Var, AbstractC1147l abstractC1147l, K k7) {
        this.f11998b = g0Var;
        this.f11999c = abstractC1147l.d(k7);
        this.f12000d = abstractC1147l;
        this.f11997a = k7;
    }

    private int i(g0 g0Var, Object obj) {
        return g0Var.c(g0Var.a(obj));
    }

    public static O j(g0 g0Var, AbstractC1147l abstractC1147l, K k7) {
        return new O(g0Var, abstractC1147l, k7);
    }

    @Override // com.google.protobuf.Z
    public void a(Object obj, Object obj2) {
        b0.E(this.f11998b, obj, obj2);
        if (this.f11999c) {
            b0.C(this.f12000d, obj, obj2);
        }
    }

    @Override // com.google.protobuf.Z
    public void b(Object obj) {
        this.f11998b.d(obj);
        this.f12000d.e(obj);
    }

    @Override // com.google.protobuf.Z
    public final boolean c(Object obj) {
        return this.f12000d.b(obj).k();
    }

    @Override // com.google.protobuf.Z
    public boolean d(Object obj, Object obj2) {
        if (!this.f11998b.a(obj).equals(this.f11998b.a(obj2))) {
            return false;
        }
        if (this.f11999c) {
            return this.f12000d.b(obj).equals(this.f12000d.b(obj2));
        }
        return true;
    }

    @Override // com.google.protobuf.Z
    public int e(Object obj) {
        int i7 = i(this.f11998b, obj);
        return this.f11999c ? i7 + this.f12000d.b(obj).f() : i7;
    }

    @Override // com.google.protobuf.Z
    public Object f() {
        K k7 = this.f11997a;
        return k7 instanceof r ? ((r) k7).P() : k7.d().c();
    }

    @Override // com.google.protobuf.Z
    public int g(Object obj) {
        int hashCode = this.f11998b.a(obj).hashCode();
        return this.f11999c ? (hashCode * 53) + this.f12000d.b(obj).hashCode() : hashCode;
    }

    @Override // com.google.protobuf.Z
    public void h(Object obj, n0 n0Var) {
        Iterator n7 = this.f12000d.b(obj).n();
        if (n7.hasNext()) {
            android.support.v4.media.a.a(((Map.Entry) n7.next()).getKey());
            throw null;
        }
        k(this.f11998b, obj, n0Var);
    }

    public final void k(g0 g0Var, Object obj, n0 n0Var) {
        g0Var.g(g0Var.a(obj), n0Var);
    }
}
