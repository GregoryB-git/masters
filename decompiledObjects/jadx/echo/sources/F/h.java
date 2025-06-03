package F;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class h {

    public static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public String f1727a;

        /* renamed from: b, reason: collision with root package name */
        public int f1728b;

        /* renamed from: F.h$a$a, reason: collision with other inner class name */
        public static class C0027a extends Thread {

            /* renamed from: o, reason: collision with root package name */
            public final int f1729o;

            public C0027a(Runnable runnable, String str, int i7) {
                super(runnable, str);
                this.f1729o = i7;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f1729o);
                super.run();
            }
        }

        public a(String str, int i7) {
            this.f1727a = str;
            this.f1728b = i7;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0027a(runnable, this.f1727a, this.f1728b);
        }
    }

    public static class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public Callable f1730o;

        /* renamed from: p, reason: collision with root package name */
        public H.a f1731p;

        /* renamed from: q, reason: collision with root package name */
        public Handler f1732q;

        public class a implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ H.a f1733o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ Object f1734p;

            public a(H.a aVar, Object obj) {
                this.f1733o = aVar;
                this.f1734p = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f1733o.accept(this.f1734p);
            }
        }

        public b(Handler handler, Callable callable, H.a aVar) {
            this.f1730o = callable;
            this.f1731p = aVar;
            this.f1732q = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.f1730o.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f1732q.post(new a(this.f1731p, obj));
        }
    }

    public static ThreadPoolExecutor a(String str, int i7, int i8) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i8, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i7));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static void b(Executor executor, Callable callable, H.a aVar) {
        executor.execute(new b(F.b.a(), callable, aVar));
    }

    public static Object c(ExecutorService executorService, Callable callable, int i7) {
        try {
            return executorService.submit(callable).get(i7, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e7) {
            throw e7;
        } catch (ExecutionException e8) {
            throw new RuntimeException(e8);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
