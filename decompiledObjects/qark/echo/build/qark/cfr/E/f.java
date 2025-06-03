/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.concurrent.Executor
 *  java.util.concurrent.RejectedExecutionException
 */
package E;

import H.e;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public abstract class f {
    public static Executor a(Handler handler) {
        return new a(handler);
    }

    public static class a
    implements Executor {
        public final Handler o;

        public a(Handler handler) {
            this.o = (Handler)e.b((Object)handler);
        }

        public void execute(Runnable runnable) {
            if (this.o.post((Runnable)e.b((Object)runnable))) {
                return;
            }
            runnable = new StringBuilder();
            runnable.append((Object)this.o);
            runnable.append(" is shutting down");
            throw new RejectedExecutionException(runnable.toString());
        }
    }

}

