package k3;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class q implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f8911a;

    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f8912a;

        public a(Runnable runnable) {
            this.f8912a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f8912a.run();
            } catch (Exception e10) {
                o3.a.b("Executor", "Background execution failure.", e10);
            }
        }
    }

    public q(ExecutorService executorService) {
        this.f8911a = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f8911a.execute(new a(runnable));
    }
}
