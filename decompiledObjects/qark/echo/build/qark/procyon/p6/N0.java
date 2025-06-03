// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import V5.q;
import V5.t;
import V5.m;
import u6.J;
import X5.e;
import X5.d;
import X5.g;
import u6.B;

public final class N0 extends B
{
    public final ThreadLocal s;
    private volatile boolean threadLocalIsSet;
    
    public N0(final g g, final d d) {
        final O0 o = O0.o;
        g k;
        if (g.b((g.c)o) == null) {
            k = g.k(o);
        }
        else {
            k = g;
        }
        super(k, d);
        this.s = new ThreadLocal();
        if (!(d.getContext().b((g.c)X5.e.c) instanceof F)) {
            final Object c = J.c(g, null);
            J.a(g, c);
            this.L0(g, c);
        }
    }
    
    @Override
    public void G0(Object g) {
        if (this.threadLocalIsSet) {
            final m m = this.s.get();
            if (m != null) {
                J.a((g)m.a(), m.b());
            }
            this.s.remove();
        }
        final Object a = D.a(g, super.r);
        final d r = super.r;
        final g context = r.getContext();
        g = null;
        final Object c = J.c(context, null);
        if (c != J.a) {
            g = E.g(r, context, c);
        }
        try {
            super.r.resumeWith(a);
            final V5.t a2 = V5.t.a;
        }
        finally {
            if (g == null || ((N0)g).K0()) {
                J.a(context, c);
            }
        }
    }
    
    public final boolean K0() {
        final boolean b = this.threadLocalIsSet && this.s.get() == null;
        this.s.remove();
        return b ^ true;
    }
    
    public final void L0(final g g, final Object o) {
        this.threadLocalIsSet = true;
        this.s.set(V5.q.a(g, o));
    }
}
