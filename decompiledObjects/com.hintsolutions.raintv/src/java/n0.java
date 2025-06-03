/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 */
import android.os.Handler;
import java.util.concurrent.Executor;

public final class n0
implements Executor {
    public final Handler a;

    public /* synthetic */ n0(Handler handler) {
        this.a = handler;
    }

    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}

