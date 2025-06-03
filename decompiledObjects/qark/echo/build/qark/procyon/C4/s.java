// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C4;

public final class s extends v
{
    public static s a;
    
    public static s e() {
        // monitorenter(s.class)
        while (true) {
            try {
                if (s.a == null) {
                    s.a = new s();
                }
                // monitorexit(s.class)
                return s.a;
                // monitorexit(s.class)
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
        return "com.google.firebase.perf.TraceEventCountBackground";
    }
    
    @Override
    public String c() {
        return "fpr_rl_trace_event_count_bg";
    }
    
    public Long d() {
        return 30L;
    }
}
