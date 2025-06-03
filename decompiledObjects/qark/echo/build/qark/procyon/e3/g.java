// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e3;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class g extends d
{
    public g(final byte[] array, final int n) {
        super(array, n);
    }
    
    public static int[] g(final int[] array, final int[] array2) {
        final int[] original = new int[16];
        a.c(original, array);
        original[12] = array2[0];
        original[13] = array2[1];
        original[14] = array2[2];
        original[15] = array2[3];
        a.d(original);
        original[4] = original[12];
        original[5] = original[13];
        original[6] = original[14];
        original[7] = original[15];
        return Arrays.copyOf(original, 8);
    }
    
    @Override
    public int[] b(final int[] array, final int n) {
        if (array.length == this.e() / 4) {
            final int[] array2 = new int[16];
            e3.a.c(array2, g(super.a, array));
            array2[12] = n;
            array2[13] = 0;
            array2[14] = array[4];
            array2[15] = array[5];
            return array2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", array.length * 32));
    }
    
    @Override
    public int e() {
        return 24;
    }
}
