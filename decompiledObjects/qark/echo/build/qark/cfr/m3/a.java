/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 */
package m3;

import java.util.Arrays;

public abstract class a {
    public static byte[] a(byte[] arrby) {
        if (arrby.length < 16) {
            byte[] arrby2 = Arrays.copyOf((byte[])arrby, (int)16);
            arrby2[arrby.length] = -128;
            return arrby2;
        }
        throw new IllegalArgumentException("x must be smaller than a block.");
    }

    public static byte[] b(byte[] arrby) {
        if (arrby.length == 16) {
            int n8;
            byte[] arrby2 = new byte[16];
            for (n8 = 0; n8 < 16; ++n8) {
                byte by;
                arrby2[n8] = by = (byte)(arrby[n8] << 1 & 254);
                if (n8 >= 15) continue;
                arrby2[n8] = (byte)((byte)(arrby[n8 + 1] >> 7 & 1) | by);
            }
            n8 = arrby2[15];
            arrby2[15] = (byte)((byte)(arrby[0] >> 7 & 135) ^ n8);
            return arrby2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }
}

