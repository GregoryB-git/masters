/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package Z0;

import g0.M;

public abstract class e {
    public static b a(int n8, long[] arrl, int[] arrn, long l8) {
        int n9;
        int n10 = 8192 / n8;
        int n11 = arrn.length;
        int n12 = 0;
        int n13 = n9 = 0;
        while (n9 < n11) {
            n13 += M.k(arrn[n9], n10);
            ++n9;
        }
        long[] arrl2 = new long[n13];
        int[] arrn2 = new int[n13];
        long[] arrl3 = new long[n13];
        int[] arrn3 = new int[n13];
        int n14 = n9 = (n11 = 0);
        n13 = n9;
        for (n9 = n12; n9 < arrn.length; ++n9) {
            n12 = arrn[n9];
            long l9 = arrl[n9];
            while (n12 > 0) {
                int n15;
                int n16 = Math.min((int)n10, (int)n12);
                arrl2[n13] = l9;
                arrn2[n13] = n15 = n8 * n16;
                n14 = Math.max((int)n14, (int)n15);
                arrl3[n13] = (long)n11 * l8;
                arrn3[n13] = 1;
                l9 += (long)arrn2[n13];
                n11 += n16;
                n12 -= n16;
                ++n13;
            }
        }
        return new b(arrl2, arrn2, n14, arrl3, arrn3, l8 * (long)n11, null);
    }

    public static final class b {
        public final long[] a;
        public final int[] b;
        public final int c;
        public final long[] d;
        public final int[] e;
        public final long f;

        public b(long[] arrl, int[] arrn, int n8, long[] arrl2, int[] arrn2, long l8) {
            this.a = arrl;
            this.b = arrn;
            this.c = n8;
            this.d = arrl2;
            this.e = arrn2;
            this.f = l8;
        }

        public /* synthetic */ b(long[] arrl, int[] arrn, int n8, long[] arrl2, int[] arrn2, long l8,  a8) {
            this(arrl, arrn, n8, arrl2, arrn2, l8);
        }
    }

}

