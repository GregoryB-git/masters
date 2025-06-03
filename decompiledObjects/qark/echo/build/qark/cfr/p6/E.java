/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 */
package p6;

import X5.d;
import X5.e;
import X5.g;
import X5.h;
import Z5.e;
import g6.p;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.u;
import p6.I;
import p6.N0;
import p6.O0;
import p6.T;
import p6.W;

public abstract class E {
    public static final g a(g g8, g g9, final boolean bl) {
        boolean bl2 = E.c(g8);
        boolean bl3 = E.c(g9);
        if (!bl2 && !bl3) {
            return g8.k(g9);
        }
        final u u8 = new u();
        u8.o = g9;
        g9 = h.o;
        g8 = (g)g8.u(g9, new p(){

            public final g a(g g8, g.b b8) {
                return g8.k(b8);
            }
        });
        if (bl3) {
            u8.o = ((g)u8.o).u(g9, .o);
        }
        return g8.k((g)u8.o);
    }

    public static final String b(g g8) {
        return null;
    }

    public static final boolean c(g g8) {
        return (Boolean)g8.u((Object)Boolean.FALSE, .o);
    }

    public static final g d(g g8, g g9) {
        if (!E.c(g9)) {
            return g8.k(g9);
        }
        return E.a(g8, g9, false);
    }

    public static final g e(I object, g g8) {
        g8 = E.a(object.f(), g8, true);
        object = g8;
        if (g8 != W.a()) {
            object = g8;
            if (g8.b(X5.e.c) == null) {
                object = g8.k(W.a());
            }
        }
        return object;
    }

    public static final N0 f(e e8) {
        e e9;
        do {
            if (e8 instanceof T) {
                return null;
            }
            e9 = e8.getCallerFrame();
            if (e9 == null) {
                return null;
            }
            e8 = e9;
        } while (!(e9 instanceof N0));
        return (N0)e9;
    }

    public static final N0 g(d d8, g g8, Object object) {
        if (!(d8 instanceof e)) {
            return null;
        }
        if (g8.b(O0.o) != null) {
            if ((d8 = E.f((e)((Object)d8))) != null) {
                d8.L0(g8, object);
            }
            return d8;
        }
        return null;
    }

}

