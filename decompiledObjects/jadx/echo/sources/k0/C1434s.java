package k0;

import d0.C1164C;
import g0.AbstractC1297a;
import g0.InterfaceC1299c;

/* renamed from: k0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1434s implements A0 {

    /* renamed from: o, reason: collision with root package name */
    public final e1 f15921o;

    /* renamed from: p, reason: collision with root package name */
    public final a f15922p;

    /* renamed from: q, reason: collision with root package name */
    public Y0 f15923q;

    /* renamed from: r, reason: collision with root package name */
    public A0 f15924r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f15925s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f15926t;

    /* renamed from: k0.s$a */
    public interface a {
        void j(C1164C c1164c);
    }

    public C1434s(a aVar, InterfaceC1299c interfaceC1299c) {
        this.f15922p = aVar;
        this.f15921o = new e1(interfaceC1299c);
    }

    @Override // k0.A0
    public long H() {
        return this.f15925s ? this.f15921o.H() : ((A0) AbstractC1297a.e(this.f15924r)).H();
    }

    public void a(Y0 y02) {
        if (y02 == this.f15923q) {
            this.f15924r = null;
            this.f15923q = null;
            this.f15925s = true;
        }
    }

    public void b(Y0 y02) {
        A0 a02;
        A0 B7 = y02.B();
        if (B7 == null || B7 == (a02 = this.f15924r)) {
            return;
        }
        if (a02 != null) {
            throw C1438u.d(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f15924r = B7;
        this.f15923q = y02;
        B7.k(this.f15921o.h());
    }

    public void c(long j7) {
        this.f15921o.a(j7);
    }

    public final boolean d(boolean z7) {
        Y0 y02 = this.f15923q;
        return y02 == null || y02.c() || (z7 && this.f15923q.getState() != 2) || (!this.f15923q.e() && (z7 || this.f15923q.p()));
    }

    public void e() {
        this.f15926t = true;
        this.f15921o.b();
    }

    public void f() {
        this.f15926t = false;
        this.f15921o.c();
    }

    public long g(boolean z7) {
        i(z7);
        return H();
    }

    @Override // k0.A0
    public C1164C h() {
        A0 a02 = this.f15924r;
        return a02 != null ? a02.h() : this.f15921o.h();
    }

    public final void i(boolean z7) {
        if (d(z7)) {
            this.f15925s = true;
            if (this.f15926t) {
                this.f15921o.b();
                return;
            }
            return;
        }
        A0 a02 = (A0) AbstractC1297a.e(this.f15924r);
        long H6 = a02.H();
        if (this.f15925s) {
            if (H6 < this.f15921o.H()) {
                this.f15921o.c();
                return;
            } else {
                this.f15925s = false;
                if (this.f15926t) {
                    this.f15921o.b();
                }
            }
        }
        this.f15921o.a(H6);
        C1164C h7 = a02.h();
        if (h7.equals(this.f15921o.h())) {
            return;
        }
        this.f15921o.k(h7);
        this.f15922p.j(h7);
    }

    @Override // k0.A0
    public void k(C1164C c1164c) {
        A0 a02 = this.f15924r;
        if (a02 != null) {
            a02.k(c1164c);
            c1164c = this.f15924r.h();
        }
        this.f15921o.k(c1164c);
    }

    @Override // k0.A0
    public boolean r() {
        return this.f15925s ? this.f15921o.r() : ((A0) AbstractC1297a.e(this.f15924r)).r();
    }
}
