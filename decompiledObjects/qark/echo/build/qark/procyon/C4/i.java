// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C4;

public final class i extends v
{
    public static i a;
    
    public static i f() {
        // monitorenter(i.class)
        while (true) {
            try {
                if (i.a == null) {
                    i.a = new i();
                }
                // monitorexit(i.class)
                return i.a;
                // monitorexit(i.class)
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
        return "com.google.firebase.perf.NetworkRequestSamplingRate";
    }
    
    @Override
    public String c() {
        return "fpr_vc_network_request_sampling_rate";
    }
    
    public Double d() {
        return 1.0;
    }
    
    public Double e() {
        return this.d() / 1000.0;
    }
}
