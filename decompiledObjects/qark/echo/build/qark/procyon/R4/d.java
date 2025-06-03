// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R4;

import l4.f;

public enum d implements f
{
    p("COLLECTION_UNKNOWN", 0, 0), 
    q("COLLECTION_SDK_NOT_INSTALLED", 1, 1), 
    r("COLLECTION_ENABLED", 2, 2), 
    s("COLLECTION_DISABLED", 3, 3), 
    t("COLLECTION_DISABLED_REMOTE", 4, 4), 
    u("COLLECTION_SAMPLED", 5, 5);
    
    public final int o;
    
    static {
        v = c();
    }
    
    public d(final String name, final int ordinal, final int o) {
        this.o = o;
    }
    
    public static final /* synthetic */ d[] c() {
        return new d[] { d.p, d.q, d.r, d.s, d.t, d.u };
    }
    
    @Override
    public int g() {
        return this.o;
    }
}
