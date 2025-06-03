package R2;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: R2.h4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0523h4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f5320o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C3 f5321p;

    public RunnableC0523h4(C3 c32, AtomicReference atomicReference) {
        this.f5321p = c32;
        this.f5320o = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f5320o) {
            try {
                try {
                    this.f5320o.set(Double.valueOf(this.f5321p.f().o(this.f5321p.p().F(), K.f4798Q)));
                } finally {
                    this.f5320o.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
