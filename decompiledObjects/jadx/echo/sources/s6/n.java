package s6;

import V5.n;
import V5.t;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import p6.C1860m;
import u.AbstractC1997b;
import u6.F;

/* loaded from: classes.dex */
public final class n extends t6.d {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19350a = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_state");
    private volatile Object _state;

    @Override // t6.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(l lVar) {
        F f7;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19350a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        f7 = m.f19348a;
        atomicReferenceFieldUpdater.set(this, f7);
        return true;
    }

    public final Object e(X5.d dVar) {
        X5.d b7;
        F f7;
        Object c7;
        Object c8;
        b7 = Y5.c.b(dVar);
        C1860m c1860m = new C1860m(b7, 1);
        c1860m.z();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19350a;
        f7 = m.f19348a;
        if (!AbstractC1997b.a(atomicReferenceFieldUpdater, this, f7, c1860m)) {
            n.a aVar = V5.n.f6797o;
            c1860m.resumeWith(V5.n.a(t.f6803a));
        }
        Object w7 = c1860m.w();
        c7 = Y5.d.c();
        if (w7 == c7) {
            Z5.h.c(dVar);
        }
        c8 = Y5.d.c();
        return w7 == c8 ? w7 : t.f6803a;
    }

    @Override // t6.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public X5.d[] b(l lVar) {
        f19350a.set(this, null);
        return t6.c.f19603a;
    }

    public final void g() {
        F f7;
        F f8;
        F f9;
        F f10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19350a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return;
            }
            f7 = m.f19349b;
            if (obj == f7) {
                return;
            }
            f8 = m.f19348a;
            if (obj == f8) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f19350a;
                f9 = m.f19349b;
                if (AbstractC1997b.a(atomicReferenceFieldUpdater2, this, obj, f9)) {
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f19350a;
                f10 = m.f19348a;
                if (AbstractC1997b.a(atomicReferenceFieldUpdater3, this, obj, f10)) {
                    n.a aVar = V5.n.f6797o;
                    ((C1860m) obj).resumeWith(V5.n.a(t.f6803a));
                    return;
                }
            }
        }
    }

    public final boolean h() {
        F f7;
        F f8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19350a;
        f7 = m.f19348a;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, f7);
        Intrinsics.b(andSet);
        f8 = m.f19349b;
        return andSet == f8;
    }
}
