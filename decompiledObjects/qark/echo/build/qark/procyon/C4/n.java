// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C4;

public final class n extends v
{
    public static n a;
    
    public static n f() {
        // monitorenter(n.class)
        while (true) {
            try {
                if (n.a == null) {
                    n.a = new n();
                }
                // monitorexit(n.class)
                return n.a;
                // monitorexit(n.class)
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
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
    }
    
    @Override
    public String b() {
        return "sessions_cpu_capture_frequency_fg_ms";
    }
    
    @Override
    public String c() {
        return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
    }
    
    public Long d() {
        return 100L;
    }
    
    public Long e() {
        return this.d() * 3L;
    }
}
