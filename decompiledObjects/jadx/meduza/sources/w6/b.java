package w6;

import i6.q;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class b implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f16436b = new AtomicInteger();

    /* renamed from: c, reason: collision with root package name */
    public final ThreadFactory f16437c = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final String f16435a = "GAC_Transform";

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f16437c.newThread(new q(runnable));
        newThread.setName(this.f16435a + "[" + this.f16436b.getAndIncrement() + "]");
        return newThread;
    }
}
