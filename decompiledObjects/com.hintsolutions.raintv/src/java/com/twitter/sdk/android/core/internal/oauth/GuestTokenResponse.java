/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Object
 *  java.lang.String
 */
package com.twitter.sdk.android.core.internal.oauth;

import com.google.gson.annotations.SerializedName;

class GuestTokenResponse {
    @SerializedName(value="guest_token")
    public final String guestToken;

    public GuestTokenResponse(String string2) {
        this.guestToken = string2;
    }
}

