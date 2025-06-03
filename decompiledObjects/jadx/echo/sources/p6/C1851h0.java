package p6;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import u6.AbstractC2033c;

/* renamed from: p6.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1851h0 extends AbstractC1849g0 implements S {

    /* renamed from: r, reason: collision with root package name */
    public final Executor f18534r;

    public C1851h0(Executor executor) {
        this.f18534r = executor;
        AbstractC2033c.a(I());
    }

    @Override // p6.F
    public void E(X5.g gVar, Runnable runnable) {
        try {
            Executor I6 = I();
            AbstractC1840c.a();
            I6.execute(runnable);
        } catch (RejectedExecutionException e7) {
            AbstractC1840c.a();
            H(gVar, e7);
            W.b().E(gVar, runnable);
        }
    }

    public final void H(X5.g gVar, RejectedExecutionException rejectedExecutionException) {
        u0.c(gVar, AbstractC1847f0.a("The task was rejected", rejectedExecutionException));
    }

    public Executor I() {
        return this.f18534r;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor I6 = I();
        ExecutorService executorService = I6 instanceof ExecutorService ? (ExecutorService) I6 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1851h0) && ((C1851h0) obj).I() == I();
    }

    public int hashCode() {
        return System.identityHashCode(I());
    }

    @Override // p6.F
    public String toString() {
        return I().toString();
    }
}
