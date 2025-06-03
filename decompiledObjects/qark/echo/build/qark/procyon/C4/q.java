// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C4;

public final class q extends v
{
    public static q a;
    
    public static q f() {
        // monitorenter(q.class)
        while (true) {
            try {
                if (q.a == null) {
                    q.a = new q();
                }
                // monitorexit(q.class)
                return q.a;
                // monitorexit(q.class)
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
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
    }
    
    @Override
    public String b() {
        return "sessions_memory_capture_frequency_fg_ms";
    }
    
    @Override
    public String c() {
        return "fpr_session_gauge_memory_capture_frequency_fg_ms";
    }
    
    public Long d() {
        return 100L;
    }
    
    public Long e() {
        return this.d() * 3L;
    }
}
