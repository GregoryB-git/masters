package R2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class O3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4951o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C3 f4952p;

    public O3(C3 c32, AtomicReference atomicReference) {
        this.f4952p = c32;
        this.f4951o = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f4951o) {
            try {
                try {
                    this.f4951o.set(Boolean.valueOf(this.f4952p.f().J(this.f4952p.p().F())));
                } finally {
                    this.f4951o.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
