/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Boolean
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.util.concurrent.ExecutorService
 */
package com.twitter.sdk.android.core;

import android.content.Context;
import com.twitter.sdk.android.core.Logger;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import java.util.concurrent.ExecutorService;

public class TwitterConfig {
    public final Context context;
    public final Boolean debug;
    public final ExecutorService executorService;
    public final Logger logger;
    public final TwitterAuthConfig twitterAuthConfig;

    private TwitterConfig(Context context, Logger logger, TwitterAuthConfig twitterAuthConfig, ExecutorService executorService, Boolean bl) {
        this.context = context;
        this.logger = logger;
        this.twitterAuthConfig = twitterAuthConfig;
        this.executorService = executorService;
        this.debug = bl;
    }

    public /* synthetic */ TwitterConfig(Context context, Logger logger, TwitterAuthConfig twitterAuthConfig, ExecutorService executorService, Boolean bl, 1 var6_6) {
        this(context, logger, twitterAuthConfig, executorService, bl);
    }

    public static class Builder {
        private final Context context;
        private Boolean debug;
        private ExecutorService executorService;
        private Logger logger;
        private TwitterAuthConfig twitterAuthConfig;

        public Builder(Context context) {
            if (context != null) {
                this.context = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        public TwitterConfig build() {
            return new TwitterConfig(this.context, this.logger, this.twitterAuthConfig, this.executorService, this.debug, null);
        }

        public Builder debug(boolean bl) {
            this.debug = bl;
            return this;
        }

        public Builder executorService(ExecutorService executorService) {
            if (executorService != null) {
                this.executorService = executorService;
                return this;
            }
            throw new IllegalArgumentException("ExecutorService must not be null.");
        }

        public Builder logger(Logger logger) {
            if (logger != null) {
                this.logger = logger;
                return this;
            }
            throw new IllegalArgumentException("Logger must not be null.");
        }

        public Builder twitterAuthConfig(TwitterAuthConfig twitterAuthConfig) {
            if (twitterAuthConfig != null) {
                this.twitterAuthConfig = twitterAuthConfig;
                return this;
            }
            throw new IllegalArgumentException("TwitterAuthConfig must not be null.");
        }
    }
}

