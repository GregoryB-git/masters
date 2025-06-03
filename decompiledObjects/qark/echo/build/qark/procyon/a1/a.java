// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a1;

import F0.N;
import java.math.BigInteger;
import java.io.EOFException;
import F0.u;
import java.io.IOException;
import F0.s;
import F0.M;

public final class a implements g
{
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
    
    public a(final i d, final long b, final long c, final long n, final long f, final boolean b2) {
        g0.a.a(b >= 0L && c > b);
        this.d = d;
        this.b = b;
        this.c = c;
        if (n != c - b && !b2) {
            this.e = 0;
        }
        else {
            this.f = f;
            this.e = 4;
        }
        this.a = new f();
    }
    
    public static /* synthetic */ i d(final a a) {
        return a.d;
    }
    
    public static /* synthetic */ long e(final a a) {
        return a.b;
    }
    
    public static /* synthetic */ long f(final a a) {
        return a.f;
    }
    
    public static /* synthetic */ long g(final a a) {
        return a.c;
    }
    
    @Override
    public void b(final long n) {
        this.h = g0.M.q(n, 0L, this.f - 1L);
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }
    
    @Override
    public long c(final s s) {
        final int e = this.e;
        if (e != 0) {
            if (e != 1) {
                if (e != 2) {
                    if (e != 3) {
                        if (e == 4) {
                            return -1L;
                        }
                        throw new IllegalStateException();
                    }
                }
                else {
                    final long i = this.i(s);
                    if (i != -1L) {
                        return i;
                    }
                    this.e = 3;
                }
                this.k(s);
                this.e = 4;
                return -(this.k + 2L);
            }
        }
        else {
            final long p = s.p();
            this.g = p;
            this.e = 1;
            final long n = this.c - 65307L;
            if (n > p) {
                return n;
            }
        }
        this.f = this.j(s);
        this.e = 4;
        return this.g;
    }
    
    public b h() {
        final long f = this.f;
        b b = null;
        if (f != 0L) {
            b = new b(null);
        }
        return b;
    }
    
    public final long i(final s s) {
        if (this.i == this.j) {
            return -1L;
        }
        final long p = s.p();
        if (!this.a.d(s, this.j)) {
            final long i = this.i;
            if (i != p) {
                return i;
            }
            throw new IOException("No ogg page can be found.");
        }
        else {
            this.a.a(s, false);
            s.h();
            final long h = this.h;
            final f a = this.a;
            final long c = a.c;
            final long n = h - c;
            final int n2 = a.h + a.i;
            if (0L <= n && n < 72000L) {
                return -1L;
            }
            final long n3 = lcmp(n, 0L);
            if (n3 < 0) {
                this.j = p;
                this.l = c;
            }
            else {
                this.i = s.p() + n2;
                this.k = this.a.c;
            }
            final long j = this.j;
            final long k = this.i;
            if (j - k < 100000L) {
                return this.j = k;
            }
            final long n4 = n2;
            long n5;
            if (n3 <= 0) {
                n5 = 2L;
            }
            else {
                n5 = 1L;
            }
            final long p2 = s.p();
            final long l = this.j;
            final long m = this.i;
            return g0.M.q(p2 - n4 * n5 + n * (l - m) / (this.l - this.k), m, l - 1L);
        }
    }
    
    public long j(final s s) {
        this.a.b();
        if (this.a.c(s)) {
            this.a.a(s, false);
            final f a = this.a;
            s.i(a.h + a.i);
            f a2;
            long c;
            do {
                c = this.a.c;
                final f a3 = this.a;
                if ((a3.b & 0x4) == 0x4 || !a3.c(s) || s.p() >= this.c || !this.a.a(s, true)) {
                    break;
                }
                a2 = this.a;
            } while (u.e(s, a2.h + a2.i));
            return c;
        }
        throw new EOFException();
    }
    
    public final void k(final s s) {
        while (true) {
            this.a.c(s);
            this.a.a(s, false);
            final f a = this.a;
            if (a.c > this.h) {
                break;
            }
            s.i(a.h + a.i);
            this.i = s.p();
            this.k = this.a.c;
        }
        s.h();
    }
    
    public final class b implements M
    {
        @Override
        public boolean h() {
            return true;
        }
        
        @Override
        public M.a j(final long n) {
            return new M.a(new N(n, g0.M.q(a1.a.e(a1.a.this) + BigInteger.valueOf(a1.a.d(a1.a.this).c(n)).multiply(BigInteger.valueOf(a1.a.g(a1.a.this) - a1.a.e(a1.a.this))).divide(BigInteger.valueOf(a1.a.f(a1.a.this))).longValue() - 30000L, a1.a.e(a1.a.this), a1.a.g(a1.a.this) - 1L)));
        }
        
        @Override
        public long l() {
            return a1.a.d(a1.a.this).b(a1.a.f(a1.a.this));
        }
    }
}
