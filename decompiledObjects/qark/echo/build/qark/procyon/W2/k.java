// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W2;

import java.util.Arrays;

public abstract class k extends f
{
    public static boolean a(final Object o, final Object obj) {
        return o == obj || (o != null && o.equals(obj));
    }
    
    public static int b(final Object... a) {
        return Arrays.hashCode(a);
    }
}
