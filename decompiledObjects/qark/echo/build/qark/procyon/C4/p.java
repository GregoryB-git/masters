// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C4;

public final class p extends v
{
    public static p a;
    
    public static p e() {
        // monitorenter(p.class)
        while (true) {
            try {
                if (p.a == null) {
                    p.a = new p();
                }
                // monitorexit(p.class)
                return p.a;
                // monitorexit(p.class)
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
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
    }
    
    @Override
    public String b() {
        return "sessions_memory_capture_frequency_bg_ms";
    }
    
    @Override
    public String c() {
        return "fpr_session_gauge_memory_capture_frequency_bg_ms";
    }
    
    public Long d() {
        return 0L;
    }
}
