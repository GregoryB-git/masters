// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public enum k
{
    p("USER_DATA", 0, "user_data"), 
    q("APP_DATA", 1, "app_data"), 
    r("CUSTOM_DATA", 2, "custom_data"), 
    s("CUSTOM_EVENTS", 3, "custom_events");
    
    public final String o;
    
    static {
        t = c();
    }
    
    public k(final String name, final int ordinal, final String o) {
        this.o = o;
    }
    
    public static final /* synthetic */ k[] c() {
        return new k[] { k.p, k.q, k.r, k.s };
    }
    
    public final String e() {
        return this.o;
    }
}
