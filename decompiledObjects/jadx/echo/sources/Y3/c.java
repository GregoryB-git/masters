package Y3;

import V3.r;
import V3.z;
import java.lang.Thread;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class c implements r {

    /* renamed from: a, reason: collision with root package name */
    public ScheduledThreadPoolExecutor f7536a;

    public class a extends ScheduledThreadPoolExecutor {
        public a(int i7, ThreadFactory threadFactory) {
            super(i7, threadFactory);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void afterExecute(Runnable runnable, Throwable th) {
            super.afterExecute(runnable, th);
            if (th == null && (runnable instanceof Future)) {
                Future future = (Future) runnable;
                try {
                    if (future.isDone()) {
                        future.get();
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (CancellationException unused2) {
                } catch (ExecutionException e7) {
                    th = e7.getCause();
                }
            }
            if (th != null) {
                c.this.g(th);
            }
        }
    }

    public class b implements ThreadFactory {

        public class a implements Thread.UncaughtExceptionHandler {
            public a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                c.this.g(th);
            }
        }

        public b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = c.this.e().newThread(runnable);
            z f7 = c.this.f();
            f7.a(newThread, "FirebaseDatabaseWorker");
            f7.b(newThread, true);
            f7.c(newThread, new a());
            return newThread;
        }

        public /* synthetic */ b(c cVar, a aVar) {
            this();
        }
    }

    public c() {
        a aVar = new a(1, new b(this, null));
        this.f7536a = aVar;
        aVar.setKeepAliveTime(3L, TimeUnit.SECONDS);
    }

    public static String h(Throwable th) {
        if (th instanceof OutOfMemoryError) {
            return "Firebase Database encountered an OutOfMemoryError. You may need to reduce the amount of data you are syncing to the client (e.g. by using queries or syncing a deeper path). See https://firebase.google.com/docs/database/ios/structure-data#best_practices_for_data_structure and https://firebase.google.com/docs/database/android/retrieve-data#filtering_data";
        }
        if (th instanceof NoClassDefFoundError) {
            return "A symbol that the Firebase Database SDK depends on failed to load. This usually indicates that your project includes an incompatible version of another Firebase dependency. If updating your dependencies to the latest version does not resolve this issue, please file a report at https://github.com/firebase/firebase-android-sdk";
        }
        if (th instanceof Q3.d) {
            return "";
        }
        return "Uncaught exception in Firebase Database runloop (" + Q3.h.g() + "). If you are not already on the latest version of the Firebase SDKs, try updating your dependencies. Should this problem persist, please file a report at https://github.com/firebase/firebase-android-sdk";
    }

    @Override // V3.r
    public void a() {
        this.f7536a.setCorePoolSize(1);
    }

    @Override // V3.r
    public ScheduledFuture b(Runnable runnable, long j7) {
        return this.f7536a.schedule(runnable, j7, TimeUnit.MILLISECONDS);
    }

    @Override // V3.r
    public void c(Runnable runnable) {
        this.f7536a.execute(runnable);
    }

    public ScheduledExecutorService d() {
        return this.f7536a;
    }

    public ThreadFactory e() {
        return Executors.defaultThreadFactory();
    }

    public z f() {
        return z.f6751a;
    }

    public abstract void g(Throwable th);
}
