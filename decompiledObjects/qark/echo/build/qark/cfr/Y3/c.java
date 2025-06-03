/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.InterruptedException
 *  java.lang.NoClassDefFoundError
 *  java.lang.Object
 *  java.lang.OutOfMemoryError
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Thread$UncaughtExceptionHandler
 *  java.lang.Throwable
 *  java.util.concurrent.CancellationException
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.Executors
 *  java.util.concurrent.Future
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.ScheduledThreadPoolExecutor
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.TimeUnit
 */
package Y3;

import Q3.d;
import Q3.h;
import V3.r;
import V3.z;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public abstract class c
implements r {
    public ScheduledThreadPoolExecutor a;

    public c() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        this.a = scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new b(null)){

            /*
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Lifted jumps to return sites
             */
            public void afterExecute(Runnable runnable, Throwable throwable) {
                Throwable throwable2;
                block7 : {
                    super.afterExecute(runnable, throwable);
                    throwable2 = throwable;
                    if (throwable == null) {
                        throwable2 = throwable;
                        if (runnable instanceof Future) {
                            runnable = (Future)runnable;
                            throwable2 = throwable;
                            try {
                                if (runnable.isDone()) {
                                    runnable.get();
                                    throwable2 = throwable;
                                }
                                break block7;
                            }
                            catch (ExecutionException executionException) {}
                            throwable2 = executionException.getCause();
                            break block7;
                            catch (CancellationException cancellationException) {
                                throwable2 = throwable;
                                break block7;
                            }
                            catch (InterruptedException interruptedException) {}
                            Thread.currentThread().interrupt();
                            throwable2 = throwable;
                        }
                    }
                }
                if (throwable2 == null) return;
                c.this.g(throwable2);
            }
        };
        scheduledThreadPoolExecutor.setKeepAliveTime(3L, TimeUnit.SECONDS);
    }

    public static String h(Throwable throwable) {
        if (throwable instanceof OutOfMemoryError) {
            return "Firebase Database encountered an OutOfMemoryError. You may need to reduce the amount of data you are syncing to the client (e.g. by using queries or syncing a deeper path). See https://firebase.google.com/docs/database/ios/structure-data#best_practices_for_data_structure and https://firebase.google.com/docs/database/android/retrieve-data#filtering_data";
        }
        if (throwable instanceof NoClassDefFoundError) {
            return "A symbol that the Firebase Database SDK depends on failed to load. This usually indicates that your project includes an incompatible version of another Firebase dependency. If updating your dependencies to the latest version does not resolve this issue, please file a report at https://github.com/firebase/firebase-android-sdk";
        }
        if (throwable instanceof d) {
            return "";
        }
        throwable = new StringBuilder();
        throwable.append("Uncaught exception in Firebase Database runloop (");
        throwable.append(h.g());
        throwable.append("). If you are not already on the latest version of the Firebase SDKs, try updating your dependencies. Should this problem persist, please file a report at https://github.com/firebase/firebase-android-sdk");
        return throwable.toString();
    }

    @Override
    public void a() {
        this.a.setCorePoolSize(1);
    }

    @Override
    public ScheduledFuture b(Runnable runnable, long l8) {
        return this.a.schedule(runnable, l8, TimeUnit.MILLISECONDS);
    }

    @Override
    public void c(Runnable runnable) {
        this.a.execute(runnable);
    }

    public ScheduledExecutorService d() {
        return this.a;
    }

    public ThreadFactory e() {
        return Executors.defaultThreadFactory();
    }

    public z f() {
        return z.a;
    }

    public abstract void g(Throwable var1);

    public class b
    implements ThreadFactory {
        public b() {
        }

        public /* synthetic */ b(Y3.c$a a8) {
            this();
        }

        public Thread newThread(Runnable runnable) {
            runnable = c.this.e().newThread(runnable);
            z z8 = c.this.f();
            z8.a((Thread)runnable, "FirebaseDatabaseWorker");
            z8.b((Thread)runnable, true);
            z8.c((Thread)runnable, new Thread.UncaughtExceptionHandler(){

                public void uncaughtException(Thread thread, Throwable throwable) {
                    c.this.g(throwable);
                }
            });
            return runnable;
        }

    }

}

