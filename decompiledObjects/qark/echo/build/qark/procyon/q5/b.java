// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q5;

public abstract class b
{
    public static void a(final Object o, final Class clazz) {
        if (o != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(clazz.getCanonicalName());
        sb.append(" must be set");
        throw new IllegalStateException(sb.toString());
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
}
