// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public enum a
{
    o("S256", 0, "S256"), 
    p("PLAIN", 1, "plain");
    
    static {
        q = c();
    }
    
    public a(final String name, final int ordinal, final String s) {
    }
    
    public static final /* synthetic */ a[] c() {
        return new a[] { a.o, a.p };
    }
}
