package v6;

import V5.n;
import V5.o;
import X5.d;
import X5.g;
import Z5.h;
import g6.p;
import kotlin.jvm.internal.y;
import p6.C1877z;
import p6.y0;
import u6.B;
import u6.J;

/* loaded from: classes.dex */
public abstract class b {
    public static final void a(p pVar, Object obj, d dVar) {
        Object a7;
        Object c7;
        d a8 = h.a(dVar);
        try {
            g context = dVar.getContext();
            Object c8 = J.c(context, null);
            try {
                a7 = ((p) y.b(pVar, 2)).invoke(obj, a8);
                c7 = Y5.d.c();
                if (a7 == c7) {
                    return;
                }
            } finally {
                J.a(context, c8);
            }
        } catch (Throwable th) {
            n.a aVar = n.f6797o;
            a7 = o.a(th);
        }
        a8.resumeWith(n.a(a7));
    }

    public static final Object b(B b7, Object obj, p pVar) {
        Object c1877z;
        Object c7;
        Object j02;
        Object c8;
        try {
            c1877z = ((p) y.b(pVar, 2)).invoke(obj, b7);
        } catch (Throwable th) {
            c1877z = new C1877z(th, false, 2, null);
        }
        c7 = Y5.d.c();
        if (c1877z == c7 || (j02 = b7.j0(c1877z)) == y0.f18575b) {
            c8 = Y5.d.c();
            return c8;
        }
        if (j02 instanceof C1877z) {
            throw ((C1877z) j02).f18582a;
        }
        return y0.h(j02);
    }
}
