/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.util.Collection
 *  java.util.List
 *  java.util.concurrent.Callable
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Future
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 */
package C3;

import C3.c;
import C3.d;
import C3.e;
import C3.f;
import C3.g;
import C3.h;
import C3.i;
import C3.j;
import C3.k;
import C3.l;
import C3.m;
import C3.n;
import C3.p;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class o
implements ScheduledExecutorService {
    public final ExecutorService o;
    public final ScheduledExecutorService p;

    public o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.o = executorService;
        this.p = scheduledExecutorService;
    }

    public static /* synthetic */ ScheduledFuture a(o o8, Callable callable, long l8, TimeUnit timeUnit, p.b b8) {
        return o8.r(callable, l8, timeUnit, b8);
    }

    public static /* synthetic */ ScheduledFuture b(o o8, Runnable runnable, long l8, long l9, TimeUnit timeUnit, p.b b8) {
        return o8.w(runnable, l8, l9, timeUnit, b8);
    }

    public static /* synthetic */ ScheduledFuture c(o o8, Runnable runnable, long l8, long l9, TimeUnit timeUnit, p.b b8) {
        return o8.u(runnable, l8, l9, timeUnit, b8);
    }

    public static /* synthetic */ void d(Callable callable, p.b b8) {
        o.p(callable, b8);
    }

    public static /* synthetic */ void e(Runnable runnable, p.b b8) {
        o.s(runnable, b8);
    }

    public static /* synthetic */ void f(o o8, Runnable runnable, p.b b8) {
        o8.t(runnable, b8);
    }

    public static /* synthetic */ Future g(o o8, Callable callable, p.b b8) {
        return o8.q(callable, b8);
    }

    public static /* synthetic */ void h(Runnable runnable, p.b b8) {
        o.x(runnable, b8);
    }

    public static /* synthetic */ void i(o o8, Runnable runnable, p.b b8) {
        o8.n(runnable, b8);
    }

    public static /* synthetic */ void j(Runnable runnable, p.b b8) {
        o.m(runnable, b8);
    }

    public static /* synthetic */ void k(o o8, Runnable runnable, p.b b8) {
        o8.v(runnable, b8);
    }

    public static /* synthetic */ ScheduledFuture l(o o8, Runnable runnable, long l8, TimeUnit timeUnit, p.b b8) {
        return o8.o(runnable, l8, timeUnit, b8);
    }

    public static /* synthetic */ void m(Runnable runnable, p.b b8) {
        try {
            runnable.run();
            b8.set(null);
            return;
        }
        catch (Exception exception) {
            b8.a((Throwable)exception);
            return;
        }
    }

    public static /* synthetic */ void p(Callable callable, p.b b8) {
        try {
            b8.set(callable.call());
            return;
        }
        catch (Exception exception) {
            b8.a((Throwable)exception);
            return;
        }
    }

    public static /* synthetic */ void s(Runnable runnable, p.b b8) {
        try {
            runnable.run();
            return;
        }
        catch (Exception exception) {
            b8.a((Throwable)exception);
            throw exception;
        }
    }

    public static /* synthetic */ void x(Runnable runnable, p.b b8) {
        try {
            runnable.run();
            return;
        }
        catch (Exception exception) {
            b8.a((Throwable)exception);
            return;
        }
    }

    public boolean awaitTermination(long l8, TimeUnit timeUnit) {
        return this.o.awaitTermination(l8, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.o.execute(runnable);
    }

    public List invokeAll(Collection collection) {
        return this.o.invokeAll(collection);
    }

    public List invokeAll(Collection collection, long l8, TimeUnit timeUnit) {
        return this.o.invokeAll(collection, l8, timeUnit);
    }

    public Object invokeAny(Collection collection) {
        return this.o.invokeAny(collection);
    }

    public Object invokeAny(Collection collection, long l8, TimeUnit timeUnit) {
        return this.o.invokeAny(collection, l8, timeUnit);
    }

    public boolean isShutdown() {
        return this.o.isShutdown();
    }

    public boolean isTerminated() {
        return this.o.isTerminated();
    }

    public final /* synthetic */ void n(Runnable runnable, p.b b8) {
        this.o.execute((Runnable)new m(runnable, b8));
    }

    public final /* synthetic */ ScheduledFuture o(Runnable runnable, long l8, TimeUnit timeUnit, p.b b8) {
        return this.p.schedule((Runnable)new j(this, runnable, b8), l8, timeUnit);
    }

    public final /* synthetic */ Future q(Callable callable, p.b b8) {
        return this.o.submit((Runnable)new n(callable, b8));
    }

    public final /* synthetic */ ScheduledFuture r(Callable callable, long l8, TimeUnit timeUnit, p.b b8) {
        return this.p.schedule((Callable)new k(this, callable, b8), l8, timeUnit);
    }

    public ScheduledFuture schedule(Runnable runnable, long l8, TimeUnit timeUnit) {
        return new p(new c(this, runnable, l8, timeUnit));
    }

    public ScheduledFuture schedule(Callable callable, long l8, TimeUnit timeUnit) {
        return new p(new h(this, callable, l8, timeUnit));
    }

    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long l8, long l9, TimeUnit timeUnit) {
        return new p(new f(this, runnable, l8, l9, timeUnit));
    }

    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long l8, long l9, TimeUnit timeUnit) {
        return new p(new g(this, runnable, l8, l9, timeUnit));
    }

    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public Future submit(Runnable runnable) {
        return this.o.submit(runnable);
    }

    public Future submit(Runnable runnable, Object object) {
        return this.o.submit(runnable, object);
    }

    public Future submit(Callable callable) {
        return this.o.submit(callable);
    }

    public final /* synthetic */ void t(Runnable runnable, p.b b8) {
        this.o.execute((Runnable)new d(runnable, b8));
    }

    public final /* synthetic */ ScheduledFuture u(Runnable runnable, long l8, long l9, TimeUnit timeUnit, p.b b8) {
        return this.p.scheduleAtFixedRate((Runnable)new i(this, runnable, b8), l8, l9, timeUnit);
    }

    public final /* synthetic */ void v(Runnable runnable, p.b b8) {
        this.o.execute((Runnable)new e(runnable, b8));
    }

    public final /* synthetic */ ScheduledFuture w(Runnable runnable, long l8, long l9, TimeUnit timeUnit, p.b b8) {
        return this.p.scheduleWithFixedDelay((Runnable)new l(this, runnable, b8), l8, l9, timeUnit);
    }
}

