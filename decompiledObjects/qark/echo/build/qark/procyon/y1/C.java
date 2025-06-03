// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public enum C
{
    o("EXPLICIT", 0), 
    p("TIMER", 1), 
    q("SESSION_CHANGE", 2), 
    r("PERSISTED_EVENTS", 3), 
    s("EVENT_THRESHOLD", 4), 
    t("EAGER_FLUSHING_EVENT", 5);
    
    static {
        u = c();
    }
    
    public C(final String name, final int ordinal) {
    }
    
    public static final /* synthetic */ C[] c() {
        return new C[] { C.o, C.p, C.q, C.r, C.s, C.t };
    }
}
