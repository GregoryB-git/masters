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
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.m0;
import com.google.android.gms.internal.measurement.n0;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class o0
implements m0 {
    public o0() {
    }

    public /* synthetic */ o0(n0 n02) {
        this();
    }

    @Override
    public final ExecutorService a(ThreadFactory threadFactory, int n8) {
        threadFactory = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, (BlockingQueue)new LinkedBlockingQueue(), threadFactory);
        threadFactory.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService((ExecutorService)threadFactory);
    }
}

