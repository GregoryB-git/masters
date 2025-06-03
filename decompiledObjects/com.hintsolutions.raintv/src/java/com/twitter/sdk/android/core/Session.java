/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 */
package com.twitter.sdk.android.core;

import com.google.gson.annotations.SerializedName;
import com.twitter.sdk.android.core.AuthToken;

public class Session<T extends AuthToken> {
    @SerializedName(value="auth_token")
    private final T authToken;
    @SerializedName(value="id")
    private final long id;

    public Session(T t, long l) {
        if (t != null) {
            this.authToken = t;
            this.id = l;
            return;
        }
        throw new IllegalArgumentException("AuthToken must not be null.");
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            Session<T> session = (Session)object;
            if (this.id != session.id) {
                return false;
            }
            object = this.authToken;
            session = session.authToken;
            if (object != null) {
                bl = object.equals((Object)session);
            } else if (session != null) {
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public T getAuthToken() {
        return this.authToken;
    }

    public long getId() {
        return this.id;
    }

    public int hashCode() {
        T t = this.authToken;
        int n = t != null ? t.hashCode() : 0;
        long l = this.id;
        return n * 31 + (int)(l ^ l >>> 32);
    }
}

