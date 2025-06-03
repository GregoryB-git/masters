/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package l1;

import F0.s;
import g0.E;
import g0.M;
import g0.z;
import l1.L;

public final class H {
    public final int a;
    public final E b;
    public final z c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    public long h;
    public long i;

    public H(int n8) {
        this.a = n8;
        this.b = new E(0L);
        this.g = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        this.c = new z();
    }

    public final int a(s s8) {
        this.c.Q(M.f);
        this.d = true;
        s8.h();
        return 0;
    }

    public long b() {
        return this.i;
    }

    public E c() {
        return this.b;
    }

    public boolean d() {
        return this.d;
    }

    public int e(s s8, F0.L l8, int n8) {
        if (n8 <= 0) {
            return this.a(s8);
        }
        if (!this.f) {
            return this.h(s8, l8, n8);
        }
        if (this.h == -9223372036854775807L) {
            return this.a(s8);
        }
        if (!this.e) {
            return this.f(s8, l8, n8);
        }
        long l9 = this.g;
        if (l9 == -9223372036854775807L) {
            return this.a(s8);
        }
        l9 = this.b.b(l9);
        this.i = this.b.c(this.h) - l9;
        return this.a(s8);
    }

    public final int f(s s8, F0.L l8, int n8) {
        long l9;
        int n9 = (int)Math.min((long)this.a, (long)s8.a());
        long l10 = s8.p();
        if (l10 != (l9 = (long)0)) {
            l8.a = l9;
            return 1;
        }
        this.c.P(n9);
        s8.h();
        s8.n(this.c.e(), 0, n9);
        this.g = this.g(this.c, n8);
        this.e = true;
        return 0;
    }

    public final long g(z z8, int n8) {
        int n9 = z8.g();
        for (int i8 = z8.f(); i8 < n9; ++i8) {
            long l8;
            if (z8.e()[i8] != 71 || (l8 = L.c(z8, i8, n8)) == -9223372036854775807L) continue;
            return l8;
        }
        return -9223372036854775807L;
    }

    public final int h(s s8, F0.L l8, int n8) {
        long l9 = s8.a();
        int n9 = (int)Math.min((long)this.a, (long)l9);
        if (s8.p() != (l9 -= (long)n9)) {
            l8.a = l9;
            return 1;
        }
        this.c.P(n9);
        s8.h();
        s8.n(this.c.e(), 0, n9);
        this.h = this.i(this.c, n8);
        this.f = true;
        return 0;
    }

    public final long i(z z8, int n8) {
        int n9 = z8.f();
        int n10 = z8.g();
        for (int i8 = n10 - 188; i8 >= n9; --i8) {
            long l8;
            if (!L.b(z8.e(), n9, n10, i8) || (l8 = L.c(z8, i8, n8)) == -9223372036854775807L) continue;
            return l8;
        }
        return -9223372036854775807L;
    }
}

