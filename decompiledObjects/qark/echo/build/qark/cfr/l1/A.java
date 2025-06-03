/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package l1;

import F0.L;
import F0.s;
import g0.E;
import g0.M;
import g0.z;

public final class A {
    public final E a = new E(0L);
    public final z b = new z();
    public boolean c;
    public boolean d;
    public boolean e;
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;

    public static boolean a(byte[] arrby) {
        boolean bl = false;
        if ((arrby[0] & 196) != 68) {
            return false;
        }
        if ((arrby[2] & 4) != 4) {
            return false;
        }
        if ((arrby[4] & 4) != 4) {
            return false;
        }
        if ((arrby[5] & 1) != 1) {
            return false;
        }
        if ((arrby[8] & 3) == 3) {
            bl = true;
        }
        return bl;
    }

    public static long l(z z8) {
        int n8 = z8.f();
        if (z8.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] arrby = new byte[9];
        z8.l(arrby, 0, 9);
        z8.T(n8);
        if (!A.a(arrby)) {
            return -9223372036854775807L;
        }
        return A.m(arrby);
    }

    public static long m(byte[] arrby) {
        byte by = arrby[0];
        long l8 = by;
        long l9 = by;
        long l10 = arrby[1];
        by = arrby[2];
        return (l8 & 56L) >> 3 << 30 | (l9 & 3L) << 28 | (l10 & 255L) << 20 | ((long)by & 248L) >> 3 << 15 | ((long)by & 3L) << 13 | ((long)arrby[3] & 255L) << 5 | ((long)arrby[4] & 248L) >> 3;
    }

    public final int b(s s8) {
        this.b.Q(M.f);
        this.c = true;
        s8.h();
        return 0;
    }

    public long c() {
        return this.h;
    }

    public E d() {
        return this.a;
    }

    public boolean e() {
        return this.c;
    }

    public final int f(byte[] arrby, int n8) {
        byte by = arrby[n8];
        byte by2 = arrby[n8 + 1];
        byte by3 = arrby[n8 + 2];
        return arrby[n8 + 3] & 255 | ((by & 255) << 24 | (by2 & 255) << 16 | (by3 & 255) << 8);
    }

    public int g(s s8, L l8) {
        if (!this.e) {
            return this.j(s8, l8);
        }
        if (this.g == -9223372036854775807L) {
            return this.b(s8);
        }
        if (!this.d) {
            return this.h(s8, l8);
        }
        long l9 = this.f;
        if (l9 == -9223372036854775807L) {
            return this.b(s8);
        }
        l9 = this.a.b(l9);
        this.h = this.a.c(this.g) - l9;
        return this.b(s8);
    }

    public final int h(s s8, L l8) {
        long l9;
        int n8 = (int)Math.min((long)20000L, (long)s8.a());
        long l10 = s8.p();
        if (l10 != (l9 = (long)0)) {
            l8.a = l9;
            return 1;
        }
        this.b.P(n8);
        s8.h();
        s8.n(this.b.e(), 0, n8);
        this.f = this.i(this.b);
        this.d = true;
        return 0;
    }

    public final long i(z z8) {
        int n8 = z8.g();
        for (int i8 = z8.f(); i8 < n8 - 3; ++i8) {
            if (this.f(z8.e(), i8) != 442) continue;
            z8.T(i8 + 4);
            long l8 = A.l(z8);
            if (l8 == -9223372036854775807L) continue;
            return l8;
        }
        return -9223372036854775807L;
    }

    public final int j(s s8, L l8) {
        long l9 = s8.a();
        int n8 = (int)Math.min((long)20000L, (long)l9);
        if (s8.p() != (l9 -= (long)n8)) {
            l8.a = l9;
            return 1;
        }
        this.b.P(n8);
        s8.h();
        s8.n(this.b.e(), 0, n8);
        this.g = this.k(this.b);
        this.e = true;
        return 0;
    }

    public final long k(z z8) {
        int n8 = z8.f();
        for (int i8 = z8.g() - 4; i8 >= n8; --i8) {
            if (this.f(z8.e(), i8) != 442) continue;
            z8.T(i8 + 4);
            long l8 = A.l(z8);
            if (l8 == -9223372036854775807L) continue;
            return l8;
        }
        return -9223372036854775807L;
    }
}

