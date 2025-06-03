/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.nio.ByteBuffer
 */
package e3;

import e3.a;
import e3.d;
import java.nio.ByteBuffer;

public class c
extends d {
    public c(byte[] arrby, int n8) {
        super(arrby, n8);
    }

    @Override
    public int[] b(int[] arrn, int n8) {
        if (arrn.length == this.e() / 4) {
            int[] arrn2 = new int[16];
            a.c(arrn2, this.a);
            arrn2[12] = n8;
            System.arraycopy((Object)arrn, (int)0, (Object)arrn2, (int)13, (int)arrn.length);
            return arrn2;
        }
        throw new IllegalArgumentException(String.format((String)"ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", (Object[])new Object[]{arrn.length * 32}));
    }

    @Override
    public int e() {
        return 12;
    }
}

