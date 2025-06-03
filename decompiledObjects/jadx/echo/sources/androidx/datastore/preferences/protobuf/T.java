package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class T implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final O f8927a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f8928b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8929c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0769p f8930d;

    public T(l0 l0Var, AbstractC0769p abstractC0769p, O o7) {
        this.f8928b = l0Var;
        this.f8929c = abstractC0769p.e(o7);
        this.f8930d = abstractC0769p;
        this.f8927a = o7;
    }

    private int j(l0 l0Var, Object obj) {
        return l0Var.i(l0Var.g(obj));
    }

    private void k(l0 l0Var, AbstractC0769p abstractC0769p, Object obj, d0 d0Var, C0768o c0768o) {
        Object f7 = l0Var.f(obj);
        C0771s d7 = abstractC0769p.d(obj);
        do {
            try {
                if (d0Var.p() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                l0Var.o(obj, f7);
            }
        } while (m(d0Var, c0768o, abstractC0769p, d7, l0Var, f7));
    }

    public static T l(l0 l0Var, AbstractC0769p abstractC0769p, O o7) {
        return new T(l0Var, abstractC0769p, o7);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void a(Object obj, Object obj2) {
        g0.F(this.f8928b, obj, obj2);
        if (this.f8929c) {
            g0.D(this.f8930d, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void b(Object obj) {
        this.f8928b.j(obj);
        this.f8930d.f(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final boolean c(Object obj) {
        return this.f8930d.c(obj).k();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public boolean d(Object obj, Object obj2) {
        if (!this.f8928b.g(obj).equals(this.f8928b.g(obj2))) {
            return false;
        }
        if (this.f8929c) {
            return this.f8930d.c(obj).equals(this.f8930d.c(obj2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int e(Object obj) {
        int j7 = j(this.f8928b, obj);
        return this.f8929c ? j7 + this.f8930d.c(obj).f() : j7;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public Object f() {
        return this.f8927a.d().c();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int g(Object obj) {
        int hashCode = this.f8928b.g(obj).hashCode();
        return this.f8929c ? (hashCode * 53) + this.f8930d.c(obj).hashCode() : hashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void h(Object obj, d0 d0Var, C0768o c0768o) {
        k(this.f8928b, this.f8930d, obj, d0Var, c0768o);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void i(Object obj, s0 s0Var) {
        Iterator n7 = this.f8930d.c(obj).n();
        if (n7.hasNext()) {
            android.support.v4.media.a.a(((Map.Entry) n7.next()).getKey());
            throw null;
        }
        n(this.f8928b, obj, s0Var);
    }

    public final boolean m(d0 d0Var, C0768o c0768o, AbstractC0769p abstractC0769p, C0771s c0771s, l0 l0Var, Object obj) {
        int e7 = d0Var.e();
        if (e7 != r0.f9073a) {
            if (r0.b(e7) != 2) {
                return d0Var.y();
            }
            Object b7 = abstractC0769p.b(c0768o, this.f8927a, r0.a(e7));
            if (b7 == null) {
                return l0Var.m(obj, d0Var);
            }
            abstractC0769p.h(d0Var, b7, c0768o, c0771s);
            return true;
        }
        Object obj2 = null;
        int i7 = 0;
        AbstractC0760g abstractC0760g = null;
        while (d0Var.p() != Integer.MAX_VALUE) {
            int e8 = d0Var.e();
            if (e8 == r0.f9075c) {
                i7 = d0Var.w();
                obj2 = abstractC0769p.b(c0768o, this.f8927a, i7);
            } else if (e8 == r0.f9076d) {
                if (obj2 != null) {
                    abstractC0769p.h(d0Var, obj2, c0768o, c0771s);
                } else {
                    abstractC0760g = d0Var.u();
                }
            } else if (!d0Var.y()) {
                break;
            }
        }
        if (d0Var.e() != r0.f9074b) {
            throw C0778z.a();
        }
        if (abstractC0760g != null) {
            if (obj2 != null) {
                abstractC0769p.i(abstractC0760g, obj2, c0768o, c0771s);
            } else {
                l0Var.d(obj, i7, abstractC0760g);
            }
        }
        return true;
    }

    public final void n(l0 l0Var, Object obj, s0 s0Var) {
        l0Var.s(l0Var.g(obj), s0Var);
    }
}
