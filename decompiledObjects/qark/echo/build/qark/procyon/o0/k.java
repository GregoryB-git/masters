// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package o0;

import Z2.a;
import java.math.RoundingMode;
import java.math.BigInteger;
import d0.q;
import java.util.List;
import g0.M;

public abstract class k
{
    public final i a;
    public final long b;
    public final long c;
    
    public k(final i a, final long b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public i a(final j j) {
        return this.a;
    }
    
    public long b() {
        return M.W0(this.c, 1000000L, this.b);
    }
    
    public abstract static class a extends k
    {
        public final long d;
        public final long e;
        public final List f;
        public final long g;
        public final long h;
        public final long i;
        
        public a(final i i, final long n, final long n2, final long d, final long e, final List f, final long j, final long g, final long h) {
            super(i, n, n2);
            this.d = d;
            this.e = e;
            this.f = f;
            this.i = j;
            this.g = g;
            this.h = h;
        }
        
        public long c(final long n, final long n2) {
            final long g = this.g(n);
            if (g != -1L) {
                return g;
            }
            return (int)(this.i(n2 - this.h + this.i, n) - this.d(n, n2));
        }
        
        public long d(long i, final long n) {
            if (this.g(i) == -1L) {
                final long g = this.g;
                if (g != -9223372036854775807L) {
                    i = this.i(n - this.h - g, i);
                    return Math.max(this.e(), i);
                }
            }
            return this.e();
        }
        
        public long e() {
            return this.d;
        }
        
        public long f(final long n, long n2) {
            if (this.f != null) {
                return -9223372036854775807L;
            }
            n2 = this.d(n, n2) + this.c(n, n2);
            return this.j(n2) + this.h(n2, n) - this.i;
        }
        
        public abstract long g(final long p0);
        
        public final long h(final long n, final long n2) {
            final List f = this.f;
            if (f != null) {
                return f.get((int)(n - this.d)).b * 1000000L / super.b;
            }
            final long g = this.g(n2);
            if (g != -1L && n == this.e() + g - 1L) {
                return n2 - this.j(n);
            }
            return this.e * 1000000L / super.b;
        }
        
        public long i(long a, long g) {
            final long e = this.e();
            g = this.g(g);
            if (g == 0L) {
                return e;
            }
            if (this.f != null) {
                long n = g + e - 1L;
                g = e;
                while (g <= n) {
                    final long n2 = (n - g) / 2L + g;
                    final long n3 = lcmp(this.j(n2), a);
                    if (n3 < 0) {
                        g = n2 + 1L;
                    }
                    else {
                        if (n3 <= 0) {
                            return n2;
                        }
                        n = n2 - 1L;
                    }
                }
                if (g == e) {
                    n = g;
                }
                return n;
            }
            a = this.d + a / (this.e * 1000000L / super.b);
            if (a < e) {
                return e;
            }
            if (g == -1L) {
                return a;
            }
            return Math.min(a, e + g - 1L);
        }
        
        public final long j(long n) {
            final List f = this.f;
            if (f != null) {
                n = f.get((int)(n - this.d)).a - super.c;
            }
            else {
                n = (n - this.d) * this.e;
            }
            return M.W0(n, 1000000L, super.b);
        }
        
        public abstract i k(final j p0, final long p1);
        
        public boolean l() {
            return this.f != null;
        }
    }
    
    public static final class b extends a
    {
        public final List j;
        
        public b(final i i, final long n, final long n2, final long n3, final long n4, final List list, final long n5, final List j, final long n6, final long n7) {
            super(i, n, n2, n3, n4, list, n5, n6, n7);
            this.j = j;
        }
        
        @Override
        public long g(final long n) {
            return this.j.size();
        }
        
        @Override
        public i k(final j j, final long n) {
            return this.j.get((int)(n - super.d));
        }
        
        @Override
        public boolean l() {
            return true;
        }
    }
    
    public static final class c extends a
    {
        public final n j;
        public final n k;
        public final long l;
        
        public c(final i i, final long n, final long n2, final long n3, final long l, final long n4, final List list, final long n5, final n j, final n k, final long n6, final long n7) {
            super(i, n, n2, n3, n4, list, n5, n6, n7);
            this.j = j;
            this.k = k;
            this.l = l;
        }
        
        @Override
        public i a(final j j) {
            final n i = this.j;
            if (i != null) {
                final q b = j.b;
                return new i(i.a(b.a, 0L, b.i, 0L), 0L, -1L);
            }
            return super.a(j);
        }
        
        @Override
        public long g(final long val) {
            final List f = super.f;
            if (f != null) {
                return f.size();
            }
            final long l = this.l;
            if (l != -1L) {
                return l - super.d + 1L;
            }
            if (val != -9223372036854775807L) {
                return a.a(BigInteger.valueOf(val).multiply(BigInteger.valueOf(super.b)), BigInteger.valueOf(super.e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }
        
        @Override
        public i k(final j j, final long n) {
            final List f = super.f;
            long a;
            if (f != null) {
                a = f.get((int)(n - super.d)).a;
            }
            else {
                a = (n - super.d) * super.e;
            }
            final n k = this.k;
            final q b = j.b;
            return new i(k.a(b.a, n, b.i, a), 0L, -1L);
        }
    }
    
    public static final class d
    {
        public final long a;
        public final long b;
        
        public d(final long a, final long b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null) {
                return false;
            }
            if (d.class != o.getClass()) {
                return false;
            }
            final d d = (d)o;
            return this.a == d.a && this.b == d.b;
        }
        
        @Override
        public int hashCode() {
            return (int)this.a * 31 + (int)this.b;
        }
    }
    
    public static class e extends k
    {
        public final long d;
        public final long e;
        
        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }
        
        public e(final i i, final long n, final long n2, final long d, final long e) {
            super(i, n, n2);
            this.d = d;
            this.e = e;
        }
        
        public i c() {
            final long e = this.e;
            if (e <= 0L) {
                return null;
            }
            return new i(null, this.d, e);
        }
    }
}
