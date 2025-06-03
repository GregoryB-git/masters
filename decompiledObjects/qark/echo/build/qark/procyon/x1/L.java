// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public enum L
{
    o("GET", 0), 
    p("POST", 1), 
    q("DELETE", 2);
    
    static {
        r = c();
    }
    
    public L(final String name, final int ordinal) {
    }
    
    public static final /* synthetic */ L[] c() {
        return new L[] { L.o, L.p, L.q };
    }
}
