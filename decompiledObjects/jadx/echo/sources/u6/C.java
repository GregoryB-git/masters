package u6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p6.E0;

/* loaded from: classes.dex */
public abstract class C extends AbstractC2035e implements E0 {

    /* renamed from: r, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f19954r = AtomicIntegerFieldUpdater.newUpdater(C.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* renamed from: q, reason: collision with root package name */
    public final long f19955q;

    public C(long j7, C c7, int i7) {
        super(c7);
        this.f19955q = j7;
        this.cleanedAndPointers = i7 << 16;
    }

    @Override // u6.AbstractC2035e
    public boolean h() {
        return f19954r.get(this) == n() && !i();
    }

    public final boolean m() {
        return f19954r.addAndGet(this, -65536) == n() && !i();
    }

    public abstract int n();

    public abstract void o(int i7, Throwable th, X5.g gVar);

    public final void p() {
        if (f19954r.incrementAndGet(this) == n()) {
            k();
        }
    }

    public final boolean q() {
        int i7;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19954r;
        do {
            i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 == n() && !i()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 65536 + i7));
        return true;
    }
}
