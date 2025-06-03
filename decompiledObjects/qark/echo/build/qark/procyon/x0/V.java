// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x0;

import g0.a;
import android.net.Uri;
import d0.u;
import d0.I;

public final class V extends I
{
    public static final Object r;
    public static final u s;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final Object o;
    public final u p;
    public final u.g q;
    
    static {
        r = new Object();
        s = new u.c().b("SinglePeriodTimeline").e(Uri.EMPTY).a();
    }
    
    public V(final long e, final long f, final long g, final long h, final long i, final long j, final long k, final boolean l, final boolean m, final boolean n, final Object o, final u u, final u.g q) {
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = (u)g0.a.e(u);
        this.q = q;
    }
    
    public V(final long n, final long n2, final long n3, final long n4, final boolean b, final boolean b2, final boolean b3, final Object o, final u u) {
        Object d;
        if (b3) {
            d = u.d;
        }
        else {
            d = null;
        }
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, n, n2, n3, n4, b, b2, false, o, u, (u.g)d);
    }
    
    public V(final long n, final boolean b, final boolean b2, final boolean b3, final Object o, final u u) {
        this(n, n, 0L, 0L, b, b2, b3, o, u);
    }
    
    @Override
    public int b(final Object obj) {
        if (V.r.equals(obj)) {
            return 0;
        }
        return -1;
    }
    
    @Override
    public b g(final int n, final b b, final boolean b2) {
        g0.a.c(n, 0, 1);
        Object r;
        if (b2) {
            r = V.r;
        }
        else {
            r = null;
        }
        return b.s(null, r, 0, this.h, -this.j);
    }
    
    @Override
    public int i() {
        return 1;
    }
    
    @Override
    public Object m(final int n) {
        g0.a.c(n, 0, 1);
        return V.r;
    }
    
    @Override
    public c o(final int n, final c c, long n2) {
        g0.a.c(n, 0, 1);
        final long k = this.k;
        final boolean m = this.m;
        long n3 = k;
        if (m) {
            n3 = k;
            if (!this.n) {
                n3 = k;
                if (n2 != 0L) {
                    final long i = this.i;
                    if (i != -9223372036854775807L) {
                        n2 = (n3 = k + n2);
                        if (n2 <= i) {
                            return c.g(I.c.q, this.p, this.o, this.e, this.f, this.g, this.l, m, this.q, n3, this.i, 0, 0, this.j);
                        }
                    }
                    n3 = -9223372036854775807L;
                }
            }
        }
        return c.g(I.c.q, this.p, this.o, this.e, this.f, this.g, this.l, m, this.q, n3, this.i, 0, 0, this.j);
    }
    
    @Override
    public int p() {
        return 1;
    }
}
