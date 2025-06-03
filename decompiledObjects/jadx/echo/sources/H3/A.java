package H3;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public abstract class A {

    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f2205a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicLong f2206b;

        /* renamed from: H3.A$a$a, reason: collision with other inner class name */
        public class C0038a extends AbstractRunnableC0382d {

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ Runnable f2207o;

            public C0038a(Runnable runnable) {
                this.f2207o = runnable;
            }

            @Override // H3.AbstractRunnableC0382d
            public void a() {
                this.f2207o.run();
            }
        }

        public a(String str, AtomicLong atomicLong) {
            this.f2205a = str;
            this.f2206b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C0038a(runnable));
            newThread.setName(this.f2205a + this.f2206b.getAndIncrement());
            return newThread;
        }
    }

    public class b extends AbstractRunnableC0382d {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f2209o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ ExecutorService f2210p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ long f2211q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ TimeUnit f2212r;

        public b(String str, ExecutorService executorService, long j7, TimeUnit timeUnit) {
            this.f2209o = str;
            this.f2210p = executorService;
            this.f2211q = j7;
            this.f2212r = timeUnit;
        }

        @Override // H3.AbstractRunnableC0382d
        public void a() {
            try {
                E3.f.f().b("Executing shutdown hook for " + this.f2209o);
                this.f2210p.shutdown();
                if (this.f2210p.awaitTermination(this.f2211q, this.f2212r)) {
                    return;
                }
                E3.f.f().b(this.f2209o + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f2210p.shutdownNow();
            } catch (InterruptedException unused) {
                E3.f.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f2209o));
                this.f2210p.shutdownNow();
            }
        }
    }

    public static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    public static void b(String str, ExecutorService executorService, long j7, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j7, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService e7 = e(d(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, e7);
        return e7;
    }

    public static ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    public static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
