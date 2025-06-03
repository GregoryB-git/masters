// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u3;

import t3.c;
import java.util.HashMap;
import r4.b;
import android.content.Context;
import java.util.Map;

public class a
{
    public final Map a;
    public final Context b;
    public final b c;
    
    public a(final Context b, final b c) {
        this.a = new HashMap();
        this.b = b;
        this.c = c;
    }
    
    public c a(final String s) {
        return new c(this.b, this.c, s);
    }
    
    public c b(final String s) {
        // monitorenter(this)
        while (true) {
            try {
                if (!this.a.containsKey(s)) {
                    this.a.put(s, this.a(s));
                }
                // monitorexit(this)
                return this.a.get(s);
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
