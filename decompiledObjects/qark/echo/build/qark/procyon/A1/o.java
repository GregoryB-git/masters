// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public enum o
{
    p("URL", 0, "endpoint"), 
    q("ENABLED", 1, "is_enabled"), 
    r("DATASETID", 2, "dataset_id"), 
    s("ACCESSKEY", 3, "access_key");
    
    public final String o;
    
    static {
        t = c();
    }
    
    public o(final String name, final int ordinal, final String o) {
        this.o = o;
    }
    
    public static final /* synthetic */ o[] c() {
        return new o[] { o.p, o.q, o.r, o.s };
    }
    
    public final String e() {
        return this.o;
    }
}
