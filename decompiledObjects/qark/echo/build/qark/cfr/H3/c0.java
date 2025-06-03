/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.concurrent.Callable
 *  java.util.concurrent.CancellationException
 *  java.util.concurrent.CountDownLatch
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.TimeoutException
 */
package H3;

import H3.A;
import H3.X;
import H3.Y;
import H3.Z;
import H3.a0;
import H3.b0;
import V2.b;
import V2.j;
import V2.k;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class c0 {
    public static final ExecutorService a = A.c("awaitEvenIfOnMainThread task continuation executor");

    public static /* synthetic */ Object a(k k8, j j8) {
        return c0.j(k8, j8);
    }

    public static /* synthetic */ Object b(CountDownLatch countDownLatch, j j8) {
        return c0.i(countDownLatch, j8);
    }

    public static /* synthetic */ Void c(k k8, j j8) {
        return c0.m(k8, j8);
    }

    public static /* synthetic */ Void d(k k8, j j8) {
        return c0.l(k8, j8);
    }

    public static /* synthetic */ void e(Callable callable, Executor executor, k k8) {
        c0.k(callable, executor, k8);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Object f(j j8) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        j8.g((Executor)a, new X(countDownLatch));
        long l8 = Looper.getMainLooper() == Looper.myLooper() ? 3L : 4L;
        countDownLatch.await(l8, TimeUnit.SECONDS);
        if (j8.n()) {
            return j8.j();
        }
        if (j8.l()) {
            throw new CancellationException("Task is already canceled");
        }
        if (j8.m()) {
            throw new IllegalStateException((Throwable)j8.i());
        }
        throw new TimeoutException();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static boolean g(CountDownLatch var0, long var1_2, TimeUnit var3_3) {
        block6 : {
            var6_5 = false;
            var5_6 = false;
            var4_7 = var6_5;
            try {
                var7_8 = var3_3.toNanos(var1_2);
                var4_7 = var6_5;
                var9_9 = System.nanoTime();
                var1_2 = var7_8;
lbl9: // 2 sources:
                var4_7 = var5_6;
                try {
                    var11_10 = var0.await(var1_2, TimeUnit.NANOSECONDS);
                    if (var5_6 == false) return var11_10;
                }
                catch (InterruptedException var3_4) {}
                Thread.currentThread().interrupt();
                return var11_10;
                var4_7 = true;
                var5_6 = true;
                var1_2 = System.nanoTime();
            }
            catch (Throwable var0_1) {
                break block6;
            }
            var1_2 = var9_9 + var7_8 - var1_2;
            ** GOTO lbl9
        }
        if (var4_7 == false) throw var0_1;
        Thread.currentThread().interrupt();
        throw var0_1;
    }

    public static j h(Executor executor, Callable callable) {
        k k8 = new k();
        executor.execute((Runnable)new Y(callable, executor, k8));
        return k8.a();
    }

    public static /* synthetic */ Object i(CountDownLatch countDownLatch, j j8) {
        countDownLatch.countDown();
        return null;
    }

    public static /* synthetic */ Object j(k k8, j j8) {
        if (j8.n()) {
            k8.c(j8.j());
        } else if (j8.i() != null) {
            k8.b(j8.i());
        }
        return null;
    }

    public static /* synthetic */ void k(Callable callable, Executor executor, k k8) {
        try {
            ((j)callable.call()).g(executor, new b0(k8));
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public static /* synthetic */ Void l(k k8, j j8) {
        if (j8.n()) {
            k8.e(j8.j());
        } else if (j8.i() != null) {
            k8.d(j8.i());
        }
        return null;
    }

    public static /* synthetic */ Void m(k k8, j j8) {
        if (j8.n()) {
            k8.e(j8.j());
        } else if (j8.i() != null) {
            k8.d(j8.i());
        }
        return null;
    }

    public static j n(j j8, j j9) {
        k k8 = new k();
        a0 a02 = new a0(k8);
        j8.f(a02);
        j9.f(a02);
        return k8.a();
    }

    public static j o(Executor executor, j j8, j j9) {
        k k8 = new k();
        Z z8 = new Z(k8);
        j8.g(executor, z8);
        j9.g(executor, z8);
        return k8.a();
    }
}

