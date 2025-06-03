// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package n2;

import U5.a;
import h2.b;

public final class N implements b
{
    public final a a;
    public final a b;
    public final a c;
    public final a d;
    public final a e;
    
    public N(final a a, final a b, final a c, final a d, final a e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static N a(final a a, final a a2, final a a3, final a a4, final a a5) {
        return new N(a, a2, a3, a4, a5);
    }
    
    public static M c(final p2.a a, final p2.a a2, final Object o, final Object o2, final a a3) {
        return new M(a, a2, (e)o, (U)o2, a3);
    }
    
    public M b() {
        return c((p2.a)this.a.get(), (p2.a)this.b.get(), this.c.get(), this.d.get(), this.e);
    }
}
