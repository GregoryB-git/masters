// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u6;

import p6.N0;
import p6.a0;
import java.util.concurrent.CancellationException;
import V5.t;
import p6.E;
import V5.o;
import V5.n;
import X5.g;
import p6.q0;
import p6.U;
import p6.L0;
import p6.D;
import g6.l;
import X5.d;

public abstract class k
{
    public static final F a;
    public static final F b;
    
    static {
        a = new F("UNDEFINED");
        b = new F("REUSABLE_CLAIMED");
    }
    
    public static final void b(d d, final Object o, l b) {
        while (true) {
            Label_0309: {
                if (!(d instanceof j)) {
                    break Label_0309;
                }
                final j j = (j)d;
                final Object b2 = D.b(o, b);
                if (j.r.F(j.getContext())) {
                    j.t = b2;
                    j.q = 1;
                    j.r.E(j.getContext(), j);
                    return;
                }
                b = (l)L0.a.b();
                if (((a0)b).O()) {
                    j.t = b2;
                    j.q = 1;
                    ((a0)b).K(j);
                    return;
                }
                ((a0)b).M(true);
                try {
                    g context = j.getContext().b((g.c)q0.n);
                    Label_0255: {
                        if (context != null && !((q0)context).a()) {
                            final CancellationException s = ((q0)context).s();
                            j.b(b2, s);
                            d = (d)n.o;
                            j.resumeWith(n.a(o.a(s)));
                            break Label_0255;
                        }
                        d = j.s;
                        Object o2 = j.u;
                        context = d.getContext();
                        o2 = J.c(context, o2);
                        if (o2 != J.a) {
                            d = E.g(d, context, o2);
                        }
                        else {
                            d = null;
                        }
                        while (true) {
                            while (true) {
                                try {
                                    j.s.resumeWith(o);
                                    final t a = t.a;
                                    if (d == null || ((N0)d).K0()) {
                                        J.a(context, o2);
                                    }
                                    while (((a0)b).R()) {}
                                    ((a0)b).H(true);
                                    return;
                                }
                                finally {
                                    if (d == null || ((N0)d).K0()) {
                                        J.a(context, o2);
                                    }
                                }
                                try {
                                    final Throwable t;
                                    j.h(t, null);
                                    continue;
                                }
                                finally {
                                    ((a0)b).H(true);
                                }
                                break;
                            }
                            break;
                        }
                    }
                    d.resumeWith(o);
                    return;
                }
                finally {}
            }
            final Throwable t2;
            final Throwable t = t2;
            continue;
        }
    }
}
