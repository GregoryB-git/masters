/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  com.twitter.sdk.android.core.Callback
 *  com.twitter.sdk.android.core.TwitterAuthException
 *  com.twitter.sdk.android.core.TwitterAuthToken
 *  com.twitter.sdk.android.core.TwitterSession
 *  java.lang.Object
 *  java.lang.String
 */
package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Intent;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.TwitterSession;

public abstract class AuthHandler {
    public static final String EXTRA_AUTH_ERROR = "auth_error";
    public static final String EXTRA_SCREEN_NAME = "screen_name";
    public static final String EXTRA_TOKEN = "tk";
    public static final String EXTRA_TOKEN_SECRET = "ts";
    public static final String EXTRA_USER_ID = "user_id";
    public static final int RESULT_CODE_ERROR = 1;
    private final Callback<TwitterSession> callback;
    private final TwitterAuthConfig config;
    public final int requestCode;

    public AuthHandler(TwitterAuthConfig twitterAuthConfig, Callback<TwitterSession> callback, int n) {
        this.config = twitterAuthConfig;
        this.callback = callback;
        this.requestCode = n;
    }

    public abstract boolean authorize(Activity var1);

    public TwitterAuthConfig getAuthConfig() {
        return this.config;
    }

    public Callback<TwitterSession> getCallback() {
        return this.callback;
    }

    public boolean handleOnActivityResult(int n, int n2, Intent intent) {
        if (this.requestCode != n) {
            return false;
        }
        Callback<TwitterSession> callback = this.getCallback();
        if (callback != null) {
            if (n2 == -1) {
                String string2 = intent.getStringExtra(EXTRA_TOKEN);
                String string3 = intent.getStringExtra(EXTRA_TOKEN_SECRET);
                String string4 = intent.getStringExtra(EXTRA_SCREEN_NAME);
                long l = intent.getLongExtra(EXTRA_USER_ID, 0L);
                callback.success(new Result<TwitterSession>(new TwitterSession(new TwitterAuthToken(string2, string3), l, string4), null));
            } else if (intent != null && intent.hasExtra(EXTRA_AUTH_ERROR)) {
                callback.failure((TwitterException)((TwitterAuthException)intent.getSerializableExtra(EXTRA_AUTH_ERROR)));
            } else {
                callback.failure((TwitterException)new TwitterAuthException("Authorize failed."));
            }
        }
        return true;
    }
}

