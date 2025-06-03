// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.crypto.tink.shaded.protobuf;

public abstract class e
{
    public static int A(final int n, final byte[] array, int n2, final int n3, final z.d d, final a a) {
        final F f = (F)d;
        n2 = K(array, n2, a);
        while (true) {
            f.d(i.c(a.b));
            if (n2 >= n3) {
                return n2;
            }
            final int h = H(array, n2, a);
            if (n != a.a) {
                return n2;
            }
            n2 = K(array, h, a);
        }
    }
    
    public static int B(final byte[] bytes, int h, final a a) {
        h = H(bytes, h, a);
        final int a2 = a.a;
        if (a2 < 0) {
            throw A.g();
        }
        if (a2 == 0) {
            a.c = "";
            return h;
        }
        a.c = new String(bytes, h, a2, z.b);
        return h + a2;
    }
    
    public static int C(final int n, final byte[] array, int n2, final int n3, final z.d d, final a a) {
        n2 = H(array, n2, a);
        final int a2 = a.a;
        if (a2 < 0) {
            throw A.g();
        }
    Label_0025_Outer:
        while (true) {
            if (a2 != 0) {
                final String s = new String(array, n2, a2, z.b);
                final int h = n2;
                n2 = a2;
                break Label_0060;
            }
            int h;
            while (true) {
                d.add("");
                Label_0075: {
                    break Label_0075;
                    final String s;
                    d.add(s);
                    n2 += h;
                }
                if (n2 >= n3) {
                    return n2;
                }
                final int h2 = H(array, n2, a);
                if (n != a.a) {
                    return n2;
                }
                h = H(array, h2, a);
                n2 = a.a;
                if (n2 < 0) {
                    throw A.g();
                }
                if (n2 == 0) {
                    n2 = h;
                    continue;
                }
                break;
            }
            final String s = new String(array, h, n2, z.b);
            continue Label_0025_Outer;
        }
    }
    
    public static int D(final int n, final byte[] array, int n2, final int n3, final z.d d, final a a) {
        n2 = H(array, n2, a);
        final int a2 = a.a;
        if (a2 < 0) {
            throw A.g();
        }
    Label_0025_Outer:
        while (true) {
            if (a2 != 0) {
                final int n4 = n2 + a2;
                if (p0.n(array, n2, n4)) {
                    final String s = new String(array, n2, a2, z.b);
                    n2 = n4;
                    break Label_0073;
                }
                throw A.d();
            }
            int a3;
            while (true) {
                d.add("");
                Label_0083: {
                    break Label_0083;
                    final String s;
                    d.add(s);
                }
                if (n2 >= n3) {
                    return n2;
                }
                final int h = H(array, n2, a);
                if (n != a.a) {
                    return n2;
                }
                n2 = H(array, h, a);
                a3 = a.a;
                if (a3 < 0) {
                    throw A.g();
                }
                if (a3 == 0) {
                    continue;
                }
                break;
            }
            final int n5 = n2 + a3;
            if (p0.n(array, n2, n5)) {
                final String s = new String(array, n2, a3, z.b);
                n2 = n5;
                continue Label_0025_Outer;
            }
            break;
        }
        throw A.d();
    }
    
    public static int E(final byte[] array, int h, final a a) {
        h = H(array, h, a);
        final int a2 = a.a;
        if (a2 < 0) {
            throw A.g();
        }
        if (a2 == 0) {
            a.c = "";
            return h;
        }
        a.c = p0.e(array, h, a2);
        return h + a2;
    }
    
    public static int F(final int n, final byte[] array, int n2, int a, final l0 l0, final a a2) {
        if (q0.a(n) == 0) {
            throw A.c();
        }
        final int b = q0.b(n);
        if (b == 0) {
            n2 = K(array, n2, a2);
            l0.n(n, a2.b);
            return n2;
        }
        if (b == 1) {
            l0.n(n, i(array, n2));
            return n2 + 8;
        }
        if (b != 2) {
            if (b != 3) {
                if (b == 5) {
                    l0.n(n, g(array, n2));
                    return n2 + 4;
                }
                throw A.c();
            }
            else {
                final l0 k = l0.k();
                final int n3 = (n & 0xFFFFFFF8) | 0x4;
                int n4 = 0;
                int n5;
                while (true) {
                    n5 = n2;
                    if (n2 >= a) {
                        break;
                    }
                    final int h = H(array, n2, a2);
                    n2 = a2.a;
                    if ((n4 = n2) == n3) {
                        n2 = (n5 = h);
                        break;
                    }
                    final int f = F(n4, array, h, a, k, a2);
                    n4 = n2;
                    n2 = f;
                }
                if (n5 <= a && n4 == n3) {
                    l0.n(n, k);
                    return n5;
                }
                throw A.h();
            }
        }
        else {
            n2 = H(array, n2, a2);
            a = a2.a;
            if (a < 0) {
                throw A.g();
            }
            if (a <= array.length - n2) {
                h h2;
                if (a == 0) {
                    h2 = h.p;
                }
                else {
                    h2 = h.k(array, n2, a);
                }
                l0.n(n, h2);
                return n2 + a;
            }
            throw A.m();
        }
    }
    
    public static int G(int n, final byte[] array, int n2, final a a) {
        final int n3 = n & 0x7F;
        n = n2 + 1;
        final byte b = array[n2];
        int n4;
        if (b >= 0) {
            n4 = b << 7;
            n2 = n3;
        }
        else {
            final int n5 = n3 | (b & 0x7F) << 7;
            final int n6 = n2 + 2;
            n = array[n];
            if (n >= 0) {
                a.a = (n5 | n << 14);
                return n6;
            }
            final int n7 = n5 | (n & 0x7F) << 14;
            n = n2 + 3;
            final byte b2 = array[n6];
            if (b2 >= 0) {
                final int n8 = b2 << 21;
                n2 = n7;
                n4 = n8;
            }
            else {
                final int n9 = n7 | (b2 & 0x7F) << 21;
                n2 += 4;
                final byte b3 = array[n];
                if (b3 >= 0) {
                    a.a = (n9 | b3 << 28);
                    return n2;
                }
                n = n2;
                while (true) {
                    n2 = n + 1;
                    if (array[n] >= 0) {
                        break;
                    }
                    n = n2;
                }
                a.a = (n9 | (b3 & 0x7F) << 28);
                return n2;
            }
        }
        a.a = (n2 | n4);
        return n;
    }
    
    public static int H(final byte[] array, int a, final a a2) {
        final int n = a + 1;
        a = array[a];
        if (a >= 0) {
            a2.a = a;
            return n;
        }
        return G(a, array, n, a2);
    }
    
    public static int I(final int n, final byte[] array, int n2, final int n3, final z.d d, final a a) {
        final y y = (y)d;
        n2 = H(array, n2, a);
        while (true) {
            y.z(a.a);
            if (n2 >= n3) {
                return n2;
            }
            final int h = H(array, n2, a);
            if (n != a.a) {
                return n2;
            }
            n2 = H(array, h, a);
        }
    }
    
    public static int J(long b, final byte[] array, int n, final a a) {
        final int n2 = n + 1;
        byte b2;
        int n3;
        for (b2 = array[n], b = ((b & 0x7FL) | (long)(b2 & 0x7F) << 7), n3 = 7, n = n2; b2 < 0; b2 = array[n], n3 += 7, b |= (long)(b2 & 0x7F) << n3, ++n) {}
        a.b = b;
        return n;
    }
    
    public static int K(final byte[] array, final int n, final a a) {
        final int n2 = n + 1;
        final long b = array[n];
        if (b >= 0L) {
            a.b = b;
            return n2;
        }
        return J(b, array, n2, a);
    }
    
    public static int L(final int n, final byte[] array, int n2, final int n3, final z.d d, final a a) {
        final F f = (F)d;
        n2 = K(array, n2, a);
        while (true) {
            f.d(a.b);
            if (n2 >= n3) {
                return n2;
            }
            final int h = H(array, n2, a);
            if (n != a.a) {
                return n2;
            }
            n2 = K(array, h, a);
        }
    }
    
    public static int M(final Object c, final e0 e0, final byte[] array, int f0, final int n, final int n2, final a a) {
        f0 = ((S)e0).f0(c, array, f0, n, n2, a);
        a.c = c;
        return f0;
    }
    
    public static int N(final Object c, final e0 e0, final byte[] array, int g, int n, final a a) {
        final int n2 = g + 1;
        final byte b = array[g];
        g = n2;
        int a2 = b;
        if (b < 0) {
            g = G(b, array, n2, a);
            a2 = a.a;
        }
        if (a2 >= 0 && a2 <= n - g) {
            n = a2 + g;
            e0.h(c, array, g, n, a);
            a.c = c;
            return n;
        }
        throw A.m();
    }
    
    public static int a(final int n, final byte[] array, int n2, final int n3, final z.d d, final a a) {
        final f f = (f)d;
        final int n4 = n2 = K(array, n2, a);
    Label_0032_Outer:
        while (true) {
            if (a.b == 0L) {
                break Label_0038;
            }
            n2 = n4;
            while (true) {
                boolean b = true;
                Label_0041: {
                    break Label_0041;
                    b = false;
                }
                f.d(b);
                if (n2 >= n3) {
                    return n2;
                }
                final int h = H(array, n2, a);
                if (n != a.a) {
                    return n2;
                }
                final int n5 = n2 = K(array, h, a);
                if (a.b != 0L) {
                    n2 = n5;
                    continue;
                }
                break;
            }
            continue Label_0032_Outer;
        }
    }
    
    public static int b(final byte[] array, int h, final a a) {
        h = H(array, h, a);
        final int a2 = a.a;
        if (a2 < 0) {
            throw A.g();
        }
        if (a2 > array.length - h) {
            throw A.m();
        }
        if (a2 == 0) {
            a.c = h.p;
            return h;
        }
        a.c = h.k(array, h, a2);
        return h + a2;
    }
    
    public static int c(final int n, final byte[] array, int n2, final int n3, final z.d d, final a a) {
        final int h = H(array, n2, a);
        final int a2 = a.a;
        if (a2 < 0) {
            throw A.g();
        }
        if (a2 > array.length - h) {
            throw A.m();
        }
        n2 = a2;
        int n4 = h;
    Label_0046_Outer:
        while (true) {
            if (a2 != 0) {
                break Label_0060;
            }
            n2 = h;
            while (true) {
                d.add(com.google.crypto.tink.shaded.protobuf.h.p);
                Label_0080: {
                    break Label_0080;
                    d.add(com.google.crypto.tink.shaded.protobuf.h.k(array, n4, n2));
                    n2 += n4;
                }
                if (n2 >= n3) {
                    return n2;
                }
                final int h2 = H(array, n2, a);
                if (n != a.a) {
                    return n2;
                }
                final int h3 = H(array, h2, a);
                final int a3 = a.a;
                if (a3 < 0) {
                    throw A.g();
                }
                if (a3 > array.length - h3) {
                    throw A.m();
                }
                n2 = a3;
                n4 = h3;
                if (a3 == 0) {
                    n2 = h3;
                    continue;
                }
                break;
            }
            continue Label_0046_Outer;
        }
    }
    
    public static double d(final byte[] array, final int n) {
        return Double.longBitsToDouble(i(array, n));
    }
    
    public static int e(final int n, final byte[] array, int i, final int n2, final z.d d, final a a) {
        final m m = (m)d;
        m.d(d(array, i));
        int h;
        for (i += 8; i < n2; i = h + 8) {
            h = H(array, i, a);
            if (n != a.a) {
                return i;
            }
            m.d(d(array, h));
        }
        return i;
    }
    
    public static int f(final int n, final byte[] array, final int n2, final int n3, final Object o, final O o2, final k0 k0, final a a) {
        a.d.a(o2, n >>> 3);
        return F(n, array, n2, n3, S.v(o), a);
    }
    
    public static int g(final byte[] array, final int n) {
        return (array[n + 3] & 0xFF) << 24 | ((array[n] & 0xFF) | (array[n + 1] & 0xFF) << 8 | (array[n + 2] & 0xFF) << 16);
    }
    
    public static int h(final int n, final byte[] array, int i, final int n2, final z.d d, final a a) {
        final y y = (y)d;
        y.z(g(array, i));
        int h;
        for (i += 4; i < n2; i = h + 4) {
            h = H(array, i, a);
            if (n != a.a) {
                return i;
            }
            y.z(g(array, h));
        }
        return i;
    }
    
    public static long i(final byte[] array, final int n) {
        return ((long)array[n + 7] & 0xFFL) << 56 | (((long)array[n] & 0xFFL) | ((long)array[n + 1] & 0xFFL) << 8 | ((long)array[n + 2] & 0xFFL) << 16 | ((long)array[n + 3] & 0xFFL) << 24 | ((long)array[n + 4] & 0xFFL) << 32 | ((long)array[n + 5] & 0xFFL) << 40 | ((long)array[n + 6] & 0xFFL) << 48);
    }
    
    public static int j(final int n, final byte[] array, int i, final int n2, final z.d d, final a a) {
        final F f = (F)d;
        f.d(i(array, i));
        int h;
        for (i += 8; i < n2; i = h + 8) {
            h = H(array, i, a);
            if (n != a.a) {
                return i;
            }
            f.d(i(array, h));
        }
        return i;
    }
    
    public static float k(final byte[] array, final int n) {
        return Float.intBitsToFloat(g(array, n));
    }
    
    public static int l(final int n, final byte[] array, int i, final int n2, final z.d d, final a a) {
        final v v = (v)d;
        v.d(k(array, i));
        int h;
        for (i += 4; i < n2; i = h + 4) {
            h = H(array, i, a);
            if (n != a.a) {
                return i;
            }
            v.d(k(array, h));
        }
        return i;
    }
    
    public static int m(final e0 e0, final byte[] array, int m, final int n, final int n2, final a a) {
        final Object f = e0.f();
        m = M(f, e0, array, m, n, n2, a);
        e0.b(f);
        a.c = f;
        return m;
    }
    
    public static int n(final e0 e0, final int n, final byte[] array, int n2, final int n3, final z.d d, final a a) {
        final int n4 = (n & 0xFFFFFFF8) | 0x4;
        n2 = m(e0, array, n2, n3, n4, a);
        while (true) {
            d.add(a.c);
            if (n2 >= n3) {
                return n2;
            }
            final int h = H(array, n2, a);
            if (n != a.a) {
                return n2;
            }
            n2 = m(e0, array, h, n3, n4, a);
        }
    }
    
    public static int o(final e0 e0, final byte[] array, int n, final int n2, final a a) {
        final Object f = e0.f();
        n = N(f, e0, array, n, n2, a);
        e0.b(f);
        a.c = f;
        return n;
    }
    
    public static int p(final e0 e0, final int n, final byte[] array, int n2, final int n3, final z.d d, final a a) {
        n2 = o(e0, array, n2, n3, a);
        while (true) {
            d.add(a.c);
            if (n2 >= n3) {
                return n2;
            }
            final int h = H(array, n2, a);
            if (n != a.a) {
                return n2;
            }
            n2 = o(e0, array, h, n3, a);
        }
    }
    
    public static int q(final byte[] array, int i, final z.d d, final a a) {
        final f f = (f)d;
        i = H(array, i, a);
        final int n = a.a + i;
        while (i < n) {
            i = K(array, i, a);
            f.d(a.b != 0L);
        }
        if (i == n) {
            return i;
        }
        throw A.m();
    }
    
    public static int r(final byte[] array, int i, final z.d d, final a a) {
        final m m = (m)d;
        int n;
        for (i = H(array, i, a), n = a.a + i; i < n; i += 8) {
            m.d(d(array, i));
        }
        if (i == n) {
            return i;
        }
        throw A.m();
    }
    
    public static int s(final byte[] array, int i, final z.d d, final a a) {
        final y y = (y)d;
        int n;
        for (i = H(array, i, a), n = a.a + i; i < n; i += 4) {
            y.z(g(array, i));
        }
        if (i == n) {
            return i;
        }
        throw A.m();
    }
    
    public static int t(final byte[] array, int i, final z.d d, final a a) {
        final F f = (F)d;
        int n;
        for (i = H(array, i, a), n = a.a + i; i < n; i += 8) {
            f.d(i(array, i));
        }
        if (i == n) {
            return i;
        }
        throw A.m();
    }
    
    public static int u(final byte[] array, int i, final z.d d, final a a) {
        final v v = (v)d;
        int n;
        for (i = H(array, i, a), n = a.a + i; i < n; i += 4) {
            v.d(k(array, i));
        }
        if (i == n) {
            return i;
        }
        throw A.m();
    }
    
    public static int v(final byte[] array, int i, final z.d d, final a a) {
        final y y = (y)d;
        i = H(array, i, a);
        final int n = a.a + i;
        while (i < n) {
            i = H(array, i, a);
            y.z(i.b(a.a));
        }
        if (i == n) {
            return i;
        }
        throw A.m();
    }
    
    public static int w(final byte[] array, int i, final z.d d, final a a) {
        final F f = (F)d;
        i = H(array, i, a);
        final int n = a.a + i;
        while (i < n) {
            i = K(array, i, a);
            f.d(i.c(a.b));
        }
        if (i == n) {
            return i;
        }
        throw A.m();
    }
    
    public static int x(final byte[] array, int i, final z.d d, final a a) {
        final y y = (y)d;
        i = H(array, i, a);
        final int n = a.a + i;
        while (i < n) {
            i = H(array, i, a);
            y.z(a.a);
        }
        if (i == n) {
            return i;
        }
        throw A.m();
    }
    
    public static int y(final byte[] array, int i, final z.d d, final a a) {
        final F f = (F)d;
        i = H(array, i, a);
        final int n = a.a + i;
        while (i < n) {
            i = K(array, i, a);
            f.d(a.b);
        }
        if (i == n) {
            return i;
        }
        throw A.m();
    }
    
    public static int z(final int n, final byte[] array, int n2, final int n3, final z.d d, final a a) {
        final y y = (y)d;
        n2 = H(array, n2, a);
        while (true) {
            y.z(i.b(a.a));
            if (n2 >= n3) {
                return n2;
            }
            final int h = H(array, n2, a);
            if (n != a.a) {
                return n2;
            }
            n2 = H(array, h, a);
        }
    }
    
    public static final class a
    {
        public int a;
        public long b;
        public Object c;
        public final p d;
        
        public a(final p d) {
            d.getClass();
            this.d = d;
        }
    }
}
