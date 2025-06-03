/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.System
 */
package com.twitter.sdk.android.core.internal.oauth;

import com.google.gson.annotations.SerializedName;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Token;

public class GuestAuthToken
extends OAuth2Token {
    private static final long EXPIRES_IN_MS = 10800000L;
    public static final String HEADER_GUEST_TOKEN = "x-guest-token";
    @SerializedName(value="guest_token")
    private final String guestToken;

    public GuestAuthToken(String string, String string2, String string3) {
        super(string, string2);
        this.guestToken = string3;
    }

    public GuestAuthToken(String string, String string2, String string3, long l4) {
        super(string, string2, l4);
        this.guestToken = string3;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            if (!super.equals(object)) {
                return false;
            }
            Object object2 = (GuestAuthToken)object;
            object = this.guestToken;
            object2 = ((GuestAuthToken)object2).guestToken;
            return !(object != null ? !object.equals(object2) : object2 != null);
        }
        return false;
    }

    public String getGuestToken() {
        return this.guestToken;
    }

    @Override
    public int hashCode() {
        int n4 = super.hashCode();
        String string = this.guestToken;
        int n5 = string != null ? string.hashCode() : 0;
        return n4 * 31 + n5;
    }

    @Override
    public boolean isExpired() {
        boolean bl = System.currentTimeMillis() >= this.createdAt + 10800000L;
        return bl;
    }
}

