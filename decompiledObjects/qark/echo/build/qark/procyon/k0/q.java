// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k0;

import g0.a;
import a3.h;
import android.os.SystemClock;
import g0.M;
import d0.u;

public final class q implements w0
{
    public final float a;
    public final float b;
    public final long c;
    public final float d;
    public final long e;
    public final long f;
    public final float g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public float n;
    public float o;
    public float p;
    public long q;
    public long r;
    public long s;
    
    public q(final float n, final float n2, final long c, final float d, final long e, final long f, final float g) {
        this.a = n;
        this.b = n2;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.o = n;
        this.n = n2;
        this.p = 1.0f;
        this.q = -9223372036854775807L;
        this.j = -9223372036854775807L;
        this.m = -9223372036854775807L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
    }
    
    public static long h(final long n, final long n2, final float n3) {
        return (long)(n * n3 + (1.0f - n3) * n2);
    }
    
    @Override
    public void a() {
        final long m = this.m;
        if (m == -9223372036854775807L) {
            return;
        }
        final long i = m + this.f;
        this.m = i;
        final long l = this.l;
        if (l != -9223372036854775807L && i > l) {
            this.m = l;
        }
        this.q = -9223372036854775807L;
    }
    
    @Override
    public void b(final u.g g) {
        this.h = M.J0(g.a);
        this.k = M.J0(g.b);
        this.l = M.J0(g.c);
        float o = g.d;
        if (o == -3.4028235E38f) {
            o = this.a;
        }
        this.o = o;
        float n = g.e;
        if (n == -3.4028235E38f) {
            n = this.b;
        }
        this.n = n;
        if (o == 1.0f && n == 1.0f) {
            this.h = -9223372036854775807L;
        }
        this.g();
    }
    
    @Override
    public float c(long a, final long n) {
        if (this.h == -9223372036854775807L) {
            return 1.0f;
        }
        this.i(a, n);
        if (this.q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.q < this.c) {
            return this.p;
        }
        this.q = SystemClock.elapsedRealtime();
        this.f(a);
        a -= this.m;
        if (Math.abs(a) < this.e) {
            this.p = 1.0f;
        }
        else {
            this.p = M.o(this.d * a + 1.0f, this.o, this.n);
        }
        return this.p;
    }
    
    @Override
    public void d(final long i) {
        this.i = i;
        this.g();
    }
    
    @Override
    public long e() {
        return this.m;
    }
    
    public final void f(long m) {
        final long n = this.r + this.s * 3L;
        if (this.m > n) {
            m = M.J0(this.c);
            final float p = this.p;
            final float n2 = (float)m;
            m = (long)((p - 1.0f) * n2);
            this.m = a3.h.c(n, this.j, this.m - (m + (long)((this.n - 1.0f) * n2)));
            return;
        }
        m = M.q(m - (long)(Math.max(0.0f, this.p - 1.0f) / this.d), this.m, n);
        this.m = m;
        final long l = this.l;
        if (l != -9223372036854775807L && m > l) {
            this.m = l;
        }
    }
    
    public final void g() {
        final long h = this.h;
        long i;
        if (h != -9223372036854775807L) {
            i = this.i;
            if (i == -9223372036854775807L) {
                final long k = this.k;
                i = h;
                if (k != -9223372036854775807L) {
                    i = h;
                    if (h < k) {
                        i = k;
                    }
                }
                final long l = this.l;
                if (l != -9223372036854775807L && i > l) {
                    i = l;
                }
            }
        }
        else {
            i = -9223372036854775807L;
        }
        if (this.j == i) {
            return;
        }
        this.j = i;
        this.m = i;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.q = -9223372036854775807L;
    }
    
    public final void i(long s, long r) {
        s -= r;
        r = this.r;
        if (r == -9223372036854775807L) {
            this.r = s;
            s = 0L;
        }
        else {
            r = Math.max(s, h(r, s, this.g));
            this.r = r;
            s = Math.abs(s - r);
            s = h(this.s, s, this.g);
        }
        this.s = s;
    }
    
    public static final class b
    {
        public float a;
        public float b;
        public long c;
        public float d;
        public long e;
        public long f;
        public float g;
        
        public b() {
            this.a = 0.97f;
            this.b = 1.03f;
            this.c = 1000L;
            this.d = 1.0E-7f;
            this.e = M.J0(20L);
            this.f = M.J0(500L);
            this.g = 0.999f;
        }
        
        public q a() {
            return new q(this.a, this.b, this.c, this.d, this.e, this.f, this.g, null);
        }
        
        public b b(final float b) {
            g0.a.a(b >= 1.0f);
            this.b = b;
            return this;
        }
        
        public b c(final float a) {
            a.a(0.0f < a && a <= 1.0f);
            this.a = a;
            return this;
        }
        
        public b d(final long n) {
            g0.a.a(n > 0L);
            this.e = M.J0(n);
            return this;
        }
        
        public b e(final float g) {
            g0.a.a(g >= 0.0f && g < 1.0f);
            this.g = g;
            return this;
        }
        
        public b f(final long c) {
            g0.a.a(c > 0L);
            this.c = c;
            return this;
        }
        
        public b g(final float n) {
            g0.a.a(n > 0.0f);
            this.d = n / 1000000.0f;
            return this;
        }
        
        public b h(final long n) {
            g0.a.a(n >= 0L);
            this.f = M.J0(n);
            return this;
        }
    }
}
