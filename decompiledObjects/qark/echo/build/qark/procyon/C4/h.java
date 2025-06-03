// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C4;

public final class h extends v
{
    public static h a;
    
    public static h e() {
        // monitorenter(h.class)
        while (true) {
            try {
                if (h.a == null) {
                    h.a = new h();
                }
                // monitorexit(h.class)
                return h.a;
                // monitorexit(h.class)
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
        return "com.google.firebase.perf.NetworkEventCountForeground";
    }
    
    @Override
    public String c() {
        return "fpr_rl_network_event_count_fg";
    }
    
    public Long d() {
        return 700L;
    }
}
