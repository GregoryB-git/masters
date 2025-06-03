// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l1;

import g0.M;
import F0.s;
import g0.E;
import F0.e;

public final class z extends e
{
    public z(final E e, final long n, final long n2) {
        super((d)new F0.e.b(), (f)new b(e, null), n, 0L, n + 1L, 0L, n2, 188L, 1000);
    }
    
    public static int k(final byte[] array, final int n) {
        return (array[n + 3] & 0xFF) | ((array[n] & 0xFF) << 24 | (array[n + 1] & 0xFF) << 16 | (array[n + 2] & 0xFF) << 8);
    }
    
    public static final class b implements f
    {
        public final E a;
        public final g0.z b;
        
        public b(final E a) {
            this.a = a;
            this.b = new g0.z();
        }
        
        public static void d(final g0.z z) {
            final int g = z.g();
            if (z.a() < 10) {
                z.T(g);
                return;
            }
            z.U(9);
            final int n = z.G() & 0x7;
            if (z.a() < n) {
                z.T(g);
                return;
            }
            z.U(n);
            if (z.a() < 4) {
                z.T(g);
                return;
            }
            if (k(z.e(), z.f()) == 443) {
                z.U(4);
                final int m = z.M();
                if (z.a() < m) {
                    z.T(g);
                    return;
                }
                z.U(m);
            }
            while (z.a() >= 4) {
                final int j = k(z.e(), z.f());
                if (j == 442) {
                    break;
                }
                if (j == 441) {
                    return;
                }
                if (j >>> 8 != 1) {
                    return;
                }
                z.U(4);
                if (z.a() < 2) {
                    z.T(g);
                    return;
                }
                z.T(Math.min(z.g(), z.f() + z.M()));
            }
        }
        
        @Override
        public e a(final s s, final long n) {
            final long p2 = s.p();
            final int n2 = (int)Math.min(20000L, s.a() - p2);
            this.b.P(n2);
            s.n(this.b.e(), 0, n2);
            return this.c(this.b, n, p2);
        }
        
        @Override
        public void b() {
            this.b.Q(M.f);
        }
        
        public final e c(final g0.z z, final long n, final long n2) {
            int f = -1;
            int n3 = -1;
            long n4 = -9223372036854775807L;
            while (z.a() >= 4) {
                if (k(z.e(), z.f()) != 442) {
                    z.U(1);
                }
                else {
                    z.U(4);
                    final long l = A.l(z);
                    int f2 = n3;
                    long b = n4;
                    if (l != -9223372036854775807L) {
                        b = this.a.b(l);
                        if (b > n) {
                            if (n4 == -9223372036854775807L) {
                                return e.d(b, n2);
                            }
                            return e.e(n2 + n3);
                        }
                        else {
                            if (100000L + b > n) {
                                return e.e(n2 + z.f());
                            }
                            f2 = z.f();
                        }
                    }
                    d(z);
                    f = z.f();
                    n3 = f2;
                    n4 = b;
                }
            }
            if (n4 != -9223372036854775807L) {
                return e.f(n4, n2 + f);
            }
            return e.d;
        }
    }
}
