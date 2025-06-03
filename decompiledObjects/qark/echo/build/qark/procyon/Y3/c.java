// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y3;

import V3.z;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import Q3.h;
import Q3.d;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import V3.r;

public abstract class c implements r
{
    public ScheduledThreadPoolExecutor a;
    
    public c() {
        (this.a = new ScheduledThreadPoolExecutor(1, new b(null)) {
            public void afterExecute(final Runnable r, final Throwable t) {
                super.afterExecute(r, t);
                if (t == null && r instanceof Future) {
                    final Future future = (Future)r;
                    try {
                        if (future.isDone()) {
                            future.get();
                            goto Label_0069;
                        }
                        goto Label_0069;
                    }
                    catch (ExecutionException ex) {
                        goto Label_0064;
                    }
                    catch (CancellationException ex2) {
                        goto Label_0069;
                    }
                    catch (InterruptedException ex3) {}
                    goto Label_0053;
                }
                goto Label_0069;
            }
        }).setKeepAliveTime(3L, TimeUnit.SECONDS);
    }
    
    public static String h(final Throwable t) {
        if (t instanceof OutOfMemoryError) {
            return "Firebase Database encountered an OutOfMemoryError. You may need to reduce the amount of data you are syncing to the client (e.g. by using queries or syncing a deeper path). See https://firebase.google.com/docs/database/ios/structure-data#best_practices_for_data_structure and https://firebase.google.com/docs/database/android/retrieve-data#filtering_data";
        }
        if (t instanceof NoClassDefFoundError) {
            return "A symbol that the Firebase Database SDK depends on failed to load. This usually indicates that your project includes an incompatible version of another Firebase dependency. If updating your dependencies to the latest version does not resolve this issue, please file a report at https://github.com/firebase/firebase-android-sdk";
        }
        if (t instanceof d) {
            return "";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Uncaught exception in Firebase Database runloop (");
        sb.append(h.g());
        sb.append("). If you are not already on the latest version of the Firebase SDKs, try updating your dependencies. Should this problem persist, please file a report at https://github.com/firebase/firebase-android-sdk");
        return sb.toString();
    }
    
    @Override
    public void a() {
        this.a.setCorePoolSize(1);
    }
    
    @Override
    public ScheduledFuture b(final Runnable command, final long delay) {
        return this.a.schedule(command, delay, TimeUnit.MILLISECONDS);
    }
    
    @Override
    public void c(final Runnable command) {
        this.a.execute(command);
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
    
    public abstract void g(final Throwable p0);
    
    public class b implements ThreadFactory
    {
        @Override
        public Thread newThread(final Runnable runnable) {
            final Thread thread = c.this.e().newThread(runnable);
            final z f = c.this.f();
            f.a(thread, "FirebaseDatabaseWorker");
            f.b(thread, true);
            f.c(thread, new Thread.UncaughtExceptionHandler() {
                @Override
                public void uncaughtException(final Thread thread, final Throwable t) {
                    c.this.g(t);
                }
            });
            return thread;
        }
    }
}
