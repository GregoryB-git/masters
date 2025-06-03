/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  com.twitter.sdk.android.core.TwitterAuthToken
 *  com.twitter.sdk.android.core.internal.scribe.DefaultScribeClient
 *  java.lang.Object
 *  java.lang.String
 */
package com.twitter.sdk.android.core.internal.scribe;

import android.annotation.SuppressLint;
import android.content.Context;
import com.twitter.sdk.android.core.GuestSessionProvider;
import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.SessionManager;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.IdManager;
import com.twitter.sdk.android.core.internal.scribe.DefaultScribeClient;

public class TwitterCoreScribeClientHolder {
    @SuppressLint(value={"StaticFieldLeak"})
    private static DefaultScribeClient instance;

    public static DefaultScribeClient getScribeClient() {
        return instance;
    }

    public static void initialize(Context context, SessionManager<? extends Session<TwitterAuthToken>> sessionManager, GuestSessionProvider guestSessionProvider, IdManager idManager, String string2, String string3) {
        instance = new DefaultScribeClient(context, sessionManager, guestSessionProvider, idManager, DefaultScribeClient.getScribeConfig((String)string2, (String)string3));
    }
}

