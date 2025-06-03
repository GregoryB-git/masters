package nc;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import nc.y0;

/* loaded from: classes.dex */
public final class h0 extends y0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: r, reason: collision with root package name */
    public static final h0 f11502r;

    /* renamed from: s, reason: collision with root package name */
    public static final long f11503s;

    static {
        Long l10;
        h0 h0Var = new h0();
        f11502r = h0Var;
        h0Var.E0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f11503s = timeUnit.toNanos(l10.longValue());
    }

    @Override // nc.z0
    public final Thread I0() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // nc.z0
    public final void J0(long j10, y0.c cVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // nc.y0
    public final void L0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.L0(runnable);
    }

    public final synchronized void P0() {
        int i10 = debugStatus;
        if (i10 == 2 || i10 == 3) {
            debugStatus = 3;
            y0.f11569o.set(this, null);
            y0.f11570p.set(this, null);
            notifyAll();
        }
    }

    @Override // nc.y0, nc.l0
    public final t0 q0(long j10, e2 e2Var, ub.h hVar) {
        long j11 = j10 > 0 ? j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10 : 0L;
        if (j11 >= 4611686018427387903L) {
            return u1.f11557a;
        }
        long nanoTime = System.nanoTime();
        y0.b bVar = new y0.b(e2Var, j11 + nanoTime);
        O0(nanoTime, bVar);
        return bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        c2.f11479a.set(this);
        try {
            synchronized (this) {
                int i10 = debugStatus;
                if (i10 == 2 || i10 == 3) {
                    z10 = false;
                } else {
                    debugStatus = 1;
                    notifyAll();
                    z10 = true;
                }
            }
            if (!z10) {
                _thread = null;
                P0();
                if (N0()) {
                    return;
                }
                I0();
                return;
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long G0 = G0();
                if (G0 == Long.MAX_VALUE) {
                    long nanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f11503s + nanoTime;
                    }
                    long j11 = j10 - nanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        P0();
                        if (N0()) {
                            return;
                        }
                        I0();
                        return;
                    }
                    if (G0 > j11) {
                        G0 = j11;
                    }
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (G0 > 0) {
                    int i11 = debugStatus;
                    if (i11 == 2 || i11 == 3) {
                        _thread = null;
                        P0();
                        if (N0()) {
                            return;
                        }
                        I0();
                        return;
                    }
                    LockSupport.parkNanos(this, G0);
                }
            }
        } catch (Throwable th) {
            _thread = null;
            P0();
            if (!N0()) {
                I0();
            }
            throw th;
        }
    }

    @Override // nc.y0, nc.x0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
