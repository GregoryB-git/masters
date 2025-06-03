package C3;

import C3.p;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class o implements ScheduledExecutorService {

    /* renamed from: o, reason: collision with root package name */
    public final ExecutorService f985o;

    /* renamed from: p, reason: collision with root package name */
    public final ScheduledExecutorService f986p;

    public o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f985o = executorService;
        this.f986p = scheduledExecutorService;
    }

    public static /* synthetic */ void m(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e7) {
            bVar.a(e7);
        }
    }

    public static /* synthetic */ void p(Callable callable, p.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e7) {
            bVar.a(e7);
        }
    }

    public static /* synthetic */ void s(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e7) {
            bVar.a(e7);
            throw e7;
        }
    }

    public static /* synthetic */ void x(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e7) {
            bVar.a(e7);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j7, TimeUnit timeUnit) {
        return this.f985o.awaitTermination(j7, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f985o.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f985o.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f985o.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f985o.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f985o.isTerminated();
    }

    public final /* synthetic */ void n(final Runnable runnable, final p.b bVar) {
        this.f985o.execute(new Runnable() { // from class: C3.m
            @Override // java.lang.Runnable
            public final void run() {
                o.m(runnable, bVar);
            }
        });
    }

    public final /* synthetic */ ScheduledFuture o(final Runnable runnable, long j7, TimeUnit timeUnit, final p.b bVar) {
        return this.f986p.schedule(new Runnable() { // from class: C3.j
            @Override // java.lang.Runnable
            public final void run() {
                o.this.n(runnable, bVar);
            }
        }, j7, timeUnit);
    }

    public final /* synthetic */ Future q(final Callable callable, final p.b bVar) {
        return this.f985o.submit(new Runnable() { // from class: C3.n
            @Override // java.lang.Runnable
            public final void run() {
                o.p(callable, bVar);
            }
        });
    }

    public final /* synthetic */ ScheduledFuture r(final Callable callable, long j7, TimeUnit timeUnit, final p.b bVar) {
        return this.f986p.schedule(new Callable() { // from class: C3.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Future q7;
                q7 = o.this.q(callable, bVar);
                return q7;
            }
        }, j7, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Runnable runnable, final long j7, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: C3.c
            @Override // C3.p.c
            public final ScheduledFuture a(p.b bVar) {
                ScheduledFuture o7;
                o7 = o.this.o(runnable, j7, timeUnit, bVar);
                return o7;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(final Runnable runnable, final long j7, final long j8, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: C3.f
            @Override // C3.p.c
            public final ScheduledFuture a(p.b bVar) {
                ScheduledFuture u7;
                u7 = o.this.u(runnable, j7, j8, timeUnit, bVar);
                return u7;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(final Runnable runnable, final long j7, final long j8, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: C3.g
            @Override // C3.p.c
            public final ScheduledFuture a(p.b bVar) {
                ScheduledFuture w7;
                w7 = o.this.w(runnable, j7, j8, timeUnit, bVar);
                return w7;
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f985o.submit(runnable);
    }

    public final /* synthetic */ void t(final Runnable runnable, final p.b bVar) {
        this.f985o.execute(new Runnable() { // from class: C3.d
            @Override // java.lang.Runnable
            public final void run() {
                o.s(runnable, bVar);
            }
        });
    }

    public final /* synthetic */ ScheduledFuture u(final Runnable runnable, long j7, long j8, TimeUnit timeUnit, final p.b bVar) {
        return this.f986p.scheduleAtFixedRate(new Runnable() { // from class: C3.i
            @Override // java.lang.Runnable
            public final void run() {
                o.this.t(runnable, bVar);
            }
        }, j7, j8, timeUnit);
    }

    public final /* synthetic */ void v(final Runnable runnable, final p.b bVar) {
        this.f985o.execute(new Runnable() { // from class: C3.e
            @Override // java.lang.Runnable
            public final void run() {
                o.x(runnable, bVar);
            }
        });
    }

    public final /* synthetic */ ScheduledFuture w(final Runnable runnable, long j7, long j8, TimeUnit timeUnit, final p.b bVar) {
        return this.f986p.scheduleWithFixedDelay(new Runnable() { // from class: C3.l
            @Override // java.lang.Runnable
            public final void run() {
                o.this.v(runnable, bVar);
            }
        }, j7, j8, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j7, TimeUnit timeUnit) {
        return this.f985o.invokeAll(collection, j7, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j7, TimeUnit timeUnit) {
        return this.f985o.invokeAny(collection, j7, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Callable callable, final long j7, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: C3.h
            @Override // C3.p.c
            public final ScheduledFuture a(p.b bVar) {
                ScheduledFuture r7;
                r7 = o.this.r(callable, j7, timeUnit, bVar);
                return r7;
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f985o.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f985o.submit(callable);
    }
}
