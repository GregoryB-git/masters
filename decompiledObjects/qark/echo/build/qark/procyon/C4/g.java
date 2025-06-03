// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C4;

public final class g extends v
{
    public static g a;
    
    public static g e() {
        // monitorenter(g.class)
        while (true) {
            try {
                if (g.a == null) {
                    g.a = new g();
                }
                // monitorexit(g.class)
                return g.a;
                // monitorexit(g.class)
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
        return "com.google.firebase.perf.NetworkEventCountBackground";
    }
    
    @Override
    public String c() {
        return "fpr_rl_network_event_count_bg";
    }
    
    public Long d() {
        return 70L;
    }
}
