/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  com.twitter.sdk.android.core.DefaultLogger
 *  java.io.File
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.ExecutorService
 */
package com.twitter.sdk.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import com.twitter.sdk.android.core.DefaultLogger;
import com.twitter.sdk.android.core.Logger;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterConfig;
import com.twitter.sdk.android.core.TwitterContext;
import com.twitter.sdk.android.core.internal.ActivityLifecycleManager;
import com.twitter.sdk.android.core.internal.CommonUtils;
import com.twitter.sdk.android.core.internal.ExecutorUtils;
import com.twitter.sdk.android.core.internal.IdManager;
import java.io.File;
import java.util.concurrent.ExecutorService;

public class Twitter {
    private static final String CONSUMER_KEY = "com.twitter.sdk.android.CONSUMER_KEY";
    private static final String CONSUMER_SECRET = "com.twitter.sdk.android.CONSUMER_SECRET";
    public static final Logger DEFAULT_LOGGER = new DefaultLogger();
    private static final String NOT_INITIALIZED_MESSAGE = "Must initialize Twitter before using getInstance()";
    public static final String TAG = "Twitter";
    @SuppressLint(value={"StaticFieldLeak"})
    public static volatile Twitter instance;
    private final Context context;
    private final boolean debug;
    private final ExecutorService executorService;
    private final IdManager idManager;
    private final ActivityLifecycleManager lifecycleManager;
    private final Logger logger;
    private final TwitterAuthConfig twitterAuthConfig;

    private Twitter(TwitterConfig twitterConfig) {
        Context context;
        this.context = context = twitterConfig.context;
        this.idManager = new IdManager(context);
        this.lifecycleManager = new ActivityLifecycleManager(context);
        Object object = twitterConfig.twitterAuthConfig;
        this.twitterAuthConfig = object == null ? new TwitterAuthConfig(CommonUtils.getStringResourceValue(context, CONSUMER_KEY, ""), CommonUtils.getStringResourceValue(context, CONSUMER_SECRET, "")) : object;
        object = twitterConfig.executorService;
        this.executorService = object == null ? ExecutorUtils.buildThreadPoolExecutorService("twitter-worker") : object;
        object = twitterConfig.logger;
        this.logger = object == null ? DEFAULT_LOGGER : object;
        twitterConfig = twitterConfig.debug;
        this.debug = twitterConfig == null ? false : twitterConfig.booleanValue();
    }

    public static void checkInitialized() {
        if (instance != null) {
            return;
        }
        throw new IllegalStateException(NOT_INITIALIZED_MESSAGE);
    }

    public static Twitter createTwitter(TwitterConfig object) {
        Class<Twitter> clazz = Twitter.class;
        synchronized (Twitter.class) {
            block4: {
                Twitter twitter;
                if (instance != null) break block4;
                instance = twitter = new Twitter((TwitterConfig)object);
                object = instance;
                // ** MonitorExit[var2_2] (shouldn't be in output)
                return object;
            }
            object = instance;
            // ** MonitorExit[var2_2] (shouldn't be in output)
            return object;
        }
    }

    public static Twitter getInstance() {
        Twitter.checkInitialized();
        return instance;
    }

    public static Logger getLogger() {
        if (instance == null) {
            return DEFAULT_LOGGER;
        }
        return Twitter.instance.logger;
    }

    public static void initialize(Context context) {
        Twitter.createTwitter(new TwitterConfig.Builder(context).build());
    }

    public static void initialize(TwitterConfig twitterConfig) {
        Twitter.createTwitter(twitterConfig);
    }

    public static boolean isDebug() {
        if (instance == null) {
            return false;
        }
        return Twitter.instance.debug;
    }

    public ActivityLifecycleManager getActivityLifecycleManager() {
        return this.lifecycleManager;
    }

    public Context getContext(String string2) {
        return new TwitterContext(this.context, string2, z2.s(z2.t(".TwitterKit"), File.separator, string2));
    }

    public ExecutorService getExecutorService() {
        return this.executorService;
    }

    public IdManager getIdManager() {
        return this.idManager;
    }

    public TwitterAuthConfig getTwitterAuthConfig() {
        return this.twitterAuthConfig;
    }
}

