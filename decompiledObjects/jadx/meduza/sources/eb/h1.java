package eb;

import java.lang.Thread;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class h1 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f5118a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f5119b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference<Thread> f5120c = new AtomicReference<>();

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f5121a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f5122b;

        public a(b bVar, Runnable runnable) {
            this.f5121a = bVar;
            this.f5122b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            h1.this.execute(this.f5121a);
        }

        public final String toString() {
            return this.f5122b.toString() + "(scheduled in SynchronizationContext)";
        }
    }

    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f5124a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f5125b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f5126c;

        public b(Runnable runnable) {
            this.f5124a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f5125b) {
                return;
            }
            this.f5126c = true;
            this.f5124a.run();
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final b f5127a;

        /* renamed from: b, reason: collision with root package name */
        public final ScheduledFuture<?> f5128b;

        public c(b bVar, ScheduledFuture scheduledFuture) {
            this.f5127a = bVar;
            x6.b.y(scheduledFuture, "future");
            this.f5128b = scheduledFuture;
        }

        public final void a() {
            this.f5127a.f5125b = true;
            this.f5128b.cancel(false);
        }
    }

    public h1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f5118a = uncaughtExceptionHandler;
    }

    public final void a() {
        boolean z10;
        do {
            AtomicReference<Thread> atomicReference = this.f5120c;
            Thread currentThread = Thread.currentThread();
            while (true) {
                if (atomicReference.compareAndSet(null, currentThread)) {
                    z10 = true;
                    break;
                } else if (atomicReference.get() != null) {
                    z10 = false;
                    break;
                }
            }
            if (!z10) {
                return;
            }
            while (true) {
                try {
                    Runnable runnable = (Runnable) this.f5119b.poll();
                    if (runnable == null) {
                        break;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        this.f5118a.uncaughtException(Thread.currentThread(), th);
                    }
                } catch (Throwable th2) {
                    this.f5120c.set(null);
                    throw th2;
                }
            }
            this.f5120c.set(null);
        } while (!this.f5119b.isEmpty());
    }

    public final void b(Runnable runnable) {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f5119b;
        x6.b.y(runnable, "runnable is null");
        concurrentLinkedQueue.add(runnable);
    }

    public final c c(Runnable runnable, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        b bVar = new b(runnable);
        return new c(bVar, scheduledExecutorService.schedule(new a(bVar, runnable), j10, timeUnit));
    }

    public final void d() {
        x6.b.I(Thread.currentThread() == this.f5120c.get(), "Not called from the SynchronizationContext");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable);
        a();
    }
}
