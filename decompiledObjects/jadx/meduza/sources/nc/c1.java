package nc;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c1 extends b1 implements l0 {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f11478c;

    public c1(Executor executor) {
        Method method;
        this.f11478c = executor;
        Method method2 = sc.b.f14330a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = sc.b.f14330a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f11478c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c1) && ((c1) obj).f11478c == this.f11478c;
    }

    @Override // nc.l0
    public final void f(long j10, l lVar) {
        Executor executor = this.f11478c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            i6.p pVar = new i6.p(9, this, lVar);
            ub.h hVar = lVar.f11516e;
            try {
                scheduledFuture = scheduledExecutorService.schedule(pVar, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                p2.m0.l(hVar, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            lVar.v(new h(scheduledFuture, 0));
        } else {
            h0.f11502r.f(j10, lVar);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f11478c);
    }

    @Override // nc.l0
    public final t0 q0(long j10, e2 e2Var, ub.h hVar) {
        Executor executor = this.f11478c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(e2Var, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                p2.m0.l(hVar, cancellationException);
            }
        }
        return scheduledFuture != null ? new s0(scheduledFuture) : h0.f11502r.q0(j10, e2Var, hVar);
    }

    @Override // nc.a0
    public final String toString() {
        return this.f11478c.toString();
    }

    @Override // nc.a0
    public final void z0(ub.h hVar, Runnable runnable) {
        try {
            this.f11478c.execute(runnable);
        } catch (RejectedExecutionException e10) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e10);
            p2.m0.l(hVar, cancellationException);
            r0.f11546b.z0(hVar, runnable);
        }
    }
}
