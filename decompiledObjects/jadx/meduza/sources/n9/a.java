package n9;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p2.m0;
import x0.q0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<c> f11324c = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<C0174a> f11323b = new ArrayList<>();

    /* renamed from: a, reason: collision with root package name */
    public final b f11322a = new b();

    /* renamed from: n9.a$a, reason: collision with other inner class name */
    public class C0174a {

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f11325a;

        /* renamed from: b, reason: collision with root package name */
        public ScheduledFuture f11326b;

        public C0174a(Runnable runnable) {
            this.f11325a = runnable;
        }

        public final void a() {
            a.this.d();
            ScheduledFuture scheduledFuture = this.f11326b;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                b();
            }
        }

        public final void b() {
            x6.b.Z("Caller should have verified scheduledFuture is non-null.", this.f11326b != null, new Object[0]);
            this.f11326b = null;
            x6.b.Z("Delayed task not found.", a.this.f11323b.remove(this), new Object[0]);
        }
    }

    public class b implements Executor {

        /* renamed from: a, reason: collision with root package name */
        public final C0175a f11328a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f11329b;

        /* renamed from: c, reason: collision with root package name */
        public final Thread f11330c;

        /* renamed from: n9.a$b$a, reason: collision with other inner class name */
        public class C0175a extends ScheduledThreadPoolExecutor {
            public C0175a(RunnableC0176b runnableC0176b) {
                super(1, runnableC0176b);
            }

            @Override // java.util.concurrent.ThreadPoolExecutor
            public final void afterExecute(Runnable runnable, Throwable th) {
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
                    } catch (ExecutionException e10) {
                        th = e10.getCause();
                    }
                }
                if (th != null) {
                    a.this.c(th);
                }
            }
        }

        /* renamed from: n9.a$b$b, reason: collision with other inner class name */
        public class RunnableC0176b implements Runnable, ThreadFactory {

            /* renamed from: a, reason: collision with root package name */
            public final CountDownLatch f11333a = new CountDownLatch(1);

            /* renamed from: b, reason: collision with root package name */
            public Runnable f11334b;

            public RunnableC0176b() {
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                x6.b.Z("Only one thread may be created in an AsyncQueue.", this.f11334b == null, new Object[0]);
                this.f11334b = runnable;
                this.f11333a.countDown();
                return b.this.f11330c;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.f11333a.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                this.f11334b.run();
            }
        }

        public b() {
            RunnableC0176b runnableC0176b = new RunnableC0176b();
            Thread newThread = Executors.defaultThreadFactory().newThread(runnableC0176b);
            this.f11330c = newThread;
            newThread.setName("FirestoreWorker");
            newThread.setDaemon(true);
            newThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: n9.b
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    a.this.c(th);
                }
            });
            C0175a c0175a = new C0175a(runnableC0176b);
            this.f11328a = c0175a;
            c0175a.setKeepAliveTime(3L, TimeUnit.SECONDS);
            this.f11329b = false;
        }

        public final <T> Task<T> a(Callable<T> callable) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            try {
                execute(new q0(15, taskCompletionSource, callable));
            } catch (RejectedExecutionException unused) {
                m0.y(2, a.class.getSimpleName(), "Refused to enqueue task after panic", new Object[0]);
            }
            return taskCompletionSource.getTask();
        }

        @Override // java.util.concurrent.Executor
        public final synchronized void execute(Runnable runnable) {
            if (!this.f11329b) {
                this.f11328a.execute(runnable);
            }
        }
    }

    public enum c {
        /* JADX INFO: Fake field, exist only in values array */
        ALL,
        LISTEN_STREAM_IDLE,
        LISTEN_STREAM_CONNECTION_BACKOFF,
        WRITE_STREAM_IDLE,
        WRITE_STREAM_CONNECTION_BACKOFF,
        HEALTH_CHECK_TIMEOUT,
        ONLINE_STATE_TIMEOUT,
        GARBAGE_COLLECTION,
        RETRY_TRANSACTION,
        CONNECTIVITY_ATTEMPT_TIMER,
        INDEX_BACKFILL
    }

    public final Task<Void> a(Runnable runnable) {
        return this.f11322a.a(new y2.h(runnable, 2));
    }

    public final C0174a b(c cVar, long j10, Runnable runnable) {
        ScheduledFuture<?> schedule;
        if (this.f11324c.contains(cVar)) {
            j10 = 0;
        }
        System.currentTimeMillis();
        C0174a c0174a = new C0174a(runnable);
        b bVar = this.f11322a;
        b.m mVar = new b.m(c0174a, 17);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (bVar) {
            schedule = !bVar.f11329b ? bVar.f11328a.schedule(mVar, j10, timeUnit) : null;
        }
        c0174a.f11326b = schedule;
        this.f11323b.add(c0174a);
        return c0174a;
    }

    public final void c(Throwable th) {
        this.f11322a.f11328a.shutdownNow();
        new Handler(Looper.getMainLooper()).post(new b.d(th, 18));
    }

    public final void d() {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f11322a.f11330c;
        if (thread == currentThread) {
            return;
        }
        x6.b.T("We are running on the wrong thread. Expected to be on the AsyncQueue thread %s/%d but was %s/%d", thread.getName(), Long.valueOf(this.f11322a.f11330c.getId()), currentThread.getName(), Long.valueOf(currentThread.getId()));
        throw null;
    }
}
