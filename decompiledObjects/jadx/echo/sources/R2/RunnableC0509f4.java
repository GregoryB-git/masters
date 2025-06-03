package R2;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: R2.f4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0509f4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f5290o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C3 f5291p;

    public RunnableC0509f4(C3 c32, AtomicReference atomicReference) {
        this.f5291p = c32;
        this.f5290o = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f5290o) {
            try {
                try {
                    this.f5290o.set(Long.valueOf(this.f5291p.f().x(this.f5291p.p().F(), K.f4794O)));
                } finally {
                    this.f5290o.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
