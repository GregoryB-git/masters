// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import w6.i;
import java.util.concurrent.CancellationException;
import V5.t;
import V5.o;
import V5.n;
import X5.g;
import u6.J;
import u6.j;
import kotlin.jvm.internal.Intrinsics;
import V5.a;
import X5.d;
import w6.h;

public abstract class U extends h
{
    public int q;
    
    public U(final int q) {
        this.q = q;
    }
    
    public abstract void b(final Object p0, final Throwable p1);
    
    public abstract d c();
    
    public Throwable e(final Object o) {
        final boolean b = o instanceof z;
        Throwable a = null;
        z z;
        if (b) {
            z = (z)o;
        }
        else {
            z = null;
        }
        if (z != null) {
            a = z.a;
        }
        return a;
    }
    
    public Object f(final Object o) {
        return o;
    }
    
    public final void h(final Throwable t, final Throwable t2) {
        if (t == null && t2 == null) {
            return;
        }
        if (t != null && t2 != null) {
            a.a(t, t2);
        }
        Throwable t3;
        if ((t3 = t) == null) {
            t3 = t2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fatal exception in coroutines machinery for ");
        sb.append(this);
        sb.append(". Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
        final String string = sb.toString();
        Intrinsics.b(t3);
        H.a(this.c().getContext(), new L(string, t3));
    }
    
    public abstract Object i();
    
    @Override
    public final void run() {
    Label_0129_Outer:
        while (true) {
            Object o = super.p;
        Label_0279_Outer:
            while (true) {
                Label_0346: {
                    while (true) {
                        Label_0074: {
                            try {
                                final d c = this.c();
                                Intrinsics.c(c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
                                final j j = (j)c;
                                final d s = j.s;
                                final Object u = j.u;
                                final g context = s.getContext();
                                final Object c2 = J.c(context, u);
                                if (c2 != J.a) {
                                    E.g(s, context, c2);
                                    break Label_0074;
                                }
                                break Label_0074;
                            }
                            finally {
                                while (true) {
                                    Label_0299: {
                                        break Label_0299;
                                        try {
                                            final d s;
                                            final g context2 = s.getContext();
                                            Object o2 = this.i();
                                            final Throwable e = this.e(o2);
                                            if (e == null && V.b(this.q)) {
                                                final q0 q0 = (q0)context2.b((g.c)p6.q0.n);
                                                Object o3;
                                                if (q0 != null && !q0.a()) {
                                                    final CancellationException s2 = q0.s();
                                                    this.b(o2, s2);
                                                    o2 = n.o;
                                                    o3 = n.a(V5.o.a(s2));
                                                }
                                                else if (e != null) {
                                                    final n.a o4 = n.o;
                                                    o3 = n.a(V5.o.a(e));
                                                }
                                                else {
                                                    final n.a o5 = n.o;
                                                    o3 = n.a(this.f(o2));
                                                }
                                                s.resumeWith(o3);
                                                final t a = t.a;
                                                Object o6 = null;
                                                if (o6 == null || ((N0)o6).K0()) {
                                                    final g context;
                                                    final Object c2;
                                                    J.a(context, c2);
                                                }
                                                Object a2 = null;
                                                try {
                                                    ((i)o).a();
                                                    n.a(t.a);
                                                }
                                                finally {
                                                    o6 = n.o;
                                                    final Throwable t;
                                                    a2 = n.a(V5.o.a(t));
                                                }
                                                this.h(null, n.b(a2));
                                                return;
                                            }
                                            break Label_0346;
                                            // iftrue(Label_0297:, o6 != null && !o6.K0())
                                            Object a3 = null;
                                        Label_0332:
                                            while (true) {
                                                try {
                                                    final n.a o7 = n.o;
                                                    ((i)o).a();
                                                    n.a(t.a);
                                                }
                                                finally {
                                                    o = n.o;
                                                    final Throwable t2;
                                                    a3 = n.a(V5.o.a(t2));
                                                }
                                                break Label_0332;
                                                final g context;
                                                final Object c2;
                                                J.a(context, c2);
                                                continue Label_0279_Outer;
                                            }
                                            Object o6 = null;
                                            this.h((Throwable)o6, n.b(a3));
                                            return;
                                        }
                                        finally {}
                                    }
                                    Object o6 = null;
                                    continue Label_0129_Outer;
                                }
                            }
                        }
                        continue;
                    }
                }
                final q0 q0 = null;
                continue;
            }
        }
    }
}
