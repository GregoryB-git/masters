/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  com.google.gson.FieldNamingPolicy
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Collections
 *  java.util.List
 *  java.util.concurrent.ScheduledExecutorService
 */
package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.twitter.sdk.android.core.GuestSessionProvider;
import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.SessionManager;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.internal.ExecutorUtils;
import com.twitter.sdk.android.core.internal.IdManager;
import com.twitter.sdk.android.core.internal.scribe.EventNamespace;
import com.twitter.sdk.android.core.internal.scribe.ScribeClient;
import com.twitter.sdk.android.core.internal.scribe.ScribeConfig;
import com.twitter.sdk.android.core.internal.scribe.ScribeEvent;
import com.twitter.sdk.android.core.internal.scribe.ScribeEventFactory;
import com.twitter.sdk.android.core.internal.scribe.ScribeItem;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

public class DefaultScribeClient
extends ScribeClient {
    private static final String DEBUG_BUILD = "debug";
    private static final String SCRIBE_PATH_TYPE = "sdk";
    private static final String SCRIBE_PATH_VERSION = "i";
    private static final String SCRIBE_URL = "https://syndication.twitter.com";
    private static volatile ScheduledExecutorService executor;
    private final String advertisingId;
    private final Context context;
    private final SessionManager<? extends Session<TwitterAuthToken>> sessionManager;

    public DefaultScribeClient(Context context, SessionManager<? extends Session<TwitterAuthToken>> sessionManager, GuestSessionProvider guestSessionProvider, IdManager idManager, ScribeConfig scribeConfig) {
        this(context, TwitterCore.getInstance().getAuthConfig(), sessionManager, guestSessionProvider, idManager, scribeConfig);
    }

    public DefaultScribeClient(Context context, TwitterAuthConfig twitterAuthConfig, SessionManager<? extends Session<TwitterAuthToken>> sessionManager, GuestSessionProvider guestSessionProvider, IdManager idManager, ScribeConfig scribeConfig) {
        super(context, DefaultScribeClient.getExecutor(), scribeConfig, new ScribeEvent.Transform(DefaultScribeClient.getGson()), twitterAuthConfig, sessionManager, guestSessionProvider, idManager);
        this.context = context;
        this.sessionManager = sessionManager;
        this.advertisingId = idManager.getAdvertisingId();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static ScheduledExecutorService getExecutor() {
        if (executor != null) return executor;
        Class<DefaultScribeClient> clazz = DefaultScribeClient.class;
        synchronized (DefaultScribeClient.class) {
            if (executor != null) return executor;
            executor = ExecutorUtils.buildSingleThreadScheduledExecutorService("scribe");
            // ** MonitorExit[var1] (shouldn't be in output)
            return executor;
        }
    }

    private static Gson getGson() {
        return new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
    }

    private String getLanguage() {
        return this.context.getResources().getConfiguration().locale.getLanguage();
    }

    public static ScribeConfig getScribeConfig(String string2, String string3) {
        String string4 = DefaultScribeClient.getScribeUrl(SCRIBE_URL, "");
        return new ScribeConfig(DefaultScribeClient.isEnabled(), string4, SCRIBE_PATH_VERSION, SCRIBE_PATH_TYPE, "", DefaultScribeClient.getUserAgent(string2, string3), 100, 600);
    }

    public static String getScribeUrl(String string2, String string3) {
        if (!TextUtils.isEmpty((CharSequence)string3)) {
            return string3;
        }
        return string2;
    }

    public static String getUserAgent(String string2, String string3) {
        StringBuilder stringBuilder = a.s("TwitterKit/", "3.0", " (Android ");
        stringBuilder.append(Build.VERSION.SDK_INT);
        stringBuilder.append(") ");
        stringBuilder.append(string2);
        stringBuilder.append("/");
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }

    private static boolean isEnabled() {
        return true;
    }

    public Session getActiveSession() {
        return this.sessionManager.getActiveSession();
    }

    public long getScribeSessionId(Session session) {
        long l = session != null ? session.getId() : 0L;
        return l;
    }

    public void scribe(EventNamespace eventNamespace, String string2) {
        String string3 = this.getLanguage();
        this.scribe(ScribeEventFactory.newScribeEvent(eventNamespace, string2, System.currentTimeMillis(), string3, this.advertisingId, (List<ScribeItem>)Collections.emptyList()));
    }

    public void scribe(EventNamespace eventNamespace, List<ScribeItem> list) {
        String string2 = this.getLanguage();
        this.scribe(ScribeEventFactory.newScribeEvent(eventNamespace, "", System.currentTimeMillis(), string2, this.advertisingId, list));
    }

    public void scribe(ScribeEvent scribeEvent) {
        super.scribe(scribeEvent, this.getScribeSessionId(this.getActiveSession()));
    }

    public void scribe(EventNamespace ... eventNamespaceArray) {
        int n = eventNamespaceArray.length;
        for (int i = 0; i < n; ++i) {
            this.scribe(eventNamespaceArray[i], (List<ScribeItem>)Collections.emptyList());
        }
    }
}

