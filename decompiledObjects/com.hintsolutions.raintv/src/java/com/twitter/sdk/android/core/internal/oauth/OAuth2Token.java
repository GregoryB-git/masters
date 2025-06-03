/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.twitter.sdk.android.core.internal.oauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.twitter.sdk.android.core.AuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Token;

public class OAuth2Token
extends AuthToken
implements Parcelable {
    public static final Parcelable.Creator<OAuth2Token> CREATOR = new Parcelable.Creator<OAuth2Token>(){

        public OAuth2Token createFromParcel(Parcel parcel) {
            return new OAuth2Token(parcel, null);
        }

        public OAuth2Token[] newArray(int n) {
            return new OAuth2Token[n];
        }
    };
    public static final String TOKEN_TYPE_BEARER = "bearer";
    @SerializedName(value="access_token")
    private final String accessToken;
    @SerializedName(value="token_type")
    private final String tokenType;

    private OAuth2Token(Parcel parcel) {
        this.tokenType = parcel.readString();
        this.accessToken = parcel.readString();
    }

    public /* synthetic */ OAuth2Token(Parcel parcel, 1 var2_2) {
        this(parcel);
    }

    public OAuth2Token(String string2, String string3) {
        this.tokenType = string2;
        this.accessToken = string3;
    }

    public OAuth2Token(String string2, String string3, long l) {
        super(l);
        this.tokenType = string2;
        this.accessToken = string3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            Object object2 = (OAuth2Token)object;
            object = this.accessToken;
            if (object != null ? !object.equals((Object)((OAuth2Token)object2).accessToken) : ((OAuth2Token)object2).accessToken != null) {
                return false;
            }
            object = this.tokenType;
            object2 = ((OAuth2Token)object2).tokenType;
            return !(object != null ? !object.equals(object2) : object2 != null);
        }
        return false;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getTokenType() {
        return this.tokenType;
    }

    public int hashCode() {
        String string2 = this.tokenType;
        int n = 0;
        int n2 = string2 != null ? string2.hashCode() : 0;
        string2 = this.accessToken;
        if (string2 != null) {
            n = string2.hashCode();
        }
        return n2 * 31 + n;
    }

    @Override
    public boolean isExpired() {
        return false;
    }

    public void writeToParcel(Parcel parcel, int n) {
        parcel.writeString(this.tokenType);
        parcel.writeString(this.accessToken);
    }
}

