package nc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class n1 extends w implements t0, f1 {

    /* renamed from: d, reason: collision with root package name */
    public o1 f11520d;

    @Override // nc.f1
    public final t1 b() {
        return null;
    }

    @Override // nc.t0
    public final void dispose() {
        boolean z10;
        sc.j jVar;
        boolean z11;
        o1 m10 = m();
        do {
            Object F = m10.F();
            z10 = false;
            if (!(F instanceof n1)) {
                if (!(F instanceof f1) || ((f1) F).b() == null) {
                    return;
                }
                do {
                    Object h10 = h();
                    if (h10 instanceof sc.q) {
                        sc.j jVar2 = ((sc.q) h10).f14364a;
                        return;
                    }
                    if (h10 == this) {
                        return;
                    }
                    ec.i.c(h10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    jVar = (sc.j) h10;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sc.j.f14349c;
                    sc.q qVar = (sc.q) atomicReferenceFieldUpdater.get(jVar);
                    if (qVar == null) {
                        qVar = new sc.q(jVar);
                        atomicReferenceFieldUpdater.lazySet(jVar, qVar);
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = sc.j.f14347a;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, h10, qVar)) {
                            z11 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater2.get(this) != h10) {
                            z11 = false;
                            break;
                        }
                    }
                } while (!z11);
                jVar.c();
                return;
            }
            if (F != this) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = o1.f11522a;
            w0 w0Var = p2.m0.f12904z;
            while (true) {
                if (atomicReferenceFieldUpdater3.compareAndSet(m10, F, w0Var)) {
                    z10 = true;
                    break;
                } else if (atomicReferenceFieldUpdater3.get(m10) != F) {
                    break;
                }
            }
        } while (!z10);
    }

    @Override // nc.f1
    public final boolean isActive() {
        return true;
    }

    public final o1 m() {
        o1 o1Var = this.f11520d;
        if (o1Var != null) {
            return o1Var;
        }
        ec.i.i("job");
        throw null;
    }

    @Override // sc.j
    public final String toString() {
        return getClass().getSimpleName() + '@' + g0.b(this) + "[job@" + g0.b(m()) + ']';
    }
}
