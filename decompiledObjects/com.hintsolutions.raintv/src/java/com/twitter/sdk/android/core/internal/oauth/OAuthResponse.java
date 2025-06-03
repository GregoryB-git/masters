/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  com.twitter.sdk.android.core.TwitterAuthToken
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.twitter.sdk.android.core.internal.oauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.twitter.sdk.android.core.TwitterAuthToken;

public class OAuthResponse
implements Parcelable {
    public static final Parcelable.Creator<OAuthResponse> CREATOR = new Parcelable.Creator<OAuthResponse>(){

        public OAuthResponse createFromParcel(Parcel parcel) {
            return new OAuthResponse(parcel, null);
        }

        public OAuthResponse[] newArray(int n) {
            return new OAuthResponse[n];
        }
    };
    public final TwitterAuthToken authToken;
    public final long userId;
    public final String userName;

    private OAuthResponse(Parcel parcel) {
        this.authToken = (TwitterAuthToken)parcel.readParcelable(TwitterAuthToken.class.getClassLoader());
        this.userName = parcel.readString();
        this.userId = parcel.readLong();
    }

    public /* synthetic */ OAuthResponse(Parcel parcel, 1 var2_2) {
        this(parcel);
    }

    public OAuthResponse(TwitterAuthToken twitterAuthToken, String string2, long l) {
        this.authToken = twitterAuthToken;
        this.userName = string2;
        this.userId = l;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("authToken=");
        stringBuilder.append((Object)this.authToken);
        stringBuilder.append(",userName=");
        stringBuilder.append(this.userName);
        stringBuilder.append(",userId=");
        stringBuilder.append(this.userId);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n) {
        parcel.writeParcelable((Parcelable)this.authToken, n);
        parcel.writeString(this.userName);
        parcel.writeLong(this.userId);
    }
}

