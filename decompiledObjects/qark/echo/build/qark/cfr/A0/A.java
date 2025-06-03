/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 */
package A0;

import A0.B;
import A0.C;
import A0.D;
import A0.E;
import A0.y;
import android.util.Pair;
import d0.I;
import d0.J;
import d0.L;
import d0.q;
import g0.M;
import java.util.Arrays;
import k0.Z0;
import k0.a1;
import k0.b1;
import x0.Z;
import x0.x;

public abstract class A
extends D {
    public a c;

    public static int n(a1[] arra1, J j8, int[] arrn, boolean bl) {
        int n8;
        int n9 = arra1.length;
        int n10 = n8 = 0;
        int n11 = 1;
        while (n8 < arra1.length) {
            int n12;
            int n13;
            int n14;
            block5 : {
                int n15;
                int n16;
                block4 : {
                    a1 a12 = arra1[n8];
                    n16 = n15 = 0;
                    while (n15 < j8.a) {
                        n16 = Math.max((int)n16, (int)Z0.h(a12.a(j8.a(n15))));
                        ++n15;
                    }
                    n15 = arrn[n8] == 0 ? 1 : 0;
                    if (n16 > n10) break block4;
                    n13 = n9;
                    n14 = n10;
                    n12 = n11;
                    if (n16 != n10) break block5;
                    n13 = n9;
                    n14 = n10;
                    n12 = n11;
                    if (!bl) break block5;
                    n13 = n9;
                    n14 = n10;
                    n12 = n11;
                    if (n11 != 0) break block5;
                    n13 = n9;
                    n14 = n10;
                    n12 = n11;
                    if (n15 == 0) break block5;
                }
                n13 = n8;
                n12 = n15;
                n14 = n16;
            }
            ++n8;
            n9 = n13;
            n10 = n14;
            n11 = n12;
        }
        return n9;
    }

    public static int[] o(a1 a12, J j8) {
        int[] arrn = new int[j8.a];
        for (int i8 = 0; i8 < j8.a; ++i8) {
            arrn[i8] = a12.a(j8.a(i8));
        }
        return arrn;
    }

    public static int[] p(a1[] arra1) {
        int n8 = arra1.length;
        int[] arrn = new int[n8];
        for (int i8 = 0; i8 < n8; ++i8) {
            arrn[i8] = arra1[i8].s();
        }
        return arrn;
    }

    @Override
    public final void i(Object object) {
        this.c = (a)object;
    }

    @Override
    public final E k(a1[] object, Z pair, x.b object2, I i8) {
        int[] arrn;
        int n8;
        String[] arrstring;
        int n9;
        int[] arrn2 = new int[object.length + 1];
        int n10 = object.length + 1;
        J[][] arrarrj = new J[n10][];
        int[][][] arrarrn = new int[object.length + 1][][];
        int n11 = 0;
        for (n9 = 0; n9 < n10; ++n9) {
            n8 = pair.a;
            arrarrj[n9] = new J[n8];
            arrarrn[n9] = new int[n8][];
        }
        int[] arrn3 = A.p((a1[])object);
        for (n9 = 0; n9 < pair.a; ++n9) {
            arrn = pair.b(n9);
            boolean bl = arrn.c == 5;
            n10 = A.n((a1[])object, (J)arrn, arrn2, bl);
            arrstring = n10 == object.length ? new int[arrn.a] : A.o(object[n10], (J)arrn);
            n8 = arrn2[n10];
            arrarrj[n10][n8] = arrn;
            arrarrn[n10][n8] = arrstring;
            arrn2[n10] = n8 + 1;
        }
        pair = new Z[object.length];
        arrstring = new String[object.length];
        arrn = new int[object.length];
        for (n9 = n11; n9 < object.length; ++n9) {
            n11 = arrn2[n9];
            pair[n9] = new Z((J[])M.O0(arrarrj[n9], n11));
            arrarrn[n9] = (int[][])M.O0((Object[])arrarrn[n9], n11);
            arrstring[n9] = object[n9].d();
            arrn[n9] = object[n9].l();
        }
        n9 = arrn2[object.length];
        object = new a(arrstring, arrn, (Z[])pair, arrn3, arrarrn, new Z((J[])M.O0(arrarrj[object.length], n9)));
        pair = this.q((a)object, arrarrn, arrn3, (x.b)object2, i8);
        object2 = C.a((a)object, (B[])pair.second);
        return new E((b1[])pair.first, (y[])pair.second, (L)object2, object);
    }

    public abstract Pair q(a var1, int[][][] var2, int[] var3, x.b var4, I var5);

    public static final class a {
        public final int a;
        public final String[] b;
        public final int[] c;
        public final Z[] d;
        public final int[] e;
        public final int[][][] f;
        public final Z g;

        public a(String[] arrstring, int[] arrn, Z[] arrz, int[] arrn2, int[][][] arrn3, Z z8) {
            this.b = arrstring;
            this.c = arrn;
            this.d = arrz;
            this.f = arrn3;
            this.e = arrn2;
            this.g = z8;
            this.a = arrn.length;
        }

        public int a(int n8, int n9, boolean bl) {
            int n10 = this.d[n8].b((int)n9).a;
            int[] arrn = new int[n10];
            int n11 = 0;
            for (int i8 = 0; i8 < n10; ++i8) {
                int n12;
                block4 : {
                    block3 : {
                        int n13 = this.g(n8, n9, i8);
                        if (n13 == 4) break block3;
                        n12 = n11;
                        if (!bl) break block4;
                        n12 = n11;
                        if (n13 != 3) break block4;
                    }
                    arrn[n11] = i8;
                    n12 = n11 + 1;
                }
                n11 = n12;
            }
            return this.b(n8, n9, Arrays.copyOf((int[])arrn, (int)n11));
        }

        public int b(int n8, int n9, int[] arrn) {
            int n10;
            int n11 = 0;
            int n12 = 16;
            String string2 = null;
            int n13 = n10 = 0;
            while (n11 < arrn.length) {
                int n14 = arrn[n11];
                String string3 = this.d[n8].b((int)n9).a((int)n14).n;
                if (n13 == 0) {
                    string2 = string3;
                } else {
                    n10 |= M.c(string2, string3) ^ true;
                }
                n12 = Math.min((int)n12, (int)Z0.e(this.f[n8][n9][n11]));
                ++n11;
                ++n13;
            }
            n9 = n12;
            if (n10 != 0) {
                n9 = Math.min((int)n12, (int)this.e[n8]);
            }
            return n9;
        }

        public int c(int n8, int n9, int n10) {
            return this.f[n8][n9][n10];
        }

        public int d() {
            return this.a;
        }

        public int e(int n8) {
            return this.c[n8];
        }

        public Z f(int n8) {
            return this.d[n8];
        }

        public int g(int n8, int n9, int n10) {
            return Z0.h(this.c(n8, n9, n10));
        }

        public Z h() {
            return this.g;
        }
    }

}

