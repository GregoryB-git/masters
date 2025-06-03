// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R4;

import l4.f;

public enum n implements f
{
    p("LOG_ENVIRONMENT_UNKNOWN", 0, 0), 
    q("LOG_ENVIRONMENT_AUTOPUSH", 1, 1), 
    r("LOG_ENVIRONMENT_STAGING", 2, 2), 
    s("LOG_ENVIRONMENT_PROD", 3, 3);
    
    public final int o;
    
    static {
        t = c();
    }
    
    public n(final String name, final int ordinal, final int o) {
        this.o = o;
    }
    
    public static final /* synthetic */ n[] c() {
        return new n[] { n.p, n.q, n.r, n.s };
    }
    
    @Override
    public int g() {
        return this.o;
    }
}
