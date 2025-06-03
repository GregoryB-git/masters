package sc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class k<E> {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14352a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_cur");
    private volatile Object _cur = new l(8, false);

    public final boolean a(E e10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14352a;
        while (true) {
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            int a10 = lVar.a(e10);
            if (a10 == 0) {
                return true;
            }
            if (a10 == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f14352a;
                l<E> c10 = lVar.c();
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, lVar, c10) && atomicReferenceFieldUpdater2.get(this) == lVar) {
                }
            } else if (a10 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14352a;
        while (true) {
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            if (lVar.b()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f14352a;
            l<E> c10 = lVar.c();
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, lVar, c10) && atomicReferenceFieldUpdater2.get(this) == lVar) {
            }
        }
    }

    public final int c() {
        l lVar = (l) f14352a.get(this);
        lVar.getClass();
        long j10 = l.f.get(lVar);
        return (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j10) >> 0))) & 1073741823;
    }

    public final E d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14352a;
        while (true) {
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            E e10 = (E) lVar.d();
            if (e10 != l.f14354g) {
                return e10;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f14352a;
            l<E> c10 = lVar.c();
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, lVar, c10) && atomicReferenceFieldUpdater2.get(this) == lVar) {
            }
        }
    }
}
