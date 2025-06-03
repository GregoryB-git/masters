package C3;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: C3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ThreadFactoryC0348b implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f942e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f943a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f944b;

    /* renamed from: c, reason: collision with root package name */
    public final int f945c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f946d;

    public ThreadFactoryC0348b(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        this.f944b = str;
        this.f945c = i7;
        this.f946d = threadPolicy;
    }

    public final /* synthetic */ void b(Runnable runnable) {
        Process.setThreadPriority(this.f945c);
        StrictMode.ThreadPolicy threadPolicy = this.f946d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread newThread = f942e.newThread(new Runnable() { // from class: C3.a
            @Override // java.lang.Runnable
            public final void run() {
                ThreadFactoryC0348b.this.b(runnable);
            }
        });
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f944b, Long.valueOf(this.f943a.getAndIncrement())));
        return newThread;
    }
}
