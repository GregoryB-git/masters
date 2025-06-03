// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

import d0.A;
import g0.M;
import g0.z;

public abstract class y
{
    public static boolean a(final z z, final B b, int j) {
        j = j(z, j);
        return j != -1 && j <= b.b;
    }
    
    public static boolean b(final z z, final int n) {
        return z.G() == M.y(z.e(), n, z.f() - 1, 0);
    }
    
    public static boolean c(final z z, final B b, final boolean b2, final a a) {
        try {
            long n = z.N();
            if (!b2) {
                n *= b.b;
            }
            a.a = n;
            return true;
        }
        catch (NumberFormatException ex) {
            return false;
        }
    }
    
    public static boolean d(final z z, final B b, int n, final a a) {
        final int f = z.f();
        final long i = z.I();
        final long n2 = i >>> 16;
        final long n3 = n;
        final boolean b2 = false;
        if (n2 != n3) {
            return false;
        }
        final boolean b3 = (n2 & 0x1L) == 0x1L;
        final int n4 = (int)(i >> 12 & 0xFL);
        final int n5 = (int)(i >> 8 & 0xFL);
        final int n6 = (int)(i >> 4 & 0xFL);
        final int n7 = (int)(i >> 1 & 0x7L);
        if ((i & 0x1L) == 0x1L) {
            n = 1;
        }
        else {
            n = 0;
        }
        boolean b4 = b2;
        if (g(n6, b)) {
            b4 = b2;
            if (f(n7, b)) {
                b4 = b2;
                if (n == 0) {
                    b4 = b2;
                    if (c(z, b, b3, a)) {
                        b4 = b2;
                        if (a(z, b, n4)) {
                            b4 = b2;
                            if (e(z, b, n5)) {
                                b4 = b2;
                                if (b(z, f)) {
                                    b4 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return b4;
    }
    
    public static boolean e(final z z, final B b, final int n) {
        final int e = b.e;
        if (n == 0) {
            return true;
        }
        if (n <= 11) {
            return n == b.f;
        }
        if (n == 12) {
            return z.G() * 1000 == e;
        }
        if (n <= 14) {
            int m = z.M();
            if (n == 14) {
                m *= 10;
            }
            return m == e;
        }
        return false;
    }
    
    public static boolean f(final int n, final B b) {
        return n == 0 || n == b.i;
    }
    
    public static boolean g(final int n, final B b) {
        final boolean b2 = false;
        boolean b3 = false;
        if (n <= 7) {
            if (n == b.g - 1) {
                b3 = true;
            }
            return b3;
        }
        boolean b4 = b2;
        if (n <= 10) {
            b4 = b2;
            if (b.g == 2) {
                b4 = true;
            }
        }
        return b4;
    }
    
    public static boolean h(final s s, final B b, final int n, final a a) {
        final long m = s.m();
        final byte[] array = new byte[2];
        s.n(array, 0, 2);
        if (((array[0] & 0xFF) << 8 | (array[1] & 0xFF)) != n) {
            s.h();
            s.o((int)(m - s.p()));
            return false;
        }
        final z z = new z(16);
        System.arraycopy(array, 0, z.e(), 0, 2);
        z.S(u.c(s, z.e(), 2, 14));
        s.h();
        s.o((int)(m - s.p()));
        return d(z, b, n, a);
    }
    
    public static long i(final s s, final B b) {
        s.h();
        boolean b2 = true;
        s.o(1);
        final byte[] array = { 0 };
        s.n(array, 0, 1);
        if ((array[0] & 0x1) != 0x1) {
            b2 = false;
        }
        s.o(2);
        int n;
        if (b2) {
            n = 7;
        }
        else {
            n = 6;
        }
        final z z = new z(n);
        z.S(u.c(s, z.e(), 0, n));
        s.h();
        final a a = new a();
        if (c(z, b, b2, a)) {
            return a.a;
        }
        throw A.a(null, null);
    }
    
    public static int j(final z z, final int n) {
        switch (n) {
            default: {
                return -1;
            }
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15: {
                return 256 << n - 8;
            }
            case 7: {
                return z.M() + 1;
            }
            case 6: {
                return z.G() + 1;
            }
            case 2:
            case 3:
            case 4:
            case 5: {
                return 576 << n - 2;
            }
            case 1: {
                return 192;
            }
        }
    }
    
    public static final class a
    {
        public long a;
    }
}
