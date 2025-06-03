package s0;

import java.util.Iterator;
import java.util.Map;
import s0.a0;
import s0.r;
import s0.v;

/* loaded from: classes.dex */
public final class s0<T> implements c1<T> {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f14099a;

    /* renamed from: b, reason: collision with root package name */
    public final h1<?, ?> f14100b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14101c;

    /* renamed from: d, reason: collision with root package name */
    public final o<?> f14102d;

    public s0(h1<?, ?> h1Var, o<?> oVar, o0 o0Var) {
        this.f14100b = h1Var;
        this.f14101c = oVar.e(o0Var);
        this.f14102d = oVar;
        this.f14099a = o0Var;
    }

    @Override // s0.c1
    public final void a(T t, T t10) {
        h1<?, ?> h1Var = this.f14100b;
        Class<?> cls = d1.f13952a;
        h1Var.o(t, h1Var.k(h1Var.g(t), h1Var.g(t10)));
        if (this.f14101c) {
            d1.A(this.f14102d, t, t10);
        }
    }

    @Override // s0.c1
    public final void b(T t) {
        this.f14100b.j(t);
        this.f14102d.f(t);
    }

    @Override // s0.c1
    public final boolean c(T t) {
        return this.f14102d.c(t).j();
    }

    @Override // s0.c1
    public final boolean d(T t, T t10) {
        if (!this.f14100b.g(t).equals(this.f14100b.g(t10))) {
            return false;
        }
        if (this.f14101c) {
            return this.f14102d.c(t).equals(this.f14102d.c(t10));
        }
        return true;
    }

    @Override // s0.c1
    public final int e(T t) {
        h1<?, ?> h1Var = this.f14100b;
        int i10 = h1Var.i(h1Var.g(t)) + 0;
        if (!this.f14101c) {
            return i10;
        }
        r<?> c10 = this.f14102d.c(t);
        int i11 = 0;
        for (int i12 = 0; i12 < c10.f14073a.e(); i12++) {
            i11 += r.g(c10.f14073a.d(i12));
        }
        Iterator<Map.Entry<?, Object>> it = c10.f14073a.f().iterator();
        while (it.hasNext()) {
            i11 += r.g(it.next());
        }
        return i10 + i11;
    }

    @Override // s0.c1
    public final T f() {
        return (T) this.f14099a.e().i();
    }

    @Override // s0.c1
    public final int g(T t) {
        int hashCode = this.f14100b.g(t).hashCode();
        return this.f14101c ? (hashCode * 53) + this.f14102d.c(t).hashCode() : hashCode;
    }

    @Override // s0.c1
    public final void h(Object obj, k kVar) {
        Iterator<Map.Entry<?, Object>> l10 = this.f14102d.c(obj).l();
        while (l10.hasNext()) {
            Map.Entry<?, Object> next = l10.next();
            r.a aVar = (r.a) next.getKey();
            if (aVar.d() != o1.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            aVar.b();
            aVar.e();
            boolean z10 = next instanceof a0.a;
            aVar.a();
            kVar.l(0, z10 ? ((a0.a) next).f13940a.getValue().b() : next.getValue());
        }
        h1<?, ?> h1Var = this.f14100b;
        h1Var.r(h1Var.g(obj), kVar);
    }

    @Override // s0.c1
    public final void i(T t, b1 b1Var, n nVar) {
        h1 h1Var = this.f14100b;
        o oVar = this.f14102d;
        i1 f = h1Var.f(t);
        r<ET> d10 = oVar.d(t);
        do {
            try {
                if (b1Var.A() == Integer.MAX_VALUE) {
                    break;
                }
            } finally {
                h1Var.n(t, f);
            }
        } while (j(b1Var, nVar, oVar, d10, h1Var, f));
    }

    public final <UT, UB, ET extends r.a<ET>> boolean j(b1 b1Var, n nVar, o<ET> oVar, r<ET> rVar, h1<UT, UB> h1Var, UB ub2) {
        int p10 = b1Var.p();
        if (p10 != 11) {
            if ((p10 & 7) != 2) {
                return b1Var.H();
            }
            v.e b10 = oVar.b(nVar, this.f14099a, p10 >>> 3);
            if (b10 == null) {
                return h1Var.l(ub2, b1Var);
            }
            oVar.h(b10);
            return true;
        }
        int i10 = 0;
        v.e eVar = null;
        g gVar = null;
        while (b1Var.A() != Integer.MAX_VALUE) {
            int p11 = b1Var.p();
            if (p11 == 16) {
                i10 = b1Var.n();
                eVar = oVar.b(nVar, this.f14099a, i10);
            } else if (p11 == 26) {
                if (eVar != null) {
                    oVar.h(eVar);
                } else {
                    gVar = b1Var.E();
                }
            } else if (!b1Var.H()) {
                break;
            }
        }
        if (b1Var.p() != 12) {
            throw new y("Protocol message end-group tag did not match expected tag.");
        }
        if (gVar != null) {
            if (eVar != null) {
                oVar.i(eVar);
            } else {
                h1Var.d(ub2, i10, gVar);
            }
        }
        return true;
    }
}
