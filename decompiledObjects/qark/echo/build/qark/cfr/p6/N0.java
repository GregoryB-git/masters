/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.ThreadLocal
 */
package p6;

import V5.m;
import V5.q;
import V5.t;
import X5.d;
import X5.e;
import X5.g;
import p6.D;
import p6.E;
import p6.F;
import p6.O0;
import u6.B;
import u6.J;

public final class N0
extends B {
    public final ThreadLocal s;
    private volatile boolean threadLocalIsSet;

    public N0(g g8, d object) {
        g g9 = O0.o;
        g9 = g8.b((g.c)((Object)g9)) == null ? g8.k(g9) : g8;
        super(g9, (d)object);
        this.s = new ThreadLocal();
        if (!(object.getContext().b(e.c) instanceof F)) {
            object = J.c(g8, null);
            J.a(g8, object);
            this.L0(g8, object);
        }
    }

    @Override
    public void G0(Object object) {
        Object object2;
        if (this.threadLocalIsSet) {
            object2 = (m)this.s.get();
            if (object2 != null) {
                J.a((g)object2.a(), object2.b());
            }
            this.s.remove();
        }
        Object object3 = D.a(object, this.r);
        d d8 = this.r;
        object2 = d8.getContext();
        object = null;
        Object object4 = J.c((g)object2, null);
        if (object4 != J.a) {
            object = E.g(d8, (g)object2, object4);
        }
        try {
            this.r.resumeWith(object3);
            object3 = t.a;
            return;
        }
        finally {
            if (object == null || object.K0()) {
                J.a((g)object2, object4);
            }
        }
    }

    public final boolean K0() {
        boolean bl = this.threadLocalIsSet && this.s.get() == null;
        this.s.remove();
        return bl ^ true;
    }

    public final void L0(g g8, Object object) {
        this.threadLocalIsSet = true;
        this.s.set((Object)q.a(g8, object));
    }
}

