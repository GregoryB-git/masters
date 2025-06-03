// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C4;

public final class j extends v
{
    public static j a;
    
    public static j e() {
        // monitorenter(j.class)
        while (true) {
            try {
                if (j.a == null) {
                    j.a = new j();
                }
                // monitorexit(j.class)
                return j.a;
                // monitorexit(j.class)
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
        return "com.google.firebase.perf.TimeLimitSec";
    }
    
    @Override
    public String c() {
        return "fpr_rl_time_limit_sec";
    }
    
    public Long d() {
        return 600L;
    }
}
