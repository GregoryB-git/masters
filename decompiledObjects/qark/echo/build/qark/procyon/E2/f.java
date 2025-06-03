// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class f
{
    public static List a() {
        return Collections.emptyList();
    }
    
    public static List b(final Object o) {
        return Collections.singletonList(o);
    }
    
    public static List c(final Object... a) {
        final int length = a.length;
        if (length == 0) {
            return a();
        }
        if (length != 1) {
            return Collections.unmodifiableList((List<?>)Arrays.asList((T[])a));
        }
        return b(a[0]);
    }
}
