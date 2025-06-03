/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.RejectedExecutionHandler
 *  java.util.concurrent.ThreadPoolExecutor
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFc1ySDK;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public final class s
implements RejectedExecutionHandler {
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        AFc1ySDK.a(runnable, threadPoolExecutor);
    }
}

