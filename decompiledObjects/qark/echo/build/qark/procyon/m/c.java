// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m;

import java.lang.reflect.InvocationTargetException;
import android.os.Handler$Callback;
import android.os.Build$VERSION;
import android.os.Looper;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadFactory;
import android.os.Handler;
import java.util.concurrent.ExecutorService;

public class c extends d
{
    public final Object a;
    public final ExecutorService b;
    public volatile Handler c;
    
    public c() {
        this.a = new Object();
        this.b = Executors.newFixedThreadPool(4, new ThreadFactory() {
            public final AtomicInteger a = new AtomicInteger(0);
            
            @Override
            public Thread newThread(final Runnable target) {
                final Thread thread = new Thread(target);
                thread.setName(String.format("arch_disk_io_%d", this.a.getAndIncrement()));
                return thread;
            }
        });
    }
    
    public static Handler d(final Looper looper) {
        if (Build$VERSION.SDK_INT >= 28) {
            return b.a(looper);
        }
        while (true) {
            while (true) {
                try {
                    return Handler.class.getDeclaredConstructor(Looper.class, Handler$Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
                    return new Handler(looper);
                }
                catch (IllegalAccessException | InstantiationException | NoSuchMethodException ex) {
                    return new Handler(looper);
                }
                catch (InvocationTargetException ex2) {}
                continue;
            }
        }
    }
    
    @Override
    public void a(final Runnable runnable) {
        this.b.execute(runnable);
    }
    
    @Override
    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
    
    @Override
    public void c(final Runnable runnable) {
        while (true) {
            if (this.c == null) {
                final Object a = this.a;
                // monitorenter(a)
                while (true) {
                    try {
                        if (this.c == null) {
                            this.c = d(Looper.getMainLooper());
                        }
                        // monitorexit(a)
                        this.c.post(runnable);
                        return;
                    }
                    // monitorexit(a)
                    finally {}
                    continue;
                }
            }
            continue;
        }
    }
}
