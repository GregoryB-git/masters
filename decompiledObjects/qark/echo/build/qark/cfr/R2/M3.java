/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 */
package R2;

import R2.C3;
import R2.G2;
import java.util.concurrent.Executor;

public final class M3
implements Executor {
    public final /* synthetic */ C3 o;

    public M3(C3 c32) {
        this.o = c32;
    }

    public final void execute(Runnable runnable) {
        this.o.e().D(runnable);
    }
}

