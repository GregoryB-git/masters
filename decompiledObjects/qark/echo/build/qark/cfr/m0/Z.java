/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 */
package m0;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class Z
implements Executor {
    public final /* synthetic */ Handler o;

    public /* synthetic */ Z(Handler handler) {
        this.o = handler;
    }

    public final void execute(Runnable runnable) {
        this.o.post(runnable);
    }
}

