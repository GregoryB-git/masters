/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Looper
 *  java.lang.Object
 *  java.lang.String
 */
package x0;

import B0.k;
import B0.m;
import android.net.Uri;
import android.os.Looper;
import d0.I;
import d0.u;
import i0.g;
import i0.y;
import l0.y1;
import p0.A;
import p0.l;
import p0.v;
import x0.E;
import x0.F;
import x0.K;
import x0.M;
import x0.V;
import x0.a;
import x0.d;
import x0.p;
import x0.v;
import x0.x;

public final class L
extends a
implements K.c {
    public final g.a h;
    public final F.a i;
    public final p0.x j;
    public final m k;
    public final int l;
    public boolean m;
    public long n;
    public boolean o;
    public boolean p;
    public y q;
    public u r;

    public L(u u8, g.a a8, F.a a9, p0.x x8, m m8, int n8) {
        this.r = u8;
        this.h = a8;
        this.i = a9;
        this.j = x8;
        this.k = m8;
        this.l = n8;
        this.m = true;
        this.n = -9223372036854775807L;
    }

    public /* synthetic */ L(u u8, g.a a8, F.a a9, p0.x x8, m m8, int n8,  a10) {
        this(u8, a8, a9, x8, m8, n8);
    }

    @Override
    public void B() {
        this.j.release();
    }

    public final u.h C() {
        return (u.h)g0.a.e(this.a().b);
    }

    public final void D() {
        V v8;
        I i8 = v8 = new V(this.n, this.o, false, this.p, null, this.a());
        if (this.m) {
            i8 = new p(v8){

                @Override
                public I.b g(int n8, I.b b8, boolean bl) {
                    super.g(n8, b8, bl);
                    b8.f = true;
                    return b8;
                }

                @Override
                public I.c o(int n8, I.c c8, long l8) {
                    super.o(n8, c8, l8);
                    c8.k = true;
                    return c8;
                }
            };
        }
        this.A(i8);
    }

    @Override
    public u a() {
        synchronized (this) {
            u u8 = this.r;
            return u8;
        }
    }

    @Override
    public void e(v v8) {
        ((K)v8).g0();
    }

    @Override
    public v f(x.b b8, B0.b b9, long l8) {
        g g8 = this.h.a();
        Object object = this.q;
        if (object != null) {
            g8.c((y)object);
        }
        object = this.C();
        return new K(object.a, g8, this.i.a(this.x()), this.j, this.s(b8), this.k, this.u(b8), this, b9, object.e, this.l, g0.M.J0(object.i));
    }

    @Override
    public void h() {
    }

    @Override
    public void l(u u8) {
        synchronized (this) {
            this.r = u8;
            return;
        }
    }

    @Override
    public void q(long l8, boolean bl, boolean bl2) {
        long l9 = l8;
        if (l8 == -9223372036854775807L) {
            l9 = this.n;
        }
        if (!this.m && this.n == l9 && this.o == bl && this.p == bl2) {
            return;
        }
        this.n = l9;
        this.o = bl;
        this.p = bl2;
        this.m = false;
        this.D();
    }

    @Override
    public void z(y y8) {
        this.q = y8;
        this.j.a((Looper)g0.a.e((Object)Looper.myLooper()), this.x());
        this.j.g();
        this.D();
    }

    public static final class b
    implements x.a {
        public final g.a a;
        public F.a b;
        public A c;
        public m d;
        public int e;

        public b(g.a a8, F0.x x8) {
            this(a8, new M(x8));
        }

        public b(g.a a8, F.a a9) {
            this(a8, a9, new l(), new k(), 1048576);
        }

        public b(g.a a8, F.a a9, A a10, m m8, int n8) {
            this.a = a8;
            this.b = a9;
            this.c = a10;
            this.d = m8;
            this.e = n8;
        }

        public static /* synthetic */ F a(F0.x x8, y1 y12) {
            return b.c(x8, y12);
        }

        public static /* synthetic */ F c(F0.x x8, y1 y12) {
            return new d(x8);
        }

        public L b(u u8) {
            g0.a.e(u8.b);
            return new L(u8, this.a, this.b, this.c.a(u8), this.d, this.e, null);
        }
    }

}

