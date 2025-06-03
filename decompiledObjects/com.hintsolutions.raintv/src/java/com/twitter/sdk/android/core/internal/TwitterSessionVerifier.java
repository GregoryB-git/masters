/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.String
 */
package com.twitter.sdk.android.core.internal;

import com.twitter.sdk.android.core.TwitterApiClient;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.internal.SessionVerifier;
import com.twitter.sdk.android.core.internal.scribe.DefaultScribeClient;
import com.twitter.sdk.android.core.internal.scribe.EventNamespace;
import com.twitter.sdk.android.core.internal.scribe.TwitterCoreScribeClientHolder;
import com.twitter.sdk.android.core.services.AccountService;
import java.io.IOException;

public class TwitterSessionVerifier
implements SessionVerifier<TwitterSession> {
    public static final String SCRIBE_ACTION = "impression";
    public static final String SCRIBE_CLIENT = "android";
    public static final String SCRIBE_COMPONENT = "";
    public static final String SCRIBE_ELEMENT = "";
    public static final String SCRIBE_PAGE = "credentials";
    public static final String SCRIBE_SECTION = "";
    private final AccountServiceProvider accountServiceProvider;
    private final DefaultScribeClient scribeClient;

    public TwitterSessionVerifier() {
        this.accountServiceProvider = new Object(){

            public AccountService getAccountService(TwitterSession twitterSession) {
                return new TwitterApiClient(twitterSession).getAccountService();
            }
        };
        this.scribeClient = TwitterCoreScribeClientHolder.getScribeClient();
    }

    public TwitterSessionVerifier(AccountServiceProvider accountServiceProvider, DefaultScribeClient defaultScribeClient) {
        this.accountServiceProvider = accountServiceProvider;
        this.scribeClient = defaultScribeClient;
    }

    private void scribeVerifySession() {
        if (this.scribeClient == null) {
            return;
        }
        EventNamespace eventNamespace = new EventNamespace.Builder().setClient(SCRIBE_CLIENT).setPage(SCRIBE_PAGE).setSection("").setComponent("").setElement("").setAction(SCRIBE_ACTION).builder();
        this.scribeClient.scribe(eventNamespace);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void verifySession(TwitterSession object) {
        object = this.accountServiceProvider.getAccountService((TwitterSession)object);
        try {
            this.scribeVerifySession();
            Boolean bl = Boolean.TRUE;
            Boolean bl2 = Boolean.FALSE;
            object.verifyCredentials(bl, bl2, bl2).execute();
            return;
        }
        catch (IOException | RuntimeException throwable) {
            return;
        }
    }
}

