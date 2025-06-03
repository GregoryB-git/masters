// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m1;

import F0.N;
import F0.M;

public final class e implements M
{
    public final c a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    
    public e(final c a, final int b, long n, final long n2) {
        this.a = a;
        this.b = b;
        this.c = n;
        n = (n2 - n) / a.e;
        this.d = n;
        this.e = this.a(n);
    }
    
    public final long a(final long n) {
        return g0.M.W0(n * this.b, 1000000L, this.a.c);
    }
    
    @Override
    public boolean h() {
        return true;
    }
    
    @Override
    public a j(long n) {
        final long q = g0.M.q(this.a.c * n / (this.b * 1000000L), 0L, this.d - 1L);
        final long c = this.c;
        final long n2 = this.a.e;
        final long a = this.a(q);
        final N n3 = new N(a, c + n2 * q);
        if (a < n && q != this.d - 1L) {
            n = q + 1L;
            return new a(n3, new N(this.a(n), this.c + this.a.e * n));
        }
        return new a(n3);
    }
    
    @Override
    public long l() {
        return this.e;
    }
}
