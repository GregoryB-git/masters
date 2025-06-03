// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package M4;

public enum c
{
    p("APP_START_TRACE_NAME", 0, "_as"), 
    q("ON_CREATE_TRACE_NAME", 1, "_astui"), 
    r("ON_START_TRACE_NAME", 2, "_astfd"), 
    s("ON_RESUME_TRACE_NAME", 3, "_asti"), 
    t("FOREGROUND_TRACE_NAME", 4, "_fs"), 
    u("BACKGROUND_TRACE_NAME", 5, "_bs");
    
    public String o;
    
    public c(final String name, final int ordinal, final String o) {
        this.o = o;
    }
    
    @Override
    public String toString() {
        return this.o;
    }
}
