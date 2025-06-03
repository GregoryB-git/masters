// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package f2;

import m2.v;
import m2.r;
import l2.e;
import U5.a;
import h2.b;

public final class w implements b
{
    public final a a;
    public final a b;
    public final a c;
    public final a d;
    public final a e;
    
    public w(final a a, final a b, final a c, final a d, final a e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static w a(final a a, final a a2, final a a3, final a a4, final a a5) {
        return new w(a, a2, a3, a4, a5);
    }
    
    public static u c(final p2.a a, final p2.a a2, final e e, final r r, final v v) {
        return new u(a, a2, e, r, v);
    }
    
    public u b() {
        return c((p2.a)this.a.get(), (p2.a)this.b.get(), (e)this.c.get(), (r)this.d.get(), (v)this.e.get());
    }
}
