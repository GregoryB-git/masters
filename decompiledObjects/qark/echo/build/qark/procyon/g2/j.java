// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g2;

import android.content.Context;
import U5.a;
import h2.b;

public final class j implements b
{
    public final a a;
    public final a b;
    public final a c;
    
    public j(final a a, final a b, final a c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static j a(final a a, final a a2, final a a3) {
        return new j(a, a2, a3);
    }
    
    public static i c(final Context context, final p2.a a, final p2.a a2) {
        return new i(context, a, a2);
    }
    
    public i b() {
        return c((Context)this.a.get(), (p2.a)this.b.get(), (p2.a)this.c.get());
    }
}
