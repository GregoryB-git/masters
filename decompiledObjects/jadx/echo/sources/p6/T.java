package p6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import u6.AbstractC2041k;

/* loaded from: classes.dex */
public final class T extends u6.B {

    /* renamed from: s, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f18511s = AtomicIntegerFieldUpdater.newUpdater(T.class, "_decision");
    private volatile int _decision;

    public T(X5.g gVar, X5.d dVar) {
        super(gVar, dVar);
    }

    private final boolean L0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f18511s;
        do {
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f18511s.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean M0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f18511s;
        do {
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f18511s.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // u6.B, p6.x0
    public void F(Object obj) {
        G0(obj);
    }

    @Override // u6.B, p6.AbstractC1836a
    public void G0(Object obj) {
        X5.d b7;
        if (L0()) {
            return;
        }
        b7 = Y5.c.b(this.f19953r);
        AbstractC2041k.c(b7, D.a(obj, this.f19953r), null, 2, null);
    }

    public final Object K0() {
        Object c7;
        if (M0()) {
            c7 = Y5.d.c();
            return c7;
        }
        Object h7 = y0.h(b0());
        if (h7 instanceof C1877z) {
            throw ((C1877z) h7).f18582a;
        }
        return h7;
    }
}
