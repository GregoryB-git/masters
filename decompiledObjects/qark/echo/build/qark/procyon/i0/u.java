// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i0;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class u
{
    public final Map a;
    public Map b;
    
    public u() {
        this.a = new HashMap();
    }
    
    public void a(final Map map) {
        synchronized (this) {
            this.b = null;
            this.a.clear();
            this.a.putAll(map);
        }
    }
    
    public Map b() {
        // monitorenter(this)
        while (true) {
            try {
                if (this.b == null) {
                    this.b = Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>(this.a));
                }
                // monitorexit(this)
                return this.b;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
