package nc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class h1 extends l1 {
    public static final AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(h1.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: e, reason: collision with root package name */
    public final dc.l<Throwable, rb.h> f11504e;

    /* JADX WARN: Multi-variable type inference failed */
    public h1(dc.l<? super Throwable, rb.h> lVar) {
        this.f11504e = lVar;
    }

    @Override // dc.l
    public final /* bridge */ /* synthetic */ rb.h invoke(Throwable th) {
        l(th);
        return rb.h.f13851a;
    }

    @Override // nc.w
    public final void l(Throwable th) {
        if (f.compareAndSet(this, 0, 1)) {
            this.f11504e.invoke(th);
        }
    }
}
