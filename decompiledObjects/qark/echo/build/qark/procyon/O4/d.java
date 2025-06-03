// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class d
{
    public static volatile d b;
    public final Set a;
    
    public d() {
        this.a = new HashSet();
    }
    
    public static d a() {
        final d b = d.b;
        if (b == null) {
            // monitorenter(d.class)
            while (true) {
                try {
                    d b2;
                    if ((b2 = d.b) == null) {
                        b2 = (d.b = new d());
                    }
                    // monitorexit(d.class)
                    return b2;
                }
                // monitorexit(d.class)
                finally {}
                continue;
            }
        }
        return b;
    }
    
    public Set b() {
        synchronized (this.a) {
            return Collections.unmodifiableSet((Set<?>)this.a);
        }
    }
}
