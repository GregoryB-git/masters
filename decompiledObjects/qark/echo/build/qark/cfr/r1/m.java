/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 */
package r1;

import java.util.concurrent.Executor;

public final class m
implements Executor {
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}

