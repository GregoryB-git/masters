// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C4;

public final class c extends v
{
    public static c a;
    
    public static c d() {
        // monitorenter(c.class)
        while (true) {
            try {
                if (c.a == null) {
                    c.a = new c();
                }
                // monitorexit(c.class)
                return c.a;
                // monitorexit(c.class)
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
        return "isEnabled";
    }
    
    @Override
    public String b() {
        return "firebase_performance_collection_enabled";
    }
}
