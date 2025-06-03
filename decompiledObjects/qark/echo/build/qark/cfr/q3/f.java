/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.nio.ByteBuffer
 *  java.security.GeneralSecurityException
 *  java.security.MessageDigest
 *  java.util.Arrays
 */
package q3;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

public abstract class f {
    public static /* varargs */ byte[] a(byte[] ... arrby) {
        byte[] arrby2;
        int n8;
        int n9 = arrby.length;
        int n10 = n8 = 0;
        while (n8 < n9) {
            arrby2 = arrby[n8];
            if (n10 <= Integer.MAX_VALUE - arrby2.length) {
                n10 += arrby2.length;
                ++n8;
                continue;
            }
            throw new GeneralSecurityException("exceeded size limit");
        }
        arrby2 = new byte[n10];
        n9 = arrby.length;
        n10 = n8 = 0;
        while (n8 < n9) {
            byte[] arrby3 = arrby[n8];
            System.arraycopy((Object)arrby3, (int)0, (Object)arrby2, (int)n10, (int)arrby3.length);
            n10 += arrby3.length;
            ++n8;
        }
        return arrby2;
    }

    public static final boolean b(byte[] arrby, byte[] arrby2) {
        return MessageDigest.isEqual((byte[])arrby, (byte[])arrby2);
    }

    public static final void c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int n8) {
        if (n8 >= 0 && byteBuffer2.remaining() >= n8 && byteBuffer3.remaining() >= n8 && byteBuffer.remaining() >= n8) {
            for (int i8 = 0; i8 < n8; ++i8) {
                byteBuffer.put((byte)(byteBuffer2.get() ^ byteBuffer3.get()));
            }
            return;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    public static final byte[] d(byte[] arrby, int n8, byte[] arrby2, int n9, int n10) {
        if (n10 >= 0 && arrby.length - n10 >= n8 && arrby2.length - n10 >= n9) {
            byte[] arrby3 = new byte[n10];
            for (int i8 = 0; i8 < n10; ++i8) {
                arrby3[i8] = (byte)(arrby[i8 + n8] ^ arrby2[i8 + n9]);
            }
            return arrby3;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    public static final byte[] e(byte[] arrby, byte[] arrby2) {
        if (arrby.length == arrby2.length) {
            return f.d(arrby, 0, arrby2, 0, arrby.length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static final byte[] f(byte[] arrby, byte[] arrby2) {
        if (arrby.length >= arrby2.length) {
            int n8 = arrby.length;
            int n9 = arrby2.length;
            arrby = Arrays.copyOf((byte[])arrby, (int)arrby.length);
            for (int i8 = 0; i8 < arrby2.length; ++i8) {
                int n10 = n8 - n9 + i8;
                arrby[n10] = (byte)(arrby[n10] ^ arrby2[i8]);
            }
            return arrby;
        }
        throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
    }
}

