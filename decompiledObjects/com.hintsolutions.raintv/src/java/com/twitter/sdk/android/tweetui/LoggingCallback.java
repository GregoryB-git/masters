/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 */
package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Logger;
import com.twitter.sdk.android.core.TwitterException;

abstract class LoggingCallback<T>
extends Callback<T> {
    private final Callback cb;
    private final Logger logger;

    public LoggingCallback(Callback callback, Logger logger) {
        this.cb = callback;
        this.logger = logger;
    }

    @Override
    public void failure(TwitterException twitterException) {
        this.logger.e("TweetUi", twitterException.getMessage(), (Throwable)twitterException);
        Callback callback = this.cb;
        if (callback != null) {
            callback.failure(twitterException);
        }
    }
}

