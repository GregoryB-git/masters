// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C4;

public final class d extends v
{
    public static d a;
    
    public static d e() {
        // monitorenter(d.class)
        while (true) {
            try {
                if (d.a == null) {
                    d.a = new d();
                }
                // monitorexit(d.class)
                return d.a;
                // monitorexit(d.class)
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
        return "com.google.firebase.perf.ExperimentTTID";
    }
    
    @Override
    public String b() {
        return "experiment_app_start_ttid";
    }
    
    @Override
    public String c() {
        return "fpr_experiment_app_start_ttid";
    }
    
    public Boolean d() {
        return Boolean.FALSE;
    }
}
