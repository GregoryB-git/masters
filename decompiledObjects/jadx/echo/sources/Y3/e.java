package Y3;

import d4.C1226a;
import d4.t;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class e {
    public static long a(d4.k kVar) {
        long j7 = 8;
        if (!(kVar instanceof d4.f) && !(kVar instanceof d4.l)) {
            if (kVar instanceof C1226a) {
                j7 = 4;
            } else {
                if (!(kVar instanceof t)) {
                    throw new IllegalArgumentException("Unknown leaf node type: " + kVar.getClass());
                }
                j7 = ((String) kVar.getValue()).length() + 2;
            }
        }
        return kVar.t().isEmpty() ? j7 : j7 + 24 + a((d4.k) kVar.t());
    }

    public static long b(d4.n nVar) {
        if (nVar.isEmpty()) {
            return 4L;
        }
        if (nVar.B()) {
            return a((d4.k) nVar);
        }
        m.g(nVar instanceof d4.c, "Unexpected node type: " + nVar.getClass());
        Iterator it = nVar.iterator();
        long j7 = 1;
        while (it.hasNext()) {
            j7 = j7 + r5.c().e().length() + 4 + b(((d4.m) it.next()).d());
        }
        return !nVar.t().isEmpty() ? j7 + 12 + a((d4.k) nVar.t()) : j7;
    }

    public static int c(d4.n nVar) {
        int i7 = 0;
        if (nVar.isEmpty()) {
            return 0;
        }
        if (nVar.B()) {
            return 1;
        }
        m.g(nVar instanceof d4.c, "Unexpected node type: " + nVar.getClass());
        Iterator it = nVar.iterator();
        while (it.hasNext()) {
            i7 += c(((d4.m) it.next()).d());
        }
        return i7;
    }
}
