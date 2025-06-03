package p6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: p6.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1865o0 extends s0 {

    /* renamed from: t, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f18545t = AtomicIntegerFieldUpdater.newUpdater(C1865o0.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: s, reason: collision with root package name */
    public final g6.l f18546s;

    public C1865o0(g6.l lVar) {
        this.f18546s = lVar;
    }

    @Override // g6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((Throwable) obj);
        return V5.t.f6803a;
    }

    @Override // p6.B
    public void v(Throwable th) {
        if (f18545t.compareAndSet(this, 0, 1)) {
            this.f18546s.invoke(th);
        }
    }
}
