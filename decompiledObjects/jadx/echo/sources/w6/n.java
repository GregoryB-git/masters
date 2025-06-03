package w6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.u;
import u.AbstractC1997b;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20498b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f20499c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f20500d = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f20501e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f20502a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    public final h a(h hVar, boolean z7) {
        if (z7) {
            return b(hVar);
        }
        h hVar2 = (h) f20498b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final h b(h hVar) {
        if (d() == 127) {
            return hVar;
        }
        if (hVar.f20486p.b() == 1) {
            f20501e.incrementAndGet(this);
        }
        int i7 = f20499c.get(this) & 127;
        while (this.f20502a.get(i7) != null) {
            Thread.yield();
        }
        this.f20502a.lazySet(i7, hVar);
        f20499c.incrementAndGet(this);
        return null;
    }

    public final void c(h hVar) {
        if (hVar == null || hVar.f20486p.b() != 1) {
            return;
        }
        f20501e.decrementAndGet(this);
    }

    public final int d() {
        return f20499c.get(this) - f20500d.get(this);
    }

    public final int e() {
        return f20498b.get(this) != null ? d() + 1 : d();
    }

    public final void f(d dVar) {
        h hVar = (h) f20498b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        while (j(dVar)) {
        }
    }

    public final h g() {
        h hVar = (h) f20498b.getAndSet(this, null);
        return hVar == null ? i() : hVar;
    }

    public final h h() {
        return k(true);
    }

    public final h i() {
        h hVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20500d;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 - f20499c.get(this) == 0) {
                return null;
            }
            int i8 = i7 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i7, i7 + 1) && (hVar = (h) this.f20502a.getAndSet(i8, null)) != null) {
                c(hVar);
                return hVar;
            }
        }
    }

    public final boolean j(d dVar) {
        h i7 = i();
        if (i7 == null) {
            return false;
        }
        dVar.a(i7);
        return true;
    }

    public final h k(boolean z7) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h hVar;
        do {
            atomicReferenceFieldUpdater = f20498b;
            hVar = (h) atomicReferenceFieldUpdater.get(this);
            if (hVar != null) {
                if ((hVar.f20486p.b() == 1) == z7) {
                }
            }
            int i7 = f20500d.get(this);
            int i8 = f20499c.get(this);
            while (i7 != i8) {
                if (z7 && f20501e.get(this) == 0) {
                    return null;
                }
                i8--;
                h m7 = m(i8, z7);
                if (m7 != null) {
                    return m7;
                }
            }
            return null;
        } while (!AbstractC1997b.a(atomicReferenceFieldUpdater, this, hVar, null));
        return hVar;
    }

    public final h l(int i7) {
        int i8 = f20500d.get(this);
        int i9 = f20499c.get(this);
        boolean z7 = i7 == 1;
        while (i8 != i9) {
            if (z7 && f20501e.get(this) == 0) {
                return null;
            }
            int i10 = i8 + 1;
            h m7 = m(i8, z7);
            if (m7 != null) {
                return m7;
            }
            i8 = i10;
        }
        return null;
    }

    public final h m(int i7, boolean z7) {
        int i8 = i7 & 127;
        h hVar = (h) this.f20502a.get(i8);
        if (hVar != null) {
            if ((hVar.f20486p.b() == 1) == z7 && r6.h.a(this.f20502a, i8, hVar, null)) {
                if (z7) {
                    f20501e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }

    public final long n(int i7, u uVar) {
        h i8 = i7 == 3 ? i() : l(i7);
        if (i8 == null) {
            return o(i7, uVar);
        }
        uVar.f16230o = i8;
        return -1L;
    }

    public final long o(int i7, u uVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h hVar;
        do {
            atomicReferenceFieldUpdater = f20498b;
            hVar = (h) atomicReferenceFieldUpdater.get(this);
            if (hVar == null) {
                return -2L;
            }
            if (((hVar.f20486p.b() != 1 ? 2 : 1) & i7) == 0) {
                return -2L;
            }
            long a7 = l.f20494f.a() - hVar.f20485o;
            long j7 = l.f20490b;
            if (a7 < j7) {
                return j7 - a7;
            }
        } while (!AbstractC1997b.a(atomicReferenceFieldUpdater, this, hVar, null));
        uVar.f16230o = hVar;
        return -1L;
    }
}
