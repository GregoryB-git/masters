// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import X5.d;
import X5.e;
import kotlin.jvm.internal.l;
import g6.p;
import X5.h;
import kotlin.jvm.internal.u;
import X5.g;

public abstract class E
{
    public static final g a(g g, final g o, final boolean b) {
        final boolean c = c(g);
        final boolean c2 = c(o);
        if (!c && !c2) {
            return g.k(o);
        }
        final u u = new u();
        u.o = o;
        final h o2 = h.o;
        g = (g)g.u(o2, new p() {
            public final g a(final g g, final g.b b) {
                return g.k(b);
            }
        });
        if (c2) {
            u.o = ((g)u.o).u(o2, E$a.o);
        }
        return g.k((g)u.o);
    }
    
    public static final String b(final g g) {
        return null;
    }
    
    public static final boolean c(final g g) {
        return (boolean)g.u(Boolean.FALSE, E$c.o);
    }
    
    public static final g d(final g g, final g g2) {
        if (!c(g2)) {
            return g.k(g2);
        }
        return a(g, g2, false);
    }
    
    public static final g e(final I i, g g) {
        g g2;
        g = (g2 = a(i.f(), g, true));
        if (g != W.a()) {
            g2 = g;
            if (g.b((g.c)e.c) == null) {
                g2 = g.k(W.a());
            }
        }
        return g2;
    }
    
    public static final N0 f(Z5.e e) {
        while (!(e instanceof T)) {
            final Z5.e callerFrame = e.getCallerFrame();
            if (callerFrame == null) {
                return null;
            }
            e = callerFrame;
            if (callerFrame instanceof N0) {
                return (N0)callerFrame;
            }
        }
        return null;
    }
    
    public static final N0 g(final d d, final g g, final Object o) {
        if (!(d instanceof Z5.e)) {
            return null;
        }
        if (g.b((g.c)O0.o) != null) {
            final N0 f = f((Z5.e)d);
            if (f != null) {
                f.L0(g, o);
            }
            return f;
        }
        return null;
    }
}
