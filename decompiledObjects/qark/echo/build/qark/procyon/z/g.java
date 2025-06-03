// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z;

import java.lang.reflect.Array;

public abstract class g
{
    public static int[] a(final int[] array, final int n, final int n2) {
        int[] array2 = array;
        if (n + 1 > array.length) {
            array2 = new int[c(n)];
            System.arraycopy(array, 0, array2, 0, n);
        }
        array2[n] = n2;
        return array2;
    }
    
    public static Object[] b(final Object[] array, final int n, final Object o) {
        Object[] array2 = array;
        if (n + 1 > array.length) {
            array2 = (Object[])Array.newInstance(array.getClass().getComponentType(), c(n));
            System.arraycopy(array, 0, array2, 0, n);
        }
        array2[n] = o;
        return array2;
    }
    
    public static int c(final int n) {
        if (n <= 4) {
            return 8;
        }
        return n * 2;
    }
}
