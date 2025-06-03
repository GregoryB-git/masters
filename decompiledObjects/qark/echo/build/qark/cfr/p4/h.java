/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 */
package p4;

import java.util.concurrent.Executor;

public final class h
implements Executor {
    public static final Executor o = new h();

    public void execute(Runnable runnable) {
        runnable.run();
    }
}

