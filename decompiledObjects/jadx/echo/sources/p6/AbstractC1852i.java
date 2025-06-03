package p6;

import X5.e;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: p6.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1852i {
    public static final P a(I i7, X5.g gVar, K k7, g6.p pVar) {
        X5.g e7 = E.e(i7, gVar);
        Q z0Var = k7.h() ? new z0(e7, pVar) : new Q(e7, true);
        z0Var.J0(k7, z0Var, pVar);
        return z0Var;
    }

    public static /* synthetic */ P b(I i7, X5.g gVar, K k7, g6.p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = X5.h.f7293o;
        }
        if ((i8 & 2) != 0) {
            k7 = K.DEFAULT;
        }
        return AbstractC1848g.a(i7, gVar, k7, pVar);
    }

    public static final InterfaceC1869q0 c(I i7, X5.g gVar, K k7, g6.p pVar) {
        X5.g e7 = E.e(i7, gVar);
        H0 a02 = k7.h() ? new A0(e7, pVar) : new H0(e7, true);
        a02.J0(k7, a02, pVar);
        return a02;
    }

    public static /* synthetic */ InterfaceC1869q0 d(I i7, X5.g gVar, K k7, g6.p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = X5.h.f7293o;
        }
        if ((i8 & 2) != 0) {
            k7 = K.DEFAULT;
        }
        return AbstractC1848g.c(i7, gVar, k7, pVar);
    }

    public static final Object e(X5.g gVar, g6.p pVar, X5.d dVar) {
        Object K02;
        Object c7;
        X5.g context = dVar.getContext();
        X5.g d7 = E.d(context, gVar);
        u0.d(d7);
        if (d7 == context) {
            u6.B b7 = new u6.B(d7, dVar);
            K02 = v6.b.b(b7, b7, pVar);
        } else {
            e.b bVar = X5.e.f7290c;
            if (Intrinsics.a(d7.b(bVar), context.b(bVar))) {
                N0 n02 = new N0(d7, dVar);
                X5.g context2 = n02.getContext();
                Object c8 = u6.J.c(context2, null);
                try {
                    Object b8 = v6.b.b(n02, n02, pVar);
                    u6.J.a(context2, c8);
                    K02 = b8;
                } catch (Throwable th) {
                    u6.J.a(context2, c8);
                    throw th;
                }
            } else {
                T t7 = new T(d7, dVar);
                v6.a.d(pVar, t7, t7, null, 4, null);
                K02 = t7.K0();
            }
        }
        c7 = Y5.d.c();
        if (K02 == c7) {
            Z5.h.c(dVar);
        }
        return K02;
    }
}
