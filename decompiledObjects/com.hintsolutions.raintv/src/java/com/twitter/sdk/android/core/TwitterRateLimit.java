/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  okhttp3.Headers
 */
package com.twitter.sdk.android.core;

import okhttp3.Headers;

public class TwitterRateLimit {
    private static final String LIMIT_KEY = "x-rate-limit-limit";
    private static final String REMAINING_KEY = "x-rate-limit-remaining";
    private static final String RESET_KEY = "x-rate-limit-reset";
    private int remainingRequest;
    private int requestLimit;
    private long resetSeconds;

    public TwitterRateLimit(Headers headers) {
        if (headers != null) {
            for (int i = 0; i < headers.size(); ++i) {
                if (LIMIT_KEY.equals((Object)headers.name(i))) {
                    this.requestLimit = Integer.valueOf((String)headers.value(i));
                    continue;
                }
                if (REMAINING_KEY.equals((Object)headers.name(i))) {
                    this.remainingRequest = Integer.valueOf((String)headers.value(i));
                    continue;
                }
                if (!RESET_KEY.equals((Object)headers.name(i))) continue;
                this.resetSeconds = Long.valueOf((String)headers.value(i));
            }
            return;
        }
        throw new IllegalArgumentException("headers must not be null");
    }

    public int getLimit() {
        return this.requestLimit;
    }

    public int getRemaining() {
        return this.remainingRequest;
    }

    public long getReset() {
        return this.resetSeconds;
    }
}

