/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 */
package w2;

import java.util.concurrent.Executor;

public final class D
implements Executor {
    public static final /* synthetic */ D o;

    static /* synthetic */ {
        o = new D();
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}

