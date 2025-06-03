// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l2;

import m2.x;
import g2.e;
import java.util.concurrent.Executor;
import U5.a;
import h2.b;

public final class d implements b
{
    public final a a;
    public final a b;
    public final a c;
    public final a d;
    public final a e;
    
    public d(final a a, final a b, final a c, final a d, final a e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static d a(final a a, final a a2, final a a3, final a a4, final a a5) {
        return new d(a, a2, a3, a4, a5);
    }
    
    public static c c(final Executor executor, final e e, final x x, final n2.d d, final o2.b b) {
        return new c(executor, e, x, d, b);
    }
    
    public c b() {
        return c((Executor)this.a.get(), (e)this.b.get(), (x)this.c.get(), (n2.d)this.d.get(), (o2.b)this.e.get());
    }
}
