/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 */
package D0;

import g0.k;
import java.util.concurrent.Executor;

public final class a
implements Executor {
    public final /* synthetic */ k o;

    public /* synthetic */ a(k k8) {
        this.o = k8;
    }

    public final void execute(Runnable runnable) {
        this.o.j(runnable);
    }
}

