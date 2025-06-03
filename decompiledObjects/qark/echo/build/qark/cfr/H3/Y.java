/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Callable
 *  java.util.concurrent.Executor
 */
package H3;

import H3.c0;
import V2.k;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class Y
implements Runnable {
    public final /* synthetic */ Callable o;
    public final /* synthetic */ Executor p;
    public final /* synthetic */ k q;

    public /* synthetic */ Y(Callable callable, Executor executor, k k8) {
        this.o = callable;
        this.p = executor;
        this.q = k8;
    }

    public final void run() {
        c0.e(this.o, this.p, this.q);
    }
}

