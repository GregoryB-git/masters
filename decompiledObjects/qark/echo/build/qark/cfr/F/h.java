/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Process
 *  java.lang.Exception
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.Callable
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Future
 *  java.util.concurrent.LinkedBlockingDeque
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.TimeoutException
 */
package F;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class h {
    public static ThreadPoolExecutor a(String object, int n8, int n9) {
        object = new a((String)object, n8);
        object = new ThreadPoolExecutor(0, 1, (long)n9, TimeUnit.MILLISECONDS, (BlockingQueue)new LinkedBlockingDeque(), (ThreadFactory)object);
        object.allowCoreThreadTimeOut(true);
        return object;
    }

    public static void b(Executor executor, Callable callable, H.a a8) {
        executor.execute((Runnable)new b(F.b.a(), callable, a8));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Object c(ExecutorService object, Callable callable, int n8) {
        object = object.submit(callable);
        long l8 = n8;
        try {
            return object.get(l8, TimeUnit.MILLISECONDS);
        }
        catch (InterruptedException interruptedException) {
            throw interruptedException;
        }
        catch (ExecutionException executionException) {
            throw new RuntimeException((Throwable)executionException);
        }
        catch (TimeoutException timeoutException) {
            throw new InterruptedException("timeout");
        }
    }

    public static class F.h$a
    implements ThreadFactory {
        public String a;
        public int b;

        public F.h$a(String string2, int n8) {
            this.a = string2;
            this.b = n8;
        }

        public Thread newThread(Runnable runnable) {
            return new a(runnable, this.a, this.b);
        }

        public static class a
        extends Thread {
            public final int o;

            public a(Runnable runnable, String string2, int n8) {
                super(runnable, string2);
                this.o = n8;
            }

            public void run() {
                Process.setThreadPriority((int)this.o);
                super.run();
            }
        }

    }

    public static class b
    implements Runnable {
        public Callable o;
        public H.a p;
        public Handler q;

        public b(Handler handler, Callable callable, H.a a8) {
            this.o = callable;
            this.p = a8;
            this.q = handler;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void run() {
            Object object;
            block2 : {
                try {
                    object = this.o.call();
                    break block2;
                }
                catch (Exception exception) {}
                object = null;
            }
            final H.a a8 = this.p;
            this.q.post(new Runnable(){

                public void run() {
                    a8.accept(object);
                }
            });
        }

    }

}

