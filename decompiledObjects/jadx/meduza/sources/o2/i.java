package o2;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import nc.j1;
import nc.m1;
import z2.a;

/* loaded from: classes.dex */
public final class i<R> implements s7.e<R> {

    /* renamed from: a, reason: collision with root package name */
    public final j1 f11717a;

    /* renamed from: b, reason: collision with root package name */
    public final z2.c<R> f11718b;

    public i(m1 m1Var) {
        z2.c<R> cVar = new z2.c<>();
        this.f11717a = m1Var;
        this.f11718b = cVar;
        m1Var.invokeOnCompletion(new h(this));
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.f11718b.cancel(z10);
    }

    @Override // s7.e
    public final void f(Runnable runnable, Executor executor) {
        this.f11718b.f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final R get() {
        return this.f11718b.get();
    }

    @Override // java.util.concurrent.Future
    public final R get(long j10, TimeUnit timeUnit) {
        return this.f11718b.get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f11718b.f17483a instanceof a.b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f11718b.isDone();
    }
}
