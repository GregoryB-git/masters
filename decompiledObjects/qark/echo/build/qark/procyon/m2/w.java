// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m2;

import n2.d;
import java.util.concurrent.Executor;
import U5.a;
import h2.b;

public final class w implements b
{
    public final a a;
    public final a b;
    public final a c;
    public final a d;
    
    public w(final a a, final a b, final a c, final a d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static w a(final a a, final a a2, final a a3, final a a4) {
        return new w(a, a2, a3, a4);
    }
    
    public static v c(final Executor executor, final d d, final x x, final o2.b b) {
        return new v(executor, d, x, b);
    }
    
    public v b() {
        return c((Executor)this.a.get(), (d)this.b.get(), (x)this.c.get(), (o2.b)this.d.get());
    }
}
