/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package x0;

import A0.y;
import d0.q;
import d0.z;
import g0.M;
import j0.i;
import k0.d1;
import k0.v0;
import k0.y0;
import x0.Q;
import x0.S;
import x0.Z;
import x0.f;
import x0.v;

public final class e
implements v,
v.a {
    public final v o;
    public v.a p;
    public a[] q;
    public long r;
    public long s;
    public long t;
    public f.b u;

    public e(v v8, boolean bl, long l8, long l9) {
        this.o = v8;
        this.q = new a[0];
        long l10 = bl ? l8 : -9223372036854775807L;
        this.r = l10;
        this.s = l8;
        this.t = l9;
    }

    public static boolean v(long l8, y[] arry) {
        if (l8 != 0L) {
            for (y y8 : arry) {
                if (y8 == null) continue;
                q q8 = y8.m();
                if (z.a(q8.n, q8.j)) continue;
                return true;
            }
        }
        return false;
    }

    public final d1 a(long l8, d1 d12) {
        long l9 = M.q(d12.a, 0L, l8 - this.s);
        long l10 = d12.b;
        long l11 = this.t;
        l8 = l11 == Long.MIN_VALUE ? Long.MAX_VALUE : l11 - l8;
        l8 = M.q(l10, 0L, l8);
        if (l9 == d12.a && l8 == d12.b) {
            return d12;
        }
        return new d1(l9, l8);
    }

    @Override
    public boolean b() {
        return this.o.b();
    }

    @Override
    public long c() {
        long l8 = this.o.c();
        if (l8 != Long.MIN_VALUE) {
            long l9 = this.t;
            if (l9 != Long.MIN_VALUE && l8 >= l9) {
                return Long.MIN_VALUE;
            }
            return l8;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public long d(long l8, d1 d12) {
        long l9 = this.s;
        if (l8 == l9) {
            return l9;
        }
        d12 = this.a(l8, d12);
        return this.o.d(l8, d12);
    }

    @Override
    public long f() {
        long l8 = this.o.f();
        if (l8 != Long.MIN_VALUE) {
            long l9 = this.t;
            if (l9 != Long.MIN_VALUE && l8 >= l9) {
                return Long.MIN_VALUE;
            }
            return l8;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public boolean g(y0 y02) {
        return this.o.g(y02);
    }

    @Override
    public void h(long l8) {
        this.o.h(l8);
    }

    @Override
    public long i(y[] object, boolean[] arrbl, Q[] arrq, boolean[] object2, long l8) {
        long l9;
        this.q = new a[arrq.length];
        Q[] arrq2 = new Q[arrq.length];
        int n8 = 0;
        int n9 = 0;
        do {
            a a8;
            int n10 = arrq.length;
            Q q8 = null;
            if (n9 >= n10) break;
            a[] arra = this.q;
            arra[n9] = a8 = (a)arrq[n9];
            if (a8 != null) {
                q8 = a8.o;
            }
            arrq2[n9] = q8;
            ++n9;
        } while (true);
        long l10 = this.o.i((y[])object, arrbl, arrq2, (boolean[])object2, l8);
        l9 = this.j() && l8 == (l9 = this.s) && e.v(l9, (y[])object) ? l10 : -9223372036854775807L;
        this.r = l9;
        boolean bl = l10 == l8 || l10 >= this.s && ((l8 = this.t) == Long.MIN_VALUE || l10 <= l8);
        g0.a.f(bl);
        for (n9 = n8; n9 < arrq.length; ++n9) {
            object = arrq2[n9];
            if (object == null) {
                this.q[n9] = null;
            } else {
                arrbl = this.q;
                object2 = arrbl[n9];
                if (object2 == null || object2.o != object) {
                    arrbl[n9] = new a((Q)object);
                }
            }
            arrq[n9] = this.q[n9];
        }
        return l10;
    }

    public boolean j() {
        if (this.r != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public void k(v v8) {
        if (this.u != null) {
            return;
        }
        ((v.a)g0.a.e(this.p)).k(this);
    }

    @Override
    public long l() {
        long l8;
        boolean bl;
        block7 : {
            block6 : {
                if (this.j()) {
                    long l9 = this.r;
                    this.r = -9223372036854775807L;
                    long l10 = this.l();
                    if (l10 != -9223372036854775807L) {
                        l9 = l10;
                    }
                    return l9;
                }
                l8 = this.o.l();
                if (l8 == -9223372036854775807L) {
                    return -9223372036854775807L;
                }
                long l11 = this.s;
                boolean bl2 = false;
                bl = l8 >= l11;
                g0.a.f(bl);
                l11 = this.t;
                if (l11 == Long.MIN_VALUE) break block6;
                bl = bl2;
                if (l8 > l11) break block7;
            }
            bl = true;
        }
        g0.a.f(bl);
        return l8;
    }

    @Override
    public Z n() {
        return this.o.n();
    }

    @Override
    public void p() {
        f.b b8 = this.u;
        if (b8 == null) {
            this.o.p();
            return;
        }
        throw b8;
    }

    @Override
    public void q(long l8, boolean bl) {
        this.o.q(l8, bl);
    }

    public void r(v v8) {
        ((v.a)g0.a.e(this.p)).e(this);
    }

    @Override
    public long s(long l8) {
        boolean bl;
        long l9;
        block4 : {
            block3 : {
                this.r = -9223372036854775807L;
                a[] arra = this.q;
                int n8 = arra.length;
                boolean bl2 = false;
                for (int i8 = 0; i8 < n8; ++i8) {
                    a a8 = arra[i8];
                    if (a8 == null) continue;
                    a8.b();
                }
                l9 = this.o.s(l8);
                if (l9 == l8) break block3;
                bl = bl2;
                if (l9 < this.s) break block4;
                l8 = this.t;
                if (l8 == Long.MIN_VALUE) break block3;
                bl = bl2;
                if (l9 > l8) break block4;
            }
            bl = true;
        }
        g0.a.f(bl);
        return l9;
    }

    public void t(f.b b8) {
        this.u = b8;
    }

    @Override
    public void u(v.a a8, long l8) {
        this.p = a8;
        this.o.u(this, l8);
    }

    public void w(long l8, long l9) {
        this.s = l8;
        this.t = l9;
    }

    public final class a
    implements Q {
        public final Q o;
        public boolean p;

        public a(Q q8) {
            this.o = q8;
        }

        @Override
        public void a() {
            this.o.a();
        }

        public void b() {
            this.p = false;
        }

        @Override
        public boolean e() {
            if (!e.this.j() && this.o.e()) {
                return true;
            }
            return false;
        }

        @Override
        public int j(v0 v02, i object, int n8) {
            if (e.this.j()) {
                return -3;
            }
            if (this.p) {
                object.w(4);
                return -4;
            }
            long l8 = e.this.f();
            if ((n8 = this.o.j(v02, (i)object, n8)) == -5) {
                object = (q)g0.a.e(v02.b);
                n8 = object.E;
                if (n8 != 0 || object.F != 0) {
                    e e8 = e.this;
                    l8 = e8.s;
                    int n9 = 0;
                    if (l8 != 0L) {
                        n8 = 0;
                    }
                    if (e8.t == Long.MIN_VALUE) {
                        n9 = object.F;
                    }
                    v02.b = object.a().V(n8).W(n9).K();
                }
                return -5;
            }
            long l9 = e.this.t;
            if (l9 != Long.MIN_VALUE && (n8 == -4 && object.t >= l9 || n8 == -3 && l8 == Long.MIN_VALUE && !object.s)) {
                object.m();
                object.w(4);
                this.p = true;
                return -4;
            }
            return n8;
        }

        @Override
        public int m(long l8) {
            if (e.this.j()) {
                return -3;
            }
            return this.o.m(l8);
        }
    }

}

