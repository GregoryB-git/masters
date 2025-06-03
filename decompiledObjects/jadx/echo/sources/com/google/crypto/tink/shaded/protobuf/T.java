package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC1090e;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class T implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final O f11305a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f11306b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11307c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1102q f11308d;

    public T(k0 k0Var, AbstractC1102q abstractC1102q, O o7) {
        this.f11306b = k0Var;
        this.f11307c = abstractC1102q.e(o7);
        this.f11308d = abstractC1102q;
        this.f11305a = o7;
    }

    private int k(k0 k0Var, Object obj) {
        return k0Var.i(k0Var.g(obj));
    }

    private void l(k0 k0Var, AbstractC1102q abstractC1102q, Object obj, d0 d0Var, C1101p c1101p) {
        Object f7 = k0Var.f(obj);
        AbstractC1104t d7 = abstractC1102q.d(obj);
        do {
            try {
                if (d0Var.p() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                k0Var.o(obj, f7);
            }
        } while (n(d0Var, c1101p, abstractC1102q, d7, k0Var, f7));
    }

    public static T m(k0 k0Var, AbstractC1102q abstractC1102q, O o7) {
        return new T(k0Var, abstractC1102q, o7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void a(Object obj, Object obj2) {
        g0.F(this.f11306b, obj, obj2);
        if (this.f11307c) {
            g0.D(this.f11308d, obj, obj2);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void b(Object obj) {
        this.f11306b.j(obj);
        this.f11308d.f(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public final boolean c(Object obj) {
        return this.f11308d.c(obj).e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public boolean d(Object obj, Object obj2) {
        if (!this.f11306b.g(obj).equals(this.f11306b.g(obj2))) {
            return false;
        }
        if (this.f11307c) {
            return this.f11308d.c(obj).equals(this.f11308d.c(obj2));
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int e(Object obj) {
        int k7 = k(this.f11306b, obj);
        return this.f11307c ? k7 + this.f11308d.c(obj).b() : k7;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public Object f() {
        O o7 = this.f11305a;
        return o7 instanceof AbstractC1108x ? ((AbstractC1108x) o7).J() : o7.d().c();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int g(Object obj) {
        int hashCode = this.f11306b.g(obj).hashCode();
        return this.f11307c ? (hashCode * 53) + this.f11308d.c(obj).hashCode() : hashCode;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void h(Object obj, byte[] bArr, int i7, int i8, AbstractC1090e.a aVar) {
        AbstractC1108x abstractC1108x = (AbstractC1108x) obj;
        if (abstractC1108x.unknownFields == l0.c()) {
            abstractC1108x.unknownFields = l0.k();
        }
        android.support.v4.media.a.a(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void i(Object obj, r0 r0Var) {
        Iterator f7 = this.f11308d.c(obj).f();
        if (f7.hasNext()) {
            android.support.v4.media.a.a(((Map.Entry) f7.next()).getKey());
            throw null;
        }
        o(this.f11306b, obj, r0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void j(Object obj, d0 d0Var, C1101p c1101p) {
        l(this.f11306b, this.f11308d, obj, d0Var, c1101p);
    }

    public final boolean n(d0 d0Var, C1101p c1101p, AbstractC1102q abstractC1102q, AbstractC1104t abstractC1104t, k0 k0Var, Object obj) {
        int e7 = d0Var.e();
        if (e7 != q0.f11432a) {
            if (q0.b(e7) != 2) {
                return d0Var.y();
            }
            Object b7 = abstractC1102q.b(c1101p, this.f11305a, q0.a(e7));
            if (b7 == null) {
                return k0Var.m(obj, d0Var);
            }
            abstractC1102q.h(d0Var, b7, c1101p, abstractC1104t);
            return true;
        }
        Object obj2 = null;
        int i7 = 0;
        AbstractC1093h abstractC1093h = null;
        while (d0Var.p() != Integer.MAX_VALUE) {
            int e8 = d0Var.e();
            if (e8 == q0.f11434c) {
                i7 = d0Var.w();
                obj2 = abstractC1102q.b(c1101p, this.f11305a, i7);
            } else if (e8 == q0.f11435d) {
                if (obj2 != null) {
                    abstractC1102q.h(d0Var, obj2, c1101p, abstractC1104t);
                } else {
                    abstractC1093h = d0Var.u();
                }
            } else if (!d0Var.y()) {
                break;
            }
        }
        if (d0Var.e() != q0.f11433b) {
            throw A.b();
        }
        if (abstractC1093h != null) {
            if (obj2 != null) {
                abstractC1102q.i(abstractC1093h, obj2, c1101p, abstractC1104t);
            } else {
                k0Var.d(obj, i7, abstractC1093h);
            }
        }
        return true;
    }

    public final void o(k0 k0Var, Object obj, r0 r0Var) {
        k0Var.s(k0Var.g(obj), r0Var);
    }
}
