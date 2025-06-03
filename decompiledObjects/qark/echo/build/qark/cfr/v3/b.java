/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Runnable
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 */
package v3;

import com.google.android.gms.internal.measurement.p0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class b
extends ThreadPoolExecutor {
    public b(FirebaseAnalytics firebaseAnalytics, int n8, int n9, long l8, TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(0, 1, 30L, timeUnit, blockingQueue);
    }

    public final void execute(Runnable runnable) {
        super.execute(p0.a().b(runnable));
    }
}

