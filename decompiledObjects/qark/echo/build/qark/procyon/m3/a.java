// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m3;

import java.util.Arrays;

public abstract class a
{
    public static byte[] a(final byte[] original) {
        if (original.length < 16) {
            final byte[] copy = Arrays.copyOf(original, 16);
            copy[original.length] = -128;
            return copy;
        }
        throw new IllegalArgumentException("x must be smaller than a block.");
    }
    
    public static byte[] b(final byte[] array) {
        if (array.length == 16) {
            final byte[] array2 = new byte[16];
            for (int i = 0; i < 16; ++i) {
                final byte b = (byte)(array[i] << 1 & 0xFE);
                array2[i] = b;
                if (i < 15) {
                    array2[i] = (byte)((byte)(array[i + 1] >> 7 & 0x1) | b);
                }
            }
            array2[15] ^= (byte)(array[0] >> 7 & 0x87);
            return array2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }
}
