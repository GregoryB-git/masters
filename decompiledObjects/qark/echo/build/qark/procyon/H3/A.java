// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H3;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.Locale;
import E3.f;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;

public abstract class A
{
    public static void a(final String s, final ExecutorService executorService) {
        b(s, executorService, 2L, TimeUnit.SECONDS);
    }
    
    public static void b(final String str, final ExecutorService executorService, final long n, final TimeUnit timeUnit) {
        final Runtime runtime = Runtime.getRuntime();
        final d target = new d() {
            @Override
            public void a() {
                while (true) {
                    while (true) {
                        try {
                            final f f = E3.f.f();
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Executing shutdown hook for ");
                            sb.append(str);
                            f.b(sb.toString());
                            executorService.shutdown();
                            if (!executorService.awaitTermination(n, timeUnit)) {
                                final f f2 = E3.f.f();
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append(str);
                                sb2.append(" did not shut down in the allocated time. Requesting immediate shutdown.");
                                f2.b(sb2.toString());
                                executorService.shutdownNow();
                                return;
                            }
                            return;
                            E3.f.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", str));
                            executorService.shutdownNow();
                            return;
                        }
                        catch (InterruptedException ex) {}
                        continue;
                    }
                }
            }
        };
        final StringBuilder sb = new StringBuilder();
        sb.append("Crashlytics Shutdown Hook for ");
        sb.append(str);
        runtime.addShutdownHook(new Thread(target, sb.toString()));
    }
    
    public static ExecutorService c(final String s) {
        final ExecutorService e = e(d(s), new ThreadPoolExecutor.DiscardPolicy());
        a(s, e);
        return e;
    }
    
    public static ThreadFactory d(final String s) {
        return new ThreadFactory() {
            public final /* synthetic */ AtomicLong b = new AtomicLong(1L);
            
            @Override
            public Thread newThread(final Runnable runnable) {
                final Thread thread = Executors.defaultThreadFactory().newThread(new d() {
                    @Override
                    public void a() {
                        runnable.run();
                    }
                });
                final StringBuilder sb = new StringBuilder();
                sb.append(s);
                sb.append(this.b.getAndIncrement());
                thread.setName(sb.toString());
                return thread;
            }
        };
    }
    
    public static ExecutorService e(final ThreadFactory threadFactory, final RejectedExecutionHandler handler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(), threadFactory, handler));
    }
}
