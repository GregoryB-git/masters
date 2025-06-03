// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import java.util.Map;
import java.util.Arrays;

public abstract class Q
{
    public static Object[] a(final Object[] original, final int from, final int to, final Object[] array) {
        return Arrays.copyOfRange(original, from, to, array.getClass());
    }
    
    public static Object[] b(Object[] copy, final int newLength) {
        if (copy.length != 0) {
            copy = Arrays.copyOf(copy, 0);
        }
        return Arrays.copyOf(copy, newLength);
    }
    
    public static Map c() {
        return k.r();
    }
}
