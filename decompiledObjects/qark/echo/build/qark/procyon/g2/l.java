// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g2;

import android.content.Context;
import U5.a;
import h2.b;

public final class l implements b
{
    public final a a;
    public final a b;
    
    public l(final a a, final a b) {
        this.a = a;
        this.b = b;
    }
    
    public static l a(final a a, final a a2) {
        return new l(a, a2);
    }
    
    public static k c(final Context context, final Object o) {
        return new k(context, (i)o);
    }
    
    public k b() {
        return c((Context)this.a.get(), this.b.get());
    }
}
