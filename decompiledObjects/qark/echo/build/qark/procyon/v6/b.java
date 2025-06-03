// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package v6;

import p6.y0;
import p6.z;
import u6.B;
import V5.o;
import V5.n;
import kotlin.jvm.internal.y;
import X5.g;
import u6.J;
import Z5.h;
import X5.d;
import g6.p;

public abstract class b
{
    public static final void a(final p p2, final Object o, d context) {
        final d a = h.a(context);
        final Object a2;
        Label_0073: {
            Label_0064: {
                Object c;
                try {
                    context = (d)context.getContext();
                    c = J.c((g)context, null);
                    final p p3 = p2;
                    final int n = 2;
                    final Object o2 = y.b(p3, n);
                    final p p4 = (p)o2;
                    final Object o3 = o;
                    final d d = a;
                    final Object o4 = p4.invoke(o3, d);
                    final d d2 = context;
                    final Object o5 = c;
                    J.a((g)d2, o5);
                    final Object o6 = o4;
                    final Object o7 = Y5.b.c();
                    if (o6 != o7) {
                        break Label_0073;
                    }
                    return;
                }
                finally {
                    break Label_0064;
                }
                try {
                    final p p3 = p2;
                    final int n = 2;
                    final Object o2 = y.b(p3, n);
                    final p p4 = (p)o2;
                    final Object o3 = o;
                    final d d = a;
                    final Object o4 = p4.invoke(o3, d);
                    final d d2 = context;
                    final Object o5 = c;
                    J.a((g)d2, o5);
                    final Object o6 = o4;
                    final Object o7 = Y5.b.c();
                    if (o6 != o7) {
                        break Label_0073;
                    }
                    return;
                }
                finally {
                    J.a((g)context, c);
                }
            }
            final n.a o8 = n.o;
            a2 = o.a((Throwable)a2);
        }
        a.resumeWith(n.a(a2));
    }
    
    public static final Object b(final B b, Object invoke, final p p3) {
        z z = null;
        try {
            invoke = ((p)y.b(p3, 2)).invoke(invoke, b);
        }
        finally {
            final Throwable t;
            z = new z(t, false, 2, null);
        }
        if (z != b.c()) {
            final Object j0 = b.j0(z);
            if (j0 != y0.b) {
                if (!(j0 instanceof z)) {
                    return y0.h(j0);
                }
                throw ((z)j0).a;
            }
        }
        return b.c();
    }
}
