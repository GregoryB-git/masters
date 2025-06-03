// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p4;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;

public abstract class b
{
    public static final Executor a;
    
    static {
        a = p4.a.o;
    }
    
    public static Executor a() {
        return b.a;
    }
    
    public static ExecutorService b() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), new F2.a("firebase-iid-executor"));
    }
}
