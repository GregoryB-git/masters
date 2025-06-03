package n9;

import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class c implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public Semaphore f11347a = new Semaphore(0);

    /* renamed from: b, reason: collision with root package name */
    public int f11348b = 0;

    public final void a() {
        try {
            this.f11347a.acquire(this.f11348b);
            this.f11348b = 0;
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            x6.b.T("Interrupted while waiting for background task", e10);
            throw null;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f11348b++;
        f.f11362c.execute(new w.g(24, this, runnable));
    }
}
