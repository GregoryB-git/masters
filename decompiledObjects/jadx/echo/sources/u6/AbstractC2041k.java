package u6;

import V5.n;
import java.util.concurrent.CancellationException;
import p6.AbstractC1837a0;
import p6.InterfaceC1869q0;
import p6.L0;
import p6.N0;

/* renamed from: u6.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2041k {

    /* renamed from: a, reason: collision with root package name */
    public static final F f19986a = new F("UNDEFINED");

    /* renamed from: b, reason: collision with root package name */
    public static final F f19987b = new F("REUSABLE_CLAIMED");

    public static final void b(X5.d dVar, Object obj, g6.l lVar) {
        if (!(dVar instanceof C2040j)) {
            dVar.resumeWith(obj);
            return;
        }
        C2040j c2040j = (C2040j) dVar;
        Object b7 = p6.D.b(obj, lVar);
        if (c2040j.f19982r.F(c2040j.getContext())) {
            c2040j.f19984t = b7;
            c2040j.f18512q = 1;
            c2040j.f19982r.E(c2040j.getContext(), c2040j);
            return;
        }
        AbstractC1837a0 b8 = L0.f18501a.b();
        if (b8.O()) {
            c2040j.f19984t = b7;
            c2040j.f18512q = 1;
            b8.K(c2040j);
            return;
        }
        b8.M(true);
        try {
            InterfaceC1869q0 interfaceC1869q0 = (InterfaceC1869q0) c2040j.getContext().b(InterfaceC1869q0.f18550n);
            if (interfaceC1869q0 == null || interfaceC1869q0.a()) {
                X5.d dVar2 = c2040j.f19983s;
                Object obj2 = c2040j.f19985u;
                X5.g context = dVar2.getContext();
                Object c7 = J.c(context, obj2);
                N0 g7 = c7 != J.f19961a ? p6.E.g(dVar2, context, c7) : null;
                try {
                    c2040j.f19983s.resumeWith(obj);
                    V5.t tVar = V5.t.f6803a;
                } finally {
                    if (g7 == null || g7.K0()) {
                        J.a(context, c7);
                    }
                }
            } else {
                CancellationException s7 = interfaceC1869q0.s();
                c2040j.b(b7, s7);
                n.a aVar = V5.n.f6797o;
                c2040j.resumeWith(V5.n.a(V5.o.a(s7)));
            }
            while (b8.R()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static /* synthetic */ void c(X5.d dVar, Object obj, g6.l lVar, int i7, Object obj2) {
        if ((i7 & 2) != 0) {
            lVar = null;
        }
        b(dVar, obj, lVar);
    }
}
