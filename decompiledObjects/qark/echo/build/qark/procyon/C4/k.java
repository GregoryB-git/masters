// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C4;

public final class k extends v
{
    public static k a;
    
    public static k e() {
        // monitorenter(k.class)
        while (true) {
            try {
                if (k.a == null) {
                    k.a = new k();
                }
                // monitorexit(k.class)
                return k.a;
                // monitorexit(k.class)
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
        return "com.google.firebase.perf.SdkDisabledVersions";
    }
    
    @Override
    public String c() {
        return "fpr_disabled_android_versions";
    }
    
    public String d() {
        return "";
    }
}
