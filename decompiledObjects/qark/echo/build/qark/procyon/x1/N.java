// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public enum N
{
    o("REQUESTS", 0), 
    p("INCLUDE_ACCESS_TOKENS", 1), 
    q("INCLUDE_RAW_RESPONSES", 2), 
    r("CACHE", 3), 
    s("APP_EVENTS", 4), 
    t("DEVELOPER_ERRORS", 5), 
    u("GRAPH_API_DEBUG_WARNING", 6), 
    v("GRAPH_API_DEBUG_INFO", 7);
    
    static {
        w = c();
    }
    
    public N(final String name, final int ordinal) {
    }
    
    public static final /* synthetic */ N[] c() {
        return new N[] { N.o, N.p, N.q, N.r, N.s, N.t, N.u, N.v };
    }
}
