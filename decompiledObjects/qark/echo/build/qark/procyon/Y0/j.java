// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y0;

import F0.N;
import g0.M;
import g0.a;
import F0.I;

public final class j implements g
{
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long[] g;
    
    public j(final long n, final int n2, final long n3, final int n4) {
        this(n, n2, n3, n4, -1L, null);
    }
    
    public j(long n, final int b, long c, final int d, final long e, final long[] g) {
        this.a = n;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.g = g;
        c = -1L;
        if (e == -1L) {
            n = c;
        }
        else {
            n += e;
        }
        this.f = n;
    }
    
    public static j a(final i i, final long n) {
        final long a = i.a();
        if (a == -9223372036854775807L) {
            return null;
        }
        final long c = i.c;
        if (c != -1L) {
            final long[] f = i.f;
            if (f != null) {
                final I.a a2 = i.a;
                return new j(n, a2.c, a, a2.f, c, f);
            }
        }
        final I.a a3 = i.a;
        return new j(n, a3.c, a, a3.f);
    }
    
    public final long b(final int n) {
        return this.c * n / 100L;
    }
    
    @Override
    public long c(long n) {
        n -= this.a;
        if (this.h() && n > this.b) {
            final long[] array = (long[])g0.a.h(this.g);
            final double n2 = n * 256.0 / this.e;
            final int h = g0.M.h(array, (long)n2, true, true);
            final long b = this.b(h);
            final long n3 = array[h];
            final int n4 = h + 1;
            final long b2 = this.b(n4);
            if (h == 99) {
                n = 256L;
            }
            else {
                n = array[n4];
            }
            double n5;
            if (n3 == n) {
                n5 = 0.0;
            }
            else {
                n5 = (n2 - n3) / (n - n3);
            }
            return b + Math.round(n5 * (b2 - b));
        }
        return 0L;
    }
    
    @Override
    public long f() {
        return this.f;
    }
    
    @Override
    public boolean h() {
        return this.g != null;
    }
    
    @Override
    public M.a j(long q) {
        if (!this.h()) {
            return new M.a(new N(0L, this.a + this.b));
        }
        q = g0.M.q(q, 0L, this.c);
        final double n = q * 100.0 / this.c;
        double n2 = 0.0;
        if (n > 0.0) {
            if (n >= 100.0) {
                n2 = 256.0;
            }
            else {
                final int n3 = (int)n;
                final long[] array = (long[])g0.a.h(this.g);
                final double n4 = (double)array[n3];
                double n5;
                if (n3 == 99) {
                    n5 = 256.0;
                }
                else {
                    n5 = (double)array[n3 + 1];
                }
                n2 = n4 + (n - n3) * (n5 - n4);
            }
        }
        return new M.a(new N(q, this.a + g0.M.q(Math.round(n2 / 256.0 * this.e), this.b, this.e - 1L)));
    }
    
    @Override
    public int k() {
        return this.d;
    }
    
    @Override
    public long l() {
        return this.c;
    }
}
