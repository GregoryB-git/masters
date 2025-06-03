/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  com.twitter.sdk.android.core.GuestSession
 *  com.twitter.sdk.android.core.GuestSession$Serializer
 *  com.twitter.sdk.android.core.PersistedSessionManager
 *  com.twitter.sdk.android.core.TwitterSession
 *  com.twitter.sdk.android.core.TwitterSession$Serializer
 *  com.twitter.sdk.android.core.internal.TwitterSessionVerifier
 *  com.twitter.sdk.android.core.internal.oauth.OAuth2Service
 *  com.twitter.sdk.android.core.internal.persistence.PreferenceStoreImpl
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.ExecutorService
 */
package com.twitter.sdk.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import com.twitter.sdk.android.core.GuestSession;
import com.twitter.sdk.android.core.GuestSessionProvider;
import com.twitter.sdk.android.core.PersistedSessionManager;
import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.SessionManager;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterApiClient;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.internal.SessionMonitor;
import com.twitter.sdk.android.core.internal.SessionVerifier;
import com.twitter.sdk.android.core.internal.TwitterApi;
import com.twitter.sdk.android.core.internal.TwitterSessionVerifier;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Service;
import com.twitter.sdk.android.core.internal.persistence.PreferenceStore;
import com.twitter.sdk.android.core.internal.persistence.PreferenceStoreImpl;
import com.twitter.sdk.android.core.internal.persistence.SerializationStrategy;
import com.twitter.sdk.android.core.internal.scribe.TwitterCoreScribeClientHolder;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

public class TwitterCore {
    public static final String KIT_SCRIBE_NAME = "TwitterCore";
    public static final String PREF_KEY_ACTIVE_GUEST_SESSION = "active_guestsession";
    public static final String PREF_KEY_ACTIVE_TWITTER_SESSION = "active_twittersession";
    public static final String PREF_KEY_GUEST_SESSION = "guestsession";
    public static final String PREF_KEY_TWITTER_SESSION = "twittersession";
    public static final String SESSION_PREF_FILE_NAME = "session_store";
    public static final String TAG = "Twitter";
    @SuppressLint(value={"StaticFieldLeak"})
    public static volatile TwitterCore instance;
    private final ConcurrentHashMap<Session, TwitterApiClient> apiClients;
    private final TwitterAuthConfig authConfig;
    private final Context context;
    private volatile TwitterApiClient guestClient;
    public SessionManager<GuestSession> guestSessionManager;
    private volatile GuestSessionProvider guestSessionProvider;
    public SessionMonitor<TwitterSession> sessionMonitor;
    public SessionManager<TwitterSession> twitterSessionManager;

    public TwitterCore(TwitterAuthConfig twitterAuthConfig) {
        this(twitterAuthConfig, (ConcurrentHashMap<Session, TwitterApiClient>)new ConcurrentHashMap(), null);
    }

    public TwitterCore(TwitterAuthConfig twitterAuthConfig, ConcurrentHashMap<Session, TwitterApiClient> concurrentHashMap, TwitterApiClient twitterApiClient) {
        this.authConfig = twitterAuthConfig;
        this.apiClients = concurrentHashMap;
        this.guestClient = twitterApiClient;
        twitterAuthConfig = Twitter.getInstance().getContext(this.getIdentifier());
        this.context = twitterAuthConfig;
        this.twitterSessionManager = new PersistedSessionManager((PreferenceStore)new PreferenceStoreImpl((Context)twitterAuthConfig, SESSION_PREF_FILE_NAME), (SerializationStrategy)new TwitterSession.Serializer(), PREF_KEY_ACTIVE_TWITTER_SESSION, PREF_KEY_TWITTER_SESSION);
        this.guestSessionManager = new PersistedSessionManager((PreferenceStore)new PreferenceStoreImpl((Context)twitterAuthConfig, SESSION_PREF_FILE_NAME), (SerializationStrategy)new GuestSession.Serializer(), PREF_KEY_ACTIVE_GUEST_SESSION, PREF_KEY_GUEST_SESSION);
        this.sessionMonitor = new SessionMonitor<TwitterSession>(this.twitterSessionManager, Twitter.getInstance().getExecutorService(), (SessionVerifier<TwitterSession>)new TwitterSessionVerifier());
    }

    private void createGuestClient() {
        TwitterCore twitterCore = this;
        synchronized (twitterCore) {
            if (this.guestClient == null) {
                TwitterApiClient twitterApiClient;
                this.guestClient = twitterApiClient = new TwitterApiClient();
            }
            return;
        }
    }

    private void createGuestClient(TwitterApiClient twitterApiClient) {
        TwitterCore twitterCore = this;
        synchronized (twitterCore) {
            if (this.guestClient == null) {
                this.guestClient = twitterApiClient;
            }
            return;
        }
    }

    private void createGuestSessionProvider() {
        TwitterCore twitterCore = this;
        synchronized (twitterCore) {
            if (this.guestSessionProvider == null) {
                Object object = new TwitterApi();
                OAuth2Service oAuth2Service = new OAuth2Service(this, (TwitterApi)object);
                this.guestSessionProvider = object = new GuestSessionProvider(oAuth2Service, this.guestSessionManager);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static TwitterCore getInstance() {
        if (instance != null) return instance;
        Class<TwitterCore> clazz = TwitterCore.class;
        synchronized (TwitterCore.class) {
            if (instance != null) return instance;
            Runnable runnable = new TwitterCore(Twitter.getInstance().getTwitterAuthConfig());
            instance = runnable;
            ExecutorService executorService = Twitter.getInstance().getExecutorService();
            runnable = new Runnable(){

                public void run() {
                    instance.doInBackground();
                }
            };
            executorService.execute(runnable);
            // ** MonitorExit[var2] (shouldn't be in output)
            return instance;
        }
    }

    private void setUpScribeClient() {
        TwitterCoreScribeClientHolder.initialize(this.context, this.getSessionManager(), this.getGuestSessionProvider(), Twitter.getInstance().getIdManager(), KIT_SCRIBE_NAME, this.getVersion());
    }

    public void addApiClient(TwitterSession twitterSession, TwitterApiClient twitterApiClient) {
        if (!this.apiClients.containsKey((Object)twitterSession)) {
            this.apiClients.putIfAbsent((Object)twitterSession, (Object)twitterApiClient);
        }
    }

    public void addGuestApiClient(TwitterApiClient twitterApiClient) {
        if (this.guestClient == null) {
            this.createGuestClient(twitterApiClient);
        }
    }

    public void doInBackground() {
        this.twitterSessionManager.getActiveSession();
        this.guestSessionManager.getActiveSession();
        this.getGuestSessionProvider();
        this.setUpScribeClient();
        this.sessionMonitor.monitorActivityLifecycle(Twitter.getInstance().getActivityLifecycleManager());
    }

    public TwitterApiClient getApiClient() {
        TwitterSession twitterSession = this.twitterSessionManager.getActiveSession();
        if (twitterSession == null) {
            return this.getGuestApiClient();
        }
        return this.getApiClient(twitterSession);
    }

    public TwitterApiClient getApiClient(TwitterSession twitterSession) {
        if (!this.apiClients.containsKey((Object)twitterSession)) {
            this.apiClients.putIfAbsent((Object)twitterSession, (Object)new TwitterApiClient(twitterSession));
        }
        return (TwitterApiClient)this.apiClients.get((Object)twitterSession);
    }

    public TwitterAuthConfig getAuthConfig() {
        return this.authConfig;
    }

    public TwitterApiClient getGuestApiClient() {
        if (this.guestClient == null) {
            this.createGuestClient();
        }
        return this.guestClient;
    }

    public GuestSessionProvider getGuestSessionProvider() {
        if (this.guestSessionProvider == null) {
            this.createGuestSessionProvider();
        }
        return this.guestSessionProvider;
    }

    public String getIdentifier() {
        return "com.twitter.sdk.android:twitter-core";
    }

    public SessionManager<TwitterSession> getSessionManager() {
        return this.twitterSessionManager;
    }

    public String getVersion() {
        return "3.1.1.9";
    }
}

