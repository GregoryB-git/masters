/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.LinkedBlockingQueue
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 */
package z4;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import z4.a;
import z4.c;

public abstract class b {
    public static final a a;
    public static volatile a b;

    static {
        b b8 = new b(null);
        a = b8;
        b = b8;
    }

    public static a a() {
        return b;
    }

    public static class b
    implements a {
        public b() {
        }

        public /* synthetic */ b( a8) {
            this();
        }

        @Override
        public ExecutorService a(ThreadFactory threadFactory, c c8) {
            return this.b(1, threadFactory, c8);
        }

        public ExecutorService b(int n8, ThreadFactory threadFactory, c c8) {
            threadFactory = new ThreadPoolExecutor(n8, n8, 60L, TimeUnit.SECONDS, (BlockingQueue)new LinkedBlockingQueue(), threadFactory);
            threadFactory.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService((ExecutorService)threadFactory);
        }
    }

}

