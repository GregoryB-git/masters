package nc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class n extends l1 {

    /* renamed from: e, reason: collision with root package name */
    public final l<?> f11519e;

    public n(l<?> lVar) {
        this.f11519e = lVar;
    }

    @Override // dc.l
    public final /* bridge */ /* synthetic */ rb.h invoke(Throwable th) {
        l(th);
        return rb.h.f13851a;
    }

    @Override // nc.w
    public final void l(Throwable th) {
        boolean z10;
        l<?> lVar = this.f11519e;
        Throwable r10 = lVar.r(m());
        boolean z11 = false;
        if (lVar.x()) {
            ub.e<?> eVar = lVar.f11515d;
            ec.i.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            sc.g gVar = (sc.g) eVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sc.g.f14336p;
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(gVar);
                d2.h0 h0Var = b.a0.Z;
                boolean z12 = true;
                if (ec.i.a(obj, h0Var)) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = sc.g.f14336p;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(gVar, h0Var, r10)) {
                            z10 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater2.get(gVar) != h0Var) {
                            z10 = false;
                            break;
                        }
                    }
                    if (z10) {
                        break;
                    }
                } else {
                    if (obj instanceof Throwable) {
                        break;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = sc.g.f14336p;
                    while (true) {
                        if (atomicReferenceFieldUpdater3.compareAndSet(gVar, obj, null)) {
                            break;
                        } else if (atomicReferenceFieldUpdater3.get(gVar) != obj) {
                            z12 = false;
                            break;
                        }
                    }
                    if (z12) {
                        break;
                    }
                }
            }
            z11 = true;
        }
        if (z11) {
            return;
        }
        lVar.cancel(r10);
        if (lVar.x()) {
            return;
        }
        lVar.p();
    }
}
