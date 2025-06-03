/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Runtime
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.util.Locale
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.LinkedBlockingQueue
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.atomic.AtomicLong
 */
package com.twitter.sdk.android.core.internal;

import com.twitter.sdk.android.core.Logger;
import com.twitter.sdk.android.core.Twitter;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class ExecutorUtils {
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    private static final long DEFAULT_TERMINATION_TIMEOUT = 1L;
    private static final long KEEP_ALIVE = 1L;
    private static final int MAXIMUM_POOL_SIZE;

    static {
        int n;
        CPU_COUNT = n = Runtime.getRuntime().availableProcessors();
        CORE_POOL_SIZE = n + 1;
        MAXIMUM_POOL_SIZE = n * 2 + 1;
    }

    private ExecutorUtils() {
    }

    public static void addDelayedShutdownHook(String string2, ExecutorService executorService) {
        ExecutorUtils.addDelayedShutdownHook(string2, executorService, 1L, TimeUnit.SECONDS);
    }

    public static void addDelayedShutdownHook(String string2, ExecutorService executorService, long l, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable(executorService, l, timeUnit, string2){
            public final ExecutorService val$service;
            public final String val$serviceName;
            public final long val$terminationTimeout;
            public final TimeUnit val$timeUnit;
            {
                this.val$service = executorService;
                this.val$terminationTimeout = l;
                this.val$timeUnit = timeUnit;
                this.val$serviceName = string2;
            }

            public void run() {
                try {
                    this.val$service.shutdown();
                    if (!this.val$service.awaitTermination(this.val$terminationTimeout, this.val$timeUnit)) {
                        Logger logger = Twitter.getLogger();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(this.val$serviceName);
                        stringBuilder.append(" did not shutdown in the allocated time. Requesting immediate shutdown.");
                        logger.d("Twitter", stringBuilder.toString());
                        this.val$service.shutdownNow();
                    }
                }
                catch (InterruptedException interruptedException) {
                    Twitter.getLogger().d("Twitter", String.format((Locale)Locale.US, (String)"Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", (Object[])new Object[]{this.val$serviceName}));
                    this.val$service.shutdownNow();
                }
            }
        }, z2.o("Twitter Shutdown Hook for ", string2)));
    }

    public static ScheduledExecutorService buildSingleThreadScheduledExecutorService(String string2) {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor((ThreadFactory)ExecutorUtils.getNamedThreadFactory(string2));
        ExecutorUtils.addDelayedShutdownHook(string2, (ExecutorService)scheduledExecutorService);
        return scheduledExecutorService;
    }

    public static ExecutorService buildThreadPoolExecutorService(String string2) {
        ThreadFactory threadFactory = ExecutorUtils.getNamedThreadFactory(string2);
        threadFactory = new ThreadPoolExecutor(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, 1L, TimeUnit.SECONDS, (BlockingQueue)new LinkedBlockingQueue(), threadFactory);
        ExecutorUtils.addDelayedShutdownHook(string2, (ExecutorService)threadFactory);
        return threadFactory;
    }

    public static ThreadFactory getNamedThreadFactory(String string2) {
        return new ThreadFactory(string2, new AtomicLong(1L)){
            public final AtomicLong val$count;
            public final String val$threadNameTemplate;
            {
                this.val$threadNameTemplate = string2;
                this.val$count = atomicLong;
            }

            public Thread newThread(Runnable runnable) {
                Thread thread = Executors.defaultThreadFactory().newThread(runnable);
                runnable = new StringBuilder();
                runnable.append(this.val$threadNameTemplate);
                runnable.append(this.val$count.getAndIncrement());
                thread.setName(runnable.toString());
                return thread;
            }
        };
    }
}

