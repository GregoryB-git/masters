/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.twitter.sdk.android.core.Callback
 *  com.twitter.sdk.android.core.models.Tweet
 *  java.lang.Object
 */
package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.models.Tweet;

class BaseTweetAction {
    public final Callback<Tweet> actionCallback;

    public BaseTweetAction(Callback<Tweet> callback) {
        this.actionCallback = callback;
    }

    public Callback<Tweet> getActionCallback() {
        return this.actionCallback;
    }
}

