/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package x0;

import A0.y;
import B0.b;
import g0.M;
import g0.a;
import k0.d1;
import k0.y0;
import x0.Q;
import x0.S;
import x0.Z;
import x0.v;
import x0.x;

public final class s
implements v,
v.a {
    public final x.b o;
    public final long p;
    public final b q;
    public x r;
    public v s;
    public v.a t;
    public long u;

    public s(x.b b8, b b9, long l8) {
        this.o = b8;
        this.q = b9;
        this.p = l8;
        this.u = -9223372036854775807L;
    }

    public void a(x.b object) {
        long l8 = this.t(this.p);
        this.s = object = ((x)a.e(this.r)).f((x.b)object, this.q, l8);
        if (this.t != null) {
            object.u(this, l8);
        }
    }

    @Override
    public boolean b() {
        v v8 = this.s;
        if (v8 != null && v8.b()) {
            return true;
        }
        return false;
    }

    @Override
    public long c() {
        return ((v)M.i(this.s)).c();
    }

    @Override
    public long d(long l8, d1 d12) {
        return ((v)M.i(this.s)).d(l8, d12);
    }

    @Override
    public long f() {
        return ((v)M.i(this.s)).f();
    }

    @Override
    public boolean g(y0 y02) {
        v v8 = this.s;
        if (v8 != null && v8.g(y02)) {
            return true;
        }
        return false;
    }

    @Override
    public void h(long l8) {
        ((v)M.i(this.s)).h(l8);
    }

    @Override
    public long i(y[] arry, boolean[] arrbl, Q[] arrq, boolean[] arrbl2, long l8) {
        long l9 = this.u;
        if (l9 != -9223372036854775807L && l8 == this.p) {
            l8 = l9;
        }
        this.u = -9223372036854775807L;
        return ((v)M.i(this.s)).i(arry, arrbl, arrq, arrbl2, l8);
    }

    public long j() {
        return this.u;
    }

    @Override
    public void k(v v8) {
        ((v.a)M.i(this.t)).k(this);
    }

    @Override
    public long l() {
        return ((v)M.i(this.s)).l();
    }

    @Override
    public Z n() {
        return ((v)M.i(this.s)).n();
    }

    @Override
    public void p() {
        Object object = this.s;
        if (object != null) {
            object.p();
            return;
        }
        object = this.r;
        if (object != null) {
            object.h();
        }
    }

    @Override
    public void q(long l8, boolean bl) {
        ((v)M.i(this.s)).q(l8, bl);
    }

    public long r() {
        return this.p;
    }

    @Override
    public long s(long l8) {
        return ((v)M.i(this.s)).s(l8);
    }

    public final long t(long l8) {
        long l9 = this.u;
        if (l9 != -9223372036854775807L) {
            l8 = l9;
        }
        return l8;
    }

    @Override
    public void u(v.a object, long l8) {
        this.t = object;
        object = this.s;
        if (object != null) {
            object.u(this, this.t(this.p));
        }
    }

    public void v(v v8) {
        ((v.a)M.i(this.t)).e(this);
    }

    public void w(long l8) {
        this.u = l8;
    }

    public void x() {
        if (this.s != null) {
            ((x)a.e(this.r)).e(this.s);
        }
    }

    public void y(x x8) {
        boolean bl = this.r == null;
        a.f(bl);
        this.r = x8;
    }
}

