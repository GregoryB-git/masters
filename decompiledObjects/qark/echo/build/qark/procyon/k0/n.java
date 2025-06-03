// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k0;

import j0.i;
import g0.M;
import g0.a;
import x0.x;
import d0.q;
import x0.Q;
import g0.c;
import l0.y1;
import d0.I;

public abstract class n implements Y0, a1
{
    public long A;
    public boolean B;
    public boolean C;
    public I D;
    public a1.a E;
    public final Object o;
    public final int p;
    public final v0 q;
    public b1 r;
    public int s;
    public y1 t;
    public c u;
    public int v;
    public Q w;
    public q[] x;
    public long y;
    public long z;
    
    public n(final int p) {
        this.o = new Object();
        this.p = p;
        this.q = new v0();
        this.A = Long.MIN_VALUE;
        this.D = I.a;
    }
    
    @Override
    public final boolean A() {
        return this.B;
    }
    
    @Override
    public A0 B() {
        return null;
    }
    
    @Override
    public final void C(final b1 r, final q[] array, final Q q, final long n, final boolean b, final boolean b2, final long n2, final long n3, final x.b b3) {
        a.f(this.v == 0);
        this.r = r;
        this.v = 1;
        this.U(b, b2);
        this.F(array, q, n2, n3, b3);
        this.f0(n2, b);
    }
    
    @Override
    public final void D(final int s, final y1 t, final c u) {
        this.s = s;
        this.t = t;
        this.u = u;
        this.V();
    }
    
    @Override
    public final void E(final I d) {
        if (!M.c(this.D, d)) {
            this.d0(this.D = d);
        }
    }
    
    @Override
    public final void F(final q[] x, final Q w, final long a, final long y, final x.b b) {
        a.f(this.B ^ true);
        this.w = w;
        if (this.A == Long.MIN_VALUE) {
            this.A = a;
        }
        this.c0(this.x = x, a, this.y = y, b);
    }
    
    @Override
    public final a1 G() {
        return this;
    }
    
    public final u J(final Throwable t, final q q, final int n) {
        return this.K(t, q, false, n);
    }
    
    public final u K(final Throwable t, final q q, final boolean b, final int n) {
        if (q != null && !this.C) {
            this.C = true;
            try {
                Z0.h(this.a(q));
                goto Label_0055;
            }
            catch (u u) {}
            finally {
                this.C = false;
            }
            goto Label_0044;
        }
        goto Label_0049;
    }
    
    public final c L() {
        return (c)a.e(this.u);
    }
    
    public final b1 M() {
        return (b1)a.e(this.r);
    }
    
    public final v0 N() {
        this.q.a();
        return this.q;
    }
    
    public final int O() {
        return this.s;
    }
    
    public final long P() {
        return this.z;
    }
    
    public final y1 Q() {
        return (y1)a.e(this.t);
    }
    
    public final q[] R() {
        return (q[])a.e(this.x);
    }
    
    public final boolean S() {
        if (this.p()) {
            return this.B;
        }
        return ((Q)a.e(this.w)).e();
    }
    
    public abstract void T();
    
    public void U(final boolean b, final boolean b2) {
    }
    
    public void V() {
    }
    
    public abstract void W(final long p0, final boolean p1);
    
    public void X() {
    }
    
    public final void Y() {
        synchronized (this.o) {
            final a1.a e = this.E;
            // monitorexit(this.o)
            if (e != null) {
                e.a(this);
            }
        }
    }
    
    public void Z() {
    }
    
    public void a0() {
    }
    
    @Override
    public final void b() {
        a.f(this.v == 0);
        this.q.a();
        this.Z();
    }
    
    public void b0() {
    }
    
    public void c0(final q[] array, final long n, final long n2, final x.b b) {
    }
    
    public void d0(final I i) {
    }
    
    public final int e0(final v0 v0, final i i, int j) {
        j = ((Q)a.e(this.w)).j(v0, i, j);
        if (j != -4) {
            if (j == -5) {
                final q q = (q)a.e(v0.b);
                if (q.s != Long.MAX_VALUE) {
                    v0.b = q.a().s0(q.s + this.y).K();
                }
            }
            return j;
        }
        if (!i.p()) {
            final long n = i.t + this.y;
            i.t = n;
            this.A = Math.max(this.A, n);
            return j;
        }
        this.A = Long.MIN_VALUE;
        if (this.B) {
            return -4;
        }
        return -3;
    }
    
    public final void f0(final long n, final boolean b) {
        this.B = false;
        this.z = n;
        this.W(this.A = n, b);
    }
    
    @Override
    public final void g() {
        final int v = this.v;
        boolean b = true;
        if (v != 1) {
            b = false;
        }
        a.f(b);
        this.q.a();
        this.v = 0;
        this.w = null;
        this.x = null;
        this.B = false;
        this.T();
    }
    
    public int g0(final long n) {
        return ((Q)a.e(this.w)).m(n - this.y);
    }
    
    @Override
    public final int getState() {
        return this.v;
    }
    
    @Override
    public final Q i() {
        return this.w;
    }
    
    @Override
    public final int l() {
        return this.p;
    }
    
    @Override
    public final void o() {
        synchronized (this.o) {
            this.E = null;
        }
    }
    
    @Override
    public final boolean p() {
        return this.A == Long.MIN_VALUE;
    }
    
    @Override
    public final void release() {
        a.f(this.v == 0);
        this.X();
    }
    
    @Override
    public int s() {
        return 0;
    }
    
    @Override
    public final void start() {
        final int v = this.v;
        boolean b = true;
        if (v != 1) {
            b = false;
        }
        a.f(b);
        this.v = 2;
        this.a0();
    }
    
    @Override
    public final void stop() {
        a.f(this.v == 2);
        this.v = 1;
        this.b0();
    }
    
    @Override
    public void t(final int n, final Object o) {
    }
    
    @Override
    public final void u() {
        this.B = true;
    }
    
    @Override
    public final void v() {
        ((Q)a.e(this.w)).a();
    }
    
    @Override
    public final long w() {
        return this.A;
    }
    
    @Override
    public final void x(final a1.a e) {
        synchronized (this.o) {
            this.E = e;
        }
    }
    
    @Override
    public final void z(final long n) {
        this.f0(n, false);
    }
}
