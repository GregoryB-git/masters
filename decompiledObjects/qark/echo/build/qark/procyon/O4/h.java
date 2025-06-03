// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O4;

import B3.r;
import android.content.Context;
import B3.c;
import B3.e;

public abstract class h
{
    public static c b(final String s, final String s2) {
        return c.l(f.a(s, s2), f.class);
    }
    
    public static c c(final String s, final a a) {
        return c.m(f.class).b(r.k(Context.class)).f(new g(s, a)).d();
    }
    
    public interface a
    {
        String a(final Object p0);
    }
}
