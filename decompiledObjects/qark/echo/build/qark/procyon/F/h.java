// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import H.a;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadPoolExecutor;

public abstract class h
{
    public static ThreadPoolExecutor a(final String s, final int n, final int n2) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, n2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<Runnable>(), new a(s, n));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
    
    public static void b(final Executor executor, final Callable callable, final H.a a) {
        executor.execute(new b(F.b.a(), callable, a));
    }
    
    public static Object c(final ExecutorService executorService, final Callable callable, final int n) {
        final Future<Object> submit = executorService.submit((Callable<Object>)callable);
        final long n2 = n;
        try {
            return submit.get(n2, TimeUnit.MILLISECONDS);
        }
        catch (InterruptedException ex) {
            goto Label_0042;
        }
        catch (ExecutionException ex2) {
            goto Label_0044;
        }
        catch (TimeoutException ex3) {}
        goto Label_0032;
    }
    
    public static class a implements ThreadFactory
    {
        public String a;
        public int b;
        
        public a(final String a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public Thread newThread(final Runnable runnable) {
            return new h.a.a(runnable, this.a, this.b);
        }
        
        public static class a extends Thread
        {
            public final int o;
            
            public a(final Runnable target, final String name, final int o) {
                super(target, name);
                this.o = o;
            }
            
            @Override
            public void run() {
                Process.setThreadPriority(this.o);
                super.run();
            }
        }
    }
    
    public static class b implements Runnable
    {
        public Callable o;
        public a p;
        public Handler q;
        
        public b(final Handler q, final Callable o, final a p3) {
            this.o = o;
            this.p = p3;
            this.q = q;
        }
        
        @Override
        public void run() {
        Label_0013_Outer:
            while (true) {
                while (true) {
                    try {
                        Object call = this.o.call();
                        while (true) {
                            this.q.post((Runnable)new Runnable() {
                                public final /* synthetic */ a o = b.this.p;
                                
                                @Override
                                public void run() {
                                    this.o.accept(call);
                                }
                            });
                            return;
                            call = null;
                            continue Label_0013_Outer;
                        }
                    }
                    catch (Exception ex) {}
                    continue;
                }
            }
        }
    }
}
