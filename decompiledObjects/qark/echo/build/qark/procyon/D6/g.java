// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D6;

import java.nio.charset.Charset;

public abstract class g
{
    public static final Charset a;
    
    static {
        a = Charset.forName("UTF-8");
    }
    
    public static boolean a(final byte[] array, final int n, final byte[] array2, final int n2, final int n3) {
        for (int i = 0; i < n3; ++i) {
            if (array[i + n] != array2[i + n2]) {
                return false;
            }
        }
        return true;
    }
    
    public static void b(final long l, final long i, final long j) {
        if ((i | j) >= 0L && i <= l && l - i >= j) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", l, i, j));
    }
}
