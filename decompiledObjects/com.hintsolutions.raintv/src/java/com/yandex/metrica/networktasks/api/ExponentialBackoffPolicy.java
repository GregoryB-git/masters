/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.yandex.metrica.networktasks.api;

import com.yandex.metrica.networktasks.api.RetryPolicyConfig;

public interface ExponentialBackoffPolicy {
    public boolean canBeExecuted(RetryPolicyConfig var1);

    public void onAllHostsAttemptsFinished(boolean var1);

    public void onHostAttemptFinished(boolean var1);
}

