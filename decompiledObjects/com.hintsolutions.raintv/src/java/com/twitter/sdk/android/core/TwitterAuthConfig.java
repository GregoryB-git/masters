/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package com.twitter.sdk.android.core;

import android.os.Parcel;
import android.os.Parcelable;

public class TwitterAuthConfig
implements Parcelable {
    public static final Parcelable.Creator<TwitterAuthConfig> CREATOR = new Parcelable.Creator<TwitterAuthConfig>(){

        public TwitterAuthConfig createFromParcel(Parcel parcel) {
            return new TwitterAuthConfig(parcel, null);
        }

        public TwitterAuthConfig[] newArray(int n) {
            return new TwitterAuthConfig[n];
        }
    };
    public static final int DEFAULT_AUTH_REQUEST_CODE = 140;
    private final String consumerKey;
    private final String consumerSecret;

    private TwitterAuthConfig(Parcel parcel) {
        this.consumerKey = parcel.readString();
        this.consumerSecret = parcel.readString();
    }

    public /* synthetic */ TwitterAuthConfig(Parcel parcel, 1 var2_2) {
        this(parcel);
    }

    public TwitterAuthConfig(String string2, String string3) {
        if (string2 != null && string3 != null) {
            this.consumerKey = TwitterAuthConfig.sanitizeAttribute(string2);
            this.consumerSecret = TwitterAuthConfig.sanitizeAttribute(string3);
            return;
        }
        throw new IllegalArgumentException("TwitterAuthConfig must not be created with null consumer key or secret.");
    }

    public static String sanitizeAttribute(String string2) {
        if (string2 != null) {
            return string2.trim();
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public String getConsumerKey() {
        return this.consumerKey;
    }

    public String getConsumerSecret() {
        return this.consumerSecret;
    }

    public int getRequestCode() {
        return 140;
    }

    public void writeToParcel(Parcel parcel, int n) {
        parcel.writeString(this.consumerKey);
        parcel.writeString(this.consumerSecret);
    }
}

