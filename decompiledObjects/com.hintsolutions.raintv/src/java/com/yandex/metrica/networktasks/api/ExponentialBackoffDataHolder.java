/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.System
 */
package com.yandex.metrica.networktasks.api;

import com.yandex.metrica.networktasks.api.HostRetryInfoProvider;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;
import com.yandex.metrica.networktasks.impl.g;
import com.yandex.metrica.networktasks.impl.h;

public class ExponentialBackoffDataHolder {
    private final g a;
    private final h b;
    private final HostRetryInfoProvider c;
    private long d;
    private int e;

    public ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider) {
        this(hostRetryInfoProvider, new h(), new g());
    }

    public ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider, h h5, g g4) {
        this.c = hostRetryInfoProvider;
        this.b = h5;
        this.a = g4;
        this.d = hostRetryInfoProvider.getLastAttemptTimeSeconds();
        this.e = hostRetryInfoProvider.getNextSendAttemptNumber();
    }

    public void reset() {
        this.e = 1;
        this.d = 0L;
        this.c.saveNextSendAttemptNumber(1);
        this.c.saveLastAttemptTimeSeconds(this.d);
    }

    public void updateLastAttemptInfo() {
        long l8;
        this.b.getClass();
        this.d = l8 = System.currentTimeMillis() / (long)1000;
        ++this.e;
        this.c.saveLastAttemptTimeSeconds(l8);
        this.c.saveNextSendAttemptNumber(this.e);
    }

    public boolean wasLastAttemptLongAgoEnough(RetryPolicyConfig retryPolicyConfig) {
        long l8;
        if (retryPolicyConfig != null && (l8 = this.d) != 0L) {
            g g4 = this.a;
            int n7 = retryPolicyConfig.exponentialMultiplier;
            int n8 = ((1 << this.e - 1) - 1) * n7;
            if (n8 <= (n7 = retryPolicyConfig.maxIntervalSeconds)) {
                n7 = n8;
            }
            return g4.a(l8, n7, "last send attempt");
        }
        return true;
    }
}

