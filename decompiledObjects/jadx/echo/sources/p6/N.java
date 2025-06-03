package p6;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class N extends AbstractC1839b0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: w, reason: collision with root package name */
    public static final N f18504w;

    /* renamed from: x, reason: collision with root package name */
    public static final long f18505x;

    static {
        Long l7;
        N n7 = new N();
        f18504w = n7;
        AbstractC1837a0.N(n7, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l7 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l7 = 1000L;
        }
        f18505x = timeUnit.toNanos(l7.longValue());
    }

    @Override // p6.AbstractC1841c0
    public Thread T() {
        Thread thread = _thread;
        return thread == null ? f0() : thread;
    }

    @Override // p6.AbstractC1839b0
    public void X(Runnable runnable) {
        if (g0()) {
            j0();
        }
        super.X(runnable);
    }

    public final synchronized void e0() {
        if (h0()) {
            debugStatus = 3;
            c0();
            Intrinsics.c(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final synchronized Thread f0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    public final boolean g0() {
        return debugStatus == 4;
    }

    public final boolean h0() {
        int i7 = debugStatus;
        return i7 == 2 || i7 == 3;
    }

    public final synchronized boolean i0() {
        if (h0()) {
            return false;
        }
        debugStatus = 1;
        Intrinsics.c(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    public final void j0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean a02;
        L0.f18501a.d(this);
        AbstractC1840c.a();
        try {
            if (!i0()) {
                if (a02) {
                    return;
                } else {
                    return;
                }
            }
            long j7 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long Q6 = Q();
                if (Q6 == Long.MAX_VALUE) {
                    AbstractC1840c.a();
                    long nanoTime = System.nanoTime();
                    if (j7 == Long.MAX_VALUE) {
                        j7 = f18505x + nanoTime;
                    }
                    long j8 = j7 - nanoTime;
                    if (j8 <= 0) {
                        _thread = null;
                        e0();
                        AbstractC1840c.a();
                        if (a0()) {
                            return;
                        }
                        T();
                        return;
                    }
                    Q6 = l6.f.c(Q6, j8);
                } else {
                    j7 = Long.MAX_VALUE;
                }
                if (Q6 > 0) {
                    if (h0()) {
                        _thread = null;
                        e0();
                        AbstractC1840c.a();
                        if (a0()) {
                            return;
                        }
                        T();
                        return;
                    }
                    AbstractC1840c.a();
                    LockSupport.parkNanos(this, Q6);
                }
            }
        } finally {
            _thread = null;
            e0();
            AbstractC1840c.a();
            if (!a0()) {
                T();
            }
        }
    }

    @Override // p6.AbstractC1839b0, p6.AbstractC1837a0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
