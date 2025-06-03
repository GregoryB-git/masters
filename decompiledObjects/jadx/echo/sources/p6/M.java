package p6;

import V5.n;
import u6.C2040j;

/* loaded from: classes.dex */
public abstract class M {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(X5.d dVar) {
        Object a7;
        if (dVar instanceof C2040j) {
            return dVar.toString();
        }
        try {
            n.a aVar = V5.n.f6797o;
            a7 = V5.n.a(dVar + '@' + b(dVar));
        } catch (Throwable th) {
            n.a aVar2 = V5.n.f6797o;
            a7 = V5.n.a(V5.o.a(th));
        }
        if (V5.n.b(a7) != null) {
            a7 = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) a7;
    }
}
