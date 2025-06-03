// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import v6.b;
import X5.f;
import g6.l;
import v6.a;
import X5.d;
import g6.p;

public enum K
{
    o("DEFAULT", 0), 
    p("LAZY", 1), 
    q("ATOMIC", 2), 
    r("UNDISPATCHED", 3);
    
    static {
        s = c();
    }
    
    public K(final String name, final int ordinal) {
    }
    
    public static final /* synthetic */ K[] c() {
        return new K[] { K.o, K.p, K.q, K.r };
    }
    
    public final void e(final p p3, final Object o, final d d) {
        final int n = a.a[this.ordinal()];
        if (n == 1) {
            v6.a.d(p3, o, d, null, 4, null);
            return;
        }
        if (n == 2) {
            f.a(p3, o, d);
            return;
        }
        if (n == 3) {
            b.a(p3, o, d);
            return;
        }
        if (n == 4) {
            return;
        }
        throw new V5.l();
    }
    
    public final boolean h() {
        return this == K.p;
    }
}
