// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e3;

import java.nio.IntBuffer;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;

public abstract class a
{
    public static final int[] a;
    
    static {
        a = e(new byte[] { 101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107 });
    }
    
    public static void a(final int[] array, int b, final int n, final int n2, final int n3) {
        final int n4 = array[b] + array[n];
        array[b] = n4;
        final int b2 = b(n4 ^ array[n3], 16);
        array[n3] = b2;
        final int n5 = array[n2] + b2;
        array[n2] = n5;
        final int b3 = b(array[n] ^ n5, 12);
        array[n] = b3;
        final int n6 = array[b] + b3;
        array[b] = n6;
        b = b(array[n3] ^ n6, 8);
        array[n3] = b;
        b += array[n2];
        array[n2] = b;
        array[n] = b(array[n] ^ b, 7);
    }
    
    public static int b(final int n, final int n2) {
        return n >>> -n2 | n << n2;
    }
    
    public static void c(final int[] array, final int[] array2) {
        final int[] a = e3.a.a;
        System.arraycopy(a, 0, array, 0, a.length);
        System.arraycopy(array2, 0, array, a.length, 8);
    }
    
    public static void d(final int[] array) {
        for (int i = 0; i < 10; ++i) {
            a(array, 0, 4, 8, 12);
            a(array, 1, 5, 9, 13);
            a(array, 2, 6, 10, 14);
            a(array, 3, 7, 11, 15);
            a(array, 0, 5, 10, 15);
            a(array, 1, 6, 11, 12);
            a(array, 2, 7, 8, 13);
            a(array, 3, 4, 9, 14);
        }
    }
    
    public static int[] e(final byte[] array) {
        final IntBuffer intBuffer = ByteBuffer.wrap(array).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        final int[] dst = new int[intBuffer.remaining()];
        intBuffer.get(dst);
        return dst;
    }
}
