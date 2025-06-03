/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package m1;

import F0.M;
import F0.N;
import m1.c;

public final class e
implements M {
    public final c a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public e(c c8, int n8, long l8, long l9) {
        this.a = c8;
        this.b = n8;
        this.c = l8;
        this.d = l8 = (l9 - l8) / (long)c8.e;
        this.e = this.a(l8);
    }

    public final long a(long l8) {
        return g0.M.W0(l8 * (long)this.b, 1000000L, this.a.c);
    }

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public M.a j(long l8) {
        long l9 = g0.M.q((long)this.a.c * l8 / ((long)this.b * 1000000L), 0L, this.d - 1L);
        long l10 = this.c;
        long l11 = this.a.e;
        long l12 = this.a(l9);
        N n8 = new N(l12, l10 + l11 * l9);
        if (l12 < l8 && l9 != this.d - 1L) {
            l8 = l9 + 1L;
            l9 = this.c;
            l10 = this.a.e;
            return new M.a(n8, new N(this.a(l8), l9 + l10 * l8));
        }
        return new M.a(n8);
    }

    @Override
    public long l() {
        return this.e;
    }
}

