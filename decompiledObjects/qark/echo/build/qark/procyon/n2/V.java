// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package n2;

import android.content.Context;
import U5.a;
import h2.b;

public final class V implements b
{
    public final a a;
    public final a b;
    public final a c;
    
    public V(final a a, final a b, final a c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static V a(final a a, final a a2, final a a3) {
        return new V(a, a2, a3);
    }
    
    public static U c(final Context context, final String s, final int n) {
        return new U(context, s, n);
    }
    
    public U b() {
        return c((Context)this.a.get(), (String)this.b.get(), (int)this.c.get());
    }
}
