/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  com.twitter.sdk.android.core.Callback
 *  com.twitter.sdk.android.core.TwitterAuthException
 *  com.twitter.sdk.android.core.TwitterSession
 *  com.twitter.sdk.android.core.identity.OAuthHandler
 *  com.twitter.sdk.android.core.identity.SSOAuthHandler
 *  com.twitter.sdk.android.core.identity.TwitterAuthClient$1
 *  com.twitter.sdk.android.core.identity.TwitterAuthClient$CallbackWrapper
 *  com.twitter.sdk.android.core.internal.scribe.DefaultScribeClient
 *  java.lang.Boolean
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  retrofit2.Callback
 */
package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.SessionManager;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.identity.AuthHandler;
import com.twitter.sdk.android.core.identity.AuthState;
import com.twitter.sdk.android.core.identity.OAuthHandler;
import com.twitter.sdk.android.core.identity.SSOAuthHandler;
import com.twitter.sdk.android.core.identity.TwitterAuthClient;
import com.twitter.sdk.android.core.internal.scribe.DefaultScribeClient;
import com.twitter.sdk.android.core.internal.scribe.EventNamespace;
import com.twitter.sdk.android.core.internal.scribe.TwitterCoreScribeClientHolder;

public class TwitterAuthClient {
    private static final String SCRIBE_ACTION = "impression";
    private static final String SCRIBE_CLIENT = "android";
    private static final String SCRIBE_COMPONENT = "";
    private static final String SCRIBE_ELEMENT = "";
    private static final String SCRIBE_LOGIN_PAGE = "login";
    private static final String SCRIBE_SECTION = "";
    private static final String SCRIBE_SHARE_EMAIL_PAGE = "shareemail";
    public final TwitterAuthConfig authConfig;
    public final AuthState authState;
    public final SessionManager<TwitterSession> sessionManager;
    public final TwitterCore twitterCore;

    public TwitterAuthClient() {
        this(TwitterCore.getInstance(), TwitterCore.getInstance().getAuthConfig(), TwitterCore.getInstance().getSessionManager(), AuthStateLazyHolder.INSTANCE);
    }

    public TwitterAuthClient(TwitterCore twitterCore, TwitterAuthConfig twitterAuthConfig, SessionManager<TwitterSession> sessionManager, AuthState authState) {
        this.twitterCore = twitterCore;
        this.authState = authState;
        this.authConfig = twitterAuthConfig;
        this.sessionManager = sessionManager;
    }

    private boolean authorizeUsingOAuth(Activity activity, CallbackWrapper callbackWrapper) {
        Twitter.getLogger().d("Twitter", "Using OAuth");
        AuthState authState = this.authState;
        TwitterAuthConfig twitterAuthConfig = this.authConfig;
        return authState.beginAuthorize(activity, (AuthHandler)new OAuthHandler(twitterAuthConfig, (Callback)callbackWrapper, twitterAuthConfig.getRequestCode()));
    }

    private boolean authorizeUsingSSO(Activity activity, CallbackWrapper callbackWrapper) {
        if (SSOAuthHandler.isAvailable((Context)activity)) {
            Twitter.getLogger().d("Twitter", "Using SSO");
            AuthState authState = this.authState;
            TwitterAuthConfig twitterAuthConfig = this.authConfig;
            return authState.beginAuthorize(activity, (AuthHandler)new SSOAuthHandler(twitterAuthConfig, (Callback)callbackWrapper, twitterAuthConfig.getRequestCode()));
        }
        return false;
    }

    private void handleAuthorize(Activity activity, Callback<TwitterSession> callbackWrapper) {
        this.scribeAuthorizeImpression();
        callbackWrapper = new /* Unavailable Anonymous Inner Class!! */;
        if (!this.authorizeUsingSSO(activity, callbackWrapper) && !this.authorizeUsingOAuth(activity, callbackWrapper)) {
            callbackWrapper.failure((TwitterException)new TwitterAuthException("Authorize failed."));
        }
    }

    private void scribeAuthorizeImpression() {
        DefaultScribeClient defaultScribeClient = this.getScribeClient();
        if (defaultScribeClient == null) {
            return;
        }
        defaultScribeClient.scribe(new EventNamespace[]{new EventNamespace.Builder().setClient(SCRIBE_CLIENT).setPage(SCRIBE_LOGIN_PAGE).setSection("").setComponent("").setElement("").setAction(SCRIBE_ACTION).builder()});
    }

    private void scribeRequestEmail() {
        DefaultScribeClient defaultScribeClient = this.getScribeClient();
        if (defaultScribeClient == null) {
            return;
        }
        defaultScribeClient.scribe(new EventNamespace[]{new EventNamespace.Builder().setClient(SCRIBE_CLIENT).setPage(SCRIBE_SHARE_EMAIL_PAGE).setSection("").setComponent("").setElement("").setAction(SCRIBE_ACTION).builder()});
    }

    public void authorize(Activity activity, Callback<TwitterSession> callback) {
        if (activity != null) {
            if (callback != null) {
                if (activity.isFinishing()) {
                    Twitter.getLogger().e("Twitter", "Cannot authorize, activity is finishing.", null);
                } else {
                    this.handleAuthorize(activity, callback);
                }
                return;
            }
            throw new IllegalArgumentException("Callback must not be null.");
        }
        throw new IllegalArgumentException("Activity must not be null.");
    }

    public void cancelAuthorize() {
        this.authState.endAuthorize();
    }

    public int getRequestCode() {
        return this.authConfig.getRequestCode();
    }

    public DefaultScribeClient getScribeClient() {
        return TwitterCoreScribeClientHolder.getScribeClient();
    }

    public void onActivityResult(int n, int n2, Intent intent) {
        Twitter.getLogger().d("Twitter", z2.n("onActivityResult called with ", n, " ", n2));
        if (!this.authState.isAuthorizeInProgress()) {
            Twitter.getLogger().e("Twitter", "Authorize not in progress", null);
        } else {
            AuthHandler authHandler = this.authState.getAuthHandler();
            if (authHandler != null && authHandler.handleOnActivityResult(n, n2, intent)) {
                this.authState.endAuthorize();
            }
        }
    }

    public void requestEmail(TwitterSession object, Callback<String> callback) {
        this.scribeRequestEmail();
        object = this.twitterCore.getApiClient((TwitterSession)object).getAccountService();
        Boolean bl = Boolean.FALSE;
        object.verifyCredentials(bl, bl, Boolean.TRUE).enqueue((retrofit2.Callback)new 1(this, callback));
    }

    public static class AuthStateLazyHolder {
        private static final AuthState INSTANCE = new AuthState();

        private AuthStateLazyHolder() {
        }
    }
}

