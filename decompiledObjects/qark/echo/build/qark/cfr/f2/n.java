/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Throwable
 *  java.util.concurrent.Executor
 */
package f2;

import java.util.concurrent.Executor;

public class n
implements Executor {
    public final Executor o;

    public n(Executor executor) {
        this.o = executor;
    }

    public void execute(Runnable runnable) {
        this.o.execute((Runnable)new a(runnable));
    }

    public static class a
    implements Runnable {
        public final Runnable o;

        public a(Runnable runnable) {
            this.o = runnable;
        }

        public void run() {
            try {
                this.o.run();
                return;
            }
            catch (Exception exception) {
                j2.a.d("Executor", "Background execution failure.", (Throwable)exception);
                return;
            }
        }
    }

}

