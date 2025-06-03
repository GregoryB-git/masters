/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  com.squareup.picasso.Picasso
 *  com.twitter.sdk.android.core.TwitterSession
 *  com.twitter.sdk.android.core.internal.scribe.DefaultScribeClient
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.twitter.sdk.android.tweetui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.squareup.picasso.Picasso;
import com.twitter.sdk.android.core.GuestSessionProvider;
import com.twitter.sdk.android.core.SessionManager;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.internal.scribe.DefaultScribeClient;
import com.twitter.sdk.android.core.internal.scribe.EventNamespace;
import com.twitter.sdk.android.core.internal.scribe.ScribeConfig;
import com.twitter.sdk.android.core.internal.scribe.ScribeItem;
import com.twitter.sdk.android.tweetui.TweetRepository;
import java.util.List;

public class TweetUi {
    private static final String KIT_SCRIBE_NAME = "TweetUi";
    public static final String LOGTAG = "TweetUi";
    @SuppressLint(value={"StaticFieldLeak"})
    public static volatile TweetUi instance;
    public Context context;
    public GuestSessionProvider guestSessionProvider;
    private Picasso imageLoader;
    public DefaultScribeClient scribeClient;
    public SessionManager<TwitterSession> sessionManager;
    private TweetRepository tweetRepository;

    public TweetUi() {
        TwitterCore twitterCore = TwitterCore.getInstance();
        this.context = Twitter.getInstance().getContext(this.getIdentifier());
        this.sessionManager = twitterCore.getSessionManager();
        this.guestSessionProvider = twitterCore.getGuestSessionProvider();
        this.tweetRepository = new TweetRepository(new Handler(Looper.getMainLooper()), twitterCore.getSessionManager());
        this.imageLoader = Picasso.with((Context)Twitter.getInstance().getContext(this.getIdentifier()));
        this.setUpScribeClient();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static TweetUi getInstance() {
        if (instance != null) return instance;
        Class<TweetUi> clazz = TweetUi.class;
        synchronized (TweetUi.class) {
            TweetUi tweetUi;
            if (instance != null) return instance;
            instance = tweetUi = new TweetUi();
            // ** MonitorExit[var1] (shouldn't be in output)
            return instance;
        }
    }

    private void setUpScribeClient() {
        ScribeConfig scribeConfig = DefaultScribeClient.getScribeConfig((String)"TweetUi", (String)this.getVersion());
        this.scribeClient = new DefaultScribeClient(this.context, this.sessionManager, this.guestSessionProvider, Twitter.getInstance().getIdManager(), scribeConfig);
    }

    public String getIdentifier() {
        return "com.twitter.sdk.android:tweet-ui";
    }

    public Picasso getImageLoader() {
        return this.imageLoader;
    }

    public TweetRepository getTweetRepository() {
        return this.tweetRepository;
    }

    public String getVersion() {
        return "3.1.1.9";
    }

    public void scribe(EventNamespace eventNamespace, List<ScribeItem> list) {
        DefaultScribeClient defaultScribeClient = this.scribeClient;
        if (defaultScribeClient == null) {
            return;
        }
        defaultScribeClient.scribe(eventNamespace, list);
    }

    public void scribe(EventNamespace ... eventNamespaceArray) {
        if (this.scribeClient == null) {
            return;
        }
        for (EventNamespace eventNamespace : eventNamespaceArray) {
            this.scribeClient.scribe(new EventNamespace[]{eventNamespace});
        }
    }

    public void setImageLoader(Picasso picasso) {
        this.imageLoader = picasso;
    }

    public void setTweetRepository(TweetRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }
}

