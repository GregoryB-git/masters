package j8;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class x implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8658a = "awaitEvenIfOnMainThread task continuation executor";

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f8659b;

    public class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f8660a;

        public a(Runnable runnable) {
            this.f8660a = runnable;
        }

        @Override // j8.d
        public final void a() {
            this.f8660a.run();
        }
    }

    public x(AtomicLong atomicLong) {
        this.f8659b = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(new a(runnable));
        newThread.setName(this.f8658a + this.f8659b.getAndIncrement());
        return newThread;
    }
}
