// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l1;

import F0.L;
import g0.M;
import F0.s;
import g0.z;
import g0.E;

public final class H
{
    public final int a;
    public final E b;
    public final z c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    public long h;
    public long i;
    
    public H(final int a) {
        this.a = a;
        this.b = new E(0L);
        this.g = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        this.c = new z();
    }
    
    public final int a(final s s) {
        this.c.Q(M.f);
        this.d = true;
        s.h();
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
    
    public int e(final s s, final L l, final int n) {
        if (n <= 0) {
            return this.a(s);
        }
        if (!this.f) {
            return this.h(s, l, n);
        }
        if (this.h == -9223372036854775807L) {
            return this.a(s);
        }
        if (!this.e) {
            return this.f(s, l, n);
        }
        final long g = this.g;
        if (g == -9223372036854775807L) {
            return this.a(s);
        }
        this.i = this.b.c(this.h) - this.b.b(g);
        return this.a(s);
    }
    
    public final int f(final s s, final L l, final int n) {
        final int n2 = (int)Math.min(this.a, s.a());
        final long p3 = s.p();
        final long a = 0;
        if (p3 != a) {
            l.a = a;
            return 1;
        }
        this.c.P(n2);
        s.h();
        s.n(this.c.e(), 0, n2);
        this.g = this.g(this.c, n);
        this.e = true;
        return 0;
    }
    
    public final long g(final z z, final int n) {
        for (int i = z.f(); i < z.g(); ++i) {
            if (z.e()[i] == 71) {
                final long c = l1.L.c(z, i, n);
                if (c != -9223372036854775807L) {
                    return c;
                }
            }
        }
        return -9223372036854775807L;
    }
    
    public final int h(final s s, final L l, final int n) {
        final long a = s.a();
        final int n2 = (int)Math.min(this.a, a);
        final long a2 = a - n2;
        if (s.p() != a2) {
            l.a = a2;
            return 1;
        }
        this.c.P(n2);
        s.h();
        s.n(this.c.e(), 0, n2);
        this.h = this.i(this.c, n);
        this.f = true;
        return 0;
    }
    
    public final long i(final z z, final int n) {
        final int f = z.f();
        final int g = z.g();
        for (int i = g - 188; i >= f; --i) {
            if (l1.L.b(z.e(), f, g, i)) {
                final long c = l1.L.c(z, i, n);
                if (c != -9223372036854775807L) {
                    return c;
                }
            }
        }
        return -9223372036854775807L;
    }
}
