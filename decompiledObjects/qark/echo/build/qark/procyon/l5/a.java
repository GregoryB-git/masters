// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l5;

public enum a
{
    o("idle", 0), 
    p("loading", 1), 
    q("buffering", 2), 
    r("ready", 3), 
    s("completed", 4), 
    t("error", 5);
    
    static {
        u = c();
    }
    
    public a(final String name, final int ordinal) {
    }
    
    public static /* synthetic */ a[] c() {
        return new a[] { a.o, a.p, a.q, a.r, a.s, a.t };
    }
}
