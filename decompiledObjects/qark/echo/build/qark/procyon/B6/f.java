// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B6;

import C6.a;

public abstract class f
{
    public static f a(final d d, final byte[] array) {
        return b(d, array, 0, array.length);
    }
    
    public static f b(final d d, final byte[] array, final int n, final int n2) {
        if (array != null) {
            a.b(array.length, n, n2);
            return new f(d) {};
        }
        throw new NullPointerException("content == null");
    }
}
