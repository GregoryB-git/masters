/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Parcelable
 *  java.lang.Object
 *  java.lang.Override
 */
package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.identity.AuthHandler;
import com.twitter.sdk.android.core.identity.OAuthActivity;

class OAuthHandler
extends AuthHandler {
    public OAuthHandler(TwitterAuthConfig twitterAuthConfig, Callback<TwitterSession> callback, int n) {
        super(twitterAuthConfig, callback, n);
    }

    @Override
    public boolean authorize(Activity activity) {
        activity.startActivityForResult(this.newIntent(activity), this.requestCode);
        return true;
    }

    public Intent newIntent(Activity activity) {
        activity = new Intent((Context)activity, OAuthActivity.class);
        activity.putExtra("auth_config", (Parcelable)this.getAuthConfig());
        return activity;
    }
}

