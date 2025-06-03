package e8;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import x0.q0;

/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f4809e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f4810a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f4811b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4812c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f4813d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f4811b = str;
        this.f4812c = i10;
        this.f4813d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f4809e.newThread(new q0(7, this, runnable));
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f4811b, Long.valueOf(this.f4810a.getAndIncrement())));
        return newThread;
    }
}
