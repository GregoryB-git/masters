package R2;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: R2.e4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0502e4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f5279o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C3 f5280p;

    public RunnableC0502e4(C3 c32, AtomicReference atomicReference) {
        this.f5280p = c32;
        this.f5279o = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f5279o) {
            try {
                try {
                    this.f5279o.set(Integer.valueOf(this.f5280p.f().u(this.f5280p.p().F(), K.f4796P)));
                } finally {
                    this.f5279o.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
