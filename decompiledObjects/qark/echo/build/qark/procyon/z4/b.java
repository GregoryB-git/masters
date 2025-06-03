// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z4;

import java.util.concurrent.Executors;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public abstract class b
{
    public static final a a;
    public static volatile a b;
    
    static {
        z4.b.b = (a = new b(null));
    }
    
    public static a a() {
        return z4.b.b;
    }
    
    public static class b implements a
    {
        @Override
        public ExecutorService a(final ThreadFactory threadFactory, final c c) {
            return this.b(1, threadFactory, c);
        }
        
        public ExecutorService b(final int n, final ThreadFactory threadFactory, final c c) {
            final ThreadPoolExecutor executor = new ThreadPoolExecutor(n, n, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), threadFactory);
            executor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(executor);
        }
    }
}
