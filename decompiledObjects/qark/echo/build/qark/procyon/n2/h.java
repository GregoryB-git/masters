// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package n2;

import h2.d;
import android.content.Context;
import U5.a;
import h2.b;

public final class h implements b
{
    public final a a;
    
    public h(final a a) {
        this.a = a;
    }
    
    public static h a(final a a) {
        return new h(a);
    }
    
    public static String c(final Context context) {
        return (String)d.c(f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }
    
    public String b() {
        return c((Context)this.a.get());
    }
}
