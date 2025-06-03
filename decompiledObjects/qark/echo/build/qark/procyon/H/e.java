// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H;

public abstract class e
{
    public static int a(final int n) {
        if (n >= 0) {
            return n;
        }
        throw new IllegalArgumentException();
    }
    
    public static Object b(final Object o) {
        o.getClass();
        return o;
    }
    
    public static Object c(final Object o, final Object obj) {
        if (o != null) {
            return o;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
