/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.ByteBuffer
 *  java.util.Arrays
 */
package e3;

import e3.a;
import e3.d;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class g
extends d {
    public g(byte[] arrby, int n8) {
        super(arrby, n8);
    }

    public static int[] g(int[] arrn, int[] arrn2) {
        int[] arrn3 = new int[16];
        a.c(arrn3, arrn);
        arrn3[12] = arrn2[0];
        arrn3[13] = arrn2[1];
        arrn3[14] = arrn2[2];
        arrn3[15] = arrn2[3];
        a.d(arrn3);
        arrn3[4] = arrn3[12];
        arrn3[5] = arrn3[13];
        arrn3[6] = arrn3[14];
        arrn3[7] = arrn3[15];
        return Arrays.copyOf((int[])arrn3, (int)8);
    }

    @Override
    public int[] b(int[] arrn, int n8) {
        if (arrn.length == this.e() / 4) {
            int[] arrn2 = new int[16];
            a.c(arrn2, g.g(this.a, arrn));
            arrn2[12] = n8;
            arrn2[13] = 0;
            arrn2[14] = arrn[4];
            arrn2[15] = arrn[5];
            return arrn2;
        }
        throw new IllegalArgumentException(String.format((String)"XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", (Object[])new Object[]{arrn.length * 32}));
    }

    @Override
    public int e() {
        return 24;
    }
}

