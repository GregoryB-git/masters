package p6;

import V5.n;

/* loaded from: classes.dex */
public abstract class D {
    public static final Object a(Object obj, X5.d dVar) {
        if (obj instanceof C1877z) {
            n.a aVar = V5.n.f6797o;
            obj = V5.o.a(((C1877z) obj).f18582a);
        }
        return V5.n.a(obj);
    }

    public static final Object b(Object obj, g6.l lVar) {
        Throwable b7 = V5.n.b(obj);
        return b7 == null ? lVar != null ? new A(obj, lVar) : obj : new C1877z(b7, false, 2, null);
    }

    public static final Object c(Object obj, InterfaceC1858l interfaceC1858l) {
        Throwable b7 = V5.n.b(obj);
        return b7 == null ? obj : new C1877z(b7, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, g6.l lVar, int i7, Object obj2) {
        if ((i7 & 1) != 0) {
            lVar = null;
        }
        return b(obj, lVar);
    }
}
