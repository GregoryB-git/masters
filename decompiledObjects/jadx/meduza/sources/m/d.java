package m;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import defpackage.f;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: b, reason: collision with root package name */
    public final Object f9853b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f9854c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Handler f9855d;

    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f9856a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            StringBuilder l10 = f.l("arch_disk_io_");
            l10.append(this.f9856a.getAndIncrement());
            thread.setName(l10.toString());
            return thread;
        }
    }

    public d() {
        super(0);
        this.f9853b = new Object();
        this.f9854c = Executors.newFixedThreadPool(4, new a());
    }

    public static Handler v(Looper looper) {
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
}
