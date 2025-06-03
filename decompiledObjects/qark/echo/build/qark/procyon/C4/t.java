// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C4;

public final class t extends v
{
    public static t a;
    
    public static t e() {
        // monitorenter(t.class)
        while (true) {
            try {
                if (t.a == null) {
                    t.a = new t();
                }
                // monitorexit(t.class)
                return t.a;
                // monitorexit(t.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public String a() {
        return "com.google.firebase.perf.TraceEventCountForeground";
    }
    
    @Override
    public String c() {
        return "fpr_rl_trace_event_count_fg";
    }
    
    public Long d() {
        return 300L;
    }
}
