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
 *  java.lang.StringBuilder
 */
package com.twitter.sdk.android.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.twitter.sdk.android.core.AuthToken;
import com.twitter.sdk.android.core.TwitterAuthToken;

public class TwitterAuthToken
extends AuthToken
implements Parcelable {
    public static final Parcelable.Creator<TwitterAuthToken> CREATOR = new Parcelable.Creator<TwitterAuthToken>(){

        public TwitterAuthToken createFromParcel(Parcel parcel) {
            return new TwitterAuthToken(parcel, null);
        }

        public TwitterAuthToken[] newArray(int n) {
            return new TwitterAuthToken[n];
        }
    };
    @SerializedName(value="secret")
    public final String secret;
    @SerializedName(value="token")
    public final String token;

    private TwitterAuthToken(Parcel parcel) {
        this.token = parcel.readString();
        this.secret = parcel.readString();
    }

    public /* synthetic */ TwitterAuthToken(Parcel parcel, 1 var2_2) {
        this(parcel);
    }

    public TwitterAuthToken(String string2, String string3) {
        this.token = string2;
        this.secret = string3;
    }

    public TwitterAuthToken(String string2, String string3, long l) {
        super(l);
        this.token = string2;
        this.secret = string3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof TwitterAuthToken)) {
            return false;
        }
        object = (TwitterAuthToken)object;
        String string2 = this.secret;
        if (string2 != null ? !string2.equals((Object)((TwitterAuthToken)object).secret) : ((TwitterAuthToken)object).secret != null) {
            return false;
        }
        string2 = this.token;
        object = ((TwitterAuthToken)object).token;
        return !(string2 != null ? !string2.equals(object) : object != null);
    }

    public int hashCode() {
        String string2 = this.token;
        int n = 0;
        int n2 = string2 != null ? string2.hashCode() : 0;
        string2 = this.secret;
        if (string2 != null) {
            n = string2.hashCode();
        }
        return n2 * 31 + n;
    }

    @Override
    public boolean isExpired() {
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("token=");
        stringBuilder.append(this.token);
        stringBuilder.append(",secret=");
        stringBuilder.append(this.secret);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n) {
        parcel.writeString(this.token);
        parcel.writeString(this.secret);
    }
}

