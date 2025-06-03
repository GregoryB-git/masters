package R2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class W3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f5089o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C3 f5090p;

    public W3(C3 c32, AtomicReference atomicReference) {
        this.f5090p = c32;
        this.f5089o = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f5089o) {
            try {
                try {
                    this.f5089o.set(this.f5090p.f().H(this.f5090p.p().F()));
                } finally {
                    this.f5089o.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
