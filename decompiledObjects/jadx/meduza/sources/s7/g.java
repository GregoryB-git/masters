package s7;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class g implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ThreadFactory f14265a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14266b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f14267c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Boolean f14268d;

    public g(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool) {
        this.f14265a = threadFactory;
        this.f14266b = str;
        this.f14267c = atomicLong;
        this.f14268d = bool;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f14265a.newThread(runnable);
        Objects.requireNonNull(newThread);
        String str = this.f14266b;
        if (str != null) {
            AtomicLong atomicLong = this.f14267c;
            Objects.requireNonNull(atomicLong);
            newThread.setName(String.format(Locale.ROOT, str, Long.valueOf(atomicLong.getAndIncrement())));
        }
        Boolean bool = this.f14268d;
        if (bool != null) {
            newThread.setDaemon(bool.booleanValue());
        }
        return newThread;
    }
}
