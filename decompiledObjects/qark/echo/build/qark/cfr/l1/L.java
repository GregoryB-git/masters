/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package l1;

import g0.z;

public abstract class L {
    public static int a(byte[] arrby, int n8, int n9) {
        while (n8 < n9 && arrby[n8] != 71) {
            ++n8;
        }
        return n8;
    }

    public static boolean b(byte[] arrby, int n8, int n9, int n10) {
        int n11 = 0;
        for (int i8 = -4; i8 <= 4; ++i8) {
            int n12 = i8 * 188 + n10;
            if (n12 >= n8 && n12 < n9 && arrby[n12] == 71) {
                n11 = n12 = n11 + 1;
                if (n12 != 5) continue;
                return true;
            }
            n11 = 0;
        }
        return false;
    }

    public static long c(z z8, int n8, int n9) {
        z8.T(n8);
        if (z8.a() < 5) {
            return -9223372036854775807L;
        }
        n8 = z8.p();
        if ((8388608 & n8) != 0) {
            return -9223372036854775807L;
        }
        if ((2096896 & n8) >> 8 != n9) {
            return -9223372036854775807L;
        }
        if ((n8 & 32) != 0 && z8.G() >= 7 && z8.a() >= 7 && (z8.G() & 16) == 16) {
            byte[] arrby = new byte[6];
            z8.l(arrby, 0, 6);
            return L.d(arrby);
        }
        return -9223372036854775807L;
    }

    public static long d(byte[] arrby) {
        return ((long)arrby[0] & 255L) << 25 | ((long)arrby[1] & 255L) << 17 | ((long)arrby[2] & 255L) << 9 | ((long)arrby[3] & 255L) << 1 | (255L & (long)arrby[4]) >> 7;
    }
}

