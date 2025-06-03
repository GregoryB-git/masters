package p6;

import u6.C2040j;

/* renamed from: p6.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1864o {
    public static final void a(InterfaceC1858l interfaceC1858l, X x7) {
        interfaceC1858l.d(new Y(x7));
    }

    public static final C1860m b(X5.d dVar) {
        if (!(dVar instanceof C2040j)) {
            return new C1860m(dVar, 1);
        }
        C1860m l7 = ((C2040j) dVar).l();
        if (l7 != null) {
            if (!l7.J()) {
                l7 = null;
            }
            if (l7 != null) {
                return l7;
            }
        }
        return new C1860m(dVar, 2);
    }
}
