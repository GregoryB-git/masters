/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.EOFException
 *  java.io.IOException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.math.BigInteger
 */
package a1;

import F0.M;
import F0.N;
import F0.s;
import F0.u;
import a1.f;
import a1.g;
import a1.i;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;

public final class a
implements g {
    public final f a;
    public final long b;
    public final long c;
    public final i d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;

    public a(i i8, long l8, long l9, long l10, long l11, boolean bl) {
        boolean bl2 = l8 >= 0L && l9 > l8;
        g0.a.a(bl2);
        this.d = i8;
        this.b = l8;
        this.c = l9;
        if (l10 != l9 - l8 && !bl) {
            this.e = 0;
        } else {
            this.f = l11;
            this.e = 4;
        }
        this.a = new f();
    }

    @Override
    public void b(long l8) {
        this.h = g0.M.q(l8, 0L, this.f - 1L);
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }

    @Override
    public long c(s s8) {
        int n8 = this.e;
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 == 4) {
                            return -1L;
                        }
                        throw new IllegalStateException();
                    }
                } else {
                    long l8 = this.i(s8);
                    if (l8 != -1L) {
                        return l8;
                    }
                    this.e = 3;
                }
                this.k(s8);
                this.e = 4;
                return - this.k + 2L;
            }
        } else {
            long l9;
            this.g = l9 = s8.p();
            this.e = 1;
            long l10 = this.c - 65307L;
            if (l10 > l9) {
                return l10;
            }
        }
        this.f = this.j(s8);
        this.e = 4;
        return this.g;
    }

    public b h() {
        long l8 = this.f;
        b b8 = null;
        if (l8 != 0L) {
            b8 = new b(null);
        }
        return b8;
    }

    public final long i(s s8) {
        if (this.i == this.j) {
            return -1L;
        }
        long l8 = s8.p();
        if (!this.a.d(s8, this.j)) {
            long l9 = this.i;
            if (l9 != l8) {
                return l9;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.a.a(s8, false);
        s8.h();
        long l10 = this.h;
        f f8 = this.a;
        long l11 = f8.c;
        int n8 = f8.h + f8.i;
        if (0L <= (l10 -= l11) && l10 < 72000L) {
            return -1L;
        }
        long l12 = l10 LCMP 0L;
        if (l12 < 0) {
            this.j = l8;
            this.l = l11;
        } else {
            this.i = s8.p() + (long)n8;
            this.k = this.a.c;
        }
        l8 = this.j;
        l11 = this.i;
        if (l8 - l11 < 100000L) {
            this.j = l11;
            return l11;
        }
        l11 = n8;
        l8 = l12 <= 0 ? 2L : 1L;
        long l13 = s8.p();
        long l14 = this.j;
        long l15 = this.i;
        return g0.M.q(l13 - l11 * l8 + l10 * (l14 - l15) / (this.l - this.k), l15, l14 - 1L);
    }

    public long j(s s8) {
        this.a.b();
        if (this.a.c(s8)) {
            long l8;
            this.a.a(s8, false);
            f f8 = this.a;
            s8.i(f8.h + f8.i);
            do {
                l8 = this.a.c;
                f8 = this.a;
                if ((f8.b & 4) == 4 || !f8.c(s8) || s8.p() >= this.c || !this.a.a(s8, true)) break;
                f8 = this.a;
            } while (u.e(s8, f8.h + f8.i));
            return l8;
        }
        throw new EOFException();
    }

    public final void k(s s8) {
        do {
            this.a.c(s8);
            this.a.a(s8, false);
            f f8 = this.a;
            if (f8.c > this.h) {
                s8.h();
                return;
            }
            s8.i(f8.h + f8.i);
            this.i = s8.p();
            this.k = this.a.c;
        } while (true);
    }

    public final class b
    implements M {
        public b() {
        }

        public /* synthetic */ b( a9) {
            this();
        }

        @Override
        public boolean h() {
            return true;
        }

        @Override
        public M.a j(long l8) {
            long l9 = a.this.d.c(l8);
            return new M.a(new N(l8, g0.M.q(a.this.b + BigInteger.valueOf((long)l9).multiply(BigInteger.valueOf((long)(a.this.c - a.this.b))).divide(BigInteger.valueOf((long)a.this.f)).longValue() - 30000L, a.this.b, a.this.c - 1L)));
        }

        @Override
        public long l() {
            return a.this.d.b(a.this.f);
        }
    }

}

