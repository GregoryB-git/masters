// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C4;

public final class r extends v
{
    public static r a;
    
    public static r f() {
        // monitorenter(r.class)
        while (true) {
            try {
                if (r.a == null) {
                    r.a = new r();
                }
                // monitorexit(r.class)
                return r.a;
                // monitorexit(r.class)
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
        return "com.google.firebase.perf.SessionSamplingRate";
    }
    
    @Override
    public String b() {
        return "sessions_sampling_percentage";
    }
    
    @Override
    public String c() {
        return "fpr_vc_session_sampling_rate";
    }
    
    public Double d() {
        return 0.01;
    }
    
    public Double e() {
        return this.d() / 1000.0;
    }
}
