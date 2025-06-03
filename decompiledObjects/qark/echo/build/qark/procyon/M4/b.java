// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package M4;

public enum b
{
    p("TRACE_EVENT_RATE_LIMITED", 0, "_fstec"), 
    q("NETWORK_TRACE_EVENT_RATE_LIMITED", 1, "_fsntc"), 
    r("TRACE_STARTED_NOT_STOPPED", 2, "_tsns"), 
    s("FRAMES_TOTAL", 3, "_fr_tot"), 
    t("FRAMES_SLOW", 4, "_fr_slo"), 
    u("FRAMES_FROZEN", 5, "_fr_fzn");
    
    public String o;
    
    public b(final String name, final int ordinal, final String o) {
        this.o = o;
    }
    
    @Override
    public String toString() {
        return this.o;
    }
}
