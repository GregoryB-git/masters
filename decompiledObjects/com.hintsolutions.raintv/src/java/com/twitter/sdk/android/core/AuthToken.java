/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Object
 *  java.lang.System
 */
package com.twitter.sdk.android.core;

import com.google.gson.annotations.SerializedName;

public abstract class AuthToken {
    @SerializedName(value="created_at")
    public final long createdAt;

    public AuthToken() {
        this(System.currentTimeMillis());
    }

    public AuthToken(long l) {
        this.createdAt = l;
    }

    public abstract boolean isExpired();
}

