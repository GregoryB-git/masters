package v6;

import V5.n;
import V5.o;
import V5.t;
import X5.d;
import Y5.c;
import g6.l;
import g6.p;
import u6.AbstractC2041k;

/* loaded from: classes.dex */
public abstract class a {
    public static final void a(d dVar, Throwable th) {
        n.a aVar = n.f6797o;
        dVar.resumeWith(n.a(o.a(th)));
        throw th;
    }

    public static final void b(d dVar, d dVar2) {
        d b7;
        try {
            b7 = c.b(dVar);
            n.a aVar = n.f6797o;
            AbstractC2041k.c(b7, n.a(t.f6803a), null, 2, null);
        } catch (Throwable th) {
            a(dVar2, th);
        }
    }

    public static final void c(p pVar, Object obj, d dVar, l lVar) {
        d a7;
        d b7;
        try {
            a7 = c.a(pVar, obj, dVar);
            b7 = c.b(a7);
            n.a aVar = n.f6797o;
            AbstractC2041k.b(b7, n.a(t.f6803a), lVar);
        } catch (Throwable th) {
            a(dVar, th);
        }
    }

    public static /* synthetic */ void d(p pVar, Object obj, d dVar, l lVar, int i7, Object obj2) {
        if ((i7 & 4) != 0) {
            lVar = null;
        }
        c(pVar, obj, dVar, lVar);
    }
}
