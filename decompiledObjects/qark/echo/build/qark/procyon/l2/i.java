// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l2;

import m2.x;
import m2.f;
import n2.d;
import android.content.Context;
import U5.a;
import h2.b;

public final class i implements b
{
    public final a a;
    public final a b;
    public final a c;
    public final a d;
    
    public i(final a a, final a b, final a c, final a d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static i a(final a a, final a a2, final a a3, final a a4) {
        return new i(a, a2, a3, a4);
    }
    
    public static x c(final Context context, final d d, final f f, final p2.a a) {
        return (x)h2.d.c(h.a(context, d, f, a), "Cannot return null from a non-@Nullable @Provides method");
    }
    
    public x b() {
        return c((Context)this.a.get(), (d)this.b.get(), (f)this.c.get(), (p2.a)this.d.get());
    }
}
