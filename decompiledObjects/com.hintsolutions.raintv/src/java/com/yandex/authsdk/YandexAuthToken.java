/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.yandex.authsdk;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

public class YandexAuthToken
implements Parcelable {
    public static final Parcelable.Creator<YandexAuthToken> CREATOR = new Parcelable.Creator<YandexAuthToken>(){

        public YandexAuthToken createFromParcel(@NonNull Parcel parcel) {
            return new YandexAuthToken(parcel);
        }

        public YandexAuthToken[] newArray(int n) {
            return new YandexAuthToken[n];
        }
    };
    private final long expiresIn;
    @NonNull
    private final String value;

    public YandexAuthToken(@NonNull Parcel parcel) {
        this.value = parcel.readString();
        this.expiresIn = parcel.readLong();
    }

    public YandexAuthToken(@NonNull String string2, long l2) {
        this.value = string2;
        this.expiresIn = l2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (YandexAuthToken)object;
            if (this.expiresIn != ((YandexAuthToken)object).expiresIn) {
                return false;
            }
            return this.value.equals((Object)((YandexAuthToken)object).value);
        }
        return false;
    }

    public long expiresIn() {
        return this.expiresIn;
    }

    @NonNull
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        int n = this.value.hashCode();
        long l2 = this.expiresIn;
        return n * 31 + (int)(l2 ^ l2 >>> 32);
    }

    @NonNull
    public String toString() {
        StringBuilder stringBuilder = z2.u("YandexAuthToken", "{token='");
        a.B(stringBuilder, this.value, '\'', ", expiresIn=");
        return a.o(stringBuilder, this.expiresIn, '}');
    }

    public void writeToParcel(@NonNull Parcel parcel, int n) {
        parcel.writeString(this.value);
        parcel.writeLong(this.expiresIn);
    }
}

