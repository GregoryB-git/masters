/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 */
package V2;

import O2.a;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class J
implements Executor {
    public final Handler o = new a(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.o.post(runnable);
    }
}

