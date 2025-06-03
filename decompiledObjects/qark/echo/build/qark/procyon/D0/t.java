// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D0;

import g0.a;
import d0.P;
import g0.D;

public final class t
{
    public final a a;
    public final q b;
    public final q.a c;
    public final D d;
    public final D e;
    public final g0.q f;
    public P g;
    public P h;
    public long i;
    public long j;
    
    public t(final a a, final q b) {
        this.a = a;
        this.b = b;
        this.c = new q.a();
        this.d = new D();
        this.e = new D();
        this.f = new g0.q();
        this.h = P.e;
        this.j = -9223372036854775807L;
    }
    
    public static Object c(final D d) {
        g0.a.a(d.k() > 0);
        while (d.k() > 1) {
            d.h();
        }
        return g0.a.e(d.h());
    }
    
    public final void a() {
        g0.a.h(this.f.d());
        this.a.d();
    }
    
    public void b() {
        this.f.a();
        this.j = -9223372036854775807L;
        if (this.e.k() > 0) {
            final Long n = (Long)c(this.e);
            n;
            this.e.a(0L, n);
        }
        if (this.g == null) {
            if (this.d.k() > 0) {
                this.g = (P)c(this.d);
            }
        }
        else {
            this.d.c();
        }
    }
    
    public boolean d(final long n) {
        final long j = this.j;
        return j != -9223372036854775807L && j >= n;
    }
    
    public boolean e() {
        return this.b.d(true);
    }
    
    public final boolean f(final long n) {
        final Long n2 = (Long)this.e.i(n);
        if (n2 != null && n2 != this.i) {
            this.i = n2;
            return true;
        }
        return false;
    }
    
    public final boolean g(final long n) {
        final P h = (P)this.d.i(n);
        if (h == null) {
            return false;
        }
        if (!h.equals(P.e) && !h.equals(this.h)) {
            this.h = h;
            return true;
        }
        return false;
    }
    
    public void h(final long n, final long n2) {
        while (!this.f.c()) {
            final long b = this.f.b();
            if (this.f(b)) {
                this.b.j();
            }
            final int c = this.b.c(b, n, n2, this.i, false, this.c);
            boolean b2 = true;
            if (c != 0 && c != 1) {
                if (c != 2 && c != 3 && c != 4) {
                    if (c == 5) {
                        return;
                    }
                    throw new IllegalStateException(String.valueOf(c));
                }
                else {
                    this.j = b;
                    this.a();
                }
            }
            else {
                this.j = b;
                if (c != 0) {
                    b2 = false;
                }
                this.i(b2);
            }
        }
    }
    
    public final void i(final boolean b) {
        final long longValue = (long)g0.a.h(this.f.d());
        if (this.g(longValue)) {
            this.a.b(this.h);
        }
        long g;
        if (b) {
            g = -1L;
        }
        else {
            g = this.c.g();
        }
        this.a.c(g, longValue, this.i, this.b.i());
    }
    
    public void j(final float n) {
        g0.a.a(n > 0.0f);
        this.b.r(n);
    }
    
    public interface a
    {
        void b(final P p0);
        
        void c(final long p0, final long p1, final long p2, final boolean p3);
        
        void d();
    }
}
