// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import V5.t;
import u6.J;
import kotlin.jvm.internal.Intrinsics;
import V5.o;
import V5.n;
import X5.g;
import X5.d;
import u6.j;

public abstract class V
{
    public static final void a(final U u, final int n) {
        final d c = u.c();
        final boolean b = n == 4;
        if (b || !(c instanceof j) || b(n) != b(u.q)) {
            d(u, c, b);
            return;
        }
        final F r = ((j)c).r;
        final g context = c.getContext();
        if (r.F(context)) {
            r.E(context, u);
            return;
        }
        e(u);
    }
    
    public static final boolean b(final int n) {
        boolean b = true;
        if (n != 1) {
            if (n == 2) {
                return true;
            }
            b = false;
        }
        return b;
    }
    
    public static final boolean c(final int n) {
        return n == 2;
    }
    
    public static final void d(U g, d context, final boolean b) {
        final Object i = ((U)g).i();
        final Throwable e = ((U)g).e(i);
        Object o2;
        if (e != null) {
            final n.a o = n.o;
            o2 = V5.o.a(e);
        }
        else {
            final n.a o3 = n.o;
            o2 = ((U)g).f(i);
        }
        final Object a = n.a(o2);
        if (b) {
            Intrinsics.c(context, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            final j j = (j)context;
            final d s = j.s;
            final Object u = j.u;
            context = (d)s.getContext();
            final Object c = J.c((g)context, u);
            if (c != J.a) {
                g = E.g(s, (g)context, c);
            }
            else {
                g = null;
            }
            try {
                j.s.resumeWith(a);
                final t a2 = t.a;
                return;
            }
            finally {
                if (g == null || ((N0)g).K0()) {
                    J.a((g)context, c);
                }
            }
        }
        context.resumeWith(a);
    }
    
    public static final void e(final U u) {
        final a0 b = L0.a.b();
        if (b.O()) {
            b.K(u);
            return;
        }
        b.M(true);
        try {
            d(u, u.c(), true);
            while (b.R()) {}
            b.H(true);
        }
        finally {
            try {
                final Throwable t;
                u.h(t, null);
            }
            finally {
                b.H(true);
            }
        }
    }
}
