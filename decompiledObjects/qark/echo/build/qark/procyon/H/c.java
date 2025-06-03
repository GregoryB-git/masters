// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H;

import java.util.Objects;

public abstract class c
{
    public static boolean a(final Object o, final Object o2) {
        return a.a(o, o2);
    }
    
    public static int b(final Object... array) {
        return a.b(array);
    }
    
    public static Object c(final Object o) {
        o.getClass();
        return o;
    }
    
    public static Object d(final Object o, final String s) {
        if (o != null) {
            return o;
        }
        throw new NullPointerException(s);
    }
    
    public abstract static class a
    {
        public static boolean a(final Object a, final Object b) {
            return Objects.equals(a, b);
        }
        
        public static int b(final Object... values) {
            return Objects.hash(values);
        }
    }
}
