package p6;

/* renamed from: p6.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1850h {
    public static final Object a(X5.g gVar, g6.p pVar) {
        AbstractC1837a0 a7;
        C1855j0 c1855j0;
        Thread currentThread = Thread.currentThread();
        X5.e eVar = (X5.e) gVar.b(X5.e.f7290c);
        if (eVar == null) {
            a7 = L0.f18501a.b();
            c1855j0 = C1855j0.f18535o;
            gVar = gVar.k(a7);
        } else {
            AbstractC1837a0 abstractC1837a0 = eVar instanceof AbstractC1837a0 ? (AbstractC1837a0) eVar : null;
            if (abstractC1837a0 != null) {
                AbstractC1837a0 abstractC1837a02 = abstractC1837a0.S() ? abstractC1837a0 : null;
                if (abstractC1837a02 != null) {
                    a7 = abstractC1837a02;
                    c1855j0 = C1855j0.f18535o;
                }
            }
            a7 = L0.f18501a.a();
            c1855j0 = C1855j0.f18535o;
        }
        C1844e c1844e = new C1844e(E.e(c1855j0, gVar), currentThread, a7);
        c1844e.J0(K.DEFAULT, c1844e, pVar);
        return c1844e.K0();
    }

    public static /* synthetic */ Object b(X5.g gVar, g6.p pVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            gVar = X5.h.f7293o;
        }
        return AbstractC1848g.e(gVar, pVar);
    }
}
