// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C4;

public final class l extends v
{
    public static l a;
    
    public static l e() {
        // monitorenter(l.class)
        while (true) {
            try {
                if (l.a == null) {
                    l.a = new l();
                }
                // monitorexit(l.class)
                return l.a;
                // monitorexit(l.class)
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
        return "com.google.firebase.perf.SdkEnabled";
    }
    
    @Override
    public String c() {
        return "fpr_enabled";
    }
    
    public Boolean d() {
        return Boolean.TRUE;
    }
}
