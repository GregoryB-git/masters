// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

public abstract class O
{
    public static Object a(final Object o, final int i) {
        if (o != null) {
            return o;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
    
    public static Object[] b(final Object... array) {
        c(array, array.length);
        return array;
    }
    
    public static Object[] c(final Object[] array, final int n) {
        for (int i = 0; i < n; ++i) {
            a(array[i], i);
        }
        return array;
    }
    
    public static Object[] d(final Object[] array, final int n) {
        return Q.b(array, n);
    }
}
