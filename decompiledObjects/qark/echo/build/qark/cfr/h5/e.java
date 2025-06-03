/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package h5;

import V4.h;
import Y4.a;
import g5.c;
import h5.b;
import h5.d;
import h5.f;

public abstract class e {
    public static final int[][] a;
    public static final int[][] b;
    public static final int[][] c;
    public static final int[][] d;

    static {
        int[] arrn = new int[]{1, 1, 1, 1, 1, 1, 1};
        int[] arrn2 = new int[]{1, 0, 1, 1, 1, 0, 1};
        int[] arrn3 = new int[]{1, 1, 1, 1, 1, 1, 1};
        a = new int[][]{arrn, {1, 0, 0, 0, 0, 0, 1}, {1, 0, 1, 1, 1, 0, 1}, {1, 0, 1, 1, 1, 0, 1}, arrn2, {1, 0, 0, 0, 0, 0, 1}, arrn3};
        arrn = new int[]{1, 1, 1, 1, 1};
        arrn2 = new int[]{1, 0, 0, 0, 1};
        arrn3 = new int[]{1, 0, 0, 0, 1};
        b = new int[][]{arrn, arrn2, {1, 0, 1, 0, 1}, arrn3, {1, 1, 1, 1, 1}};
        arrn = new int[]{-1, -1, -1, -1, -1, -1, -1};
        arrn2 = new int[]{6, 22, -1, -1, -1, -1, -1};
        arrn3 = new int[]{6, 26, -1, -1, -1, -1, -1};
        int[] arrn4 = new int[]{6, 34, -1, -1, -1, -1, -1};
        int[] arrn5 = new int[]{6, 22, 38, -1, -1, -1, -1};
        int[] arrn6 = new int[]{6, 24, 42, -1, -1, -1, -1};
        int[] arrn7 = new int[]{6, 28, 50, -1, -1, -1, -1};
        int[] arrn8 = new int[]{6, 34, 62, -1, -1, -1, -1};
        int[] arrn9 = new int[]{6, 26, 46, 66, -1, -1, -1};
        int[] arrn10 = new int[]{6, 26, 48, 70, -1, -1, -1};
        int[] arrn11 = new int[]{6, 26, 50, 74, -1, -1, -1};
        int[] arrn12 = new int[]{6, 30, 56, 82, -1, -1, -1};
        int[] arrn13 = new int[]{6, 30, 58, 86, -1, -1, -1};
        int[] arrn14 = new int[]{6, 28, 50, 72, 94, -1, -1};
        int[] arrn15 = new int[]{6, 26, 50, 74, 98, -1, -1};
        int[] arrn16 = new int[]{6, 32, 58, 84, 110, -1, -1};
        int[] arrn17 = new int[]{6, 30, 58, 86, 114, -1, -1};
        int[] arrn18 = new int[]{6, 26, 50, 74, 98, 122, -1};
        int[] arrn19 = new int[]{6, 30, 54, 78, 102, 126, -1};
        int[] arrn20 = new int[]{6, 30, 56, 82, 108, 134, -1};
        int[] arrn21 = new int[]{6, 34, 60, 86, 112, 138, -1};
        int[] arrn22 = new int[]{6, 34, 62, 90, 118, 146, -1};
        int[] arrn23 = new int[]{6, 30, 54, 78, 102, 126, 150};
        int[] arrn24 = new int[]{6, 24, 50, 76, 102, 128, 154};
        int[] arrn25 = new int[]{6, 28, 54, 80, 106, 132, 158};
        int[] arrn26 = new int[]{6, 32, 58, 84, 110, 136, 162};
        int[] arrn27 = new int[]{6, 30, 58, 86, 114, 142, 170};
        c = new int[][]{arrn, {6, 18, -1, -1, -1, -1, -1}, arrn2, arrn3, {6, 30, -1, -1, -1, -1, -1}, arrn4, arrn5, arrn6, {6, 26, 46, -1, -1, -1, -1}, arrn7, {6, 30, 54, -1, -1, -1, -1}, {6, 32, 58, -1, -1, -1, -1}, arrn8, arrn9, arrn10, arrn11, {6, 30, 54, 78, -1, -1, -1}, arrn12, arrn13, {6, 34, 62, 90, -1, -1, -1}, arrn14, arrn15, {6, 30, 54, 78, 102, -1, -1}, {6, 28, 54, 80, 106, -1, -1}, arrn16, arrn17, {6, 34, 62, 90, 118, -1, -1}, arrn18, arrn19, {6, 26, 52, 78, 104, 130, -1}, arrn20, arrn21, {6, 30, 58, 86, 114, 142, -1}, arrn22, arrn23, arrn24, arrn25, arrn26, {6, 26, 54, 82, 110, 138, 166}, arrn27};
        arrn = new int[]{8, 1};
        arrn2 = new int[]{8, 8};
        d = new int[][]{{8, 0}, arrn, {8, 2}, {8, 3}, {8, 4}, {8, 5}, {8, 7}, arrn2, {7, 8}, {5, 8}, {4, 8}, {3, 8}, {2, 8}, {1, 8}, {0, 8}};
    }

    public static void a(a a8, g5.a a9, c c8, int n8, b b8) {
        e.c(b8);
        e.d(c8, b8);
        e.l(a9, n8, b8);
        e.s(c8, b8);
        e.f(a8, n8, b8);
    }

    public static int b(int n8, int n9) {
        if (n9 != 0) {
            int n10 = e.n(n9);
            n8 <<= n10 - 1;
            while (e.n(n8) >= n10) {
                n8 ^= n9 << e.n(n8) - n10;
            }
            return n8;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    public static void c(b b8) {
        b8.a((byte)-1);
    }

    public static void d(c c8, b b8) {
        e.j(b8);
        e.e(b8);
        e.r(c8, b8);
        e.k(b8);
    }

    public static void e(b b8) {
        if (b8.b(8, b8.d() - 8) != 0) {
            b8.f(8, b8.d() - 8, 1);
            return;
        }
        throw new h();
    }

    public static void f(a a8, int n8, b b8) {
        int n9 = b8.e() - 1;
        int n10 = b8.d() - 1;
        int n11 = 0;
        int n12 = -1;
        while (n9 > 0) {
            int n13 = n9;
            int n14 = n10;
            int n15 = n11;
            if (n9 == 6) {
                n13 = n9 - 1;
                n15 = n11;
                n14 = n10;
            }
            while (n14 >= 0 && n14 < b8.d()) {
                n10 = n15;
                for (n9 = 0; n9 < 2; ++n9) {
                    n11 = n13 - n9;
                    n15 = n10;
                    if (e.o(b8.b(n11, n14))) {
                        boolean bl;
                        if (n10 < a8.l()) {
                            bl = a8.j(n10);
                            ++n10;
                        } else {
                            bl = false;
                        }
                        boolean bl2 = bl;
                        if (n8 != -1) {
                            bl2 = bl;
                            if (d.f(n8, n11, n14)) {
                                bl2 = bl ^ true;
                            }
                        }
                        b8.g(n11, n14, bl2);
                        n15 = n10;
                    }
                    n10 = n15;
                }
                n14 += n12;
                n15 = n10;
            }
            n12 = - n12;
            n10 = n14 + n12;
            n9 = n13 - 2;
            n11 = n15;
        }
        if (n11 == a8.l()) {
            return;
        }
        b8 = new StringBuilder("Not all bits consumed: ");
        b8.append(n11);
        b8.append('/');
        b8.append(a8.l());
        throw new h(b8.toString());
    }

    public static void g(int n8, int n9, b b8) {
        for (int i8 = 0; i8 < 8; ++i8) {
            int n10 = n8 + i8;
            if (e.o(b8.b(n10, n9))) {
                b8.f(n10, n9, 0);
                continue;
            }
            throw new h();
        }
    }

    public static void h(int n8, int n9, b b8) {
        for (int i8 = 0; i8 < 5; ++i8) {
            int[] arrn = b[i8];
            for (int i9 = 0; i9 < 5; ++i9) {
                b8.f(n8 + i9, n9 + i8, arrn[i9]);
            }
        }
    }

    public static void i(int n8, int n9, b b8) {
        for (int i8 = 0; i8 < 7; ++i8) {
            int[] arrn = a[i8];
            for (int i9 = 0; i9 < 7; ++i9) {
                b8.f(n8 + i9, n9 + i8, arrn[i9]);
            }
        }
    }

    public static void j(b b8) {
        int n8 = a[0].length;
        e.i(0, 0, b8);
        e.i(b8.e() - n8, 0, b8);
        e.i(0, b8.e() - n8, b8);
        e.g(0, 7, b8);
        e.g(b8.e() - 8, 7, b8);
        e.g(0, b8.e() - 8, b8);
        e.m(7, 0, b8);
        e.m(b8.d() - 8, 0, b8);
        e.m(7, b8.d() - 7, b8);
    }

    public static void k(b b8) {
        int n8 = 8;
        while (n8 < b8.e() - 8) {
            int n9 = n8 + 1;
            int n10 = n9 % 2;
            if (e.o(b8.b(n8, 6))) {
                b8.f(n8, 6, n10);
            }
            if (e.o(b8.b(6, n8))) {
                b8.f(6, n8, n10);
            }
            n8 = n9;
        }
    }

    public static void l(g5.a arrn, int n8, b b8) {
        a a8 = new a();
        e.p((g5.a)arrn, n8, a8);
        for (n8 = 0; n8 < a8.l(); ++n8) {
            boolean bl = a8.j(a8.l() - 1 - n8);
            arrn = d[n8];
            b8.g(arrn[0], arrn[1], bl);
            if (n8 < 8) {
                b8.g(b8.e() - n8 - 1, 8, bl);
                continue;
            }
            b8.g(8, b8.d() - 7 + (n8 - 8), bl);
        }
    }

    public static void m(int n8, int n9, b b8) {
        for (int i8 = 0; i8 < 7; ++i8) {
            int n10 = n9 + i8;
            if (e.o(b8.b(n8, n10))) {
                b8.f(n8, n10, 0);
                continue;
            }
            throw new h();
        }
    }

    public static int n(int n8) {
        return 32 - Integer.numberOfLeadingZeros((int)n8);
    }

    public static boolean o(int n8) {
        if (n8 == -1) {
            return true;
        }
        return false;
    }

    public static void p(g5.a object, int n8, a a8) {
        if (f.b(n8)) {
            n8 = object.c() << 3 | n8;
            a8.d(n8, 5);
            a8.d(e.b(n8, 1335), 10);
            object = new a();
            object.d(21522, 15);
            a8.s((a)object);
            if (a8.l() == 15) {
                return;
            }
            object = new StringBuilder("should not happen but we got: ");
            object.append(a8.l());
            throw new h(object.toString());
        }
        throw new h("Invalid mask pattern");
    }

    public static void q(c c8, a a8) {
        a8.d(c8.f(), 6);
        a8.d(e.b(c8.f(), 7973), 12);
        if (a8.l() == 18) {
            return;
        }
        c8 = new StringBuilder("should not happen but we got: ");
        c8.append(a8.l());
        throw new h(c8.toString());
    }

    public static void r(c arrn, b b8) {
        if (arrn.f() < 2) {
            return;
        }
        int n8 = arrn.f();
        arrn = c[n8 - 1];
        int n9 = arrn.length;
        for (n8 = 0; n8 < n9; ++n8) {
            int n10 = arrn[n8];
            if (n10 < 0) continue;
            int n11 = arrn.length;
            for (int i8 = 0; i8 < n11; ++i8) {
                int n12 = arrn[i8];
                if (n12 < 0 || !e.o(b8.b(n12, n10))) continue;
                e.h(n12 - 2, n10 - 2, b8);
            }
        }
    }

    public static void s(c c8, b b8) {
        if (c8.f() < 7) {
            return;
        }
        a a8 = new a();
        e.q(c8, a8);
        int n8 = 17;
        for (int i8 = 0; i8 < 6; ++i8) {
            for (int i9 = 0; i9 < 3; ++i9) {
                boolean bl = a8.j(n8);
                --n8;
                b8.g(i8, b8.d() - 11 + i9, bl);
                b8.g(b8.d() - 11 + i9, i8, bl);
            }
        }
    }
}

