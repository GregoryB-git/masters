// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package v5;

import io.flutter.embedding.engine.b;
import java.util.HashMap;
import java.util.Map;

public class c
{
    public static volatile c b;
    public final Map a;
    
    public c() {
        this.a = new HashMap();
    }
    
    public static c b() {
        while (true) {
            if (c.b == null) {
                // monitorenter(c.class)
                while (true) {
                    try {
                        if (c.b == null) {
                            c.b = new c();
                        }
                        // monitorexit(c.class)
                        return c.b;
                    }
                    // monitorexit(c.class)
                    finally {}
                    continue;
                }
            }
            continue;
        }
    }
    
    public b a(final String s) {
        return this.a.get(s);
    }
}
