/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
package X2;

import W2.k;
import X2.s;
import java.util.Arrays;

public abstract class l {
    public static Object a(int n8) {
        if (n8 >= 2 && n8 <= 1073741824 && Integer.highestOneBit((int)n8) == n8) {
            if (n8 <= 256) {
                return new byte[n8];
            }
            if (n8 <= 65536) {
                return new short[n8];
            }
            return new int[n8];
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("must be power of 2 between 2^1 and 2^30: ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static int b(int n8, int n9) {
        return n8 & n9;
    }

    public static int c(int n8, int n9) {
        return n8 & n9;
    }

    public static int d(int n8, int n9, int n10) {
        return n8 & n10 | n9 & n10;
    }

    public static int e(int n8) {
        int n9 = n8 < 32 ? 4 : 2;
        return n9 * (n8 + 1);
    }

    public static int f(Object object, Object object2, int n8, Object object3, int[] arrn, Object[] arrobject, Object[] arrobject2) {
        int n9 = s.c(object);
        int n10 = n9 & n8;
        int n11 = l.h(object3, n10);
        if (n11 == 0) {
            return -1;
        }
        int n12 = l.b(n9, n8);
        n9 = -1;
        do {
            int n13;
            if (l.b(n13 = arrn[--n11], n8) == n12 && k.a(object, arrobject[n11]) && (arrobject2 == null || k.a(object2, arrobject2[n11]))) {
                n13 = l.c(n13, n8);
                if (n9 == -1) {
                    l.i(object3, n10, n13);
                    return n11;
                }
                arrn[n9] = l.d(arrn[n9], n13, n8);
                return n11;
            }
            if ((n13 = l.c(n13, n8)) == 0) {
                return -1;
            }
            n9 = n11;
            n11 = n13;
        } while (true);
    }

    public static void g(Object object) {
        if (object instanceof byte[]) {
            Arrays.fill((byte[])((byte[])object), (byte)0);
            return;
        }
        if (object instanceof short[]) {
            Arrays.fill((short[])((short[])object), (short)0);
            return;
        }
        Arrays.fill((int[])((int[])object), (int)0);
    }

    public static int h(Object object, int n8) {
        if (object instanceof byte[]) {
            return ((byte[])object)[n8] & 255;
        }
        if (object instanceof short[]) {
            return ((short[])object)[n8] & 65535;
        }
        return ((int[])object)[n8];
    }

    public static void i(Object object, int n8, int n9) {
        if (object instanceof byte[]) {
            ((byte[])object)[n8] = (byte)n9;
            return;
        }
        if (object instanceof short[]) {
            ((short[])object)[n8] = (short)n9;
            return;
        }
        ((int[])object)[n8] = n9;
    }

    public static int j(int n8) {
        return Math.max((int)4, (int)s.a(n8 + 1, 1.0));
    }
}

