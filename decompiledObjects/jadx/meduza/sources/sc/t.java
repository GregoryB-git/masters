package sc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import nc.v1;
import sc.t;

/* loaded from: classes.dex */
public abstract class t<S extends t<S>> extends c<S> implements v1 {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f14366d = AtomicIntegerFieldUpdater.newUpdater(t.class, "cleanedAndPointers");

    /* renamed from: c, reason: collision with root package name */
    public final long f14367c;
    private volatile int cleanedAndPointers;

    public t(long j10, S s10, int i10) {
        super(s10);
        this.f14367c = j10;
        this.cleanedAndPointers = i10 << 16;
    }

    @Override // sc.c
    public final boolean c() {
        if (f14366d.get(this) == f()) {
            if (!(b() == 0)) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        if (f14366d.addAndGet(this, -65536) == f()) {
            if (!(b() == 0)) {
                return true;
            }
        }
        return false;
    }

    public abstract int f();

    public abstract void g(int i10, ub.h hVar);

    public final void h() {
        if (f14366d.incrementAndGet(this) == f()) {
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x001f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i() {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = sc.t.f14366d
        L2:
            int r1 = r0.get(r5)
            int r2 = r5.f()
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L1c
            sc.c r2 = r5.b()
            if (r2 != 0) goto L16
            r2 = r3
            goto L17
        L16:
            r2 = r4
        L17:
            if (r2 == 0) goto L1a
            goto L1c
        L1a:
            r2 = r4
            goto L1d
        L1c:
            r2 = r3
        L1d:
            if (r2 != 0) goto L21
            r3 = r4
            goto L2a
        L21:
            r2 = 65536(0x10000, float:9.18355E-41)
            int r2 = r2 + r1
            boolean r1 = r0.compareAndSet(r5, r1, r2)
            if (r1 == 0) goto L2
        L2a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: sc.t.i():boolean");
    }
}
