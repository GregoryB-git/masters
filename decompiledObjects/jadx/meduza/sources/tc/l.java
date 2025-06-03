package tc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14776b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f14777c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f14778d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f14779e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray<g> f14780a = new AtomicReferenceArray<>(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    public final g a(g gVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f14777c;
        if (atomicIntegerFieldUpdater.get(this) - f14778d.get(this) == 127) {
            return gVar;
        }
        if (gVar.f14766b.c() == 1) {
            f14779e.incrementAndGet(this);
        }
        int i10 = atomicIntegerFieldUpdater.get(this) & 127;
        while (this.f14780a.get(i10) != null) {
            Thread.yield();
        }
        this.f14780a.lazySet(i10, gVar);
        f14777c.incrementAndGet(this);
        return null;
    }

    public final g b() {
        g andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f14778d;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 - f14777c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1) && (andSet = this.f14780a.getAndSet(i11, null)) != null) {
                if (andSet.f14766b.c() == 1) {
                    f14779e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final g c(int i10, boolean z10) {
        int i11 = i10 & 127;
        g gVar = this.f14780a.get(i11);
        if (gVar != null) {
            boolean z11 = false;
            if ((gVar.f14766b.c() == 1) == z10) {
                AtomicReferenceArray<g> atomicReferenceArray = this.f14780a;
                while (true) {
                    if (atomicReferenceArray.compareAndSet(i11, gVar, null)) {
                        z11 = true;
                        break;
                    }
                    if (atomicReferenceArray.get(i11) != gVar) {
                        break;
                    }
                }
                if (z11) {
                    if (z10) {
                        f14779e.decrementAndGet(this);
                    }
                    return gVar;
                }
            }
        }
        return null;
    }
}
