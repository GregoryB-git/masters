// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C4;

public final class u extends v
{
    public static u a;
    
    public static u f() {
        // monitorenter(u.class)
        while (true) {
            try {
                if (u.a == null) {
                    u.a = new u();
                }
                // monitorexit(u.class)
                return u.a;
                // monitorexit(u.class)
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
        return "com.google.firebase.perf.TraceSamplingRate";
    }
    
    @Override
    public String c() {
        return "fpr_vc_trace_sampling_rate";
    }
    
    public Double d() {
        return 1.0;
    }
    
    public Double e() {
        return this.d() / 1000.0;
    }
}
