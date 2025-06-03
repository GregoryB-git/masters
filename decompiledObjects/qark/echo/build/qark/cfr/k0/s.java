/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 */
package k0;

import d0.C;
import g0.c;
import k0.A0;
import k0.Y0;
import k0.e1;
import k0.u;

public final class s
implements A0 {
    public final e1 o;
    public final a p;
    public Y0 q;
    public A0 r;
    public boolean s;
    public boolean t;

    public s(a a8, c c8) {
        this.p = a8;
        this.o = new e1(c8);
        this.s = true;
    }

    @Override
    public long H() {
        if (this.s) {
            return this.o.H();
        }
        return ((A0)g0.a.e(this.r)).H();
    }

    public void a(Y0 y02) {
        if (y02 == this.q) {
            this.r = null;
            this.q = null;
            this.s = true;
        }
    }

    public void b(Y0 y02) {
        A0 a02;
        A0 a03 = y02.B();
        if (a03 != null && a03 != (a02 = this.r)) {
            if (a02 == null) {
                this.r = a03;
                this.q = y02;
                a03.k(this.o.h());
                return;
            }
            throw u.d((RuntimeException)new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    public void c(long l8) {
        this.o.a(l8);
    }

    public final boolean d(boolean bl) {
        Y0 y02 = this.q;
        if (!(y02 == null || y02.c() || bl && this.q.getState() != 2 || !this.q.e() && (bl || this.q.p()))) {
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

    public long g(boolean bl) {
        this.i(bl);
        return this.H();
    }

    @Override
    public C h() {
        A0 a02 = this.r;
        if (a02 != null) {
            return a02.h();
        }
        return this.o.h();
    }

    public final void i(boolean bl) {
        if (this.d(bl)) {
            this.s = true;
            if (this.t) {
                this.o.b();
            }
            return;
        }
        Object object = (A0)g0.a.e(this.r);
        long l8 = object.H();
        if (this.s) {
            if (l8 < this.o.H()) {
                this.o.c();
                return;
            }
            this.s = false;
            if (this.t) {
                this.o.b();
            }
        }
        this.o.a(l8);
        object = object.h();
        if (!object.equals(this.o.h())) {
            this.o.k((C)object);
            this.p.j((C)object);
        }
    }

    @Override
    public void k(C c8) {
        A0 a02 = this.r;
        C c9 = c8;
        if (a02 != null) {
            a02.k(c8);
            c9 = this.r.h();
        }
        this.o.k(c9);
    }

    @Override
    public boolean r() {
        if (this.s) {
            return this.o.r();
        }
        return ((A0)g0.a.e(this.r)).r();
    }

    public static interface a {
        public void j(C var1);
    }

}

