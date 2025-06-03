// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C4;

public final class b extends v
{
    public static b a;
    
    public static b e() {
        // monitorenter(b.class)
        while (true) {
            try {
                if (b.a == null) {
                    b.a = new b();
                }
                // monitorexit(b.class)
                return b.a;
                // monitorexit(b.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public String b() {
        return "firebase_performance_collection_deactivated";
    }
    
    public Boolean d() {
        return Boolean.FALSE;
    }
}
