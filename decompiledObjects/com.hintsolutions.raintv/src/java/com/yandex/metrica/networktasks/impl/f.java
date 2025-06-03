/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  kotlin.jvm.internal.Intrinsics
 */
package com.yandex.metrica.networktasks.impl;

import com.yandex.metrica.networktasks.api.ExponentialBackoffPolicy;
import com.yandex.metrica.networktasks.api.IExecutionPolicy;
import com.yandex.metrica.networktasks.api.NetworkTask;
import com.yandex.metrica.networktasks.impl.c;
import com.yandex.metrica.networktasks.impl.d;
import kotlin.jvm.internal.Intrinsics;

public final class f
implements Runnable {
    private final NetworkTask a;
    private final c b;
    private final d c;

    public f(NetworkTask networkTask, c c3, d d4) {
        Intrinsics.checkNotNullParameter((Object)networkTask, (String)"networkTask");
        Intrinsics.checkNotNullParameter((Object)((Object)c3), (String)"rootThreadStateSource");
        Intrinsics.checkNotNullParameter((Object)d4, (String)"taskPerformingStrategy");
        this.a = networkTask;
        this.b = c3;
        this.c = d4;
    }

    public void run() {
        boolean bl;
        ExponentialBackoffPolicy exponentialBackoffPolicy = this.a.getExponentialBackoffPolicy();
        Intrinsics.checkNotNullExpressionValue((Object)exponentialBackoffPolicy, (String)"networkTask.exponentialBackoffPolicy");
        IExecutionPolicy iExecutionPolicy = this.a.getConnectionExecutionPolicy();
        Intrinsics.checkNotNullExpressionValue((Object)iExecutionPolicy, (String)"networkTask.connectionExecutionPolicy");
        boolean bl2 = this.b.isRunning();
        boolean bl3 = true;
        if (bl2 && iExecutionPolicy.canBeExecuted() && exponentialBackoffPolicy.canBeExecuted(this.a.getRetryPolicyConfig())) {
            bl2 = this.a.onCreateNetworkTask();
            iExecutionPolicy = null;
            while (this.b.isRunning() && bl2 && exponentialBackoffPolicy.canBeExecuted(this.a.getRetryPolicyConfig())) {
                iExecutionPolicy = Boolean.valueOf((boolean)this.c.a(this.a));
                bl2 = !iExecutionPolicy.booleanValue() && this.a.shouldTryNextHost();
                exponentialBackoffPolicy.onHostAttemptFinished(iExecutionPolicy.booleanValue());
            }
            bl = bl3;
            if (iExecutionPolicy != null) {
                exponentialBackoffPolicy.onAllHostsAttemptsFinished(iExecutionPolicy.booleanValue());
                bl = bl3;
            }
        } else {
            bl = false;
        }
        if (!bl) {
            this.a.onShouldNotExecute();
        }
    }
}

