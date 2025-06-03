package n9;

import g.q;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class m implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f11370a;

    /* renamed from: b, reason: collision with root package name */
    public final Semaphore f11371b = new Semaphore(4);

    public m(Executor executor) {
        this.f11370a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.f11371b.tryAcquire()) {
            try {
                this.f11370a.execute(new q(21, this, runnable));
                return;
            } catch (RejectedExecutionException unused) {
            }
        }
        runnable.run();
    }
}
