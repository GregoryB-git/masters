package p6;

import V5.n;
import kotlin.jvm.internal.Intrinsics;
import u6.C2040j;

/* loaded from: classes.dex */
public abstract class V {
    public static final void a(U u7, int i7) {
        X5.d c7 = u7.c();
        boolean z7 = i7 == 4;
        if (z7 || !(c7 instanceof C2040j) || b(i7) != b(u7.f18512q)) {
            d(u7, c7, z7);
            return;
        }
        F f7 = ((C2040j) c7).f19982r;
        X5.g context = c7.getContext();
        if (f7.F(context)) {
            f7.E(context, u7);
        } else {
            e(u7);
        }
    }

    public static final boolean b(int i7) {
        return i7 == 1 || i7 == 2;
    }

    public static final boolean c(int i7) {
        return i7 == 2;
    }

    public static final void d(U u7, X5.d dVar, boolean z7) {
        Object f7;
        Object i7 = u7.i();
        Throwable e7 = u7.e(i7);
        if (e7 != null) {
            n.a aVar = V5.n.f6797o;
            f7 = V5.o.a(e7);
        } else {
            n.a aVar2 = V5.n.f6797o;
            f7 = u7.f(i7);
        }
        Object a7 = V5.n.a(f7);
        if (!z7) {
            dVar.resumeWith(a7);
            return;
        }
        Intrinsics.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C2040j c2040j = (C2040j) dVar;
        X5.d dVar2 = c2040j.f19983s;
        Object obj = c2040j.f19985u;
        X5.g context = dVar2.getContext();
        Object c7 = u6.J.c(context, obj);
        N0 g7 = c7 != u6.J.f19961a ? E.g(dVar2, context, c7) : null;
        try {
            c2040j.f19983s.resumeWith(a7);
            V5.t tVar = V5.t.f6803a;
        } finally {
            if (g7 == null || g7.K0()) {
                u6.J.a(context, c7);
            }
        }
    }

    public static final void e(U u7) {
        AbstractC1837a0 b7 = L0.f18501a.b();
        if (b7.O()) {
            b7.K(u7);
            return;
        }
        b7.M(true);
        try {
            d(u7, u7.c(), true);
            do {
            } while (b7.R());
        } finally {
            try {
            } finally {
            }
        }
    }
}
