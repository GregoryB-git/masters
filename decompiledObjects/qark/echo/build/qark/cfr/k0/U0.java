/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  java.lang.Object
 *  java.util.List
 */
package k0;

import A0.E;
import X2.v;
import android.os.SystemClock;
import d0.C;
import d0.I;
import g0.M;
import java.util.List;
import k0.u;
import x0.Z;
import x0.x;

public final class U0 {
    public static final x.b u = new x.b(new Object());
    public final I a;
    public final x.b b;
    public final long c;
    public final long d;
    public final int e;
    public final u f;
    public final boolean g;
    public final Z h;
    public final E i;
    public final List j;
    public final x.b k;
    public final boolean l;
    public final int m;
    public final int n;
    public final C o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public U0(I i8, x.b b8, long l8, long l9, int n8, u u8, boolean bl, Z z8, E e8, List list, x.b b9, boolean bl2, int n9, int n10, C c8, long l10, long l11, long l12, long l13, boolean bl3) {
        this.a = i8;
        this.b = b8;
        this.c = l8;
        this.d = l9;
        this.e = n8;
        this.f = u8;
        this.g = bl;
        this.h = z8;
        this.i = e8;
        this.j = list;
        this.k = b9;
        this.l = bl2;
        this.m = n9;
        this.n = n10;
        this.o = c8;
        this.q = l10;
        this.r = l11;
        this.s = l12;
        this.t = l13;
        this.p = bl3;
    }

    public static U0 k(E e8) {
        I i8 = I.a;
        x.b b8 = u;
        return new U0(i8, b8, -9223372036854775807L, 0L, 1, null, false, Z.d, e8, v.Y(), b8, false, 1, 0, C.d, 0L, 0L, 0L, 0L, false);
    }

    public static x.b l() {
        return u;
    }

    public U0 a() {
        return new U0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.m(), SystemClock.elapsedRealtime(), this.p);
    }

    public U0 b(boolean bl) {
        return new U0(this.a, this.b, this.c, this.d, this.e, this.f, bl, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public U0 c(x.b b8) {
        return new U0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, b8, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public U0 d(x.b b8, long l8, long l9, long l10, long l11, Z z8, E e8, List list) {
        return new U0(this.a, b8, l9, l10, this.e, this.f, this.g, z8, e8, list, this.k, this.l, this.m, this.n, this.o, this.q, l11, l8, SystemClock.elapsedRealtime(), this.p);
    }

    public U0 e(boolean bl, int n8, int n9) {
        return new U0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, bl, n8, n9, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public U0 f(u u8) {
        return new U0(this.a, this.b, this.c, this.d, this.e, u8, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public U0 g(C c8) {
        return new U0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, c8, this.q, this.r, this.s, this.t, this.p);
    }

    public U0 h(int n8) {
        return new U0(this.a, this.b, this.c, this.d, n8, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public U0 i(boolean bl) {
        return new U0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, bl);
    }

    public U0 j(I i8) {
        return new U0(i8, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public long m() {
        long l8;
        long l9;
        if (!this.n()) {
            return this.s;
        }
        do {
            l9 = this.t;
            l8 = this.s;
        } while (l9 != this.t);
        long l10 = SystemClock.elapsedRealtime();
        return M.J0(M.i1(l8) + (long)((float)(l10 - l9) * this.o.a));
    }

    public boolean n() {
        if (this.e == 3 && this.l && this.n == 0) {
            return true;
        }
        return false;
    }

    public void o(long l8) {
        this.s = l8;
        this.t = SystemClock.elapsedRealtime();
    }
}

