/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.System
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.nio.IntBuffer
 */
package e3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

public abstract class a {
    public static final int[] a = a.e(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    public static void a(int[] arrn, int n8, int n9, int n10, int n11) {
        int n12;
        arrn[n8] = n12 = arrn[n8] + arrn[n9];
        arrn[n11] = n12 = a.b(n12 ^ arrn[n11], 16);
        arrn[n10] = n12 = arrn[n10] + n12;
        arrn[n9] = n12 = a.b(arrn[n9] ^ n12, 12);
        arrn[n8] = n12 = arrn[n8] + n12;
        arrn[n11] = n8 = a.b(arrn[n11] ^ n12, 8);
        arrn[n10] = n8 = arrn[n10] + n8;
        arrn[n9] = a.b(arrn[n9] ^ n8, 7);
    }

    public static int b(int n8, int n9) {
        return n8 >>> - n9 | n8 << n9;
    }

    public static void c(int[] arrn, int[] arrn2) {
        int[] arrn3 = a;
        System.arraycopy((Object)arrn3, (int)0, (Object)arrn, (int)0, (int)arrn3.length);
        System.arraycopy((Object)arrn2, (int)0, (Object)arrn, (int)arrn3.length, (int)8);
    }

    public static void d(int[] arrn) {
        for (int i8 = 0; i8 < 10; ++i8) {
            a.a(arrn, 0, 4, 8, 12);
            a.a(arrn, 1, 5, 9, 13);
            a.a(arrn, 2, 6, 10, 14);
            a.a(arrn, 3, 7, 11, 15);
            a.a(arrn, 0, 5, 10, 15);
            a.a(arrn, 1, 6, 11, 12);
            a.a(arrn, 2, 7, 8, 13);
            a.a(arrn, 3, 4, 9, 14);
        }
    }

    public static int[] e(byte[] intBuffer) {
        intBuffer = ByteBuffer.wrap((byte[])intBuffer).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] arrn = new int[intBuffer.remaining()];
        intBuffer.get(arrn);
        return arrn;
    }
}

