package e1;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class c<Result> {

    /* renamed from: e, reason: collision with root package name */
    public static Handler f3865e;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f3867b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f3868c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f3869d = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public final b f3866a = new b(new a());

    public class a implements Callable<Result> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public final Result call() {
            c.this.f3869d.set(true);
            try {
                Process.setThreadPriority(10);
                c.this.a();
                Binder.flushPendingCommands();
                return null;
            } finally {
            }
        }
    }

    public class b extends FutureTask<Result> {
        public b(a aVar) {
            super(aVar);
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            try {
                Result result = get();
                c cVar = c.this;
                if (cVar.f3869d.get()) {
                    return;
                }
                cVar.d(result);
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (CancellationException unused) {
                c cVar2 = c.this;
                if (cVar2.f3869d.get()) {
                    return;
                }
                cVar2.d(null);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* renamed from: e1.c$c, reason: collision with other inner class name */
    public class RunnableC0068c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f3872a;

        public RunnableC0068c(Object obj) {
            this.f3872a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            c cVar = c.this;
            Object obj = this.f3872a;
            if (cVar.f3868c.get()) {
                cVar.b(obj);
            } else {
                cVar.c(obj);
            }
            cVar.f3867b = 3;
        }
    }

    public abstract void a();

    public void b(Result result) {
    }

    public void c(Result result) {
    }

    public final void d(Result result) {
        Handler handler;
        synchronized (c.class) {
            if (f3865e == null) {
                f3865e = new Handler(Looper.getMainLooper());
            }
            handler = f3865e;
        }
        handler.post(new RunnableC0068c(result));
    }
}
