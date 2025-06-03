// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O1;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;

public final class z
{
    public static final z a;
    public static volatile String b;
    
    static {
        a = new z();
    }
    
    public static final String a() {
        return z.b;
    }
    
    public static final boolean b() {
        final String b = z.b;
        Object value = null;
        if (b != null) {
            value = i.s(b, "Unity.", false, 2, null);
        }
        return Intrinsics.a(value, Boolean.TRUE);
    }
}
