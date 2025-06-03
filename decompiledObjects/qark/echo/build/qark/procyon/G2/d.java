// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package G2;

import android.content.Context;

public class d
{
    public static d b;
    public c a;
    
    static {
        d.b = new d();
    }
    
    public d() {
        this.a = null;
    }
    
    public static c a(final Context context) {
        return d.b.b(context);
    }
    
    public final c b(final Context context) {
        // monitorenter(this)
        while (true) {
            try {
                if (this.a == null) {
                    Context applicationContext = context;
                    if (context.getApplicationContext() != null) {
                        applicationContext = context.getApplicationContext();
                    }
                    this.a = new c(applicationContext);
                }
                // monitorexit(this)
                return this.a;
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
