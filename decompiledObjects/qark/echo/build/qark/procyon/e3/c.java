// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e3;

import java.nio.ByteBuffer;

public class c extends d
{
    public c(final byte[] array, final int n) {
        super(array, n);
    }
    
    @Override
    public int[] b(final int[] array, final int n) {
        if (array.length == this.e() / 4) {
            final int[] array2 = new int[16];
            e3.a.c(array2, super.a);
            array2[12] = n;
            System.arraycopy(array, 0, array2, 13, array.length);
            return array2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", array.length * 32));
    }
    
    @Override
    public int e() {
        return 12;
    }
}
