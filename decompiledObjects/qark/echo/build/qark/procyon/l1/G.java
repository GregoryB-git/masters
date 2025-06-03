// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l1;

import g0.M;
import F0.s;
import g0.z;
import g0.E;
import F0.e;

public final class G extends e
{
    public G(final E e, final long n, final long n2, final int n3, final int n4) {
        super((d)new b(), (f)new a(n3, e, n4), n, 0L, n + 1L, 0L, n2, 188L, 940);
    }
    
    public static final class a implements f
    {
        public final E a;
        public final z b;
        public final int c;
        public final int d;
        
        public a(final int c, final E a, final int d) {
            this.c = c;
            this.a = a;
            this.d = d;
            this.b = new z();
        }
        
        @Override
        public e a(final s s, final long n) {
            final long p2 = s.p();
            final int n2 = (int)Math.min(this.d, s.a() - p2);
            this.b.P(n2);
            s.n(this.b.e(), 0, n2);
            return this.c(this.b, n, p2);
        }
        
        @Override
        public void b() {
            this.b.Q(M.f);
        }
        
        public final e c(final z z, final long n, final long n2) {
            final int g = z.g();
            long n3 = -1L;
            long n4 = -1L;
            long n5 = -9223372036854775807L;
            while (z.a() >= 188) {
                final int a = L.a(z.e(), z.f(), g);
                final int n6 = a + 188;
                if (n6 > g) {
                    break;
                }
                final long c = L.c(z, a, this.c);
                long n7 = n4;
                long b = n5;
                if (c != -9223372036854775807L) {
                    b = this.a.b(c);
                    if (b > n) {
                        if (n5 == -9223372036854775807L) {
                            return e.d(b, n2);
                        }
                        return e.e(n2 + n4);
                    }
                    else {
                        if (100000L + b > n) {
                            return e.e(n2 + a);
                        }
                        n7 = a;
                    }
                }
                z.T(n6);
                n3 = n6;
                n4 = n7;
                n5 = b;
            }
            if (n5 != -9223372036854775807L) {
                return e.f(n5, n2 + n3);
            }
            return e.d;
        }
    }
}
