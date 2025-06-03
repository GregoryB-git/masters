/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.twitter.sdk.android.core.Callback
 *  com.twitter.sdk.android.core.GuestSession
 *  com.twitter.sdk.android.core.GuestSessionProvider$1
 *  com.twitter.sdk.android.core.internal.oauth.GuestAuthToken
 *  com.twitter.sdk.android.core.internal.oauth.OAuth2Service
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.util.concurrent.CountDownLatch
 */
package com.twitter.sdk.android.core;

import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.GuestSession;
import com.twitter.sdk.android.core.GuestSessionProvider;
import com.twitter.sdk.android.core.SessionManager;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Service;
import java.util.concurrent.CountDownLatch;

public class GuestSessionProvider {
    private final OAuth2Service oAuth2Service;
    private final SessionManager<GuestSession> sessionManager;

    public GuestSessionProvider(OAuth2Service oAuth2Service, SessionManager<GuestSession> sessionManager) {
        this.oAuth2Service = oAuth2Service;
        this.sessionManager = sessionManager;
    }

    public static /* synthetic */ SessionManager access$000(GuestSessionProvider guestSessionProvider) {
        return guestSessionProvider.sessionManager;
    }

    public GuestSession getCurrentSession() {
        GuestSessionProvider guestSessionProvider = this;
        synchronized (guestSessionProvider) {
            GuestSession guestSession;
            block4: {
                guestSession = this.sessionManager.getActiveSession();
                boolean bl = this.isSessionValid(guestSession);
                if (!bl) break block4;
                return guestSession;
            }
            this.refreshToken();
            guestSession = this.sessionManager.getActiveSession();
            return guestSession;
        }
    }

    public boolean isSessionValid(GuestSession guestSession) {
        boolean bl = guestSession != null && guestSession.getAuthToken() != null && !((GuestAuthToken)guestSession.getAuthToken()).isExpired();
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public GuestSession refreshCurrentSession(GuestSession guestSession) {
        GuestSessionProvider guestSessionProvider = this;
        synchronized (guestSessionProvider) {
            GuestSession guestSession2 = this.sessionManager.getActiveSession();
            if (guestSession == null) return this.sessionManager.getActiveSession();
            if (!guestSession.equals(guestSession2)) return this.sessionManager.getActiveSession();
            this.refreshToken();
            return this.sessionManager.getActiveSession();
        }
    }

    public void refreshToken() {
        Twitter.getLogger().d("GuestSessionProvider", "Refreshing expired guest session.");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.oAuth2Service.requestGuestAuthToken((Callback)new 1(this, countDownLatch));
        try {
            countDownLatch.await();
        }
        catch (InterruptedException interruptedException) {
            this.sessionManager.clearSession(0L);
        }
    }
}

