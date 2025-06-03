// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k0;

import d0.C;
import g0.a;
import g0.c;

public final class s implements A0
{
    public final e1 o;
    public final a p;
    public Y0 q;
    public A0 r;
    public boolean s;
    public boolean t;
    
    public s(final a p2, final c c) {
        this.p = p2;
        this.o = new e1(c);
        this.s = true;
    }
    
    @Override
    public long H() {
        if (this.s) {
            return this.o.H();
        }
        return ((A0)g0.a.e(this.r)).H();
    }
    
    public void a(final Y0 y0) {
        if (y0 == this.q) {
            this.r = null;
            this.q = null;
            this.s = true;
        }
    }
    
    public void b(final Y0 q) {
        final A0 b = q.B();
        if (b != null) {
            final A0 r = this.r;
            if (b != r) {
                if (r == null) {
                    this.r = b;
                    this.q = q;
                    b.k(this.o.h());
                    return;
                }
                throw u.d(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
            }
        }
    }
    
    public void c(final long n) {
        this.o.a(n);
    }
    
    public final boolean d(final boolean b) {
        final Y0 q = this.q;
        if (q != null && !q.c() && (!b || this.q.getState() == 2)) {
            if (!this.q.e()) {
                if (b) {
                    return true;
                }
                if (this.q.p()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public void e() {
        this.t = true;
        this.o.b();
    }
    
    public void f() {
        this.t = false;
        this.o.c();
    }
    
    public long g(final boolean b) {
        this.i(b);
        return this.H();
    }
    
    @Override
    public C h() {
        final A0 r = this.r;
        if (r != null) {
            return r.h();
        }
        return this.o.h();
    }
    
    public final void i(final boolean b) {
        if (this.d(b)) {
            this.s = true;
            if (this.t) {
                this.o.b();
            }
            return;
        }
        final A0 a0 = (A0)g0.a.e(this.r);
        final long h = a0.H();
        if (this.s) {
            if (h < this.o.H()) {
                this.o.c();
                return;
            }
            this.s = false;
            if (this.t) {
                this.o.b();
            }
        }
        this.o.a(h);
        final C h2 = a0.h();
        if (!h2.equals(this.o.h())) {
            this.o.k(h2);
            this.p.j(h2);
        }
    }
    
    @Override
    public void k(final C c) {
        final A0 r = this.r;
        C h = c;
        if (r != null) {
            r.k(c);
            h = this.r.h();
        }
        this.o.k(h);
    }
    
    @Override
    public boolean r() {
        if (this.s) {
            return this.o.r();
        }
        return ((A0)g0.a.e(this.r)).r();
    }
    
    public interface a
    {
        void j(final C p0);
    }
}
