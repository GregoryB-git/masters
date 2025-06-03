/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Runtime
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.util.List
 *  java.util.Locale
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.LinkedBlockingQueue
 *  java.util.concurrent.RejectedExecutionHandler
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.ThreadPoolExecutor$DiscardPolicy
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.atomic.AtomicLong
 */
package H3;

import E3.f;
import H3.d;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public abstract class A {
    public static void a(String string2, ExecutorService executorService) {
        A.b(string2, executorService, 2L, TimeUnit.SECONDS);
    }

    public static void b(String string2, ExecutorService object, long l8, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        object = new d((ExecutorService)object, l8, timeUnit){
            public final /* synthetic */ ExecutorService p;
            public final /* synthetic */ long q;
            public final /* synthetic */ TimeUnit r;
            {
                this.p = executorService;
                this.q = l8;
                this.r = timeUnit;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void a() {
                try {
                    f f8 = f.f();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Executing shutdown hook for ");
                    stringBuilder.append(String.this);
                    f8.b(stringBuilder.toString());
                    this.p.shutdown();
                    if (this.p.awaitTermination(this.q, this.r)) return;
                    f8 = f.f();
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(String.this);
                    stringBuilder.append(" did not shut down in the allocated time. Requesting immediate shutdown.");
                    f8.b(stringBuilder.toString());
                    this.p.shutdownNow();
                    return;
                }
                catch (InterruptedException interruptedException) {}
                f.f().b(String.format((Locale)Locale.US, (String)"Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", (Object[])new Object[]{String.this}));
                this.p.shutdownNow();
            }
        };
        timeUnit = new StringBuilder();
        timeUnit.append("Crashlytics Shutdown Hook for ");
        timeUnit.append(string2);
        runtime.addShutdownHook(new Thread((Runnable)object, timeUnit.toString()));
    }

    public static ExecutorService c(String string2) {
        ExecutorService executorService = A.e(A.d(string2), (RejectedExecutionHandler)new ThreadPoolExecutor.DiscardPolicy());
        A.a(string2, executorService);
        return executorService;
    }

    public static ThreadFactory d(String string2) {
        return new ThreadFactory(new AtomicLong(1L)){
            public final /* synthetic */ AtomicLong b;
            {
                this.b = atomicLong;
            }

            public Thread newThread(final Runnable runnable) {
                runnable = Executors.defaultThreadFactory().newThread((Runnable)new d(){

                    @Override
                    public void a() {
                        runnable.run();
                    }
                });
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(String.this);
                stringBuilder.append(this.b.getAndIncrement());
                runnable.setName(stringBuilder.toString());
                return runnable;
            }

        };
    }

    public static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService((ExecutorService)new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, (BlockingQueue)new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }

}

