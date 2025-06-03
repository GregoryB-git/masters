/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.twitter.sdk.android.core.internal.oauth.GuestAuthToken
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.twitter.sdk.android.core;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.twitter.sdk.android.core.AuthTokenAdapter;
import com.twitter.sdk.android.core.Logger;
import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.twitter.sdk.android.core.internal.persistence.SerializationStrategy;

public class GuestSession
extends Session<GuestAuthToken> {
    public static final long LOGGED_OUT_USER_ID = 0L;

    public GuestSession(GuestAuthToken guestAuthToken) {
        super(guestAuthToken, 0L);
    }

    public static class Serializer
    implements SerializationStrategy<GuestSession> {
        private final Gson gson = new GsonBuilder().registerTypeAdapter(GuestAuthToken.class, (Object)new AuthTokenAdapter()).create();

        @Override
        public GuestSession deserialize(String object) {
            if (!TextUtils.isEmpty((CharSequence)object)) {
                try {
                    object = (GuestSession)this.gson.fromJson((String)object, GuestSession.class);
                    return object;
                }
                catch (Exception exception) {
                    Logger logger = Twitter.getLogger();
                    StringBuilder stringBuilder = z2.t("Failed to deserialize session ");
                    stringBuilder.append(exception.getMessage());
                    logger.d("Twitter", stringBuilder.toString());
                }
            }
            return null;
        }

        @Override
        public String serialize(GuestSession object) {
            if (object != null && ((Session)object).getAuthToken() != null) {
                try {
                    object = this.gson.toJson(object);
                    return object;
                }
                catch (Exception exception) {
                    Logger logger = Twitter.getLogger();
                    object = z2.t("Failed to serialize session ");
                    object.append(exception.getMessage());
                    logger.d("Twitter", object.toString());
                }
            }
            return "";
        }
    }
}

