// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y0;

import F0.N;
import g0.M;
import java.math.RoundingMode;
import g0.p;

public final class b implements g
{
    public final long a;
    public final p b;
    public final p c;
    public final int d;
    public long e;
    
    public b(long y0, final long n, final long a) {
        this.e = y0;
        this.a = a;
        final p b = new p();
        this.b = b;
        final p c = new p();
        this.c = c;
        b.a(0L);
        c.a(n);
        int d;
        final int n2 = d = -2147483647;
        if (y0 != -9223372036854775807L) {
            y0 = g0.M.Y0(n - a, 8L, y0, RoundingMode.HALF_UP);
            d = n2;
            if (y0 > 0L) {
                d = n2;
                if (y0 <= 2147483647L) {
                    d = (int)y0;
                }
            }
        }
        this.d = d;
    }
    
    public boolean a(final long n) {
        final p b = this.b;
        return n - b.b(b.c() - 1) < 100000L;
    }
    
    public void b(final long n, final long n2) {
        if (this.a(n)) {
            return;
        }
        this.b.a(n);
        this.c.a(n2);
    }
    
    @Override
    public long c(final long n) {
        return this.b.b(g0.M.e(this.c, n, true, true));
    }
    
    public void d(final long e) {
        this.e = e;
    }
    
    @Override
    public long f() {
        return this.a;
    }
    
    @Override
    public boolean h() {
        return true;
    }
    
    @Override
    public M.a j(final long n) {
        final int e = g0.M.e(this.b, n, true, true);
        final N n2 = new N(this.b.b(e), this.c.b(e));
        if (n2.a != n && e != this.b.c() - 1) {
            final p b = this.b;
            final int n3 = e + 1;
            return new M.a(n2, new N(b.b(n3), this.c.b(n3)));
        }
        return new M.a(n2);
    }
    
    @Override
    public int k() {
        return this.d;
    }
    
    @Override
    public long l() {
        return this.e;
    }
}
