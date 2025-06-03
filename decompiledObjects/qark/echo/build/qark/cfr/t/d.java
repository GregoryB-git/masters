/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package t;

public abstract class d {
    public static final int[] a = new int[0];
    public static final long[] b = new long[0];
    public static final Object[] c = new Object[0];

    public static int a(int[] arrn, int n8, int n9) {
        --n8;
        int n10 = 0;
        while (n10 <= n8) {
            int n11 = n10 + n8 >>> 1;
            int n12 = arrn[n11];
            if (n12 < n9) {
                n10 = n11 + 1;
                continue;
            }
            if (n12 > n9) {
                n8 = n11 - 1;
                continue;
            }
            return n11;
        }
        return n10;
    }

    public static int b(long[] arrl, int n8, long l8) {
        --n8;
        int n9 = 0;
        while (n9 <= n8) {
            int n10 = n9 + n8 >>> 1;
            long l9 = arrl[n10] LCMP l8;
            if (l9 < 0) {
                n9 = n10 + 1;
                continue;
            }
            if (l9 > 0) {
                n8 = n10 - 1;
                continue;
            }
            return n10;
        }
        return n9;
    }

    public static boolean c(Object object, Object object2) {
        if (!(object == object2 || object != null && object.equals(object2))) {
            return false;
        }
        return true;
    }

    public static int d(int n8) {
        for (int i8 = 4; i8 < 32; ++i8) {
            int n9 = (1 << i8) - 12;
            if (n8 > n9) continue;
            return n9;
        }
        return n8;
    }

    public static int e(int n8) {
        return d.d(n8 * 4) / 4;
    }

    public static int f(int n8) {
        return d.d(n8 * 8) / 8;
    }
}

