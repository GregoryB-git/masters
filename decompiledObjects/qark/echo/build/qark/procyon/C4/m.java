// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C4;

public final class m extends v
{
    public static m a;
    
    public static m e() {
        // monitorenter(m.class)
        while (true) {
            try {
                if (m.a == null) {
                    m.a = new m();
                }
                // monitorexit(m.class)
                return m.a;
                // monitorexit(m.class)
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
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
    }
    
    @Override
    public String b() {
        return "sessions_cpu_capture_frequency_bg_ms";
    }
    
    @Override
    public String c() {
        return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
    }
    
    public Long d() {
        return 0L;
    }
}
