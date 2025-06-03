// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C4;

public final class o extends v
{
    public static o a;
    
    public static o e() {
        // monitorenter(o.class)
        while (true) {
            try {
                if (o.a == null) {
                    o.a = new o();
                }
                // monitorexit(o.class)
                return o.a;
                // monitorexit(o.class)
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
        return "com.google.firebase.perf.SessionsMaxDurationMinutes";
    }
    
    @Override
    public String b() {
        return "sessions_max_length_minutes";
    }
    
    @Override
    public String c() {
        return "fpr_session_max_duration_min";
    }
    
    public Long d() {
        return 240L;
    }
}
