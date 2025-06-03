// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public enum D
{
    o("SUCCESS", 0), 
    p("SERVER_ERROR", 1), 
    q("NO_CONNECTIVITY", 2), 
    r("UNKNOWN_ERROR", 3);
    
    static {
        s = c();
    }
    
    public D(final String name, final int ordinal) {
    }
    
    public static final /* synthetic */ D[] c() {
        return new D[] { D.o, D.p, D.q, D.r };
    }
}
