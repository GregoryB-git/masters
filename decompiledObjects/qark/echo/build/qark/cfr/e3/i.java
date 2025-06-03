/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.security.GeneralSecurityException
 *  java.util.Arrays
 */
package e3;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import q3.f;

public abstract class i {
    public static byte[] a(byte[] arrby, byte[] arrby2) {
        if (arrby.length == 32) {
            long l8;
            long l9;
            long l10;
            long l11 = i.c(arrby, 0, 0) & 0x3FFFFFFL;
            long l12 = i.c(arrby, 3, 2) & 67108611L;
            long l13 = i.c(arrby, 6, 4) & 67092735L;
            long l14 = i.c(arrby, 9, 6) & 66076671L;
            long l15 = i.c(arrby, 12, 8) & 1048575L;
            long l16 = l13 * 5L;
            long l17 = l14 * 5L;
            long l18 = l15 * 5L;
            byte[] arrby3 = new byte[17];
            long l19 = 0L;
            long l20 = l9 = (l10 = (l8 = 0L));
            long l21 = l10;
            l10 = l19;
            for (int i8 = 0; i8 < arrby2.length; i8 += 16) {
                i.b(arrby3, arrby2, i8);
                long l22 = l21 + i.c(arrby3, 9, 6);
                long l23 = l9 + (i.c(arrby3, 12, 8) | (long)(arrby3[16] << 24));
                long l24 = (l20 += i.c(arrby3, 0, 0)) * l11 + (l10 += i.c(arrby3, 3, 2)) * l18 + (l8 += i.c(arrby3, 6, 4)) * l17 + l22 * l16 + l23 * (l12 * 5L);
                l19 = l20 * l12 + l10 * l11 + l8 * l18 + l22 * l17 + l23 * l16 + (l24 >> 26);
                l21 = l20 * l13 + l10 * l12 + l8 * l11 + l22 * l18 + l23 * l17 + (l19 >> 26);
                l9 = l20 * l14 + l10 * l13 + l8 * l12 + l22 * l11 + l23 * l18 + (l21 >> 26);
                l20 = l20 * l15 + l10 * l14 + l8 * l13 + l22 * l12 + l23 * l11 + (l9 >> 26);
                l22 = (l24 & 0x3FFFFFFL) + (l20 >> 26) * 5L;
                l10 = (l19 & 0x3FFFFFFL) + (l22 >> 26);
                l8 = l21 & 0x3FFFFFFL;
                l21 = l9 & 0x3FFFFFFL;
                l9 = l20 & 0x3FFFFFFL;
                l20 = l22 & 0x3FFFFFFL;
            }
            l19 = l8 + (l10 >> 26);
            l8 = l19 & 0x3FFFFFFL;
            l19 = l21 + (l19 >> 26);
            l21 = l19 & 0x3FFFFFFL;
            l19 = l9 + (l19 >> 26);
            l9 = l19 & 0x3FFFFFFL;
            l11 = (l20 += (l19 >> 26) * 5L) & 0x3FFFFFFL;
            l14 = (l10 & 0x3FFFFFFL) + (l20 >> 26);
            l12 = l11 + 5L;
            l16 = (l12 >> 26) + l14;
            l15 = l8 + (l16 >> 26);
            l13 = l21 + (l15 >> 26);
            l10 = l9 + (l13 >> 26) - 0x4000000L;
            l19 = l20 = l10 >> 63;
            l14 = l16 & 0x3FFFFFFL & l19 | l14 & l20;
            l8 = l15 & 0x3FFFFFFL & l19 | l8 & l20;
            l21 = l13 & 0x3FFFFFFL & l19 | l21 & l20;
            l11 = ((l11 & l20 | l12 & 0x3FFFFFFL & l19 | l14 << 26) & 0xFFFFFFFFL) + i.d(arrby, 16);
            l12 = ((l14 >> 6 | l8 << 20) & 0xFFFFFFFFL) + i.d(arrby, 20) + (l11 >> 32);
            l8 = ((l8 >> 12 | l21 << 14) & 0xFFFFFFFFL) + i.d(arrby, 24) + (l12 >> 32);
            l13 = i.d(arrby, 28);
            arrby = new byte[16];
            i.e(arrby, l11 & 0xFFFFFFFFL, 0);
            i.e(arrby, l12 & 0xFFFFFFFFL, 4);
            i.e(arrby, l8 & 0xFFFFFFFFL, 8);
            i.e(arrby, ((l21 >> 18 | (l10 & l19 | l9 & l20) << 8) & 0xFFFFFFFFL) + l13 + (l8 >> 32) & 0xFFFFFFFFL, 12);
            return arrby;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }

    public static void b(byte[] arrby, byte[] arrby2, int n8) {
        int n9 = Math.min((int)16, (int)(arrby2.length - n8));
        System.arraycopy((Object)arrby2, (int)n8, (Object)arrby, (int)0, (int)n9);
        arrby[n9] = 1;
        if (n9 != 16) {
            Arrays.fill((byte[])arrby, (int)(n9 + 1), (int)arrby.length, (byte)0);
        }
    }

    public static long c(byte[] arrby, int n8, int n9) {
        return i.d(arrby, n8) >> n9 & 0x3FFFFFFL;
    }

    public static long d(byte[] arrby, int n8) {
        byte by = arrby[n8];
        byte by2 = arrby[n8 + 1];
        byte by3 = arrby[n8 + 2];
        return (long)((arrby[n8 + 3] & 255) << 24 | (by & 255 | (by2 & 255) << 8 | (by3 & 255) << 16)) & 0xFFFFFFFFL;
    }

    public static void e(byte[] arrby, long l8, int n8) {
        int n9 = 0;
        while (n9 < 4) {
            arrby[n8 + n9] = (byte)(255L & l8);
            ++n9;
            l8 >>= 8;
        }
    }

    public static void f(byte[] arrby, byte[] arrby2, byte[] arrby3) {
        if (f.b(i.a(arrby, arrby2), arrby3)) {
            return;
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}

