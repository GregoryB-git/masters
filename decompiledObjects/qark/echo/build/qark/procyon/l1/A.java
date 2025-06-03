// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l1;

import F0.L;
import g0.M;
import F0.s;
import g0.z;
import g0.E;

public final class A
{
    public final E a;
    public final z b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public long g;
    public long h;
    
    public A() {
        this.a = new E(0L);
        this.f = -9223372036854775807L;
        this.g = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.b = new z();
    }
    
    public static boolean a(final byte[] array) {
        boolean b = false;
        if ((array[0] & 0xC4) != 0x44) {
            return false;
        }
        if ((array[2] & 0x4) != 0x4) {
            return false;
        }
        if ((array[4] & 0x4) != 0x4) {
            return false;
        }
        if ((array[5] & 0x1) != 0x1) {
            return false;
        }
        if ((array[8] & 0x3) == 0x3) {
            b = true;
        }
        return b;
    }
    
    public static long l(final z z) {
        final int f = z.f();
        if (z.a() < 9) {
            return -9223372036854775807L;
        }
        final byte[] array = new byte[9];
        z.l(array, 0, 9);
        z.T(f);
        if (!a(array)) {
            return -9223372036854775807L;
        }
        return m(array);
    }
    
    public static long m(final byte[] array) {
        final byte b = array[0];
        final long n = b;
        final long n2 = b;
        final long n3 = array[1];
        final byte b2 = array[2];
        return (n & 0x38L) >> 3 << 30 | (n2 & 0x3L) << 28 | (n3 & 0xFFL) << 20 | ((long)b2 & 0xF8L) >> 3 << 15 | ((long)b2 & 0x3L) << 13 | ((long)array[3] & 0xFFL) << 5 | ((long)array[4] & 0xF8L) >> 3;
    }
    
    public final int b(final s s) {
        this.b.Q(M.f);
        this.c = true;
        s.h();
        return 0;
    }
    
    public long c() {
        return this.h;
    }
    
    public E d() {
        return this.a;
    }
    
    public boolean e() {
        return this.c;
    }
    
    public final int f(final byte[] array, final int n) {
        return (array[n + 3] & 0xFF) | ((array[n] & 0xFF) << 24 | (array[n + 1] & 0xFF) << 16 | (array[n + 2] & 0xFF) << 8);
    }
    
    public int g(final s s, final L l) {
        if (!this.e) {
            return this.j(s, l);
        }
        if (this.g == -9223372036854775807L) {
            return this.b(s);
        }
        if (!this.d) {
            return this.h(s, l);
        }
        final long f = this.f;
        if (f == -9223372036854775807L) {
            return this.b(s);
        }
        this.h = this.a.c(this.g) - this.a.b(f);
        return this.b(s);
    }
    
    public final int h(final s s, final L l) {
        final int n = (int)Math.min(20000L, s.a());
        final long p2 = s.p();
        final long a = 0;
        if (p2 != a) {
            l.a = a;
            return 1;
        }
        this.b.P(n);
        s.h();
        s.n(this.b.e(), 0, n);
        this.f = this.i(this.b);
        this.d = true;
        return 0;
    }
    
    public final long i(final z z) {
        for (int i = z.f(); i < z.g() - 3; ++i) {
            if (this.f(z.e(), i) == 442) {
                z.T(i + 4);
                final long l = l(z);
                if (l != -9223372036854775807L) {
                    return l;
                }
            }
        }
        return -9223372036854775807L;
    }
    
    public final int j(final s s, final L l) {
        final long a = s.a();
        final int n = (int)Math.min(20000L, a);
        final long a2 = a - n;
        if (s.p() != a2) {
            l.a = a2;
            return 1;
        }
        this.b.P(n);
        s.h();
        s.n(this.b.e(), 0, n);
        this.g = this.k(this.b);
        this.e = true;
        return 0;
    }
    
    public final long k(final z z) {
        for (int f = z.f(), i = z.g() - 4; i >= f; --i) {
            if (this.f(z.e(), i) == 442) {
                z.T(i + 4);
                final long l = l(z);
                if (l != -9223372036854775807L) {
                    return l;
                }
            }
        }
        return -9223372036854775807L;
    }
}
