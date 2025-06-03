// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

import g0.a;

public abstract class e
{
    public final a a;
    public final f b;
    public c c;
    public final int d;
    
    public e(final d d, final f b, final long n, final long n2, final long n3, final long n4, final long n5, final long n6, final int d2) {
        this.b = b;
        this.d = d2;
        this.a = new a(d, n, n2, n3, n4, n5, n6);
    }
    
    public c a(final long n) {
        return new c(n, this.a.i(n), F0.e.a.a(this.a), F0.e.a.b(this.a), F0.e.a.d(this.a), F0.e.a.e(this.a), F0.e.a.g(this.a));
    }
    
    public final M b() {
        return this.a;
    }
    
    public int c(final s s, final L l) {
        while (true) {
            final c c = (c)g0.a.h(this.c);
            final long b = c.j();
            final long c2 = c.i();
            final long d = c.k();
            if (c2 - b <= this.d) {
                this.e(false, b);
                return this.g(s, b, l);
            }
            if (!this.i(s, d)) {
                return this.g(s, d, l);
            }
            s.h();
            final e a = this.b.a(s, c.m());
            final int a2 = e.a(a);
            if (a2 == -3) {
                this.e(false, d);
                return this.g(s, d, l);
            }
            if (a2 != -2) {
                if (a2 != -1) {
                    if (a2 == 0) {
                        this.i(s, e.c(a));
                        this.e(true, e.c(a));
                        return this.g(s, e.c(a), l);
                    }
                    throw new IllegalStateException("Invalid case");
                }
                else {
                    c.o(e.b(a), e.c(a));
                }
            }
            else {
                c.p(e.b(a), e.c(a));
            }
        }
    }
    
    public final boolean d() {
        return this.c != null;
    }
    
    public final void e(final boolean b, final long n) {
        this.c = null;
        this.b.b();
        this.f(b, n);
    }
    
    public void f(final boolean b, final long n) {
    }
    
    public final int g(final s s, final long a, final L l) {
        if (a == s.p()) {
            return 0;
        }
        l.a = a;
        return 1;
    }
    
    public final void h(final long n) {
        final c c = this.c;
        if (c != null && c.l() == n) {
            return;
        }
        this.c = this.a(n);
    }
    
    public final boolean i(final s s, long n) {
        n -= s.p();
        if (n >= 0L && n <= 262144L) {
            s.i((int)n);
            return true;
        }
        return false;
    }
    
    public static class a implements M
    {
        public final d a;
        public final long b;
        public final long c;
        public final long d;
        public final long e;
        public final long f;
        public final long g;
        
        public a(final d a, final long b, final long c, final long d, final long e, final long f, final long g) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
        }
        
        public static /* synthetic */ long a(final a a) {
            return a.c;
        }
        
        public static /* synthetic */ long b(final a a) {
            return a.d;
        }
        
        public static /* synthetic */ long d(final a a) {
            return a.e;
        }
        
        public static /* synthetic */ long e(final a a) {
            return a.f;
        }
        
        public static /* synthetic */ long g(final a a) {
            return a.g;
        }
        
        @Override
        public boolean h() {
            return true;
        }
        
        public long i(final long n) {
            return this.a.a(n);
        }
        
        @Override
        public M.a j(final long n) {
            return new M.a(new N(n, F0.e.c.h(this.a.a(n), this.c, this.d, this.e, this.f, this.g)));
        }
        
        @Override
        public long l() {
            return this.b;
        }
    }
    
    public static final class b implements d
    {
        @Override
        public long a(final long n) {
            return n;
        }
    }
    
    public static class c
    {
        public final long a;
        public final long b;
        public final long c;
        public long d;
        public long e;
        public long f;
        public long g;
        public long h;
        
        public c(final long a, final long b, final long d, final long e, final long f, final long g, final long c) {
            this.a = a;
            this.b = b;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.c = c;
            this.h = h(b, d, e, f, g, c);
        }
        
        public static long h(long n, final long n2, final long n3, final long n4, final long n5, final long n6) {
            if (n4 + 1L >= n5) {
                return n4;
            }
            if (n2 + 1L >= n3) {
                return n4;
            }
            n = (long)((n - n2) * ((n5 - n4) / (float)(n3 - n2)));
            return g0.M.q(n + n4 - n6 - n / 20L, n4, n5 - 1L);
        }
        
        public final long i() {
            return this.g;
        }
        
        public final long j() {
            return this.f;
        }
        
        public final long k() {
            return this.h;
        }
        
        public final long l() {
            return this.a;
        }
        
        public final long m() {
            return this.b;
        }
        
        public final void n() {
            this.h = h(this.b, this.d, this.e, this.f, this.g, this.c);
        }
        
        public final void o(final long e, final long g) {
            this.e = e;
            this.g = g;
            this.n();
        }
        
        public final void p(final long d, final long f) {
            this.d = d;
            this.f = f;
            this.n();
        }
    }
    
    public interface d
    {
        long a(final long p0);
    }
    
    public static final class e
    {
        public static final e d;
        public final int a;
        public final long b;
        public final long c;
        
        static {
            d = new e(-3, -9223372036854775807L, -1L);
        }
        
        public e(final int a, final long b, final long c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public static /* synthetic */ int a(final e e) {
            return e.a;
        }
        
        public static /* synthetic */ long b(final e e) {
            return e.b;
        }
        
        public static /* synthetic */ long c(final e e) {
            return e.c;
        }
        
        public static e d(final long n, final long n2) {
            return new e(-1, n, n2);
        }
        
        public static e e(final long n) {
            return new e(0, -9223372036854775807L, n);
        }
        
        public static e f(final long n, final long n2) {
            return new e(-2, n, n2);
        }
    }
    
    public interface f
    {
        e a(final s p0, final long p1);
        
        void b();
    }
}
