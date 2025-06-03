/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.RejectedExecutionException
 */
package p6;

import X5.g;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import p6.S;
import p6.W;
import p6.c;
import p6.f0;
import p6.g0;
import p6.u0;

public final class h0
extends g0
implements S {
    public final Executor r;

    public h0(Executor executor) {
        this.r = executor;
        u6.c.a(this.I());
    }

    @Override
    public void E(g g8, Runnable runnable) {
        try {
            Executor executor = this.I();
            c.a();
            executor.execute(runnable);
            return;
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            c.a();
            this.H(g8, rejectedExecutionException);
            W.b().E(g8, runnable);
            return;
        }
    }

    public final void H(g g8, RejectedExecutionException rejectedExecutionException) {
        u0.c(g8, f0.a("The task was rejected", (Throwable)rejectedExecutionException));
    }

    public Executor I() {
        return this.r;
    }

    public void close() {
        Executor executor = this.I();
        executor = executor instanceof ExecutorService ? (ExecutorService)executor : null;
        if (executor != null) {
            executor.shutdown();
        }
    }

    public boolean equals(Object object) {
        if (object instanceof h0 && ((h0)object).I() == this.I()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return System.identityHashCode((Object)this.I());
    }

    @Override
    public String toString() {
        return this.I().toString();
    }
}

