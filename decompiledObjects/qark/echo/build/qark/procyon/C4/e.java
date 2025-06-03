// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C4;

public final class e extends v
{
    public static e a;
    
    public static e e() {
        // monitorenter(e.class)
        while (true) {
            try {
                if (e.a == null) {
                    e.a = new e();
                }
                // monitorexit(e.class)
                return e.a;
                // monitorexit(e.class)
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
        return "com.google.firebase.perf.FragmentSamplingRate";
    }
    
    @Override
    public String b() {
        return "fragment_sampling_percentage";
    }
    
    @Override
    public String c() {
        return "fpr_vc_fragment_sampling_rate";
    }
    
    public Double d() {
        return 0.0;
    }
}
