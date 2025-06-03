/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.networktasks.api.ExponentialBackoffDataHolder;
import com.yandex.metrica.networktasks.api.ExponentialBackoffPolicy;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ed
implements ExponentialBackoffPolicy {
    private final ExponentialBackoffDataHolder a;

    public ed(@NotNull ExponentialBackoffDataHolder exponentialBackoffDataHolder) {
        this.a = exponentialBackoffDataHolder;
    }

    @Override
    public boolean canBeExecuted(@Nullable RetryPolicyConfig retryPolicyConfig) {
        return this.a.wasLastAttemptLongAgoEnough(retryPolicyConfig);
    }

    @Override
    public void onAllHostsAttemptsFinished(boolean bl2) {
        if (bl2) {
            this.a.reset();
        } else {
            this.a.updateLastAttemptInfo();
        }
    }

    @Override
    public void onHostAttemptFinished(boolean bl2) {
    }
}

