/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.System
 *  java.util.concurrent.TimeUnit
 *  kotlin.Metadata
 */
package com.hintsolutions.raintv.utils;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2={"Lcom/hintsolutions/raintv/utils/RateLimiter;", "", "requestsPerSecond", "", "(D)V", "intervalMillis", "", "lastRequestTime", "tryAcquire", "", "app_release"}, k=1, mv={1, 7, 1}, xi=48)
public final class RateLimiter {
    private final long intervalMillis;
    private long lastRequestTime;

    public RateLimiter(double d2) {
        this.intervalMillis = (long)((double)TimeUnit.SECONDS.toMillis(1L) / d2);
    }

    public final boolean tryAcquire() {
        boolean bl;
        long l = System.currentTimeMillis();
        if (l - this.lastRequestTime >= this.intervalMillis) {
            this.lastRequestTime = l;
            bl = true;
        } else {
            bl = false;
        }
        return bl;
    }
}

