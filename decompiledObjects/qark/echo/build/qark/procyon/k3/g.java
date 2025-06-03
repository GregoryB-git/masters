// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k3;

import n3.c;
import n3.b;
import java.util.concurrent.atomic.AtomicReference;

public final class g
{
    public static final g b;
    public static final b c;
    public final AtomicReference a;
    
    static {
        b = new g();
        c = new b(null);
    }
    
    public g() {
        this.a = new AtomicReference();
    }
    
    public static g b() {
        return g.b;
    }
    
    public n3.b a() {
        n3.b c;
        if ((c = this.a.get()) == null) {
            c = g.c;
        }
        return c;
    }
    
    public static class b implements n3.b
    {
        @Override
        public a a(final c c, final String s, final String s2) {
            return f.a;
        }
    }
}
