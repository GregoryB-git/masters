/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.twitter.sdk.android.core;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.persistence.SerializationStrategy;

public class TwitterSession
extends Session<TwitterAuthToken> {
    public static final long UNKNOWN_USER_ID = -1L;
    public static final String UNKNOWN_USER_NAME = "";
    @SerializedName(value="user_name")
    private final String userName;

    public TwitterSession(TwitterAuthToken twitterAuthToken, long l, String string2) {
        super(twitterAuthToken, l);
        this.userName = string2;
    }

    @Override
    public boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            if (!super.equals(object)) {
                return false;
            }
            Object object2 = (TwitterSession)object;
            object = this.userName;
            object2 = ((TwitterSession)object2).userName;
            if (object != null) {
                bl = object.equals(object2);
            } else if (object2 != null) {
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public long getUserId() {
        return this.getId();
    }

    public String getUserName() {
        return this.userName;
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        String string2 = this.userName;
        int n2 = string2 != null ? string2.hashCode() : 0;
        return n * 31 + n2;
    }

    public static class Serializer
    implements SerializationStrategy<TwitterSession> {
        private final Gson gson = new Gson();

        @Override
        public TwitterSession deserialize(String object) {
            if (!TextUtils.isEmpty((CharSequence)object)) {
                try {
                    object = (TwitterSession)this.gson.fromJson((String)object, TwitterSession.class);
                    return object;
                }
                catch (Exception exception) {
                    Twitter.getLogger().d("Twitter", exception.getMessage());
                }
            }
            return null;
        }

        @Override
        public String serialize(TwitterSession object) {
            if (object != null && ((Session)object).getAuthToken() != null) {
                try {
                    object = this.gson.toJson(object);
                    return object;
                }
                catch (Exception exception) {
                    Twitter.getLogger().d("Twitter", exception.getMessage());
                }
            }
            return TwitterSession.UNKNOWN_USER_NAME;
        }
    }
}

