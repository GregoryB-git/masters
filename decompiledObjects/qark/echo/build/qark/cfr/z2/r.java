/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 */
package z2;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class r
implements Executor {
    public final /* synthetic */ Handler o;

    public /* synthetic */ r(Handler handler) {
        this.o = handler;
    }

    public final void execute(Runnable runnable) {
        this.o.post(runnable);
    }
}

