// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q3;

import java.util.Arrays;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.GeneralSecurityException;

public abstract class f
{
    public static byte[] a(final byte[]... array) {
        int n;
        for (int length = array.length, i = n = 0; i < length; ++i) {
            final byte[] array2 = array[i];
            if (n > Integer.MAX_VALUE - array2.length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            n += array2.length;
        }
        final byte[] array3 = new byte[n];
        int n2;
        for (int length2 = array.length, j = n2 = 0; j < length2; ++j) {
            final byte[] array4 = array[j];
            System.arraycopy(array4, 0, array3, n2, array4.length);
            n2 += array4.length;
        }
        return array3;
    }
    
    public static final boolean b(final byte[] digesta, final byte[] digestb) {
        return MessageDigest.isEqual(digesta, digestb);
    }
    
    public static final void c(final ByteBuffer byteBuffer, final ByteBuffer byteBuffer2, final ByteBuffer byteBuffer3, final int n) {
        if (n >= 0 && byteBuffer2.remaining() >= n && byteBuffer3.remaining() >= n && byteBuffer.remaining() >= n) {
            for (int i = 0; i < n; ++i) {
                byteBuffer.put((byte)(byteBuffer2.get() ^ byteBuffer3.get()));
            }
            return;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }
    
    public static final byte[] d(final byte[] array, final int n, final byte[] array2, final int n2, final int n3) {
        if (n3 >= 0 && array.length - n3 >= n && array2.length - n3 >= n2) {
            final byte[] array3 = new byte[n3];
            for (int i = 0; i < n3; ++i) {
                array3[i] = (byte)(array[i + n] ^ array2[i + n2]);
            }
            return array3;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }
    
    public static final byte[] e(final byte[] array, final byte[] array2) {
        if (array.length == array2.length) {
            return d(array, 0, array2, 0, array.length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }
    
    public static final byte[] f(byte[] copy, final byte[] array) {
        if (copy.length >= array.length) {
            final int length = copy.length;
            final int length2 = array.length;
            copy = Arrays.copyOf(copy, copy.length);
            for (int i = 0; i < array.length; ++i) {
                final int n = length - length2 + i;
                copy[n] ^= array[i];
            }
            return copy;
        }
        throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
    }
}
