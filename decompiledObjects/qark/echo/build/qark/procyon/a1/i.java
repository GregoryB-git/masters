// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a1;

import d0.q;
import F0.L;
import F0.s;
import g0.z;
import g0.M;
import g0.a;
import F0.t;
import F0.T;

public abstract class i
{
    public final e a;
    public T b;
    public t c;
    public g d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public b j;
    public long k;
    public boolean l;
    public boolean m;
    
    public i() {
        this.a = new e();
        this.j = new b();
    }
    
    public final void a() {
        g0.a.h(this.b);
        M.i(this.c);
    }
    
    public long b(final long n) {
        return n * 1000000L / this.i;
    }
    
    public long c(final long n) {
        return this.i * n / 1000000L;
    }
    
    public void d(final t c, final T b) {
        this.c = c;
        this.b = b;
        this.l(true);
    }
    
    public void e(final long g) {
        this.g = g;
    }
    
    public abstract long f(final z p0);
    
    public final int g(final s s, final L l) {
        this.a();
        final int h = this.h;
        if (h == 0) {
            return this.j(s);
        }
        if (h == 1) {
            s.i((int)this.f);
            this.h = 2;
            return 0;
        }
        if (h == 2) {
            M.i(this.d);
            return this.k(s, l);
        }
        if (h == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }
    
    public final boolean h(final s s) {
        while (this.a.d(s)) {
            this.k = s.p() - this.f;
            if (!this.i(this.a.c(), this.f, this.j)) {
                return true;
            }
            this.f = s.p();
        }
        this.h = 3;
        return false;
    }
    
    public abstract boolean i(final z p0, final long p1, final b p2);
    
    public final int j(final s s) {
        if (!this.h(s)) {
            return -1;
        }
        final q a = this.j.a;
        this.i = a.C;
        if (!this.m) {
            this.b.d(a);
            this.m = true;
        }
        final g b = this.j.b;
        Label_0156: {
            g d;
            if (b != null) {
                d = b;
            }
            else {
                if (s.a() != -1L) {
                    final f b2 = this.a.b();
                    this.d = new a1.a(this, this.f, s.a(), b2.h + b2.i, b2.c, (b2.b & 0x4) != 0x0);
                    break Label_0156;
                }
                d = new c(null);
            }
            this.d = d;
        }
        this.h = 2;
        this.a.f();
        return 0;
    }
    
    public final int k(final s s, final L l) {
        final long c = this.d.c(s);
        if (c >= 0L) {
            l.a = c;
            return 1;
        }
        if (c < -1L) {
            this.e(-(c + 2L));
        }
        if (!this.l) {
            this.c.e((F0.M)g0.a.h(this.d.a()));
            this.l = true;
        }
        if (this.k <= 0L && !this.a.d(s)) {
            this.h = 3;
            return -1;
        }
        this.k = 0L;
        final z c2 = this.a.c();
        final long f = this.f(c2);
        if (f >= 0L) {
            final long g = this.g;
            if (g + f >= this.e) {
                final long b = this.b(g);
                this.b.e(c2, c2.g());
                this.b.b(b, 1, c2.g(), 0, null);
                this.e = -1L;
            }
        }
        this.g += f;
        return 0;
    }
    
    public void l(final boolean b) {
        int h;
        if (b) {
            this.j = new b();
            this.f = 0L;
            h = 0;
        }
        else {
            h = 1;
        }
        this.h = h;
        this.e = -1L;
        this.g = 0L;
    }
    
    public final void m(final long n, final long n2) {
        this.a.e();
        if (n == 0L) {
            this.l(this.l ^ true);
            return;
        }
        if (this.h != 0) {
            this.e = this.c(n2);
            ((g)M.i(this.d)).b(this.e);
            this.h = 2;
        }
    }
    
    public static class b
    {
        public q a;
        public g b;
    }
    
    public static final class c implements g
    {
        @Override
        public F0.M a() {
            return new F0.M.b(-9223372036854775807L);
        }
        
        @Override
        public void b(final long n) {
        }
        
        @Override
        public long c(final s s) {
            return -1L;
        }
    }
}
