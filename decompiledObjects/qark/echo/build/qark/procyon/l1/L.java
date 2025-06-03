// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l1;

import g0.z;

public abstract class L
{
    public static int a(final byte[] array, int n, final int n2) {
        while (n < n2 && array[n] != 71) {
            ++n;
        }
        return n;
    }
    
    public static boolean b(final byte[] array, final int n, final int n2, final int n3) {
        int i = -4;
        int n4 = 0;
        while (i <= 4) {
            final int n5 = i * 188 + n3;
            if (n5 >= n && n5 < n2 && array[n5] == 71) {
                if (++n4 == 5) {
                    return true;
                }
            }
            else {
                n4 = 0;
            }
            ++i;
        }
        return false;
    }
    
    public static long c(final z z, int p3, final int n) {
        z.T(p3);
        if (z.a() < 5) {
            return -9223372036854775807L;
        }
        p3 = z.p();
        if ((0x800000 & p3) != 0x0) {
            return -9223372036854775807L;
        }
        if ((0x1FFF00 & p3) >> 8 != n) {
            return -9223372036854775807L;
        }
        if ((p3 & 0x20) != 0x0 && z.G() >= 7 && z.a() >= 7 && (z.G() & 0x10) == 0x10) {
            final byte[] array = new byte[6];
            z.l(array, 0, 6);
            return d(array);
        }
        return -9223372036854775807L;
    }
    
    public static long d(final byte[] array) {
        return ((long)array[0] & 0xFFL) << 25 | ((long)array[1] & 0xFFL) << 17 | ((long)array[2] & 0xFFL) << 9 | ((long)array[3] & 0xFFL) << 1 | (0xFFL & (long)array[4]) >> 7;
    }
}
