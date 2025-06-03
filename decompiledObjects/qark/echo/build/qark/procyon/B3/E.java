// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B3;

public abstract class E
{
    public static void a(final boolean b, final String s) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(s);
    }
    
    public static Object b(final Object o) {
        o.getClass();
        return o;
    }
    
    public static Object c(final Object o, final String s) {
        if (o != null) {
            return o;
        }
        throw new NullPointerException(s);
    }
    
    public static void d(final boolean b, final String s) {
        if (b) {
            return;
        }
        throw new IllegalStateException(s);
    }
}
