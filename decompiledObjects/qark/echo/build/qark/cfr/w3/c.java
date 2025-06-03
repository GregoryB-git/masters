/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 */
package w3;

import java.util.concurrent.Executor;

public final class c
implements Executor {
    public static final /* synthetic */ c o;

    static /* synthetic */ {
        o = new c();
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}

