// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package h5;

import V4.h;
import g5.c;
import Y4.a;

public abstract class e
{
    public static final int[][] a;
    public static final int[][] b;
    public static final int[][] c;
    public static final int[][] d;
    
    static {
        a = new int[][] { { 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 0, 0, 1 }, { 1, 0, 1, 1, 1, 0, 1 }, { 1, 0, 1, 1, 1, 0, 1 }, { 1, 0, 1, 1, 1, 0, 1 }, { 1, 0, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1, 1 } };
        b = new int[][] { { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1 } };
        c = new int[][] { { -1, -1, -1, -1, -1, -1, -1 }, { 6, 18, -1, -1, -1, -1, -1 }, { 6, 22, -1, -1, -1, -1, -1 }, { 6, 26, -1, -1, -1, -1, -1 }, { 6, 30, -1, -1, -1, -1, -1 }, { 6, 34, -1, -1, -1, -1, -1 }, { 6, 22, 38, -1, -1, -1, -1 }, { 6, 24, 42, -1, -1, -1, -1 }, { 6, 26, 46, -1, -1, -1, -1 }, { 6, 28, 50, -1, -1, -1, -1 }, { 6, 30, 54, -1, -1, -1, -1 }, { 6, 32, 58, -1, -1, -1, -1 }, { 6, 34, 62, -1, -1, -1, -1 }, { 6, 26, 46, 66, -1, -1, -1 }, { 6, 26, 48, 70, -1, -1, -1 }, { 6, 26, 50, 74, -1, -1, -1 }, { 6, 30, 54, 78, -1, -1, -1 }, { 6, 30, 56, 82, -1, -1, -1 }, { 6, 30, 58, 86, -1, -1, -1 }, { 6, 34, 62, 90, -1, -1, -1 }, { 6, 28, 50, 72, 94, -1, -1 }, { 6, 26, 50, 74, 98, -1, -1 }, { 6, 30, 54, 78, 102, -1, -1 }, { 6, 28, 54, 80, 106, -1, -1 }, { 6, 32, 58, 84, 110, -1, -1 }, { 6, 30, 58, 86, 114, -1, -1 }, { 6, 34, 62, 90, 118, -1, -1 }, { 6, 26, 50, 74, 98, 122, -1 }, { 6, 30, 54, 78, 102, 126, -1 }, { 6, 26, 52, 78, 104, 130, -1 }, { 6, 30, 56, 82, 108, 134, -1 }, { 6, 34, 60, 86, 112, 138, -1 }, { 6, 30, 58, 86, 114, 142, -1 }, { 6, 34, 62, 90, 118, 146, -1 }, { 6, 30, 54, 78, 102, 126, 150 }, { 6, 24, 50, 76, 102, 128, 154 }, { 6, 28, 54, 80, 106, 132, 158 }, { 6, 32, 58, 84, 110, 136, 162 }, { 6, 26, 54, 82, 110, 138, 166 }, { 6, 30, 58, 86, 114, 142, 170 } };
        d = new int[][] { { 8, 0 }, { 8, 1 }, { 8, 2 }, { 8, 3 }, { 8, 4 }, { 8, 5 }, { 8, 7 }, { 8, 8 }, { 7, 8 }, { 5, 8 }, { 4, 8 }, { 3, 8 }, { 2, 8 }, { 1, 8 }, { 0, 8 } };
    }
    
    public static void a(final a a, final g5.a a2, final c c, final int n, final b b) {
        c(b);
        d(c, b);
        l(a2, n, b);
        s(c, b);
        f(a, n, b);
    }
    
    public static int b(int n, final int n2) {
        if (n2 != 0) {
            int n3;
            for (n3 = n(n2), n <<= n3 - 1; n(n) >= n3; n ^= n2 << n(n) - n3) {}
            return n;
        }
        throw new IllegalArgumentException("0 polynomial");
    }
    
    public static void c(final b b) {
        b.a((byte)(-1));
    }
    
    public static void d(final c c, final b b) {
        j(b);
        e(b);
        r(c, b);
        k(b);
    }
    
    public static void e(final b b) {
        if (b.b(8, b.d() - 8) != 0) {
            b.f(8, b.d() - 8, 1);
            return;
        }
        throw new h();
    }
    
    public static void f(final a a, final int n, final b b) {
        int i = b.e() - 1;
        int n2 = b.d() - 1;
        int j = 0;
        int n3 = -1;
        while (i > 0) {
            int n4 = i;
            int n5 = n2;
            int n6 = j;
            if (i == 6) {
                n4 = i - 1;
                n6 = j;
                n5 = n2;
            }
            while (n5 >= 0 && n5 < b.d()) {
                int k = 0;
                int n7 = n6;
                while (k < 2) {
                    final int n8 = n4 - k;
                    int n9 = n7;
                    if (o(b.b(n8, n5))) {
                        boolean l;
                        if (n7 < a.l()) {
                            l = a.j(n7);
                            ++n7;
                        }
                        else {
                            l = false;
                        }
                        boolean b2 = l;
                        if (n != -1) {
                            b2 = l;
                            if (h5.d.f(n, n8, n5)) {
                                b2 = (l ^ true);
                            }
                        }
                        b.g(n8, n5, b2);
                        n9 = n7;
                    }
                    ++k;
                    n7 = n9;
                }
                n5 += n3;
                n6 = n7;
            }
            n3 = -n3;
            n2 = n5 + n3;
            i = n4 - 2;
            j = n6;
        }
        if (j == a.l()) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Not all bits consumed: ");
        sb.append(j);
        sb.append('/');
        sb.append(a.l());
        throw new h(sb.toString());
    }
    
    public static void g(final int n, final int n2, final b b) {
        for (int i = 0; i < 8; ++i) {
            final int n3 = n + i;
            if (!o(b.b(n3, n2))) {
                throw new h();
            }
            b.f(n3, n2, 0);
        }
    }
    
    public static void h(final int n, final int n2, final b b) {
        for (int i = 0; i < 5; ++i) {
            final int[] array = e.b[i];
            for (int j = 0; j < 5; ++j) {
                b.f(n + j, n2 + i, array[j]);
            }
        }
    }
    
    public static void i(final int n, final int n2, final b b) {
        for (int i = 0; i < 7; ++i) {
            final int[] array = e.a[i];
            for (int j = 0; j < 7; ++j) {
                b.f(n + j, n2 + i, array[j]);
            }
        }
    }
    
    public static void j(final b b) {
        final int length = e.a[0].length;
        i(0, 0, b);
        i(b.e() - length, 0, b);
        i(0, b.e() - length, b);
        g(0, 7, b);
        g(b.e() - 8, 7, b);
        g(0, b.e() - 8, b);
        m(7, 0, b);
        m(b.d() - 8, 0, b);
        m(7, b.d() - 7, b);
    }
    
    public static void k(final b b) {
        int n;
        for (int i = 8; i < b.e() - 8; i = n) {
            n = i + 1;
            final int n2 = n % 2;
            if (o(b.b(i, 6))) {
                b.f(i, 6, n2);
            }
            if (o(b.b(6, i))) {
                b.f(6, i, n2);
            }
        }
    }
    
    public static void l(final g5.a a, int i, final b b) {
        final a a2 = new a();
        p(a, i, a2);
        boolean j;
        int[] array;
        for (i = 0; i < a2.l(); ++i) {
            j = a2.j(a2.l() - 1 - i);
            array = e.d[i];
            b.g(array[0], array[1], j);
            if (i < 8) {
                b.g(b.e() - i - 1, 8, j);
            }
            else {
                b.g(8, b.d() - 7 + (i - 8), j);
            }
        }
    }
    
    public static void m(final int n, final int n2, final b b) {
        for (int i = 0; i < 7; ++i) {
            final int n3 = n2 + i;
            if (!o(b.b(n, n3))) {
                throw new h();
            }
            b.f(n, n3, 0);
        }
    }
    
    public static int n(final int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }
    
    public static boolean o(final int n) {
        return n == -1;
    }
    
    public static void p(final g5.a a, int n, final a a2) {
        if (!f.b(n)) {
            throw new h("Invalid mask pattern");
        }
        n |= a.c() << 3;
        a2.d(n, 5);
        a2.d(b(n, 1335), 10);
        final a a3 = new a();
        a3.d(21522, 15);
        a2.s(a3);
        if (a2.l() == 15) {
            return;
        }
        final StringBuilder sb = new StringBuilder("should not happen but we got: ");
        sb.append(a2.l());
        throw new h(sb.toString());
    }
    
    public static void q(final c c, final a a) {
        a.d(c.f(), 6);
        a.d(b(c.f(), 7973), 12);
        if (a.l() == 18) {
            return;
        }
        final StringBuilder sb = new StringBuilder("should not happen but we got: ");
        sb.append(a.l());
        throw new h(sb.toString());
    }
    
    public static void r(final c c, final b b) {
        if (c.f() < 2) {
            return;
        }
        final int[] array = e.c[c.f() - 1];
        for (int length = array.length, i = 0; i < length; ++i) {
            final int n = array[i];
            if (n >= 0) {
                for (int length2 = array.length, j = 0; j < length2; ++j) {
                    final int n2 = array[j];
                    if (n2 >= 0 && o(b.b(n2, n))) {
                        h(n2 - 2, n - 2, b);
                    }
                }
            }
        }
    }
    
    public static void s(final c c, final b b) {
        if (c.f() < 7) {
            return;
        }
        final a a = new a();
        q(c, a);
        int n = 17;
        for (int i = 0; i < 6; ++i) {
            for (int j = 0; j < 3; ++j) {
                final boolean k = a.j(n);
                --n;
                b.g(i, b.d() - 11 + j, k);
                b.g(b.d() - 11 + j, i, k);
            }
        }
    }
}
