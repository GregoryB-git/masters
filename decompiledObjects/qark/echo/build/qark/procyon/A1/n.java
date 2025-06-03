// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public enum n
{
    p("EVENT", 0, "event"), 
    q("ACTION_SOURCE", 1, "action_source"), 
    r("APP", 2, "app"), 
    s("MOBILE_APP_INSTALL", 3, "MobileAppInstall"), 
    t("INSTALL_EVENT_TIME", 4, "install_timestamp");
    
    public final String o;
    
    static {
        u = c();
    }
    
    public n(final String name, final int ordinal, final String o) {
        this.o = o;
    }
    
    public static final /* synthetic */ n[] c() {
        return new n[] { n.p, n.q, n.r, n.s, n.t };
    }
    
    public final String e() {
        return this.o;
    }
}
