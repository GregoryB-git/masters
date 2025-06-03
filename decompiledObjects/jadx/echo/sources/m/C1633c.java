package m;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1633c extends d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f17312a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f17313b = Executors.newFixedThreadPool(4, new a());

    /* renamed from: c, reason: collision with root package name */
    public volatile Handler f17314c;

    /* renamed from: m.c$a */
    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f17315a = new AtomicInteger(0);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f17315a.getAndIncrement())));
            return thread;
        }
    }

    public static Handler d(Looper looper) {
        Handler createAsync;
        if (Build.VERSION.SDK_INT >= 28) {
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // m.d
    public void a(Runnable runnable) {
        this.f17313b.execute(runnable);
    }

    @Override // m.d
    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // m.d
    public void c(Runnable runnable) {
        if (this.f17314c == null) {
            synchronized (this.f17312a) {
                try {
                    if (this.f17314c == null) {
                        this.f17314c = d(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.f17314c.post(runnable);
    }
}
