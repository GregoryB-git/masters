// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C4;

import A4.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class f extends v
{
    public static f a;
    public static final Map b;
    
    static {
        b = Collections.unmodifiableMap((Map<?, ?>)new HashMap() {
            {
                this.put(461L, "FIREPERF_AUTOPUSH");
                this.put(462L, "FIREPERF");
                this.put(675L, "FIREPERF_INTERNAL_LOW");
                this.put(676L, "FIREPERF_INTERNAL_HIGH");
            }
        });
    }
    
    public static f e() {
        // monitorenter(f.class)
        while (true) {
            try {
                if (f.a == null) {
                    f.a = new f();
                }
                // monitorexit(f.class)
                return f.a;
                // monitorexit(f.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static String f(final long l) {
        return f.b.get(l);
    }
    
    public static boolean g(final long l) {
        return f.b.containsKey(l);
    }
    
    @Override
    public String a() {
        return "com.google.firebase.perf.LogSourceName";
    }
    
    @Override
    public String c() {
        return "fpr_log_source";
    }
    
    public String d() {
        return A4.a.c;
    }
}
