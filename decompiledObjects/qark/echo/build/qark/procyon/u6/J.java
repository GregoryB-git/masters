// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u6;

import p6.K0;
import kotlin.jvm.internal.Intrinsics;
import X5.g;
import g6.p;

public abstract class J
{
    public static final F a;
    public static final p b;
    public static final p c;
    public static final p d;
    
    static {
        a = new F("NO_THREAD_ELEMENTS");
        b = J$a.o;
        c = J$b.o;
        d = J$c.o;
    }
    
    public static final void a(final g g, final Object o) {
        if (o == J.a) {
            return;
        }
        if (o instanceof N) {
            ((N)o).b(g);
            return;
        }
        final Object u = g.u(null, J.c);
        Intrinsics.c(u, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((K0)u).D(g, o);
    }
    
    public static final Object b(final g g) {
        final Object u = g.u(0, J.b);
        Intrinsics.b(u);
        return u;
    }
    
    public static final Object c(final g g, final Object o) {
        Object b = o;
        if (o == null) {
            b = b(g);
        }
        if (b == Integer.valueOf(0)) {
            return J.a;
        }
        if (b instanceof Integer) {
            return g.u(new N(g, ((Integer)b).intValue()), J.d);
        }
        Intrinsics.c(b, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((K0)b).B(g);
    }
}
